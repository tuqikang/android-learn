package tqktqk.cn.android_learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private Button btLogin;

    private EditText etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        btLogin = findViewById(R.id.btn_login);
        btLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();//在界面上弹出一个提示的消息
            }
        });

        etUsername = findViewById(R.id.et_1);
        etUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edittext info :",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
