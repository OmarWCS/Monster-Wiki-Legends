package wildcodeschool.mwlatr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Bestiaire extends AppCompatActivity {

    private ListView mListview;
    private List<Monster> MonsterArrayList= new ArrayList<Monster>();
    final Button création = (Button) findViewById(R.id.création);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestiaire);
        mListview= (ListView) findViewById(R.id.mlistview);
        ArrayAdapter arrayAdapter;

        //if(intent.hasExtras)


        //int Type = getIntent().getExtras().getIntegerArrayList()






        MonsterArrayList.add(new Monster("Firesaur", R.drawable.firesaur_1));
        MonsterArrayList.add(new Monster("FireLion", R.drawable.fire_lion_1));
        MonsterArrayList.add(new Monster ("Génie", R.drawable.genie_1));
        MonsterArrayList.add(new Monster ("LightSpirit", R.drawable.light_spirit_1));
        MonsterArrayList.add(new Monster ("MerSnake", R.drawable.mersnake_1));
        MonsterArrayList.add(new Monster ("Metalsaur", R.drawable.metalsaur_1));
        MonsterArrayList.add(new Monster ("Panda", R.drawable.panda_1));
        MonsterArrayList.add(new Monster ("Rockilla", R.drawable.rockilla_1));
        MonsterArrayList.add(new Monster ("ThunderEagle", R.drawable.thunder_eagle_1));
        MonsterArrayList.add(new Monster ("Treezard", R.drawable.treezard_1));
        MonsterArrayList.add(new Monster ("Turtle", R.drawable.turtle_1));
        MonsterArrayList.add(new Monster ("TyrannoKing", R.drawable.tyrannoking_1));

        arrayAdapter = new ArrayAdapter<Monster>(this, android.R.layout.activity_list_item, MonsterArrayList);
        mListview.setAdapter(arrayAdapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bestiary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


