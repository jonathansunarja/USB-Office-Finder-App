package team23.officefinder;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundStaffRoom extends AsyncTask<String, Void, String> {


    @Override
    protected String doInBackground(String... params) {

        String loginURL = "http://homepages.cs.ncl.ac.uk/2017-18/CSC2022/Team23/website/db_login.php";
        String result="";

        //String number = "16024306";
        //String password = "Password";

        String number = params[0];
        String password = params[1];

        try {

            URL url = new URL(loginURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            OutputStream outputStream = conn.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));

            String post_data = URLEncoder.encode("number","UTF-8")+"="+URLEncoder.encode(number,"UTF-8")+ "&" +URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");

            bufferedWriter.write(post_data);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            InputStream inputStream = conn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
            String line="";
            while((line = bufferedReader.readLine())!= null) {
                result += line;
            }
            bufferedReader.close();
            inputStream.close();
            conn.disconnect();


            //Log.d(TAG, "doInBackground: " + result);

            //http://www.codebind.com/android-tutorials-and-examples/android-mysql-database-tutorial-android-login-php-mysql/


        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
