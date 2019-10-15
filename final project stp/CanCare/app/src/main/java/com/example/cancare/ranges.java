package com.example.cancare;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class ranges extends Fragment {


  String range[]={"غازات الدم الشرياني","الشوارد","مبحث الدم","الدهون","قيم حمض الأساس","اختبارات الجهاز الهضمي","الهرمونات",


          "الفيتامينات","علامات الورم"};



    ListView listView1 ;

    public ranges() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_ranges, container, false);

listView1=view.findViewById(R.id.ls1);
ArrayAdapter arrayAdapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,range);
listView1.setAdapter(arrayAdapter);
listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle=new Bundle();
        bundle.putInt("index1", position);

        Fragment frag=new textFragment();
        frag.setArguments(bundle);


        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, frag, "findThisFragment")
                .addToBackStack(null)
                .commit();

    }
});



        return view ;
    }


}
