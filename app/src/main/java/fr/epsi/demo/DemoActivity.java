package fr.epsi.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DemoActivity extends AppCompatActivity {
    protected DemoApp demoApp;

    public static void display(DemoActivity activity){
        Intent intent = new Intent(activity,MainActivity.class);
        activity.startActivity(intent);
    }

    public void setTitle(String string){
        TextView title = findViewById(R.id.textViewTitle);
        if(title != null){
            title.setText(string);
        }
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        demoApp = (DemoApp) getApplication();
    }


}
