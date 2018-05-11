package team23.officefinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Arrays;
import java.util.HashMap;

import uk.liamp.teamproject.R;

public class MainActivity extends AppCompatActivity {

    private boolean inputTypeIsNumber = false;
    private boolean isLift = false;
    private EditText txtFromRoom;
    private EditText txtToRoom;
    private final String TAG = "Main";
    Generator g;
    private boolean takeLift;
    private String[] staff;

    public void toggleTakeLift(View view){
        Switch s = (Switch) findViewById(R.id.toggleSwitch);
        if(s.isChecked()){
            takeLift = true;
        }else{
            takeLift = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFromRoom = (EditText) findViewById(R.id.fromText);
        txtToRoom = (EditText) findViewById(R.id.toText);
        g = new Generator();

        BackgroundStaff bgs = new BackgroundStaff(this);
        bgs.execute();

    }

    public void fromChangeInputType(View view){
        EditText editText = (EditText) findViewById(R.id.fromText);
        ImageView inputTypeButton = (ImageView) findViewById(R.id.inputTypeButton);
        if (inputTypeIsNumber) {
            editText.setInputType(InputType.TYPE_CLASS_TEXT);
            inputTypeIsNumber = !inputTypeIsNumber;
            inputTypeButton.setBackground(getResources().getDrawable(R.color.colorAccentLight));
        }else{
            editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);;
            inputTypeIsNumber = !inputTypeIsNumber;
            inputTypeButton.setBackground(getResources().getDrawable(R.color.colorAccent));
        }
    }

    public void toChangeInputType(View view){
        EditText editText = (EditText) findViewById(R.id.toText);
        ImageView inputTypeButton = (ImageView) findViewById(R.id.inputTypeButton2);
        if (inputTypeIsNumber) {
            editText.setInputType(InputType.TYPE_CLASS_TEXT);
            inputTypeIsNumber = !inputTypeIsNumber;
            inputTypeButton.setBackground(getResources().getDrawable(R.color.colorAccentLight));
        }else{
            editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);;
            inputTypeIsNumber = !inputTypeIsNumber;
            inputTypeButton.setBackground(getResources().getDrawable(R.color.colorAccent));
        }
    }

    public void openCameraView(View v) {
        Intent i = new Intent(this, CameraTestActivity.class);
        startActivityForResult(i, 1);
    }

    public void findRoute(View view){
        txtFromRoom.setError(null);
        txtToRoom.setError(null);

        String fromRoomNumber = txtFromRoom.getText().toString();
        String toRoomNumber = txtToRoom.getText().toString();

        HashMap<String, Node> nodeMap = g.getMap();
        if (nodeMap.get(fromRoomNumber) == null) {
            txtFromRoom.setError("Invalid room number");
            txtFromRoom.requestFocus();
        } else if (nodeMap.get(toRoomNumber) == null) {
            txtToRoom.setError("Invalid room number");
            txtToRoom.requestFocus();
        } else {
            RouteFinder rf = new RouteFinder();
            rf.FindRoute(fromRoomNumber, toRoomNumber, takeLift);

            Intent intent = new Intent(this, DirectionsActivity.class);
            intent.putExtra("directionsList", rf.getDirectionsList());
            intent.putExtra("directionsType", rf.getTypeList());
            intent.putExtra("floorList", rf.getFloorList());
            intent.putExtra("takeLift", takeLift);
            intent.putExtra("source", fromRoomNumber);
            intent.putExtra("destination", toRoomNumber);

            startActivity(intent);
        }
    }


    public void openMapView(View view){
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    public void openSettingsView(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void openLecturerList(View v) {
        Intent i = new Intent(this, StaffList.class);
        i.putExtra("StaffList", staff);
        startActivity(i);

        //startActivityForResult(i, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                txtFromRoom.setText(data.getStringExtra("RoomNumber"));
                txtToRoom.requestFocus();
            }
        }
    }

    public void createArray(String result) {
        staff = result.split("\\$");
    }

}
