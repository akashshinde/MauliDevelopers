package com.example.maulidevelopers.app;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Akash on 14/06/14.
 */
public class ProjectListFragment extends ListFragment {

    String[] list = {"Mauli Vihar","Mauli Tirth"};

    public ProjectListFragment() {
    }

    private static final String ARG_SECTION_NUMBER = "section_number";
    public static ProjectListFragment newInstance(int sectionNumber) {
        ProjectListFragment fragment = new ProjectListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layoutView = inflater.inflate(R.layout.listview, container, false);
        //TextView textView = (TextView) layoutView.findViewById(R.id.textView1);
        return layoutView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ProjectListAdapter(getActivity(),R.layout.list_item_card, list));

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(),"Clicked on "+position,Toast.LENGTH_SHORT).show();
        



    }
}
