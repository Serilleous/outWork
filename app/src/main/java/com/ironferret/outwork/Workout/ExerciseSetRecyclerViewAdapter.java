package com.ironferret.outwork.Workout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ironferret.outwork.Data.ExerciseSet;
import com.ironferret.outwork.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serilleous on 2/27/2016.
 */
public class ExerciseSetRecyclerViewAdapter extends RecyclerView.Adapter<ExerciseSetViewHolder> {
    List<ExerciseSet> mExerciseSets;
    static int value = 0;

    @Override
    public ExerciseSetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.exercise_set_listitem, parent, false);
        return new ExerciseSetViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ExerciseSetViewHolder holder, int position) {
        ((TextView)holder.itemView.findViewById(R.id.firstText)).setText(Integer.toString(value++));

    }

    @Override
    public int getItemCount() {
        return mExerciseSets.size();
    }

    public ExerciseSetRecyclerViewAdapter initData() {
        mExerciseSets = new ArrayList<>();
        return this;
    }
    public void addItem() {
        mExerciseSets.add(new ExerciseSet());
    }
}
