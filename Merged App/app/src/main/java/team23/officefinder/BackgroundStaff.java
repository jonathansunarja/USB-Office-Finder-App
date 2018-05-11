package team23.officefinder;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundStaff extends AsyncTask<Void, Void, String> {

    private MainActivity a;

    public BackgroundStaff(Activity a) {
        this.a = (MainActivity) a;
    }


    @Override
    protected String doInBackground(Void... voids) {

        String staffURL = "http://homepages.cs.ncl.ac.uk/2017-18/CSC2022/Team23/website/db_staff.php";
        String result="";

        try {

            URL url = new URL(staffURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            //OutputStream outputStream = conn.getOutputStream();
            //outputStream.close();
            InputStream inputStream = conn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
            String line="";
            while((line = bufferedReader.readLine())!= null) {
                result += line;
            }
            bufferedReader.close();
            inputStream.close();
            conn.disconnect();

            //Log.d("STAFF", "doInBackground: " + result);

            //http://www.codebind.com/android-tutorials-and-examples/android-mysql-database-tutorial-android-login-php-mysql/


        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    protected void onPostExecute(String r) {
        a.createArray(r);
        //Log.d("", "onPostExecute: " + r);
    }
}
