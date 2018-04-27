package com.cjscjs.flowerpot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {


    ImageView iv;

    Timer timer=new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        iv=findViewById(R.id.iv);
        //View에게 애니메이션 효과를 주는 객체 생성
        //appear_logo.xml문서를 읽어서 Animation객체로 생성
        Animation ani= AnimationUtils.loadAnimation(this,R.anim.appear_logo);
        iv.startAnimation(ani);

        //4초후에 MainActivity 실행!!

        //스케줄관리 객체에게 스케줄 등록
        timer.schedule(task ,4000);

    }

    TimerTask task=new TimerTask() {
        @Override
        public void run() {
            //스케줄링에 의해 4초후에 이 메소드 실행
            Intent intent=new Intent(IntroActivity.this,MainMenuActivity.class);
            startActivity(intent);

            finish();

        }
    };
}
