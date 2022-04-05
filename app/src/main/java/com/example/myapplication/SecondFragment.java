package com.example.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private Tasks tasks= new Tasks();

    // Add RecyclerView member
    private RecyclerView recyclerView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        // initialise some data for testing
        String tag1 = "urgent";
        String tag2 = "due";
        String tag3 = "overdue";
        String tag4 = "Low";
        String tag5 = "Mid";
        String tag6 = "High";
        String status1 = "Not Done";
        String status2 = "Completed";
        LocalDateTime rightnow = LocalDateTime.now();
        Task task1 = new Task("Revise math", "I hate math", "orange", rightnow, rightnow, "Science", tag1, "Not Done");
        Task task2 = new Task("test2", "i love math", "blue", rightnow, rightnow, "Math", tag2, "Not Done");
        Task task3 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task4 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task5 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task6 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task7 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task8 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task9 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task10 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task11 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task12 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        Task task13 = new Task("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
        tasks.addTask(task1);
        tasks.addTask(task2);
        tasks.addTask(task3);
        tasks.addTask(task4);
        tasks.addTask(task5);
        tasks.addTask(task6);
        tasks.addTask(task7);
        tasks.addTask(task8);
        tasks.addTask(task9);
        tasks.addTask(task10);
        tasks.addTask(task11);
        tasks.addTask(task12);
        tasks.addTask(task13);



        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new RandomNumListAdapter(1234, tasks));


        // onClickListener for click events on items in recylcer view
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(SecondFragment.this.getContext(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever TODO: implement click on task handler what it should do next
                        Log.i("testTouch", "fragment touched");
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );

        return view;
    }
}