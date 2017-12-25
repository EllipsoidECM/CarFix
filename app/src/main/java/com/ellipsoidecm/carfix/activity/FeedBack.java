package com.ellipsoidecm.carfix.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ellipsoidecm.carfix.R;
import com.ellipsoidecm.carfix.others.SendMail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class FeedBack extends AppCompatActivity {
    EditText fname,femail,fmessage,fmobile;
    Button send;
    String tomessage;

    String name,email,message,mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        fname = (EditText) findViewById(R.id.name_f);
        femail = (EditText) findViewById(R.id.email_f);
        fmessage = (EditText) findViewById(R.id.message_f);
        fmobile = (EditText) findViewById(R.id.phone_f);

        send = (Button) findViewById(R.id.submit_f);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            sendEmail();

            }
        });





    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void sendEmail() {
        try{
        name = "Customer name: "+fname.getText().toString().trim();
        email = "Customer mail: "+femail.getText().toString().trim();
        message = "Customer feedback: "+fmessage.getText().toString().trim();
        mobile = "Customer mobile: "+fmobile.getText().toString().trim();
        tomessage = ""+name+ "\n" +email+ "\n"+message+"\n"+mobile;}
        catch (Exception e){}

        //Getting content for email
        String subject = "Feedback";


        //Creating SendMail object
        SendMail sm = new SendMail(this, "hello@ellipsoidecm.com", subject, tomessage);

        //Executing sendmail to send email
        sm.execute();
    }

}
