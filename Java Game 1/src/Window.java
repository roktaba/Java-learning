import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {

    public Window (int width, int height, String title){
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
    }
}
