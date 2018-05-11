package team23.officefinder;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import uk.liamp.teamproject.R;

public class StaffList extends ListActivity {

    private String staffName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_list);

        final ListView lv = getListView();
        String staffName;

        String[] list = getIntent().getExtras().getStringArray("StaffList");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(lv.getContext(),
                android.R.layout.simple_list_item_1, list);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sn = (String) lv.getItemAtPosition(position);
                StaffList sl = new StaffList();
                sl.setStaffName(sn);
            }
        });
    }

    public void setStaffName(String name) {
        this.staffName = name;
    }
}
