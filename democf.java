import java.awt.*;
import java.awt.event.*;
public class democf extends Frame implements ActionListener
{
Label l1,l2,l3,l4,l5;
TextField t1,t2,t3,t4,t5;
Button b1,b2,b3;
democf()
{
setSize(1000,1000);
setLayout(null);
setVisible(true);
setTitle("Tax sheet");

l1= new Label("Name");
l1.setBounds(200,200,100,50);
add(l1);

t1= new TextField();
t1.setBounds(500,200,100,50);
add(t1);

l2= new Label("Occupation");
l2.setBounds(200,300,100,50);
add(l2);

t2= new TextField();
t2.setBounds(500,300,100,50);
add(t2);

l3= new Label("Income");
l3.setBounds(200,400,100,50);
add(l3);

t3= new TextField();
t3.setBounds(500,400,100,50);
add(t3);

l4= new Label("Tax Percentage");
l4.setBounds(200,500,100,50);
add(l4);

t4= new TextField();
t4.setBounds(500,500,100,50);
add(t4);

l5= new Label("Income");
l5.setBounds(200,600,100,50);
add(l5);

t5= new TextField();
t5.setBounds(500,600,100,50);
add(t5);

b1= new Button("WT");
b1.setBounds(240,800,100,50);
add(b1);
b1.addActionListener(this);

b2= new Button("PT");
b2.setBounds(360,800,100,50);
add(b2);
b2.addActionListener(this);

b3= new Button("Exit");
b3.setBounds(480,800,100,50);
add(b3);
b3.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
if (ae.getSource()==b1)
{
int i= Integer.parseInt(t3.getText());
double j=i/0.2;
double k=i*0.44;
t4.setText(Double.toString(j));
t5.setText(Double.toString(k));
}

if (ae.getSource()==b2)
{
int i= Integer.parseInt(t3.getText());
double j=i/0.3;
double k=i*0.66;
t4.setText(Double.toString(j));
t5.setText(Double.toString(k));
}

if (ae.getSource()==b3)
{
System.exit(0);
}
}

public static void main(String ar[])
{
new democf();
}
}


