package tiil.edu.nt21_quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
        EditText edPass = (EditText) findViewById(R.id.edtPassword);
        Button btnXacNhan = (Button) findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            //Xử lý đăng nhập
            //Lấy dữ liệu
            //B1 Tìm tham chiếu đk
            public void onClick(View view) {
                EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPassword);
                //B2. Lấy dữ liệu
                String tenDangNhap = edTenDN.getText().toString();
                String mk = edPass.getText().toString();
                //Kiểm tra mật khẩu
                if( tenDangNhap.equals("tranluonggiabao") && mk.equals(1004) )//Mk đúng
                {
                    //chuyển sang màn hình home
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                }
                else{
                    Toast.makeText(LoginActivity.this,"BẠN NHẬP SAI THÔNG TIN",Toast.LENGTH_LONG)
                }
            }
        });
    }
}