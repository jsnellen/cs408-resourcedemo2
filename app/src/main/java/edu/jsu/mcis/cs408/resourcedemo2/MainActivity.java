package edu.jsu.mcis.cs408.resourcedemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import edu.jsu.mcis.cs408.resourcedemo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private Die die1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        die1 = new Die();

    }


    public void onClick(View v) {

        die1.next();
        updateDrawable();

    }

    public void updateDrawable() {

        binding.button.getDrawable().setLevel(die1.getValue().getLevel());

    }

}