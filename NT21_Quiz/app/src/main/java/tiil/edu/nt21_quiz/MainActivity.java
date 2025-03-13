package tiil.edu.nt21_quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Tìm đk
        Button btnDangNhap = (Button) findViewById(R.id.btnLogin);
        //Sự kiện
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Lệnh xử lý ở đây
                Intent iLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivities(iLogin);

            }
        });
    }
}