package org.brohede.marcus.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Arraylist för ListView
        String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
        List<String> listdata =new ArrayList<String>(Arrays.asList(mountainNames));

        //Arrayadapter för ListView
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.list_item_textview,R.id.my_item_textview,listdata);
        ListView myListView = (ListView)findViewById(R.id.my_listview);
        myListView.setAdapter(adapter);
        
        //För att listitem kan tryckas på
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long id) {
                //Toast för varje bergs information genom switch-satser
                switch(i){
                    case 0 :
                        Toast.makeText(MainActivity.this, "4478m i Alps!", Toast.LENGTH_SHORT).show();
                        break;
                    case 1 :
                        Toast.makeText(MainActivity.this, "4808m i Alps!", Toast.LENGTH_SHORT).show();
                        break;
                    case 2 :
                        Toast.makeText(MainActivity.this, "6190m i Alaska!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}
