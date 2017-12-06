package com.ellipsoidecm.carfix.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.listItems.CompletedTicketItems;
import com.ellipsoidecm.carfix.others.CustomVolleyRequest;

import java.util.List;


public class CompletedTicketAdapter extends RecyclerView.Adapter<CompletedTicketAdapter.ViewHolder> {

    private ImageLoader completedTicketLoader;
    private Context context;

    List<CompletedTicketItems> completedTicketItemses;


    public CompletedTicketAdapter(List<CompletedTicketItems> completedTicketItemses, Context context) {
        super();
        //Getting all the superheroes
        this.completedTicketItemses = completedTicketItemses;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.completed_tickets, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        CompletedTicketItems completedTicketItems = completedTicketItemses.get(position);

        completedTicketLoader = CustomVolleyRequest.getInstance(context).getImageLoader();
        completedTicketLoader.get(completedTicketItems.getCompletedImageUrl(), ImageLoader.getImageListener(holder.imageViewTicket, R.mipmap.ic_launcher, android.R.drawable.ic_dialog_alert));

        holder.imageViewTicket.setImageUrl(completedTicketItems.getCompletedImageUrl(), completedTicketLoader);
        holder.textViewStatus.setText(completedTicketItems.getCompletedTicketStatus());
        holder.textViewID.setText(completedTicketItems.getCompletedTicketId());

    }

    @Override
    public int getItemCount() {
        return completedTicketItemses.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public NetworkImageView imageViewTicket;
        public TextView textViewStatus, textViewID;

        public ViewHolder(View itemView) {
            super(itemView);
            imageViewTicket = (NetworkImageView) itemView.findViewById(R.id.img_completedTicket);
            textViewStatus = (TextView) itemView.findViewById(R.id.tv_completedTicketId);
            textViewID = (TextView) itemView.findViewById(R.id.tv_completedTicketStatus);

        }
    }
}