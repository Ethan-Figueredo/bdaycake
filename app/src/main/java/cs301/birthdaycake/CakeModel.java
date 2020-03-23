package cs301.birthdaycake;

public class CakeModel {
    public boolean candleLit = true;
    public int candleCount = 2;
    public boolean frost = true;
    public boolean ifCakeCandles = true;
    public float[] balloonCoordinates = new float[]{-1f,-1f};

    double xPos;
    float ypos;
    /**
     *Constructor
     *
     * */
    public CakeModel(){
        System.out.println("Model Created");
    }
}
