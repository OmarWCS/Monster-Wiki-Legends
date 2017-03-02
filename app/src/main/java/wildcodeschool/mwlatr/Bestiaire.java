package wildcodeschool.mwlatr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Bestiaire extends AppCompatActivity {

    private ListView mListview = (ListView) findViewById(R.id.mlistview);
    private List<Monster> MonsterArrayList= new ArrayList<>();
    private ArrayAdapter arrayAdapter = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestiaire);

        //if(intent.hasExtras)

        final Button création = (Button) findViewById(R.id.création);
        //int Type = getIntent().getExtras().getIntegerArrayList()




        // Feu : 1 /Magie : 2/ Lumiére : 3/ Eau : 4/ Métal : 5/ "Nature : 6/ Terre : 7/ Foudre : 8 / PLante : 9: Mort 10/
        Monster FireLion = new Monster("FireLion", 1);
        Monster Firesaur = new Monster("Firesaur", 1);
        Monster Génie = new Monster ("Génie", 2);
        Monster LightSpirit = new Monster ("LightSpirit", 3);
        Monster MerSnake = new Monster ("Mersnake", 4);
        Monster Metalsaur = new Monster("Metalsaur", 5);
        Monster Panda = new Monster ("Panda", 6);
        Monster Rockilla = new Monster ("Rockilla", 7);
        Monster ThunderEagle = new Monster ("ThunderEagle", 8);
        Monster Treezard = new Monster ("Treezard", 9);
        Monster Turtle = new Monster ("Turtle", 4);
        Monster TyrannoKing= new Monster ("TyrannoKing", 10);

        this.MonsterArrayList.add(FireLion);
        this.MonsterArrayList.add(Firesaur);
        this.MonsterArrayList.add(Génie);
        this.MonsterArrayList.add(LightSpirit);
        this.MonsterArrayList.add(MerSnake);
        this.MonsterArrayList.add(Metalsaur);
        this.MonsterArrayList.add(Panda);
        this.MonsterArrayList.add(Rockilla);
        this.MonsterArrayList.add(ThunderEagle);
        this.MonsterArrayList.add(Treezard);
        this.MonsterArrayList.add(Turtle);
        this.MonsterArrayList.add(TyrannoKing);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.activity_list_item, MonsterArrayList);

    }
}

