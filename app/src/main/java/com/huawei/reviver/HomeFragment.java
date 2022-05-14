package com.huawei.reviver;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<DataModel>dataHolder;

    String s1[],s2[];
    int images[] = {R.drawable.ic_one,R.drawable.ic_two,R.drawable.ic_three,R.drawable.ic_four,R.drawable.ic_five,
            R.drawable.ic_six,R.drawable.ic_seven,R.drawable.ic_eight,R.drawable.ic_nine,R.drawable.ic_ten};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        dataHolder = new ArrayList<>();
        s1 = getResources().getStringArray(R.array.explore);
        s2 = getResources().getStringArray(R.array.description);

        DataModel obj1 = new DataModel(images[0],s1[0],s2[0]);
        dataHolder.add(obj1);

        DataModel obj2 = new DataModel(images[1],s1[1],s2[1]);
        dataHolder.add(obj2);

        DataModel obj3 = new DataModel(images[2],s1[2],s2[2]);
        dataHolder.add(obj3);

        DataModel obj4 = new DataModel(images[3],s1[3],s2[3]);
        dataHolder.add(obj4);

        DataModel obj5 = new DataModel(images[4],s1[4],s2[4]);
        dataHolder.add(obj5);

        DataModel obj6 = new DataModel(images[5],s1[5],s2[5]);
        dataHolder.add(obj6);

        DataModel obj7 = new DataModel(images[6],s1[6],s2[6]);
        dataHolder.add(obj7);

        DataModel obj8 = new DataModel(images[7],s1[7],s2[7]);
        dataHolder.add(obj8);

        DataModel obj9 = new DataModel(images[8],s1[8],s2[8]);
        dataHolder.add(obj9);

        DataModel obj10 = new DataModel(images[9],s1[9],s2[9]);
        dataHolder.add(obj10);

        recyclerView.setAdapter(new MyAdapter(dataHolder));

        return view;
    }
}