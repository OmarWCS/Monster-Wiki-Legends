package wildcodeschool.mwlatr;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bestiaire extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestiaire);

        final Button création = (Button) findViewById(R.id.création);
        final ListView mListview = (ListView) findViewById(R.id.mlistview);
        final List<Monster> MonsterArrayList = new ArrayList<Monster>();
        final Monster[] MonsterTab = new Monster[15](a)
        Monster FireLion = new Monster("FireLion", "Feu");
        Monster Firesaur = new Monster("Firesaur", "Feu");
        Monster Génie = new Monster ("Génie", "Magie");
        Monster LightSpirit = new Monster ("LightSpirit", "Lumiére");
        Monster MerSnake = new Monster ("Mersnake", "Eau");
        Monster Metalsaur = new Monster("Metalsaur", "Metal");
        Monster Panda = new Monster ("Panda", "Nature");
        Monster Rockilla = new Monster ("Rockilla", "Terre");
        Monster ThunderEagle = new Monster ("ThunderEagle", "Foudre");
        Monster Treezard = new Monster ("Treezard", "Plante");
        Monster Turtle = new Monster ("Turtle", "Eau");
        Monster TyrannoKing= new Monster ("TyrannoKing", "Mort");


        final ArrayAdapter arrayAdapter;

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, MonsterArrayList);

        mListview.setAdapter(arrayAdapter);

        création.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MonsterList.add("Michel Sapin");
                MonsterList.add("Maitre Gims");


            }
        });
    }


}