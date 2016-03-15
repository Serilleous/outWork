package com.ironferret.outwork.Workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.ironferret.outwork.R;

/**
 * The primary activity that will be used during a workout.  Contains the list
 * of exercise sets/rests and the toolbox for changing the values therein during
 * a workout*/
public class WorkoutActivity extends AppCompatActivity {
    Button mAddButton;
    RecyclerView mSetRecyclerView;
    ExerciseSetRecyclerViewAdapter mExerciseSetAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_main);


        mSetRecyclerView = (RecyclerView) findViewById(R.id.set_list_recycler_view);
        mSetRecyclerView.setHasFixedSize(true);
        mExerciseSetAdapter = new ExerciseSetRecyclerViewAdapter().initData();

        mSetRecyclerView.setAdapter(mExerciseSetAdapter);
        mSetRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAddButton = (Button)findViewById(R.id.addSetButton);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExerciseSetAdapter.addItem();
                mExerciseSetAdapter.notifyDataSetChanged();
            }
        });
    }
}
