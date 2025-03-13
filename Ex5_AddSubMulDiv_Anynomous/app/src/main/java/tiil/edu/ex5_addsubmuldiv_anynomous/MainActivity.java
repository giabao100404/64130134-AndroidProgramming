package tiil.edu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        //Tìm view
        Timview();
        btnCong.setOnClickListener(bolangnghe_XuLyCong);
        btnTru.setOnClickListener(bolangnghe_XuLyTru);
        btnNhan.setOnClickListener(bolangnghe_XuLyNhan);
        //btnChia.setOnClickListener(bolangnghe_XuLyChia);
            //ví dụ bộ lắng nghe ẩn danh
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code xử lý chia ở đây
                //1 Lấy số 1
                String strSo1 = edtSO1.getText().toString();
                String strSo2 = edtSO2.getText().toString();
                //2 chuyển thành số để tính toán
                double SO1 = Double.parseDouble(strSo1);
                double SO2 = Double.parseDouble(strSo2);
                //3 tinh toan
                double thuong = SO1 / SO2;
                //4 Xuất
                String strkq = String.valueOf(thuong);
                KQ.setText(strkq);
            }
        });
    }
    //--------------------------------
    //Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener bolangnghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Code xử lý cộng ở đây
            //1 Lấy số 1
            String strSo1 = edtSO1.getText().toString();
            String strSo2 = edtSO2.getText().toString();
            //2 chuyển thành số để tính toán
            double SO1 = Double.parseDouble(strSo1);
            double SO2 = Double.parseDouble(strSo2);
            //3 tinh toan
            double tong = SO1 + SO2;
            //4 Xuất
            String strkq = String.valueOf(tong);
            KQ.setText(strkq);
        }
    }
    View.OnClickListener bolangnghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Code xử lý trừ ở đây
            //1 Lấy số 1
            String strSo1 = edtSO1.getText().toString();
            String strSo2 = edtSO2.getText().toString();
            //2 chuyển thành số để tính toán
            double SO1 = Double.parseDouble(strSo1);
            double SO2 = Double.parseDouble(strSo2);
            //3 tinh toan
            double hieu = SO1 - SO2;
            //4 Xuất
            String strkq = String.valueOf(hieu);
            KQ.setText(strkq);
        }
    }View.OnClickListener bolangnghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Code xử lý nhân ở đây
            //1 Lấy số 1
            String strSo1 = edtSO1.getText().toString();
            String strSo2 = edtSO2.getText().toString();
            //2 chuyển thành số để tính toán
            double SO1 = Double.parseDouble(strSo1);
            double SO2 = Double.parseDouble(strSo2);
            //3 tinh toan
            double tich = SO1 * SO2;
            //4 Xuất
            String strkq = String.valueOf(tich);
            KQ.setText(strkq);
        }
    }
    View.OnClickListener bolangnghe_XuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Code xử lý chia ở đây
            //1 Lấy số 1
            String strSo1 = edtSO1.getText().toString();
            String strSo2 = edtSO2.getText().toString();
            //2 chuyển thành số để tính toán
            double SO1 = Double.parseDouble(strSo1);
            double SO2 = Double.parseDouble(strSo2);
            //3 tinh toan
            double thuong = SO1 / SO2;
            //4 Xuất
            String strkq = String.valueOf(thuong);
            KQ.setText(strkq);
        }
    }
    //--------------------------------
    public void Timview()
    {
        editSO1 = (EditText) findViewById(R.id.edtSO1);
        editSO2 = (EditText) findViewById(R.id.edtSO2);
        btnCong = (Button) findViewById(R.id.edtbtnCong);
        btnTru = (Button) findViewById(R.id.edtbtnTru);
        btnNhan = (Button) findViewById(R.id.edtbtnNhan);
        btnChia = (Button) findViewById(R.id.edtbtnChia);
        KQ = (TextView) findViewById(R.id.textViewKQ);
    }
    //Khai báo các đối tượng tương ứng với các điều khiển (view) cần thao tác
    EditText editSO1;
    EditText editSO2;
    Button btnCong,btnTru,btnNhan,btnChia;
    TextView KQ;
}