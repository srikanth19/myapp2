package app.com.example.user.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button yesbuttonclick,nobuttonclick;
    private EditText nametxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yesbuttonclick=(Button)findViewById(R.id.button1);
        nobuttonclick=(Button)findViewById(R.id.button2);
        nametxt=(EditText)findViewById(R.id.txt);
    }

    public void yesbuttonclick(View view) {
        String username =String.valueOf(nametxt.getText());
        String youryesresponse="u r loged in   "+username;
        Toast.makeText(this,youryesresponse,Toast.LENGTH_SHORT).show();
    }

    public void nobuttonclick(View view) {
        String username =String.valueOf(nametxt.getText());
        String yournoresponse="u r not loged in    "+username;
        Toast.makeText(this,yournoresponse,Toast.LENGTH_SHORT).show();
    }

    public void nametxt(View view) {
    }
}
