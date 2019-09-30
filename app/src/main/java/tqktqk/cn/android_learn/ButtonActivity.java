package tqktqk.cn.android_learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private TextView mTv1;

    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn3 = findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "按钮3被点击了", Toast.LENGTH_SHORT).show();//在界面上弹出一个提示的消息
            }
        });
        mTv1 = findViewById(R.id.tv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "tv1被点击了", Toast.LENGTH_SHORT).show();//在界面上弹出一个提示的消息
            }
        });

    }

    public void showToast(View view){
        Toast.makeText(this, "按钮4被点击了", Toast.LENGTH_SHORT).show();//在界面上弹出一个提示的消息
    }
}
