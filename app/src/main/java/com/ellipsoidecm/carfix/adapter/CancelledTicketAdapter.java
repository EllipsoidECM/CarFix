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
import com.ellipsoidecm.carfix.listItems.CancelledTicketItems;
import com.ellipsoidecm.carfix.others.CustomVolleyRequest;

import java.util.List;


public class CancelledTicketAdapter extends RecyclerView.Adapter<CancelledTicketAdapter.ViewHolder> {

    private ImageLoader cancelledTicketLoader;
    private Context context;

    List<CancelledTicketItems> cancelledTicketItemses;


    public CancelledTicketAdapter(List<CancelledTicketItems> cancelledTicketItemses, Context context) {
        super();
        //Getting all the superheroes
        this.cancelledTicketItemses = cancelledTicketItemses;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cancelled_tickets, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        CancelledTicketItems cancelledTicketItems = cancelledTicketItemses.get(position);

        cancelledTicketLoader = CustomVolleyRequest.getInstance(context).getImageLoader();
        cancelledTicketLoader.get(cancelledTicketItems.getCancelledImageUrl(), ImageLoader.getImageListener(holder.imageViewTicket, R.mipmap.ic_launcher, android.R.drawable.ic_dialog_alert));

        holder.imageViewTicket.setImageUrl(cancelledTicketItems.getCancelledImageUrl(), cancelledTicketLoader);
        holder.textViewStatus.setText(cancelledTicketItems.getCancelledTicketStatus());
        holder.textViewID.setText(cancelledTicketItems.getCancelledTicketId());

    }

    @Override
    public int getItemCount() {
        return cancelledTicketItemses.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public NetworkImageView imageViewTicket;
        public TextView textViewStatus, textViewID;

        public ViewHolder(View itemView) {
            super(itemView);
            imageViewTicket = (NetworkImageView) itemView.findViewById(R.id.img_cancelledTicket);
            textViewStatus = (TextView) itemView.findViewById(R.id.tv_cancelledTicketStatus);
            textViewID = (TextView) itemView.findViewById(R.id.tv_cancelledTicketId);

        }
    }
}