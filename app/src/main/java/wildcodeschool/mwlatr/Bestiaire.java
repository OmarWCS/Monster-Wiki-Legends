package wildcodeschool.mwlatr;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Bestiaire extends Activity {


    private List<Monster> MonsterArrayList= new ArrayList<>(null);
    private ListView mListview = (ListView) findViewById(R.id.mlistview);
    private ArrayAdapter arrayAdapter = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestiaire);

        //if(intent.hasExtras)
        arrayAdapter = new ArrayAdapter(this, android.R.layout.activity_list_item, MonsterArrayList);

        final Button création = (Button) findViewById(R.id.création);
        //int Type = getIntent().getExtras().getIntegerArrayList()





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


