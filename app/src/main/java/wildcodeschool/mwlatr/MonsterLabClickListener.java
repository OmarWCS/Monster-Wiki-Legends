package wildcodeschool.mwlatr;

import android.view.View;
import android.widget.Toast;

/**
 * Created by apprenti on 26/02/17.
 */

public class MonsterLabClickListener implements View.OnClickListener {
    @Override
    public void Onclick(View view) {
        Toast.makeText(view.getContext(),"Open the Monster Lab", Toast.LENGTH_SHORT).show();

    }
}
