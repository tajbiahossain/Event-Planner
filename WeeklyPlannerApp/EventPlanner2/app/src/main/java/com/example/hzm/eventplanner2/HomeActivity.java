package com.example.hzm.eventplanner2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button viewBtn;
    Button sat8amBtn, sun8amBtn, mon8amBtn, tue8amBtn, wed8amBtn, thur8amBtn, fri8amBtn;
    Button sat9amBtn, sun9amBtn, mon9amBtn, tue9amBtn, wed9amBtn, thur9amBtn, fri9amBtn;
    Button sat10amBtn, sun10amBtn, mon10amBtn, tue10amBtn, wed10amBtn, thur10amBtn, fri10amBtn;
    Button sat11amBtn, sun11amBtn, mon11amBtn, tue11amBtn, wed11amBtn, thur11amBtn, fri11amBtn;
    Button sat12amBtn, sun12amBtn, mon12amBtn, tue12amBtn, wed12amBtn, thur12amBtn, fri12amBtn;
    Button sat1pmBtn, sun1pmBtn, mon1pmBtn, tue1pmBtn, wed1pmBtn, thur1pmBtn, fri1pmBtn;
    Button sat2pmBtn, sun2pmBtn, mon2pmBtn, tue2pmBtn, wed2pmBtn, thur2pmBtn, fri2pmBtn;
    Button sat3pmBtn, sun3pmBtn, mon3pmBtn, tue3pmBtn, wed3pmBtn, thur3pmBtn, fri3pmBtn;
    Button sat4pmBtn, sun4pmBtn, mon4pmBtn, tue4pmBtn, wed4pmBtn, thur4pmBtn, fri4pmBtn;
    Button sat5pmBtn, sun5pmBtn, mon5pmBtn, tue5pmBtn, wed5pmBtn, thur5pmBtn, fri5pmBtn;
    Button sat6pmBtn, sun6pmBtn, mon6pmBtn, tue6pmBtn, wed6pmBtn, thur6pmBtn, fri6pmBtn;

    DatabaseHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        notify("onCreate");
        db = new DatabaseHandler(this);
        //buttons
        viewBtn = (Button)findViewById(R.id.viewBtn);
        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),viewAll.class);
                startActivity(i);

            }
        });
        sat8amBtn = (Button)findViewById(R.id.sat8amBtn);
        sat8amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(),createEvent.class);
                i1.putExtra("id","1");
                startActivity(i1);

            }
        });


        sun8amBtn = (Button)findViewById(R.id.sun8amBtn);
        sun8amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(),createEvent.class);
                i2.putExtra("id","2");
                startActivity(i2);

            }
        });
        mon8amBtn = (Button)findViewById(R.id.mon8amBtn);
        mon8amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(),createEvent.class);
                i3.putExtra("id","3");
                startActivity(i3);
            }
        });

        tue8amBtn = (Button)findViewById(R.id.tue8amBtn);
        tue8amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getApplicationContext(),createEvent.class);
                i4.putExtra("id","4");
                startActivity(i4);
            }
        });
        wed8amBtn = (Button)findViewById(R.id.wed8amBtn);
        wed8amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getApplicationContext(),createEvent.class);
                i5.putExtra("id","5");
                startActivity(i5);
            }
        });
        thur8amBtn = (Button)findViewById(R.id.thur8amBtn);
        thur8amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getApplicationContext(),createEvent.class);
                i6.putExtra("id","6");
                startActivity(i6);
            }
        });
        fri8amBtn = (Button)findViewById(R.id.fri8amBtn);
        fri8amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getApplicationContext(),createEvent.class);
                i7.putExtra("id","7");
                startActivity(i7);
            }
        });









        sat9amBtn = (Button)findViewById(R.id.sat9amBtn);
        sat9amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(getApplicationContext(),createEvent.class);
                i8.putExtra("id","8");
                startActivity(i8);
            }
        });
        sun9amBtn = (Button)findViewById(R.id.sun9amBtn);
        sun9amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(getApplicationContext(),createEvent.class);
                i9.putExtra("id","9");
                startActivity(i9);
            }
        });
        mon9amBtn = (Button)findViewById(R.id.mon9amBtn);
        mon9amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10 = new Intent(getApplicationContext(),createEvent.class);
                i10.putExtra("id","10");
                startActivity(i10);
            }
        });
        tue9amBtn = (Button)findViewById(R.id.tue9amBtn);
        tue9amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11 = new Intent(getApplicationContext(),createEvent.class);
                i11.putExtra("id","11");
                startActivity(i11);
            }
        });
        wed9amBtn = (Button)findViewById(R.id.wed9amBtn);
        wed9amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getApplicationContext(),createEvent.class);
                i12.putExtra("id","12");
                startActivity(i12);
            }
        });
        thur9amBtn = (Button)findViewById(R.id.thur9amBtn);
        thur9amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i13 = new Intent(getApplicationContext(),createEvent.class);
                i13.putExtra("id","13");
                startActivity(i13);
            }
        });
        fri9amBtn = (Button)findViewById(R.id.fri9amBtn);
        fri9amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14 = new Intent(getApplicationContext(),createEvent.class);
                i14.putExtra("id","14");
                startActivity(i14);
            }
        });





        sat10amBtn = (Button)findViewById(R.id.sat10amBtn);
        sat10amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15 = new Intent(getApplicationContext(),createEvent.class);
                i15.putExtra("id","15");
                startActivity(i15);
            }
        });
        sun10amBtn = (Button)findViewById(R.id.sun10amBtn);
        sun10amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i16 = new Intent(getApplicationContext(),createEvent.class);
                i16.putExtra("id","16");
                startActivity(i16);
            }
        });
        mon10amBtn = (Button)findViewById(R.id.mon10amBtn);
        mon10amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i17 = new Intent(getApplicationContext(),createEvent.class);
                i17.putExtra("id","17");
                startActivity(i17);
            }
        });
        tue10amBtn = (Button)findViewById(R.id.tue10amBtn);
        tue10amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i18 = new Intent(getApplicationContext(),createEvent.class);
                i18.putExtra("id","18");
                startActivity(i18);
            }
        });
        wed10amBtn = (Button)findViewById(R.id.wed10amBtn);
        wed10amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i19 = new Intent(getApplicationContext(),createEvent.class);
                i19.putExtra("id","19");
                startActivity(i19);
            }
        });
        thur10amBtn = (Button)findViewById(R.id.thur10amBtn);
        thur10amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i20 = new Intent(getApplicationContext(),createEvent.class);
                i20.putExtra("id","20");
                startActivity(i20);
            }
        });
        fri10amBtn = (Button)findViewById(R.id.fri10amBtn);
        fri10amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i21 = new Intent(getApplicationContext(),createEvent.class);
                i21.putExtra("id","21");
                startActivity(i21);
            }
        });






        sat11amBtn = (Button)findViewById(R.id.sat11amBtn);
        sat11amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i22 = new Intent(getApplicationContext(),createEvent.class);
                i22.putExtra("id","22");
                startActivity(i22);
            }
        });
        sun11amBtn = (Button)findViewById(R.id.sun11amBtn);
        sun11amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i23 = new Intent(getApplicationContext(),createEvent.class);
                i23.putExtra("id","23");
                startActivity(i23);
            }
        });
        mon11amBtn = (Button)findViewById(R.id.mon11amBtn);
        mon11amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i24 = new Intent(getApplicationContext(),createEvent.class);
                i24.putExtra("id","24");
                startActivity(i24);
            }
        });
        tue11amBtn = (Button)findViewById(R.id.tue11amBtn);
        tue11amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i25 = new Intent(getApplicationContext(),createEvent.class);
                i25.putExtra("id","25");
                startActivity(i25);
            }
        });
        wed11amBtn = (Button)findViewById(R.id.wed11amBtn);
        wed11amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i26 = new Intent(getApplicationContext(),createEvent.class);
                i26.putExtra("id","26");
                startActivity(i26);
            }
        });
        thur11amBtn = (Button)findViewById(R.id.thur11amBtn);
        thur11amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i27 = new Intent(getApplicationContext(),createEvent.class);
                i27.putExtra("id","27");
                startActivity(i27);
            }
        });
        fri11amBtn = (Button)findViewById(R.id.fri11amBtn);
        fri11amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i28 = new Intent(getApplicationContext(),createEvent.class);
                i28.putExtra("id","28");
                startActivity(i28);
            }
        });






        sat12amBtn = (Button)findViewById(R.id.sat12amBtn);
        sat12amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i29 = new Intent(getApplicationContext(),createEvent.class);
                i29.putExtra("id","29");
                startActivity(i29);
            }
        });
        sun12amBtn = (Button)findViewById(R.id.sun12amBtn);
        sun12amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i30 = new Intent(getApplicationContext(),createEvent.class);
                i30.putExtra("id","30");
                startActivity(i30);
            }
        });
        mon12amBtn = (Button)findViewById(R.id.mon12amBtn);
        mon12amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i31 = new Intent(getApplicationContext(),createEvent.class);
                i31.putExtra("id","31");
                startActivity(i31);
            }
        });
        tue12amBtn = (Button)findViewById(R.id.tue12amBtn);
        tue12amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i32 = new Intent(getApplicationContext(),createEvent.class);
                i32.putExtra("id","32");
                startActivity(i32);
            }
        });
        wed12amBtn = (Button)findViewById(R.id.wed12amBtn);
        wed12amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i33 = new Intent(getApplicationContext(),createEvent.class);
                i33.putExtra("id","33");
                startActivity(i33);
            }
        });
        thur12amBtn = (Button)findViewById(R.id.thur12amBtn);
        thur12amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i34 = new Intent(getApplicationContext(),createEvent.class);
                i34.putExtra("id","34");
                startActivity(i34);
            }
        });
        fri12amBtn = (Button)findViewById(R.id.fri12amBtn);
        fri12amBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i35 = new Intent(getApplicationContext(),createEvent.class);
                i35.putExtra("id","35");
                startActivity(i35);
            }
        });





        sat1pmBtn = (Button)findViewById(R.id.sat1pmBtn);
        sat1pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i36 = new Intent(getApplicationContext(),createEvent.class);
                i36.putExtra("id","36");
                startActivity(i36);
            }
        });
        sun1pmBtn = (Button)findViewById(R.id.sun1pmBtn);
        sun1pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i37 = new Intent(getApplicationContext(),createEvent.class);
                i37.putExtra("id","37");
                startActivity(i37);
            }
        });
        mon1pmBtn = (Button)findViewById(R.id.mon1pmBtn);
        mon1pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i38 = new Intent(getApplicationContext(),createEvent.class);
                i38.putExtra("id","38");
                startActivity(i38);
            }
        });
        tue1pmBtn = (Button)findViewById(R.id.tue1pmBtn);
        tue1pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i39 = new Intent(getApplicationContext(),createEvent.class);
                i39.putExtra("id","39");
                startActivity(i39);
            }
        });
        wed1pmBtn = (Button)findViewById(R.id.wed1pmBtn);
        wed1pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i40 = new Intent(getApplicationContext(),createEvent.class);
                i40.putExtra("id","40");
                startActivity(i40);
            }
        });
        thur1pmBtn = (Button)findViewById(R.id.thur1pmBtn);
        thur1pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i41 = new Intent(getApplicationContext(),createEvent.class);
                i41.putExtra("id","41");
                startActivity(i41);
            }
        });
        fri1pmBtn = (Button)findViewById(R.id.fri1pmBtn);
        fri1pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i42 = new Intent(getApplicationContext(),createEvent.class);
                i42.putExtra("id","42");
                startActivity(i42);
            }
        });





        sat2pmBtn = (Button)findViewById(R.id.sat2pmBtn);
        sat2pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i43 = new Intent(getApplicationContext(),createEvent.class);
                i43.putExtra("id","43");
                startActivity(i43);
            }
        });
        sun2pmBtn = (Button)findViewById(R.id.sun2pmBtn);
        sun2pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i44 = new Intent(getApplicationContext(),createEvent.class);
                i44.putExtra("id","44");
                startActivity(i44);
            }
        });
        mon2pmBtn = (Button)findViewById(R.id.mon2pmBtn);
        mon2pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i45 = new Intent(getApplicationContext(),createEvent.class);
                i45.putExtra("id","45");
                startActivity(i45);
            }
        });
        tue2pmBtn = (Button)findViewById(R.id.tue2pmBtn);
        tue2pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i46 = new Intent(getApplicationContext(),createEvent.class);
                i46.putExtra("id","46");
                startActivity(i46);
            }
        });
        wed2pmBtn = (Button)findViewById(R.id.wed2pmBtn);
        wed2pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i47 = new Intent(getApplicationContext(),createEvent.class);
                i47.putExtra("id","47");
                startActivity(i47);
            }
        });
        thur2pmBtn = (Button)findViewById(R.id.thur2pmBtn);
        thur2pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i48 = new Intent(getApplicationContext(),createEvent.class);
                i48.putExtra("id","48");
                startActivity(i48);
            }
        });
        fri2pmBtn = (Button)findViewById(R.id.fri2pmBtn);
        fri2pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i49 = new Intent(getApplicationContext(),createEvent.class);
                i49.putExtra("id","49");
                startActivity(i49);
            }
        });





        sat3pmBtn = (Button)findViewById(R.id.sat3pmBtn);
        sat3pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i50 = new Intent(getApplicationContext(),createEvent.class);
                i50.putExtra("id","50");
                startActivity(i50);
            }
        });
        sun3pmBtn = (Button)findViewById(R.id.sun3pmBtn);
        sun3pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i51 = new Intent(getApplicationContext(),createEvent.class);
                i51.putExtra("id","51");
                startActivity(i51);
            }
        });
        mon3pmBtn = (Button)findViewById(R.id.mon3pmBtn);
        mon3pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i52 = new Intent(getApplicationContext(),createEvent.class);
                i52.putExtra("id","52");
                startActivity(i52);
            }
        });
        tue3pmBtn = (Button)findViewById(R.id.tue3pmBtn);
        tue3pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i53 = new Intent(getApplicationContext(),createEvent.class);
                i53.putExtra("id","53");
                startActivity(i53);
            }
        });
        wed3pmBtn = (Button)findViewById(R.id.wed3pmBtn);
        wed3pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i54 = new Intent(getApplicationContext(),createEvent.class);
                i54.putExtra("id","54");
                startActivity(i54);
            }
        });
        thur3pmBtn = (Button)findViewById(R.id.thur3pmBtn);
        thur3pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i55 = new Intent(getApplicationContext(),createEvent.class);
                i55.putExtra("id","55");
                startActivity(i55);
            }
        });
        fri3pmBtn = (Button)findViewById(R.id.fri3pmBtn);
        fri3pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i56 = new Intent(getApplicationContext(),createEvent.class);
                i56.putExtra("id","56");
                startActivity(i56);
            }
        });




        sat4pmBtn = (Button)findViewById(R.id.sat4pmBtn);
        sat4pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i57 = new Intent(getApplicationContext(),createEvent.class);
                i57.putExtra("id","57");
                startActivity(i57);
            }
        });
        sun4pmBtn = (Button)findViewById(R.id.sun4pmBtn);
        sun4pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i58 = new Intent(getApplicationContext(),createEvent.class);
                i58.putExtra("id","58");
                startActivity(i58);
            }
        });
        mon4pmBtn = (Button)findViewById(R.id.mon4pmBtn);
        mon4pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i59 = new Intent(getApplicationContext(),createEvent.class);
                i59.putExtra("id","59");
                startActivity(i59);
            }
        });
        tue4pmBtn = (Button)findViewById(R.id.tue4pmBtn);
        tue4pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i60 = new Intent(getApplicationContext(),createEvent.class);
                i60.putExtra("id","60");
                startActivity(i60);
            }
        });
        wed4pmBtn = (Button)findViewById(R.id.wed4pmBtn);
        wed4pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i61 = new Intent(getApplicationContext(),createEvent.class);
                i61.putExtra("id","61");
                startActivity(i61);
            }
        });
        thur4pmBtn = (Button)findViewById(R.id.thur4pmBtn);
        thur4pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i62 = new Intent(getApplicationContext(),createEvent.class);
                i62.putExtra("id","62");
                startActivity(i62);
            }
        });
        fri4pmBtn = (Button)findViewById(R.id.fri4pmBtn);
        fri4pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i63 = new Intent(getApplicationContext(),createEvent.class);
                i63.putExtra("id","63");
                startActivity(i63);
            }
        });




        sat5pmBtn = (Button)findViewById(R.id.sat5pmBtn);
        sat5pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i64 = new Intent(getApplicationContext(),createEvent.class);
                i64.putExtra("id","64");
                startActivity(i64);
            }
        });
        sun5pmBtn = (Button)findViewById(R.id.sun5pmBtn);
        sun5pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i65 = new Intent(getApplicationContext(),createEvent.class);
                i65.putExtra("id","65");
                startActivity(i65);
            }
        });
        mon5pmBtn = (Button)findViewById(R.id.mon5pmBtn);
        mon5pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i66 = new Intent(getApplicationContext(),createEvent.class);
                i66.putExtra("id","66");
                startActivity(i66);
            }
        });
        tue5pmBtn = (Button)findViewById(R.id.tue5pmBtn);
        tue5pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i67 = new Intent(getApplicationContext(),createEvent.class);
                i67.putExtra("id","67");
                startActivity(i67);
            }
        });
        wed5pmBtn = (Button)findViewById(R.id.wed5pmBtn);
        wed5pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i68 = new Intent(getApplicationContext(),createEvent.class);
                i68.putExtra("id","68");
                startActivity(i68);
            }
        });
        thur5pmBtn = (Button)findViewById(R.id.thur5pmBtn);
        thur5pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i69 = new Intent(getApplicationContext(),createEvent.class);
                i69.putExtra("id","69");
                startActivity(i69);
            }
        });
        fri5pmBtn = (Button)findViewById(R.id.fri5pmBtn);
        fri5pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i70 = new Intent(getApplicationContext(),createEvent.class);
                i70.putExtra("id","70");
                startActivity(i70);
            }
        });





        sat6pmBtn = (Button)findViewById(R.id.sat6pmBtn);
        sat6pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i71 = new Intent(getApplicationContext(),createEvent.class);
                i71.putExtra("id","71");
                startActivity(i71);
            }
        });
        sun6pmBtn = (Button)findViewById(R.id.sun6pmBtn);
        sun6pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i72 = new Intent(getApplicationContext(),createEvent.class);
                i72.putExtra("id","72");
                startActivity(i72);
            }
        });
        mon6pmBtn = (Button)findViewById(R.id.mon6pmBtn);
        mon6pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i73 = new Intent(getApplicationContext(),createEvent.class);
                i73.putExtra("id","73");
                startActivity(i73);
            }
        });
        tue6pmBtn = (Button)findViewById(R.id.tue6pmBtn);
        tue6pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i74= new Intent(getApplicationContext(),createEvent.class);
                i74.putExtra("id","74");
                startActivity(i74);
            }
        });
        wed6pmBtn = (Button)findViewById(R.id.wed6pmBtn);
        wed6pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i75 = new Intent(getApplicationContext(),createEvent.class);
                i75.putExtra("id","75");
                startActivity(i75);
            }
        });
        thur6pmBtn = (Button)findViewById(R.id.thur6pmBtn);
        thur6pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i76 = new Intent(getApplicationContext(),createEvent.class);
                i76.putExtra("id","76");
                startActivity(i76);
            }
        });
        fri6pmBtn = (Button)findViewById(R.id.fri6pmBtn);
        fri6pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i77 = new Intent(getApplicationContext(),createEvent.class);
                i77.putExtra("id","77");
                startActivity(i77);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        notify("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        notify("onResume");

    }
    @Override
     protected void onStart(){
         super.onStart();
         notify("onStart");

        if(db.getName(1) != null){
            sat8amBtn.setText(db.getName(1));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat8amBtn.setText("+");
        }

        if(db.getName(2) != null){
            sun8amBtn.setText(db.getName(2));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun8amBtn.setText("+");
        }


        if(db.getName(3) != null){
            mon8amBtn.setText(db.getName(3));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon8amBtn.setText("+");
        }


        if(db.getName(4) != null){
            tue8amBtn.setText(db.getName(4));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue8amBtn.setText("+");
        }

        if(db.getName(5) != null){
            wed8amBtn.setText(db.getName(5));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed8amBtn.setText("+");
        }


        if(db.getName(6) != null){
            thur8amBtn.setText(db.getName(6));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur8amBtn.setText("+");
        }


        if(db.getName(7) != null){
            fri8amBtn.setText(db.getName(7));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri8amBtn.setText("+");
        }






        if(db.getName(8) != null){
            sat9amBtn.setText(db.getName(8));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat9amBtn.setText("+");
        }

        if(db.getName(9) != null){
            sun9amBtn.setText(db.getName(9));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun9amBtn.setText("+");
        }


        if(db.getName(10) != null){
            mon9amBtn.setText(db.getName(10));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon9amBtn.setText("+");
        }


        if(db.getName(11) != null){
            tue9amBtn.setText(db.getName(11));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue9amBtn.setText("+");
        }

        if(db.getName(12) != null){
            wed9amBtn.setText(db.getName(12));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed9amBtn.setText("+");
        }


        if(db.getName(13) != null){
            thur9amBtn.setText(db.getName(13));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur9amBtn.setText("+");
        }


        if(db.getName(14) != null){
            fri9amBtn.setText(db.getName(14));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri9amBtn.setText("+");
        }







        if(db.getName(15) != null){
            sat10amBtn.setText(db.getName(15));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat10amBtn.setText("+");
        }

        if(db.getName(16) != null){
            sun10amBtn.setText(db.getName(16));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun10amBtn.setText("+");
        }


        if(db.getName(17) != null){
            mon10amBtn.setText(db.getName(17));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon10amBtn.setText("+");
        }


        if(db.getName(18) != null){
            tue10amBtn.setText(db.getName(18));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue10amBtn.setText("+");
        }

        if(db.getName(19) != null){
            wed10amBtn.setText(db.getName(19));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed10amBtn.setText("+");
        }


        if(db.getName(20) != null){
            thur10amBtn.setText(db.getName(20));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur10amBtn.setText("+");
        }


        if(db.getName(21) != null){
            fri10amBtn.setText(db.getName(21));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri10amBtn.setText("+");
        }






        if(db.getName(22) != null){
            sat11amBtn.setText(db.getName(22));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat11amBtn.setText("+");
        }

        if(db.getName(23) != null){
            sun11amBtn.setText(db.getName(23));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun11amBtn.setText("+");
        }


        if(db.getName(24) != null){
            mon11amBtn.setText(db.getName(24));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon11amBtn.setText("+");
        }


        if(db.getName(25) != null){
            tue11amBtn.setText(db.getName(25));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue11amBtn.setText("+");
        }

        if(db.getName(26) != null){
            wed11amBtn.setText(db.getName(26));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed11amBtn.setText("+");
        }


        if(db.getName(27) != null){
            thur11amBtn.setText(db.getName(27));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur11amBtn.setText("+");
        }


        if(db.getName(28) != null){
            fri11amBtn.setText(db.getName(28));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri11amBtn.setText("+");
        }





        if(db.getName(29) != null){
            sat12amBtn.setText(db.getName(29));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat12amBtn.setText("+");
        }

        if(db.getName(30) != null){
            sun12amBtn.setText(db.getName(30));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun12amBtn.setText("+");
        }


        if(db.getName(31) != null){
            mon12amBtn.setText(db.getName(31));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon12amBtn.setText("+");
        }


        if(db.getName(32) != null){
            tue12amBtn.setText(db.getName(32));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue12amBtn.setText("+");
        }

        if(db.getName(33) != null){
            wed12amBtn.setText(db.getName(33));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed12amBtn.setText("+");
        }


        if(db.getName(34) != null){
            thur12amBtn.setText(db.getName(34));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur12amBtn.setText("+");
        }


        if(db.getName(35) != null){
            fri12amBtn.setText(db.getName(35));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri12amBtn.setText("+");
        }





        if(db.getName(36) != null){
            sat1pmBtn.setText(db.getName(36));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat1pmBtn.setText("+");
        }

        if(db.getName(37) != null){
            sun1pmBtn.setText(db.getName(37));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun1pmBtn.setText("+");
        }


        if(db.getName(38) != null){
            mon1pmBtn.setText(db.getName(38));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon1pmBtn.setText("+");
        }


        if(db.getName(39) != null){
            tue1pmBtn.setText(db.getName(39));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue1pmBtn.setText("+");
        }

        if(db.getName(40) != null){
            wed1pmBtn.setText(db.getName(40));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed1pmBtn.setText("+");
        }


        if(db.getName(41) != null){
            thur1pmBtn.setText(db.getName(41));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur1pmBtn.setText("+");
        }


        if(db.getName(42) != null){
            fri1pmBtn.setText(db.getName(42));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri1pmBtn.setText("+");
        }







        if(db.getName(43) != null){
            sat2pmBtn.setText(db.getName(43));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat2pmBtn.setText("+");
        }

        if(db.getName(44) != null){
            sun2pmBtn.setText(db.getName(44));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun2pmBtn.setText("+");
        }


        if(db.getName(45) != null){
            mon2pmBtn.setText(db.getName(45));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon2pmBtn.setText("+");
        }


        if(db.getName(46) != null){
            tue2pmBtn.setText(db.getName(46));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue2pmBtn.setText("+");
        }

        if(db.getName(47) != null){
            wed2pmBtn.setText(db.getName(47));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed2pmBtn.setText("+");
        }


        if(db.getName(48) != null){
            thur2pmBtn.setText(db.getName(48));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur2pmBtn.setText("+");
        }


        if(db.getName(49) != null){
            fri2pmBtn.setText(db.getName(49));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri2pmBtn.setText("+");
        }






        if(db.getName(50) != null){
            sat3pmBtn.setText(db.getName(50));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat3pmBtn.setText("+");
        }

        if(db.getName(51) != null){
            sun3pmBtn.setText(db.getName(51));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun3pmBtn.setText("+");
        }


        if(db.getName(52) != null){
            mon3pmBtn.setText(db.getName(52));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon3pmBtn.setText("+");
        }


        if(db.getName(53) != null){
            tue3pmBtn.setText(db.getName(53));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue3pmBtn.setText("+");
        }

        if(db.getName(54) != null){
            wed3pmBtn.setText(db.getName(54));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed3pmBtn.setText("+");
        }


        if(db.getName(55) != null){
            thur3pmBtn.setText(db.getName(55));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur3pmBtn.setText("+");
        }


        if(db.getName(56) != null){
            fri3pmBtn.setText(db.getName(56));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri3pmBtn.setText("+");
        }






        if(db.getName(57) != null){
            sat4pmBtn.setText(db.getName(57));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat4pmBtn.setText("+");
        }

        if(db.getName(58) != null){
            sun4pmBtn.setText(db.getName(58));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun4pmBtn.setText("+");
        }


        if(db.getName(59) != null){
            mon4pmBtn.setText(db.getName(59));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon4pmBtn.setText("+");
        }


        if(db.getName(60) != null){
            tue4pmBtn.setText(db.getName(60));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue4pmBtn.setText("+");
        }

        if(db.getName(61) != null){
            wed4pmBtn.setText(db.getName(61));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed4pmBtn.setText("+");
        }


        if(db.getName(62) != null){
            thur4pmBtn.setText(db.getName(62));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur4pmBtn.setText("+");
        }


        if(db.getName(63) != null){
            fri4pmBtn.setText(db.getName(63));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri4pmBtn.setText("+");
        }






        if(db.getName(64) != null){
            sat5pmBtn.setText(db.getName(64));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat5pmBtn.setText("+");
        }

        if(db.getName(65) != null){
            sun5pmBtn.setText(db.getName(65));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun5pmBtn.setText("+");
        }


        if(db.getName(66) != null){
            mon5pmBtn.setText(db.getName(66));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon5pmBtn.setText("+");
        }


        if(db.getName(67) != null){
            tue5pmBtn.setText(db.getName(67));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue5pmBtn.setText("+");
        }

        if(db.getName(68) != null){
            wed5pmBtn.setText(db.getName(68));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed5pmBtn.setText("+");
        }


        if(db.getName(69) != null){
            thur5pmBtn.setText(db.getName(69));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur5pmBtn.setText("+");
        }


        if(db.getName(70) != null){
            fri5pmBtn.setText(db.getName(70));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri5pmBtn.setText("+");
        }




        if(db.getName(71) != null){
            sat6pmBtn.setText(db.getName(71));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sat6pmBtn.setText("+");
        }

        if(db.getName(72) != null){
            sun6pmBtn.setText(db.getName(72));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            sun6pmBtn.setText("+");
        }


        if(db.getName(73) != null){
            mon6pmBtn.setText(db.getName(73));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            mon6pmBtn.setText("+");
        }


        if(db.getName(74) != null){
            tue6pmBtn.setText(db.getName(74));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            tue6pmBtn.setText("+");
        }

        if(db.getName(75) != null){
            wed6pmBtn.setText(db.getName(75));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            wed6pmBtn.setText("+");
        }


        if(db.getName(76) != null){
            thur6pmBtn.setText(db.getName(76));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            thur6pmBtn.setText("+");
        }


        if(db.getName(77) != null){
            fri6pmBtn.setText(db.getName(77));
            //if (db.getType(1)=="Social") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.GREEN,null));
            //if (db.getType(1)=="Professional") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.BLUE,null));
            //if (db.getType(1)=="Educational") sat8amBtn.setBackgroundColor(getResources().getColor(R.color.YELLOW,null));
        }
        else {
            fri6pmBtn.setText("+");
        }
     }
    @Override
    protected void onStop() {
        super.onStop();
        notify("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        notify("onDestroy");
    }

   /* @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        notify("onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        notify("onSaveInstanceState");
    }*/

    private void notify(String methodName) {
        Log.d("HomeActivity: ",methodName);
    }



}
