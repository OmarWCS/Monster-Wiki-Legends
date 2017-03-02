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

public class arrayAdapter extends ArrayAdapter<Monster> {

    private ArrayList<Monster> MonsterArrayList = new ArrayList<>();

    public arrayAdapter(Context context, int textViewResourceId, ArrayList<Monster> objects) {
        super(context, textViewResourceId, objects);
        MonsterArrayList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_list_item, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        textView.setText(MonsterArrayList.get(position).getMonsterName());
        imageView.setImageResource(MonsterArrayList.get(position).getMonsterElement());
        return v;

    }

}


