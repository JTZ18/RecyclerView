package com.example.myapplication;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class RandomNumListAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private Random random;
    private String[] kode = {"d116df5",
            "36ffc75", "f5cfe78", "5b87628",
            "db8d14e", "9913dc4", "e120f96",
            "466251b"};
    private Tasks tasks;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public RandomNumListAdapter(int seed) {

        this.random = new Random(seed);
        //TODO: code breaks when preparing hardcoded case
//        ArrayList<String> tags = new ArrayList<String>();
//        tags.add("urgent");
//        tags.add("Science");
//        LocalDateTime rightnow = LocalDateTime.now();
//        Task task1 = new Task("Revise math", "I hate math", "orange", rightnow, rightnow, tags, "urgent");
//        Task task2 = new Task("test2", "i love math", "blue", rightnow, rightnow, tags, "due");
//        Task task3 = new Task("science is king", "e = mc^2", "red", rightnow, rightnow, tags, "overdue");
//        tasks.addTask(task1);
//        tasks.addTask(task2);
//        tasks.addTask(task3);


    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.frame_textview;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.getView().setText(kode[position]);
        holder.getView_title().setText(String.valueOf(random.nextInt()));
        holder.getView_tag1().setText(String.valueOf(random.nextInt()));

        /**
         * //        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
         * //        Task task = tasks.getTask(position);
         * //        holder.getView().setText(task.getStartDateTime().format(formatter));
         * //        holder.getView_title().setText(task.getTitle());
         * //        holder.getView_tag1().setText(task.getStatus());
         *         holder.getView_tag2().setText(String.valueOf(random.nextInt()));
         */
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
