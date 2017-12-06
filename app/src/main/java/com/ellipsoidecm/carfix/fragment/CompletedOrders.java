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
import com.ellipsoidecm.carfix.adapter.CompletedTicketAdapter;
import com.ellipsoidecm.carfix.config.ConfigTickets;
import com.ellipsoidecm.carfix.listItems.CompletedTicketItems;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class CompletedOrders extends Fragment {

    private List<CompletedTicketItems> listCompletedTicketItem;

    Context context;

    private RecyclerView recyclerCompletedTicket;
    private RecyclerView.LayoutManager layoutCompletedTicketManager;
    private RecyclerView.Adapter adapterCompletedTicket;


    public CompletedOrders() {
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
        final View view = inflater.inflate(R.layout.fragment_completed_orders, container, false);

        recyclerCompletedTicket = (RecyclerView) view.findViewById(R.id.completed_tickets_recycler_view);
        recyclerCompletedTicket.setHasFixedSize(true);
        layoutCompletedTicketManager = new LinearLayoutManager(getActivity());
        recyclerCompletedTicket.setLayoutManager(layoutCompletedTicketManager);

        listCompletedTicketItem = new ArrayList<>();

        getCompletedTickets();

        return view;
    }

    private void getCompletedTickets() {
        final ProgressDialog loading = ProgressDialog.show(getActivity(), "Loading Data", "Please wait...", false, false);

        //Creating a json array request
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(ConfigTickets.COMPLETED_TICKET_URL,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //Dismissing progress dialog
                        loading.dismiss();

                        //calling method to parse json array
                        parseCompletedTickets(response);
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

    private void parseCompletedTickets(JSONArray array) {
        for (int i = 0; i < array.length(); i++) {
            CompletedTicketItems completedTicketsItems = new CompletedTicketItems();
            JSONObject json = null;
            try {
                json = array.getJSONObject(i);
                completedTicketsItems.setCompletedImageUrl(json.getString(ConfigTickets.TAG_COMPLETD_TICKET_URL));
                completedTicketsItems.setCompletedTicketStatus(json.getString(ConfigTickets.TAG_COMPLETD_TICKET_ID));
                completedTicketsItems.setCompletedTicketId(json.getString(ConfigTickets.TAG_COMPLETD_TICKET_STATUS));

            } catch (JSONException e) {
                e.printStackTrace();
            }
            listCompletedTicketItem.add(completedTicketsItems);
        }

        //Finally initializing our adapter
        adapterCompletedTicket = new CompletedTicketAdapter(listCompletedTicketItem, getActivity());

        //Adding adapter to recyclerview
        recyclerCompletedTicket.setAdapter(adapterCompletedTicket);

    }

}
