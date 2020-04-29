package fr.epsi.demo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends DemoActivity {

    public static void display(DemoActivity activity){
        Intent intent = new Intent(activity,MainActivity.class);
        activity.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.buttonA);
        Button btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Redirection vers autre fenetre
                Intent intent = new Intent(MainActivity.this,ImageActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        switch (resultCode){
            case ImageActivity.K_I_RESULT_CODE_CLOSE:
                String msg = data.getExtras().getString("msg","");
                demoApp.displayToast(msg);
                break;
            default:
                super.onActivityResult(requestCode,resultCode,data);
                break;
        }
    }
}
