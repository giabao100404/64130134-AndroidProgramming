package thigk2.tranluonggiabao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chucnang2Activity extends AppCompatActivity {
    //Khai báo các đối tượng gắn với điều khieern
    EditText editTextGK;
    EditText editTextCK;
    EditText editTextKQ;
    Button nutKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //viết hàm tìm điều khiển
        TimDieuKhien();
    }

    void TimDieuKhien() {
        editTextGK = (EditText) findViewById(R.id.edtGK);
        editTextCK = (EditText) findViewById(R.id.edtCK);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);
        nutKQ = (Button) findViewById(R.id.btnKQ);
    }

    //Xử lý cộng
    public void XuLyCong(View v) {
        //code xử lý cộng
        //b1. Lấy dữ liệu 2 số
        //b1.1 Tìm Editext số 1 và 2

        //b1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextGK.getText().toString();
        String soThu2 = editTextCK.getText().toString();
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
}