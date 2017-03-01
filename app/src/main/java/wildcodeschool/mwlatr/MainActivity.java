package wildcodeschool.mwlatr;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    final Intent toCreate = new Intent(this, MonsterLab.class);
    final Intent toBestiary =new Intent(this, Bestiaire.class);
    final Button
    final Button

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setToBestiary(Intent toBestiary) {
        this.toBestiary = toBestiary;
    }
}
