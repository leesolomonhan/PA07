
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slider extends JFrame
        implements ChangeListener {
JSlider slide = new JSlider(0, 9, 0);
JTextField value = new JTextField();

public Slider() {
  setLayout(new BorderLayout());
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

  add("South", end);
}

public int set(){
  int values = slide.getValue();
  value.setText(""+values);
  return values;
}
  public void stateChanged(ChangeEvent e) {
    int values = slide.getValue();
    value.setText(""+values);
  }
}
