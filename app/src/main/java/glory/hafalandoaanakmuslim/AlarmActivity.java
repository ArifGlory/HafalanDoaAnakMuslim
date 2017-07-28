package glory.hafalandoaanakmuslim;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

//import Adapter.AlarmReceiver;

import static android.app.TimePickerDialog.*;

public class AlarmActivity extends AppCompatActivity {

    TimePicker timePicker;
    Button btn_setAlarm;
    TextView textAlarmPrompt,textDigitalAlarm;

    String digitAlarm;
    long nilaialarmDigit;
    TimePickerDialog timePickerDialog;
    final static int RQS1 = 1;
    private static final long delayAlarm = 1 *60 * 1000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        textAlarmPrompt = (TextView) findViewById(R.id.alarmprompt);
        btn_setAlarm = (Button) findViewById(R.id.btnSetAlarm);

        btn_setAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textAlarmPrompt.setText("");
                openTimePickerDialog(false);
            }
        });



    }

    private void openTimePickerDialog(Boolean is24r){

        Calendar calendar = Calendar.getInstance();
        //ini masi ad coding nya
        timePickerDialog = new TimePickerDialog(AlarmActivity.this,onTimeSetListener,calendar.get(Calendar.HOUR_OF_DAY),
                            calendar.get(Calendar.MINUTE),true);

        timePickerDialog.setTitle("Set Waktu Alarm");
        timePickerDialog.show();


    }

    OnTimeSetListener onTimeSetListener = new OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            Calendar calNow = Calendar.getInstance();
            Calendar calSet = (Calendar) calNow.clone();

            calSet.set(Calendar.HOUR_OF_DAY,hourOfDay);
            calSet.set(Calendar.MINUTE,minute);
            calSet.set(Calendar.SECOND,0);
            calSet.set(Calendar.MILLISECOND, 0);

            if (calSet.compareTo(calNow) <=0){
                //today set time passed,count to tomorow

                calSet.add(Calendar.DATE,1);
                Log.i("Hasil = ","<=0");
            }else if (calSet.compareTo(calNow) > 0){

                Log.i("Hasil = "," > 0");
            }else {

                Log.i("Hasil = ","else");
            }
            setAlarm(calSet);

        }
    };

    private void setAlarm(Calendar targetCal){
            textAlarmPrompt.setText("*****\n"+"Alarm Set On "+"\n"
                                    +targetCal.getTime()+"\n*****");

        Intent i = new Intent(getBaseContext(), AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getBaseContext(),RQS1,i,0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),pendingIntent);


    }
    DialogInterface.OnClickListener listener;


    /*public void btnSetAlarm(View view) {

        //textAlarmPrompt.setText("");
        openTimePickerDialog(false);

    }*/


}
