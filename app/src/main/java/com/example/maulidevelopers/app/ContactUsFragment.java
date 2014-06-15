package com.example.maulidevelopers.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Akash on 14/06/14.
 */
public class ContactUsFragment extends Fragment{

    public ContactUsFragment() {
    }

    private static final String ARG_SECTION_NUMBER = "section_number";
    public static ContactUsFragment newInstance(int sectionNumber) {
        ContactUsFragment fragment = new ContactUsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.contact_us, container, false);
        return rootView;

    }
}
