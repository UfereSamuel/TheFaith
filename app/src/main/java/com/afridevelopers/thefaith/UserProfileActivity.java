package com.afridevelopers.thefaith;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserProfileActivity extends AppCompatActivity {
    private ImageView coverpic,display_full_pic;
    private CircleImageView  profilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        profilePic = (CircleImageView)findViewById(R.id.img_profile);
        coverpic = (ImageView)findViewById(R.id.profile_cover_pic);
        display_full_pic = (ImageView)findViewById(R.id.display_full);

        //Edit your profile button. opens a dialog to get text from user.
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(UserProfileActivity.this);
                LayoutInflater layoutinflater = getLayoutInflater();
                builder.setView(layoutinflater.inflate(R.layout.edit_profile,null));

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();

            }
        });

        profilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Displays the full profile pic in an alert box
                AlertDialog.Builder builder = new AlertDialog.Builder(UserProfileActivity.this);
                LayoutInflater layoutinflater = getLayoutInflater();
                builder.setView(layoutinflater.inflate(R.layout.display_full_picture,null));
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();


            }
        });
        //Displays the full cover pic in an alert box
        coverpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Displays the cover pic in a fragment
                AlertDialog.Builder builder = new AlertDialog.Builder(UserProfileActivity.this);
                LayoutInflater layoutinflater = getLayoutInflater();
                builder.setView(layoutinflater.inflate(R.layout.display_full_picture,null));
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();

            }
        });
    }
}
