package team23.officefinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

import uk.liamp.teamproject.R;

public class DirectionsActivity extends AppCompatActivity {

    private String roomName;
    private ArrayList<String> directionsList;
    private ArrayList<String> typeList;
    private ArrayList<Integer> floorList;
    private Generator g;
    private  boolean takeLift;
    private String source;
    private String destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);

        g = new Generator();

        directionsList = (ArrayList<String>)getIntent().getExtras().getSerializable("directionsList");
        typeList = (ArrayList<String>)getIntent().getExtras().getSerializable("directionsType");
        floorList  = (ArrayList<Integer>)getIntent().getExtras().getSerializable("floorList");
        source = getIntent().getExtras().getString("source");
        destination = getIntent().getExtras().getString("destination");
        roomName = g.getMap().get(destination).getType();
        takeLift = getIntent().getExtras().getBoolean("takeLift");

        Switch s = (Switch) findViewById(R.id.toggleSwitch);
        s.setChecked(takeLift);


        addDirectionBlocks();
    }

    public void addDirectionBlocks(){

        TextView roomNumText = (TextView) findViewById(R.id.roomNumText);
        TextView roomNameText = (TextView) findViewById(R.id.roomNameText);

        roomNumText.setText(destination);
        roomNameText.setText(roomName);

        LinearLayout linearLayout;
        LinearLayout directionsContainer = (LinearLayout) findViewById(R.id.directions_container);
        for(int i = 0; i < directionsList.size(); i++){
            linearLayout = (LinearLayout) View.inflate(this, R.layout.directions_block, null);
            populateDirectionBlocks(linearLayout, i);
            directionsContainer.addView(linearLayout);
        }
    }


    public void populateDirectionBlocks(LinearLayout linearLayout, int num){
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.travelModeImage);
        TextView floorNumText = (TextView) linearLayout.findViewById(R.id.floorNumText);
        TextView directionsText = (TextView) linearLayout.findViewById(R.id.directionsText);
        floorNumText.setText(Integer.toString(floorList.get(num)));
        directionsText.setText(directionsList.get(num));
        if(directionsList.get(num).contains("left")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.left));
        }else if(directionsList.get(num).contains("right")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.right));
        }
        if(typeList.get(num).contains("Stairs")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.stairs));
        }else if(typeList.get(num).contains("Elevator")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.elevator));
        }
    }

    public void gotoMap(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toggleTakeLift(View view){
        Switch s = (Switch) findViewById(R.id.toggleSwitch);
        if(s.isChecked()){
            takeLift = true;
        }else{
            takeLift = false;
        }

        RouteFinder rf = new RouteFinder();
        rf.FindRoute(source, destination, takeLift);

        Intent refresh = new Intent (this, DirectionsActivity.class);
        refresh.putExtra("directionsList", rf.getDirectionsList());
        refresh.putExtra("directionsType", rf.getTypeList());
        refresh.putExtra("floorList", rf.getFloorList());
        refresh.putExtra("takeLift", takeLift);
        refresh.putExtra("source", source);
        refresh.putExtra("destination", destination);
        startActivity(refresh);
        finish();
    }

}
