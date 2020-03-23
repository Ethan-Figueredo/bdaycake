package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import cs301.birthdaycake.CakeView;
import cs301.birthdaycake.CakeView;

public class CakeController implements  View.OnClickListener, CompoundButton.OnCheckedChangeListener,SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    private CakeView viewCake;
    private CakeModel modelCake;

    public CakeController(CakeView hey){
        this.viewCake = hey;
        this.modelCake = hey.getCakeModel();
    }

    public boolean onTouch(View v, MotionEvent event){
        float x = event.getX();
        float y = event.getY();
        modelCake.balloonCoordinates[0] = x;
        modelCake.balloonCoordinates[1] = y;
        modelCake.xPos = event.getX();
        modelCake.ypos = event.getY();
        viewCake.invalidate();
        return true;
    }
    @Override
    public void onClick(View view) {
        modelCake.candleLit = false;
        viewCake.invalidate();
    }



    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        viewCake.getCake().ifCakeCandles = !viewCake.getCake().ifCakeCandles;
        viewCake.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int prog, boolean b) {
        viewCake.getCake().candleCount = prog;
        viewCake.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
