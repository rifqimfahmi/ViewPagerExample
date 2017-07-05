package com.renotekno.zcabez.viewpagerexample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment that displays "Thursday".
 */
public class ThursdayFragment extends Fragment {

    private String className = "LogActivities " + getClass().getName();

    @Override
    public void onAttach(Context context) {
        Log.d(className, "on Attach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(className, "on Create");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(className, "on Create View");
        return inflater.inflate(R.layout.fragment_thursday, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(className, "on Activity Created");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(className, "on Start");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(className, "on Resume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(className, "on Pause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(className, "on Stop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(className, "on Destroy View");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(className, "on Destroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(className, "on Detach");
        super.onDetach();
    }
}