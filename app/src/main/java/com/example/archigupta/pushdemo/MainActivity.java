package com.example.archigupta.pushdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.PushService;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
   String device_token="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        PushService.getToken();
//
    }





//        FirebaseInstanceId.getInstance().getInstanceId()
//                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
//
//
//                    @Override
//                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
//                        if (!task.isSuccessful()) {
//                            Log.w(TAG, "getInstanceId failed", task.getException());
//                            return;
//                        }
//
//                        // Get new Instance ID token
//                        String token = task.getResult().getToken();
//                        Log.d("Device token", token);
//
//                        Toast.makeText(MainActivity.this, token, Toast.LENGTH_SHORT).show();
//                    }
//                });

}
