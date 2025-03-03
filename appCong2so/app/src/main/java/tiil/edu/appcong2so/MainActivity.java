package tiil.edu.appcong2so;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Đây là bộ lắng nghe và xử lý xự kiện click lên nút Tính Tổng
    public void XuLyCong(View view){
        //Tìm tham chiếu đến điều khiển trên tệp XML, mapping sang JAVA file
        EditText editTextsoA = findViewById(R.id.edtA);
        EditText editTextsoB = findViewById(R.id.edtB);
        EditText editTextsoKQ = findViewById(R.id.edtKQ);

        //Lấy dữ liệu về ở điều kiện số a:
        String strA = editTextsoA.getText().toString();          //strA = "2"
        //Lấy dữ liệu về ở điều kiện số b:
        String strB = editTextsoB.getText().toString();          //strB = "4"

        //Chuyển dữ liệu sang dạng số
                    int so_A = Integer.parseInt(strA);
                    int so_B = Integer.parseInt(strB);

        //Tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);          //chuyển sang dạng chuỗi

        //Hiện ra màn hình
        editTextsoKQ.setText(strTong);
    }
}
