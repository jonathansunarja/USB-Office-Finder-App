package team23.officefinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import uk.liamp.teamproject.R;

public class Map extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        imageView = (ImageView) findViewById(R.id.mapImage);
        textView = (TextView) findViewById(R.id.floorLabel);
    }

    public void floor1(View view){
        textView.setText("Floor 1");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.floor1));
    }

    public void floor2(View view){
        textView.setText("Floor 2");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.floor2));
    }

    public void floor3(View view){
        textView.setText("Floor 3");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.floor3));
    }

    public void floor4(View view){
        textView.setText("Floor 4");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.floor4));
    }

    public void floor5(View view){
        textView.setText("Floor 5");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.floor5));
    }

    public void floor6(View view){
        textView.setText("Floor 6");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.floor6));
    }
}
