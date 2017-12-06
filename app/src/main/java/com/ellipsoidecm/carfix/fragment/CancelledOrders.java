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
import com.ellipsoidecm.carfix.adapter.CancelledTicketAdapter;
import com.ellipsoidecm.carfix.config.ConfigTickets;
import com.ellipsoidecm.carfix.listItems.CancelledTicketItems;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class CancelledOrders extends Fragment {

    private List<CancelledTicketItems> listCancelledTicketItem;

    Context context;

    private RecyclerView recyclerCancelledTicket;
    private RecyclerView.LayoutManager layoutCancelledTicketManager;
    private RecyclerView.Adapter adapterCancelledTicket;


    public CancelledOrders() {
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

        recyclerCancelledTicket = (RecyclerView) view.findViewById(R.id.cancelled_tickets_recycler_view);
        recyclerCancelledTicket.setHasFixedSize(true);
        layoutCancelledTicketManager = new LinearLayoutManager(getActivity());
        recyclerCancelledTicket.setLayoutManager(layoutCancelledTicketManager);

        listCancelledTicketItem = new ArrayList<>();

        getCompletedTickets();

        return view;
    }

    private void getCompletedTickets() {
        final ProgressDialog loading = ProgressDialog.show(getActivity(), "Loading Data", "Please wait...", false, false);

        //Creating a json array request
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(ConfigTickets.CANCELLED_TICKET_URL,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //Dismissing progress dialog
                        loading.dismiss();

                        //calling method to parse json array
                        parseCancelledTickets(response);
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

    private void parseCancelledTickets(JSONArray array) {
        for (int i = 0; i < array.length(); i++) {
            CancelledTicketItems cancelledTicketItems = new CancelledTicketItems();
            JSONObject json = null;
            try {
                json = array.getJSONObject(i);
                cancelledTicketItems.setCancelledImageUrl(json.getString(ConfigTickets.TAG_CANCELLED_TICKET_URL));
                cancelledTicketItems.setCancelledTicketId(json.getString(ConfigTickets.TAG_CANCELLED_TICKET_ID));
                cancelledTicketItems.setCancelledTicketStatus(json.getString(ConfigTickets.TAG_CANCELLED_TICKET_STATUS));

            } catch (JSONException e) {
                e.printStackTrace();
            }
            listCancelledTicketItem.add(cancelledTicketItems);
        }

        //Finally initializing our adapter
        adapterCancelledTicket = new CancelledTicketAdapter(listCancelledTicketItem, getActivity());

        //Adding adapter to recyclerview
        recyclerCancelledTicket.setAdapter(adapterCancelledTicket);

    }

}
