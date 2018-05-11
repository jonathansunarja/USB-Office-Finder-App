package team23.officefinder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

import static android.app.PendingIntent.getActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import uk.liamp.teamproject.R;

public class LoginActivity extends AppCompatActivity {

    // UI references.
    private EditText txtID;
    private EditText txtPassword;
    private View mProgressView;
    private View mLoginFormView;
    private FirebaseAuth auth;
    private CheckBox checkRememberID;
    private SharedPreferences pref;
    private final String STUDENT_ID_KEY = "StudentID";
    private final String CHECKBOX_CHECKED_KEY = "RememberChecked";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // to enable validation of room during search
        Generator.generateData(false);

        // Set up the login form.

        auth = FirebaseAuth.getInstance();
        txtID = findViewById(R.id.txtID);
        txtPassword = findViewById(R.id.txtPassword);
        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
        checkRememberID = findViewById(R.id.checkRememberID);

        pref = this.getPreferences(Context.MODE_PRIVATE);
        String newID = pref.getString(STUDENT_ID_KEY, "");
        checkRememberID.setChecked(pref.getBoolean(CHECKBOX_CHECKED_KEY, false));
        txtID.setText(newID);
        if (!txtID.getText().toString().equals("")) {
            txtPassword.requestFocus();
        }
    }


    /**
     * Attempts to sign in or register the account specified by the login form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     */
    public void attemptLogin(View v) {

        String ID = txtID.getText().toString();
        String password = txtPassword.getText().toString();

        BackgroundLogin bgw = new BackgroundLogin(this);


        // Reset errors.
        txtID.setError(null);
        txtPassword.setError(null);

        // Store values at the time of the login attempt.

        boolean cancel = false;
        View focusView = null;

        // Check for a valid password, if the user entered one.
        if (TextUtils.isEmpty(password)) {
            txtPassword.setError("Enter password");
            focusView = txtPassword;
            cancel = true;
        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(ID)) {
            txtID.setError("This field is required");
            focusView = txtID;
            cancel = true;
        } else if (!isIDValid(ID)) {
            txtID.setError("Invalid student number");
            focusView = txtID;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            SharedPreferences.Editor editor = pref.edit();

            if (checkRememberID.isChecked()) {
                //Save student ID to user preferences
                //pref = this.getPreferences(Context.MODE_PRIVATE);
                editor.putString(STUDENT_ID_KEY, ID);
                editor.putBoolean(CHECKBOX_CHECKED_KEY, true);
                editor.commit();
            } else {
                editor.putString(STUDENT_ID_KEY, "");
                editor.putBoolean(CHECKBOX_CHECKED_KEY, false);
                editor.commit();
            }
            bgw.execute(ID, password);
            Toast.makeText(getApplicationContext(), "Attempting to login...", Toast.LENGTH_SHORT).show();
        }


    }

    public void loginAsGuest(View v) {
        BackgroundLogin bgw = new BackgroundLogin(this);
        bgw.execute("000000000", "Guest");
        Toast.makeText(getApplicationContext(), "Attempting to login...", Toast.LENGTH_SHORT).show();
    }

    public void login() {

        startActivity(new Intent(this, MainActivity.class));

    }

    public void loginFail() {
        txtID.setError("Invalid credentials");
        txtPassword.setError("Invalid credentials");
    }

    private boolean isIDValid(String ID) {
        return ID.length() == 9;
    }
}

