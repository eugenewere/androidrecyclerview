package com.example.grocify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HorizonatalRecyclerViewAdapter extends RecyclerView.Adapter<HorizonatalRecyclerViewAdapter.Viewholder> {


    private Context mContext ;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImagess = new ArrayList<>();

    public HorizonatalRecyclerViewAdapter(Context mContext, ArrayList<String> mNames, ArrayList<String> mImages) {
        this.mContext = mContext;
        this.mNames = mNames;
        this.mImagess = mImages;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_horizontal_recycler_view, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImagess.get(position))
                .into(holder.image);

        holder.name.setText(mNames.get(position));
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mNames.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNames.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView name;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.image2);
            name =itemView.findViewById(R.id.name2);


        }
    }

}
