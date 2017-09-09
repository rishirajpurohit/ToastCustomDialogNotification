package in.rishirajpurohit.android.notificationdemo_1;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Toast
        Button my_button = (Button) findViewById(R.id.button);
        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast my_toast = Toast.makeText(MainActivity.this, "Hi there", Toast.LENGTH_SHORT);
                my_toast.show();
            }
        });

        //Dialog
//        AlertDialog.Builder my_builder = new AlertDialog.Builder(MainActivity.this);
//
//        my_builder.setPositiveButton("okay", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "you clicked okay", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        my_builder.setNegativeButton("Go Back", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast my_toast = Toast.makeText(MainActivity.this, "Negative button clicked", Toast.LENGTH_SHORT);
//                my_toast.show();
//            }
//        });
////
//        my_builder.setMessage("Are you sure you want to delete ? ");
//        my_builder.setTitle("my dialog");
//
//        AlertDialog my_dialog = my_builder.create();
//        my_dialog.show();

//
//        Intent i = new Intent(MainActivity.this,Main2Activity.class);
//        PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this,8265,i,0);
//        my_notif_builder.setContentIntent(pIntent);
//
//        my_notif_builder.addAction(R.mipmap.ic_launcher_round,"GO",pIntent);
//
//

        NotificationCompat.Builder my_notif_builder = new NotificationCompat.Builder(MainActivity.this);



        my_notif_builder.setSmallIcon(R.mipmap.ic_launcher);
        my_notif_builder.setContentText("First Notification COntent");
        my_notif_builder.setContentTitle("First Notification COntent");

        Notification notif = my_notif_builder.build();


        NotificationManager notif_manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        notif_manager.notify(654664,notif);

//        notif_manager.notify(3874683,notif);






//            PendingIntent pintent = ();

//
//        AlarmManager alarm_manager = (AlarmManager) getSystemService(ALARM_SERVICE);
//        alarm_manager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,93785654,2763,);


    }


}
