/**
 * Created by theotherone on 16/05/2017.
 */
public abstract class Tag {


    public String Name;
    public float xPosition;
    public float yPosition;

    ExpressoGraphics expressoGraphics;



    public Tag(String name, float positionX, float positionY) {

        Name = name;
        xPosition = positionX;
        yPosition = positionY;
    }

    public String getName() {
        return Name;
    }

    public float getXPosition() {
        return xPosition;
    }

    public float getYPosition() {
        return yPosition;
    }

    public abstract void render();

}

