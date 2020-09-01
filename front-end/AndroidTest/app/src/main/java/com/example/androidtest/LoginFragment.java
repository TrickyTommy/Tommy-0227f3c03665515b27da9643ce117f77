package com.example.androidtest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class LoginFragment extends Fragment {

private EditText login_username;
private EditText login_password;
private Button btn_login,btn_register;

    OnloginFormActivityListener loginFormActivityListener;
    public interface OnloginFormActivityListener
    {
        public void performRegister();
        public void performLogin(String username);
    }
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
        btn_register = view.findViewById(R.id.btn_register);
        btn_login = view.findViewById(R.id.btn_login);
        login_username = view.findViewById(R.id.login_username);
        login_password = view.findViewById(R.id.login_password);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loginFormActivityListener.performRegister();
            }
        });
        return  view;
    }

    @Override
   public void onAttach(Context context){
        super.onAttach(context);
        Activity activity = (Activity) context;
        loginFormActivityListener = (OnloginFormActivityListener)activity;

   }
}