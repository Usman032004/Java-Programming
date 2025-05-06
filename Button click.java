import java.awt.*;
import java.awt.event.*;
public class Buttonclick 
{
   public static void main(String args[])
   {
      Frame f = new Frame ("Button Events");
      Label l = new Label("Details of Praents:");
      l.setFont(new Font("Calibri",Font.BOLD,16));
      Label nl = new Label();
      Label dl = new Label();
      Label al = new Label();
      l.setBounds(20,20,500,50);
      nl.setBounds(20,110,500,30);
      dl.setBounds(20,150,500,30);
      al.setBounds(20,190,500,30);
      Button mb = new Button("Mother");
      mb.setBounds(20,70,50,30);
      mb.addActionListener(new ActionListener() 
      {
      public void actionPerformed (ActionEvent e)
      {
         nl.setText("Name:" + " " + "sally");
         dl.setText("Desigation:" + " " + " Perfessor");
         al.setText("Age:" + " " + "42");
      }
   }
      );
      Button fb = new Button ("Father");
      fb.setBounds(80,70,50,30);
      fb.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            nl.setText("Name:" + " " + "Ron");
            dl.setText("Desigation:" + " " + "Managar");
            al.setText("Age:" + " " + "44");
         }
      }
      );
      f.add(mb);
      f.add(fb);
      f.add(l);
      f.add(nl);
      f.add(dl);
      f.add(al);
      f.setSize(250,250);
      f.setLayout(null);
      f.setVisible(true);
   }
}
