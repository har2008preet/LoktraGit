package com.cube.android.loktragit.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.cube.android.loktragit.Model.Repo;
import com.cube.android.loktragit.R;
import com.paginate.recycler.LoadingListItemCreator;

import java.util.List;

/**
 * Created by abc on 02-05-2017.
 */

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.MyViewHolder>   {

    private List<Repo> repos;
    private Context context;
    public RepoAdapter(List<Repo> repos, Context context){
        this.repos = repos;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView sha;
        TextView message;
        ImageView profilePic;
        Repo repository;
        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name);
            sha = (TextView) itemView
                    .findViewById(R.id.sha);
            message = (TextView) itemView
                    .findViewById(R.id.message);

            profilePic = (ImageView) itemView
                    .findViewById(R.id.profile_pic);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(message.getVisibility()==View.GONE){
                        message.setVisibility(View.VISIBLE);
                    }else{
                        message.setVisibility(View.GONE);
                    }
                }
            });
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.repo_layout,null);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Repo repo= repos.get(position);

        holder.name.setText(repo.getCommit().getAuthor().getName());
        holder.sha.setText("Commit:"+repo.getSha());
        if(repo.getCommit().getMessage()!=null)
            holder.message.setText("Message:"+repo.getCommit().getMessage());
        Glide.with(context).load(repo.getAuthor().getAvatar_url())
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.profilePic);
    }

    @Override
    public int getItemCount() {
        return repos.size();
    }


}
