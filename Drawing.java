
/**
 * Write a description of class buscard here.
 *
 * @author Jacob Neiheisel
 * @version 15 August 2020 version one
 */

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.lang.ClassLoader;
import java.net.*;
public class Drawing extends JPanel{
    //https://stackoverflow.com/questions/6714045/how-to-resize-jlabel-imageicon
    //https://www.dummies.com/programming/java/how-to-write-java-code-to-show-an-image-on-the-screen/
    public static void estabframe() {
        JFrame f = new JFrame();
        f.setContentPane(new Drawing());
        f.setSize(600, 400);
        // ImageIcon icon = new ImageIcon("jacob.jpg");
        // Image image = icon.getImage(); // transform it 
        // Image newimg = image.getScaledInstance(120, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        // icon = new ImageIcon(newimg);  // transform it back
        //JLabel label = new JLabel(icon);
        //f.add(label);
        // f.setDefaultCloseOperation
        // (JFrame.EXIT_ON_CLOSE);
        // f.pack();
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        // this statement required
        super.paintComponent(g);

        // Get the current width and height of the drawing.
        int drawing_width = getWidth();
        int drawing_height = getHeight();
        // optional: paint the background color (default is white)
        setBackground(new Color(170,169,173));

        // draw a solid and empty rectangle
        g.setColor(new Color(10,126,140));
        
        g.drawRect(drawing_width*1/100,drawing_height*1/100, drawing_width*98/100, drawing_height*98/100);
        g.drawRect(drawing_width*2/100, drawing_height*2/100, drawing_width*96/100, drawing_height*96/100);
        // draw a solid and empty oval
        g.setColor(new Color(2, 132, 130));
        
        g.fillRect(drawing_width*49/100-drawing_width*1/160, drawing_height*29/100+drawing_height*7/ 80, drawing_width*1/15, drawing_height*1/ 10);
        g.drawOval(drawing_width*49/100, drawing_height*29/ 100, drawing_width*67/1200, drawing_height*7/ 40);
        g.setColor(new Color(217, 234, 217));
        g.drawLine(drawing_width*49/100, drawing_height*29/100+drawing_height*14/ 80, drawing_width*49/100+drawing_width*83/1500, drawing_height*29/100+drawing_height*14/ 80);
        g.drawLine(drawing_width*49/100, drawing_height*29/100+drawing_height*77/ 800, drawing_width*49/100+drawing_width*83/1500, drawing_height*29/100+drawing_height*77/ 800);
        g.fillOval(drawing_width*49/100+drawing_width*14/1200, drawing_height*29/100+drawing_height*7/ 80+drawing_height*1/ 40, drawing_width*1/30, drawing_height*1/ 20);
 
        //define the image
        //https://www.javatpoint.com/Displaying-image-in-swing
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("jacob1.jpg");
        int xpic = drawing_width*70 / 100;
        if(drawing_width>650 && drawing_width<=700){
            xpic =drawing_width*73 / 100;
        }
        else if(drawing_width>700 && drawing_width<=750){
            xpic =drawing_width*75 / 100;
        }
        else if(drawing_width>750 && drawing_width<=800){
            xpic =drawing_width*765 / 1000;
        }
        else if(drawing_width>800 && drawing_width<=850){
            xpic =drawing_width*78 / 100;
        }
        else if(drawing_width>850 && drawing_width<=900){
            xpic =drawing_width*79 / 100;
        }
        else if(drawing_width>900 && drawing_width<=950){
            xpic =drawing_width*80 / 100;
        }
        else if(drawing_width>950 && drawing_width<=1000){
            xpic =drawing_width*81 / 100;
        }
        else if(drawing_width>1000 && drawing_width<=1050){
            xpic =drawing_width*82 / 100;
        }
        else if(drawing_width>1050 && drawing_width<=1100){
            xpic =drawing_width*83/ 100;
        }
        else if(drawing_width>1100 && drawing_width<=1150){
            xpic =drawing_width*835 / 1000;
        }
        else if(drawing_width>1150 && drawing_width<=1200){
            xpic =drawing_width*84 / 100;
        }
        else if(drawing_width>1200 && drawing_width<=1250){
            xpic =drawing_width*85/ 100;
        }
        else if(drawing_width>1250 && drawing_width<=1300){
            xpic =drawing_width*855 / 1000;
        }
        else if(drawing_width>1300 && drawing_width<=1350){
            xpic =drawing_width*86 / 100;
        }
        else if(drawing_width>1350 && drawing_width<=1400){
            xpic =drawing_width*865 / 1000;
        }
        else if(drawing_width>1400 && drawing_width<=1450){
            xpic =drawing_width*87/ 100;
        }
        else if(drawing_width>1450 && drawing_width<=1500){
            xpic =drawing_width*875 / 1000;
        }
        else if(drawing_width>1500 && drawing_width<=1550){
            xpic =drawing_width*877 / 1000;
        }
        else if(drawing_width>1550 && drawing_width<=1600){
            xpic =drawing_width*88 / 100;
        }
        int ypic = drawing_height*5 / 100;
        int ytext = drawing_height*65 / 100;
        g.drawImage(i, xpic,ypic,this); 
        //http://java2everyone.blogspot.com/2009/02/draw-triangle-in-jpanel.html
        
        int[]x={drawing_width*7 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*21 / 40};    
        int[]y={drawing_height*3 / 10,drawing_height*3 / 40,drawing_height*3 / 40,drawing_height*3 / 10}; 
      
        int[]x2={drawing_width*7 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*21 / 40};    
        int[]y2={drawing_height*3 / 10,drawing_height*21 / 40,drawing_height*21 / 40,drawing_height*3 / 10};
        
        int[]x3={drawing_width*9 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*2025 / 4000};    
        int[]y3={drawing_height*3 / 10,drawing_height*1/10,drawing_height*1/10,drawing_height*3 / 10}; 
        
        int[]x4={drawing_width*9 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*2025 / 4000};    
        int[]y4={drawing_height*3 / 10,drawing_height*20/40,drawing_height*20/40,drawing_height*3 / 10}; 
        
        int[]x5={drawing_width*11 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*195 / 400};    
        int[]y5={drawing_height*3 / 10,drawing_height*1/8,drawing_height*1/8,drawing_height*3 / 10}; 
        
        int[]x6={drawing_width*11 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*195 / 400};    
        int[]y6={drawing_height*3 / 10,drawing_height*19/40,drawing_height*19/40,drawing_height*3 / 10};
        
        int[]x7={drawing_width*13 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*1875 / 4000};    
        int[]y7={drawing_height*3 / 10,drawing_height*6/40,drawing_height*6/40,drawing_height*3 / 10}; 
        
        int[]x8={drawing_width*13 / 120,drawing_width*23 / 120,drawing_width*47 / 120,drawing_width*1875 / 4000};    
        int[]y8={drawing_height*3 / 10,drawing_height*18/40,drawing_height*18/40,drawing_height*3 / 10};
        
        
        g.setColor(new Color(225,81,25));   
        g.fillPolygon(x,y,4);
        g.fillPolygon(x2,y2,4);
        
        g.setColor(new Color(255,204,0)); 
        g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
        
        g.setColor(new Color(255,153,51)); 
        g.fillPolygon(x5,y5,4);
        g.fillPolygon(x6,y6,4);
        
        g.setColor(new Color(153,204,204)); 
        g.fillPolygon(x7,y7,4);
        g.fillPolygon(x8,y8,4);
        g.setColor(new Color(0,0,0)); 
        g.fillRect(drawing_width*275/1200,drawing_height*7/40, drawing_width*15/120, drawing_height*5/40);
        g.fillRect(drawing_width*320/1200, drawing_height*12/40, drawing_width*6/120, drawing_height*1/20);
        g.fillRect(drawing_width*275/1200, drawing_height*135/400, drawing_width*15/120, drawing_height*2/80);
        g.setColor(new Color(255,255,255));
        g.fillRect(drawing_width*288/1200,drawing_height*75/400, drawing_width*123/1200, drawing_height*37/400);
        g.setColor(new Color(1,1,1));  
        // display words
        Font font = new Font("Courier New", Font.BOLD, 18);
        g.setFont(font);
        g.setColor(new Color (0,0,80));
        g.drawString("Jacob Neiheisel", xpic-drawing_width*1 / 100, ytext);
        Font font1 = new Font("Arial", Font.PLAIN, 18);
        g.setFont(font1);
        g.drawString("Specializing in", xpic+drawing_width*1 / 100, ytext+50);
        g.drawString("Cybersecurity", xpic+drawing_width*1 / 100, ytext+100);
        Font font2 = new Font("Georgia", Font.PLAIN, 14);
        g.setFont(font2);
        g.drawString("1001 N Silvery Lane", drawing_width*3 / 100, ytext+50);
        g.drawString("Dearborn, Michigan 48128", drawing_width*3 / 100, ytext+75);
        g.drawString("Phone: 616-616-6161", drawing_width*3 / 100, ytext+100);
    } 
}