package fr.epsi.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ImageActivity extends DemoActivity {

    public static final int K_I_RESULT_CODE_CLOSE=222;

    public static void display(DemoActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        final EditText message = findViewById(R.id.messageText);
        Button btn = findViewById(R.id.buttonReturn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("msg",message.getText().toString());
                setResult(K_I_RESULT_CODE_CLOSE,data);
                finish();
            }
        });
        String text = ((DemoApp) getApplication()).getTitle();
        ((DemoApp) getApplication()).displayToast(text);
    }
}
