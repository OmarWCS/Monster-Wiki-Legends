package wildcodeschool.mwlatr;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;


public class CustomAdapter extends ArrayAdapter<Monster> {
    private ArrayList<Monster> MonsterArrayList = new ArrayList<>();
    public CustomAdapter (Context context, int textViewResourceId, ArrayList<Monster> objects) {
        super(context, textViewResourceId, objects);
        MonsterArrayList = objects;
    }
    @Override
    public int getCount() {

        int count=MonsterArrayList.size(); //counts the total number of elements from the arrayList.
        return count;//returns the total count to adapter
    }


    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View variableview;
        variableview = convertView ;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        variableview = inflater.inflate(R.layout.activity_list_item, null);
        TextView tNomDuMonstre = (TextView) variableview.findViewById(R.id.tNomDuMonstre);
        ImageView imageView = (ImageView) variableview.findViewById(R.id.imageView);
        tNomDuMonstre.setText(MonsterArrayList.get(position).getMonsterName());
        imageView.setImageResource(MonsterArrayList.get(position).getElementImage());
        return variableview;

    }





}

