package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnloginFormActivityListener {


    public static PrefConfig prefConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefConfig = new PrefConfig(this);

        if(findViewById(R.id.fragment_container)!=null){
            if(savedInstanceState!=null)
            {
                return;
            }

            if(prefConfig.readLoginstatus()){
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new Welcome()).commit();
            }
            else {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new LoginFragment()).commit();
            }
        }
    }

    @Override
    public void performRegister() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new RegistrationFragment()).addToBackStack(null).commit();
    }

    @Override
    public void performLogin(String username) {

    }
}