package c.pong.test_android;//之前設定的套件名稱(JAVA標準語法)

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//extends 繼承
    @Override //會檢查下面的方法是否為同名
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super就是指定要呼叫父類別的onCreat(),這裡會執行之前的狀態存入此頁面savedInstanceState
        setContentView(R.layout.activity_main);//載入佈局檔:把activity_main.xml畫面顯示出來
    TextView mytext=(TextView)findViewById(R.id.textView);//取得TextView物件
    //findViewById會傳回View類別因此需要強制轉換變成(TextView)
    mytext.setText("我設定的文字");

    }

}
