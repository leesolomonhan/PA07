import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class finalproject {

        finalproject(){

            JFrame frame=new JFrame("Final Project");


            JTabbedPane tabpane=new JTabbedPane();
            tabpane.setBounds(100,100,500,500);  //Size of the screens associated with the tabs
                //This if the first tab
                JPanel tab1=new JPanel();
                JTextField text= new JTextField("This is the first tab");
                //This adds the date and time
                String date = new SimpleDateFormat("MM/dd/yyyy | hh:mm:ss").format(new Date());
                JLabel datelabel = new JLabel(date);
                //adding it to the tab1
                tab1.add(datelabel);
                tab1.add(text);
                Slider sliderWidget = new Slider();
                JButton load = new JButton("Load File");
                JButton enter = new JButton("Encryption Level");
                JButton set = new JButton("Set");
                tab1.add(load);
                tab1.add(enter);
                tab1.add(set);
		tab1.add(sliderWidget);
                tabpane.add("Main",tab1);
                
				


                //This is the second tab
                JPanel tab2=new JPanel();
                JTextField text2= new JTextField("This is the second page on the tab");
                //This adds the date and time
                String date2 = new SimpleDateFormat("MM/dd/yyyy | hh:mm:ss").format(new Date());
                JLabel datelabel2 = new JLabel(date);
                //adding it to the tab2
                tab2.add(datelabel2);
                tab2.add(text2);
                tabpane.add("Visit",tab2);

			
			load.addActionListener(new ActionListener() {
 				public void actionPerformed(ActionEvent e){
   					try{
    					JFileChooser chooser = new JFileChooser();
      					chooser.showOpenDialog(null);
      					File f = chooser.getSelectedFile();
      					Scanner file = new Scanner(new File(f.getAbsolutePath()));

    				} catch (IOException f){
    					System.out.println("Error "+f);
					}
				}
			});
			
			set.addActionListener(new ActionListener() {
 				public void actionPerformed(ActionEvent e){
  					Slider.set();	
				}
			});

            frame.add(tabpane);
            frame.setSize(700,700);
            frame.setLayout(null);
            frame.setVisible(true);
        }


          public static void main(String[] args) {
              new finalproject();
          }
}
