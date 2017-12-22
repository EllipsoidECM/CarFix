package com.ellipsoidecm.carfix.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.adapter.ProcessingTicketAdapter;
import com.ellipsoidecm.carfix.config.ConfigTickets;
import com.ellipsoidecm.carfix.listItems.ProcessingTicketItems;
import com.ellipsoidecm.carfix.others.SharedPrefManager;
import com.ellipsoidecm.carfix.others.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class ProcessingOrders extends Fragment {

    private List<ProcessingTicketItems> listProcessingTicketItem;

    Context context;

    private RecyclerView recyclerProcessingTicket;
    private RecyclerView.LayoutManager layoutProcessingTicketManager;
    private RecyclerView.Adapter adapterProcessingTicket;


    public ProcessingOrders() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_cancelled_orders, container, false);
        recyclerProcessingTicket = (RecyclerView) view.findViewById(R.id.cancelled_tickets_recycler_view);
        recyclerProcessingTicket.setHasFixedSize(true);
        layoutProcessingTicketManager = new LinearLayoutManager(getActivity());
        recyclerProcessingTicket.setLayoutManager(layoutProcessingTicketManager);

        listProcessingTicketItem = new ArrayList<>();


        getCompletedTickets();

        return view;
    }

    private void getCompletedTickets() {
        final ProgressDialog loading = ProgressDialog.show(getActivity(), "Loading Data", "Please wait...", false, false);
        User user = SharedPrefManager.getInstance(getActivity()).getUser();

        //Creating a json array request
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(ConfigTickets.PROCESSING_TICKET_URL+user.getId(),
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //Dismissing progress dialog
                        loading.dismiss();

                        //calling method to parse json array
                        parseProcessingTickets(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //Creating request queue
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());

        //Adding request to the queue
        requestQueue.add(jsonArrayRequest);
    }

    private void parseProcessingTickets(JSONArray array) {


        for (int i = 0; i < array.length(); i++) {
            ProcessingTicketItems processingTicketItems = new ProcessingTicketItems();

            JSONObject json = null;
            try {
                json = array.getJSONObject(i);
                processingTicketItems.setProcessingImageUrl(json.getString(ConfigTickets.TAG_PROCESSING_TICKET_URL));
                processingTicketItems.setProcessingTicketId(json.getString(ConfigTickets.TAG_PROCESSING_TICKET_ID));
                processingTicketItems.setProcessingTicketStatus(json.getString(ConfigTickets.TAG_PROCESSING_TICKET_STATUS));

            } catch (JSONException e) {
                e.printStackTrace();
            }
            listProcessingTicketItem.add(processingTicketItems);
        }

        //Finally initializing our adapter
        adapterProcessingTicket = new ProcessingTicketAdapter(listProcessingTicketItem, getActivity());

        //Adding adapter to recyclerview
        recyclerProcessingTicket.setAdapter(adapterProcessingTicket);

    }

}
