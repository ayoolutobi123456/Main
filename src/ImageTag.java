/**
 * Created by theotherone on 16/05/2017.
 */
public class ImageTag extends Tag {

    ImageTag arrayOfBytes;

    public ImageTag(String name, float xPosition, float yPosition, ImageTag bytesOfArray) {
        super(name, xPosition, yPosition);
        arrayOfBytes = bytesOfArray;
    }

    public void render(){
       expressoGraphics.drawImage(xPosition, yPosition, expressoGraphics.loadImageUrl(arrayOfBytes));
    }
}
