/**
 * Created by theotherone on 16/05/2017.
 */
public class ParagraphTag extends Tag {

    public String textualDocument;

    public ParagraphTag(String name, float xPosition, float yPosition, String textualContent) {
        super(name, xPosition, yPosition);
        textualDocument = textualContent;
    }

    public void render(){
        expressoGraphics.drawText(Name, xPosition, yPosition, textualDocument);
    }
}
