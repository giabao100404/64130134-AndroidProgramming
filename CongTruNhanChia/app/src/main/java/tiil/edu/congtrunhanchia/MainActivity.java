package tiil.edu.congtrunhanchia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng gắn với điều khieern
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutcong,nuttru,nutnhan,nutchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //viết hàm tìm điều khiển
        TimDieuKhien();
    }
    void TimDieuKhien()
    {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);
        nutcong = (Button) findViewById(R.id.btnCong);
        nuttru = (Button) findViewById(R.id.btnTru);
        nutnhan = (Button) findViewById(R.id.btnNhan);
        nutchia = (Button) findViewById(R.id.btnChia);
    }
    //Xử lý cộng
    public void XuLyCong(View v) {
        //code xử lý cộng
        //b1. Lấy dữ liệu 2 số
        //b1.1 Tìm Editext số 1 và 2

        //b1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 Chuyển dữ liệu chuỗi về số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float tong = soA + soB;
        //b3. hiện kết quả
        //b3.1

        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(tong);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);

    }

    //Xử lý trừ
    public void XuLyTru(View v){
        //code xử lý trừ
//b1. Lấy dữ liệu 2 số
        //b1.1 Tìm Editext số 1 và 2

        //b1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 Chuyển dữ liệu chuỗi về số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float hieu = soA - soB;
        //b3. hiện kết quả
        //b3.1

        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(hieu);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }

    //Xử lý nhân
    public void XuLyNhan(View v){
        //code xử lý nhân
//b1. Lấy dữ liệu 2 số
        //b1.1 Tìm Editext số 1 và 2

        //b1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 Chuyển dữ liệu chuỗi về số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float nhan = soA * soB;
        //b3. hiện kết quả
        //b3.1

        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(nhan);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }

    //Xử lý chia
    public void XuLyChia(View v){
        //code xử lý chia
//b1. Lấy dữ liệu 2 số
        //b1.1 Tìm Editext số 1 và 2

        //b1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 Chuyển dữ liệu chuỗi về số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float thuong = soA / soB;
        //b3. hiện kết quả
        //b3.1

        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(thuong);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
}