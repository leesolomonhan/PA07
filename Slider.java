
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slider extends JFrame
        implements ActionListener, ChangeListener {
JSlider slide = new JSlider(0, 9, 0);
JButton reset = new JButton("Reset");
JTextField value = new JTextField();

public static void main(String[]args) {
  Slider x = new Slider();
  x.setVisible(true);
}
public Slider() {
  setLayout(new BorderLayout());
  setSize(500,200);
  setTitle("Value");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel center = new JPanel();
  JPanel end = new JPanel();
  end.setLayout(new FlowLayout());

  slide.setMajorTickSpacing(10);
  slide.setMinorTickSpacing(1);
  slide.setPaintTicks(true);
  slide.setPaintLabels(true);
  slide.addChangeListener(this);
  add("North", slide);

  center.add(new Label("Degree of Encryption"));
  center.add(value);
  value.setText("0");
  add("Center",center);

  reset.addActionListener(this);
  end.add(reset);
  add("South", end);
}

public void actionPerformed(ActionEvent e){
  if (e.getSource() == reset){
    reset();
  }
}
private void reset(){
  value.setText("0");
  slide.setValue(0);
}
  public void stateChanged(ChangeEvent e) {
    int values = slide.getValue();
    value.setText(""+values);
  }
}
