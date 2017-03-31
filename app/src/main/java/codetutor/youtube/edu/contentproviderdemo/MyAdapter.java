package codetutor.youtube.edu.contentproviderdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zhang on 3/29/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<Contact> contacts;

    public MyAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.id_textview.setText(contacts.get(position).getID());
        holder.name_textview.setText(contacts.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView id_textview;
        TextView name_textview;

        public MyViewHolder(View itemView) {
            super(itemView);
            id_textview = (TextView) itemView.findViewById(R.id.id_textview);
            name_textview = (TextView) itemView.findViewById(R.id.name_textview);
        }
    }
}
