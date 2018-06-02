package com.example.rhyun.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Hello Test
 */
public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 현재 엑티비티에서 activity_main 파일을 화면으로 사용
        setContentView(R.layout.activity_main);

        // 화면과 소스코드 연결하기
        tv = findViewById(R.id.textView);
        bt = findViewById(R.id.button);

        // 버튼 클릭처리 - 리소스 등록
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Hello Android!!!");
            }
        });
    }


}
