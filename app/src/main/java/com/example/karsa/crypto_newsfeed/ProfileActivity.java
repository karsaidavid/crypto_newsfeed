package com.example.karsa.crypto_newsfeed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textName, textEmail;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mAuth = FirebaseAuth.getInstance();

        imageView = findViewById(R.id.imageView);
        textName = findViewById(R.id.textViewName);
        textEmail = findViewById(R.id.textViewEmail);


        FirebaseUser user = mAuth.getCurrentUser();

        Glide.with(this)
                .load(user.getPhotoUrl())
                .into(imageView);

        textName.setText(user.getDisplayName());
        textEmail.setText(user.getEmail());


        Button clickButton = (Button) findViewById(R.id.Signoutbutton);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(ProfileActivity.this, "User Signed Out", Toast.LENGTH_SHORT).show();
                //finish();
                Intent aboutScreen = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(aboutScreen);
            }
        });

        Button feedbutton = (Button) findViewById(R.id.FeedButton);
        feedbutton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(ProfileActivity.this, "Opening feed", Toast.LENGTH_SHORT).show();

                //Intent aboutScreen = new Intent(ProfileActivity.this, FeedActivity.class);
                //startActivity(aboutScreen);
            }
        });
    }




    @Override
    protected void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(this, ProfileActivity.class));
        }
    }
}