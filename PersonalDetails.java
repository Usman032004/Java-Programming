import java.awt.*;
import java.awt.event.*;
public class PersonalDetails 
{
   public static void main(String args[])
   {
      Frame f = new Frame("Button Example");
      Label l = new Label ("Welcome to My Page");
      l.setFont(new Font ("Calibri",Font.BOLD,16));
      Label fnl = new Label();
      Label mnl = new Label();
      Label lnl = new Label();
      Label rl = new Label();
      Label al = new Label();
      l.setBounds(250,30,600,50);
      fnl.setBounds(20,120,600,30);
      mnl.setBounds(20,160,600,30);
      lnl.setBounds(20,200,600,30);
      rl.setBounds(20,240,600,30);
      al.setBounds(20,280,600,30);
      Button mb = new Button ("Click Here For Personal Details");
      mb.setFont(new Font("Calibri", Font.BOLD,16));
      mb.setBounds(210,70,320,30);
      mb.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e)
         {
            fnl.setText("Full Name:sally");
            mnl.setText("Father Name: Ron Mother Name: Vinny Age:19");
            lnl.setText("Roll_no: U18AS23S035 Colege Name : Al-Ameen Institute of Information Sciences");
            al.setText("Address: Opp.lalbagh main Gate,Bangalore");
         }
      }
      );
      f.add(mb);
      f.add(l);
      f.add(fnl);
      f.add(mnl);
      f.add(lnl);
      f.add(rl);
      f.add(al);
      f.setSize(600,600);
      f.setLayout(null);
      f.setVisible(true);
   }
}

