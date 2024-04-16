import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Temperatureconverter{
    static JFrame f;
    static JButton b2,b1;
    static JPanel p;
    static JTextArea t;
    static JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
   static  double s,m,n;
   static int bol;
    public static void main(String args[]){
         f = new JFrame("Temperature Converter");
         f.setSize(400 , 300);
         f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/andre/Desktop/Temperature Converter/icon1.png")); 
         b2 = new JButton("   Convert   ");
         b1 = new JButton("Reset");
         t = new JTextArea();
         t.setPreferredSize(new Dimension(150,25));
         l8 = new JLabel("                                                                                                                                                                                                                                                                                ");
         l = new JLabel("Your Temperature : ");
         l9 = new JLabel("Convert in : ");
         l1 = new JLabel("                                                                                                                                                                                                                                                                                ");
         l2 = new JLabel("                                                                                                                                                                                                                                                                                ");
         l3 = new JLabel("                                                                                                                                                                                                                                                                                ");
         l4 = new JLabel("Temperature in : ");
         l5 = new JLabel("                                                                                                                                                                                                                                                                                ");
         l6 = new JLabel("                                                                                                                                                                                                                                                                                ");
         l7 = new JLabel("                                                                                                                                                                                                                                                                                ");
         p = new JPanel();
         p.setPreferredSize(new Dimension(400 , 300));
         p.add(l8);
         p.add(l);
         p.add(t);
         p.add(b1);
         Choice list1 =new Choice();
         list1.setSize(150 , 25);
         list1.add("");
         list1.add("\u00B0"+"C"+"(Celsius)");
         list1.add("\u00B0"+"F"+"(Fahrenheit)");  
         list1.add("\u00B0"+"K"+"(Kelvin)");
         Choice list = new Choice();
         list.setSize(150 , 25);
         list.add("");
         list.add("\u00B0"+"C"+"(Celsius)");
         list.add("\u00B0"+"F"+"(Fahrenheit)");  
         list.add("\u00B0"+"K"+"(Kelvin)");
         p.add(l1);
         p.add(l7);
         p.add(l4);
         p.add(list);
         b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
              
              if(list.getSelectedItem()=="\u00B0"+"C"+"(Celsius)"){
                    if(list1.getSelectedItem()=="\u00B0"+"C"+"(Celsius)") {  
                      s = Double.parseDouble(t.getText());
                                                                           s = s + 0;
                                                                           String f = String.valueOf(s);
                                                                           t.setText(f); 
                                                                           s=0;
                    }
                    if(list1.getSelectedItem()=="\u00B0"+"K"+"(Kelvin)") {  
                      s = Double.parseDouble(t.getText());
                        s = s + 273.15;
                        String u = String.valueOf(s);
                        t.setText(u); 
                        s=0;
                   }
                   if(list1.getSelectedItem()=="\u00B0"+"F"+"(Fahrenheit)") {  
                    s = Double.parseDouble(t.getText());
                    s = (s * (double)9.0/5.0)+32;
                    String.format("%.2f" , s);
                    String.format("%%.2f" , s);
                    String.format("%%%.2f" , s);
                    Math.round(s);
                    String u = String.valueOf(s);
                    t.setText(u); 
                    s=0;
               }

            }
              if(list.getSelectedItem()=="\u00B0"+"K"+"(Kelvin)"){
                if(list1.getSelectedItem()=="\u00B0"+"C"+"(Celsius)") {  
                  s = Double.parseDouble(t.getText());
                                                                       s = s-273.15;
                                                                       String f = String.valueOf(s);
                                                                       t.setText(f); 
                                                                       s=0;
                }
                if(list1.getSelectedItem()=="\u00B0"+"K"+"(Kelvin)") {  
                  s = Double.parseDouble(t.getText());
                                                                           s = s + 0;
                                                                           String f = String.valueOf(s);
                                                                           t.setText(f);
                                                                           s=0;
               }
               if(list1.getSelectedItem()=="\u00B0"+"F"+"(Fahrenheit)") {  
                s = Double.parseDouble(t.getText());
                s = (s-273.15) * (double)(9.0/5.0)+32;
                String.format("%.2f" , s);
                String.format("%%.2f" , s);
                String.format("%%%.2f" , s);
                Math.round(s);
                String u = String.valueOf(s);
                t.setText(u); 
                s=0;
           }                                      
              }
              if(list.getSelectedItem()=="\u00B0"+"F"+"(Fahrenheit)"){
               
                if(list1.getSelectedItem()=="\u00B0"+"K"+"(Kelvin)") {  
                  s = Double.parseDouble(t.getText());
                    s = (s-32) * (double)(5.0/9.0)+273.15;
                    String.format("%.2f" , s);
                    String.format("%%.2f" , s);
                    String.format("%%%.2f" , s);
                    Math.round(s);
                    String u = String.valueOf(s);
                    t.setText(u); 
                    s=0;
               }
               if(list1.getSelectedItem()=="\u00B0"+"F"+"(Fahrenheit)") {  
                s = Double.parseDouble(t.getText());
                s = s+0;
                String u = String.valueOf(s);
                t.setText(u); 
                s=0;
               }
                if(list1.getSelectedItem()=="\u00B0"+"C"+"(Celsius)") {  
                  s = Double.parseDouble(t.getText());
                                                                       s = (s-32)*(double)(5.0/9.0);
                                                                       String.format("%.2f" , s);
                                                                       String.format("%%.2f" , s);
                                                                       String.format("%%%.2f" , s);
                                                                       String f = String.valueOf(s);
                                                                       Math.round(s);
                                                                       t.setText(f); 
                                                                       s=0;
                }                           
              } 
              if(e.getSource()==b2){  
                String x = t.getText();
                for(int i=0;i<x.length();i++){
                if ((Character.isLetter(x.charAt(i)) == true))  
                                                               bol=1; 
                }
                if(bol==1)
                           JOptionPane.showMessageDialog(f, "The input has letters in it ! Please insert a number !","Error", JOptionPane.ERROR_MESSAGE);
               if(t.getText().isEmpty() && list.getSelectedItem()=="" && list1.getSelectedItem()=="") 
                                 JOptionPane.showMessageDialog(f, "The input is empty ! Please insert a number !","Error", JOptionPane.ERROR_MESSAGE);
                          else
                                 l.setText("Your result : ");
              }
            } 
            });  
            b1.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                        l.setText("Your Temperature : ");
                        t.setText("");
                        list.removeAll();
                        list1.removeAll();
                        list.add("");
         list.add("\u00B0"+"C"+"(Celsius)");
         list.add("\u00B0"+"F"+"(Fahrenheit)");  
         list.add("\u00B0"+"K"+"(Kelvin)");
         list1.add("");
         list1.add("\u00B0"+"C"+"(Celsius)");
         list1.add("\u00B0"+"F"+"(Fahrenheit)");  
         list1.add("\u00B0"+"K"+"(Kelvin)");
                        
                }  
                });  
         p.add(l5);
         p.add(l9);
         p.add(list1);
         p.add(l6);
         p.add(b2);
         f.add(p);
         f.setVisible(true);
         f.setResizable(false);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}