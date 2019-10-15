package com.example.cancare;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class photos extends Fragment {


    private  String[] photo1 = {"الدوالي","النزلة الوافدة-الأنفلونزا ","رائحة الفم ","الذئبة ","القمل","حصى الكلى","التهاب البلعوم الحاد","الحصبة الألمانية" ,"عسر الهضم","التهاب الغدة الدرقية ",
    "الأمراض التشنجية","نقص فيتامين (د) ","انسداد الشرايين ","نزيف الأنف"};



    public photos() {
        // Required empty public constructor
    }
ListView list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_photos, container, false);

list =view.findViewById(R.id.lsp);
        ArrayAdapter arrayAdapter=new ArrayAdapter <>(getContext(),android.R.layout.simple_list_item_1,photo1);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //بتبعت اى قيمة من fragment ل fragment تانية
        Bundle bundle1=new Bundle();
        bundle1.putInt("index2", position);
        Fragment frag=new showPhotoFragment();
        frag.setArguments(bundle1);

          //بتفتح fragment واحنا موجودين ف fragment تانية
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, frag, "findThisFragment")
                .addToBackStack(null)
                .commit();
    }
});



        return view;
    }

}
