import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField t1 = new TextField(), t2 = new TextField(), res = new TextField();
    Button add = new Button("+"), sub = new Button("-"), mul = new Button("*"), div = new Button("/");

    SimpleCalculator() {
        setLayout(new GridLayout(4,2));
        add(new Label("First:")); add(t1);
        add(new Label("Second:")); add(t2);
        add(add); add(sub);
        add(mul); add(div);
        add(res);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300,200);
        setTitle("Simple Calculator");
        setVisible(true);

        addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ dispose(); } });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;
            if(e.getSource()==add) r=a+b;
            else if(e.getSource()==sub) r=a-b;
            else if(e.getSource()==mul) r=a*b;
            else if(e.getSource()==div) r=a/b;
            res.setText(""+r);
        } catch(Exception ex) { res.setText("Error"); }
    }

    public static void main(String[] args) { new SimpleCalculator(); }
}
