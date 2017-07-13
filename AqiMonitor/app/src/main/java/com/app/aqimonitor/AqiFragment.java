package com.app.aqimonitor;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AqiFragment extends Fragment {

    private ListView mListView;
    private Adapter mAdapter;

    public AqiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.aqilist_fragment,container,false);

        mListView = (ListView) v.findViewById(R.id.aqi_list);
        mListView.setAdapter(new AqiListAdapter());
        return v;
    }

    class AqiListAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null)
            {
                view = getActivity().getLayoutInflater().inflate(R.layout.listitem,null);
            }
            return view;
        }
    };

}
