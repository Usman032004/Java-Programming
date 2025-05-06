import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseListenerExample implements MouseListener
{
   Label lbl1,lbl2;
   Frame fr;
   String s;
   MouseListenerExample()
   {
      fr = new Frame("Java Mouse Listener Example");
      lbl1 = new Label("Demo For the Mouse Event", Label.CENTER);
      lbl2 = new Label();
      fr.setLayout(new FlowLayout());
      fr.add(lbl1);
      fr.add(lbl2);
      fr.addMouseListener(this);
      fr.setSize(250,250);
      fr.setVisible(true);
   }
   public void mouseClicked(MouseEvent ev)
   {
      lbl2.setText("Mouse Button Clicked");
      fr.setVisible(true);
   }
   public void mouseEntered(MouseEvent ev)
   {
      lbl2.setText("Mouse has Entered the area of Windows");
      fr.setVisible(true);
   }
   public void mouseExited(MouseEvent ev)
   {
      lbl2.setText("Mouse has left the area of Windows");
      fr.setVisible(true);
   }
   public void mousePressed (MouseEvent ev)
   {
      lbl2.setText("Mouse Button is being Pressed");
      fr.setVisible(true);
   }
   public void mouseReleased (MouseEvent ev)
   {
      lbl2.setText("mouse Released");
      fr.setVisible(true);
   }
   public static void main(String args[])
   {
      new MouseListenerExample();
   }
   }