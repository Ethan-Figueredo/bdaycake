package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);


        CakeView foundView = findViewById( R.id.cakeview );

        CakeController ourController = new CakeController(foundView);

        Button blowout = findViewById( R.id.button2 );
        blowout.setOnClickListener(ourController);

        Switch candleSwitch = findViewById( R.id.switch1 );
        candleSwitch.setOnCheckedChangeListener(ourController);

        SeekBar candleSeek = findViewById( R.id.seekBar );
        candleSeek.setOnSeekBarChangeListener(ourController);

        foundView.setOnTouchListener(ourController);


    }
    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }

}
