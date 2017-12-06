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
import com.ellipsoidecm.carfix.listItems.ProcessingTicketItems;
import com.ellipsoidecm.carfix.others.CustomVolleyRequest;

import java.util.List;


public class ProcessingTicketAdapter extends RecyclerView.Adapter<ProcessingTicketAdapter.ViewHolder> {

    private ImageLoader processingTicketLoader;
    private Context context;

    List<ProcessingTicketItems> processingTicketItemses;


    public ProcessingTicketAdapter(List<ProcessingTicketItems> processingTicketItemses, Context context) {
        super();
        //Getting all the superheroes
        this.processingTicketItemses = processingTicketItemses;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.processing_tickets, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ProcessingTicketItems processingTicketItems = processingTicketItemses.get(position);

        processingTicketLoader = CustomVolleyRequest.getInstance(context).getImageLoader();
        processingTicketLoader.get(processingTicketItems.getProcessingImageUrl(), ImageLoader.getImageListener(holder.imageViewTicket, R.mipmap.ic_launcher, android.R.drawable.ic_dialog_alert));

        holder.imageViewTicket.setImageUrl(processingTicketItems.getProcessingImageUrl(), processingTicketLoader);
        holder.textViewStatus.setText(processingTicketItems.getProcessingTicketStatus());
        holder.textViewID.setText(processingTicketItems.getProcessingTicketId());

    }

    @Override
    public int getItemCount() {
        return processingTicketItemses.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public NetworkImageView imageViewTicket;
        public TextView textViewStatus, textViewID;

        public ViewHolder(View itemView) {
            super(itemView);
            imageViewTicket = (NetworkImageView) itemView.findViewById(R.id.img_processingTicket);
            textViewStatus = (TextView) itemView.findViewById(R.id.tv_processingTicketStatus);
            textViewID = (TextView) itemView.findViewById(R.id.tv_processingTicketId);

        }
    }
}