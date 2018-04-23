package rohit.com.recyclerviewexample;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by VIVEK on 10/15/2017.
 */

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder> {

    private int listItemLayout;
    private ArrayList<Item> itemList;
    private Context mContext;

    public ItemArrayAdapter(Context context, int listItemLayout, ArrayList<Item> itemList) {
        mContext = context;
        this.listItemLayout = listItemLayout;
        this.itemList = itemList;
    }

    @Override
    public ItemArrayAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemArrayAdapter.ViewHolder holder, int position) {


        final String name = itemList.get(position).getName();
        final String city = itemList.get(position).getCity();

        TextView name1 = holder.name;
        name1.setText(itemList.get(position).getName());
        TextView city1 = holder.city;
        city1.setText(itemList.get(position).getCity());
        TextView state = holder.state;
        state.setText(itemList.get(position).getState());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext," Button Clicked", Toast.LENGTH_LONG).show();


                Intent intent = new Intent(mContext, UserDetailActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("city" ,city );
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
       return itemList == null ? 0 : itemList.size();

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        public TextView name;
        public TextView city;
        public TextView state;

        ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.caardView);
            name = (TextView) itemView.findViewById(R.id.textView_name);
            city =(TextView)itemView.findViewById(R.id.textView_city);
            state = (TextView)itemView.findViewById(R.id.textView_state);

        }

    }
}





























