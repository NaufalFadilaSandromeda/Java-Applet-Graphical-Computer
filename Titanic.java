import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.Font;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Titanic extends JApplet{
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Titanic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Titanic();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }
    public void init() {
        setSize(850, 500);
   

    }
}
class panel extends JPanel implements Runnable{
    int x = 0;
    int y = 500;
    Thread t = new Thread(this); //funsinya untuk mengaktifkan animasi
    //thread = untuk menjalankan aplikasi
    //t = variabel
 
    public panel(Font font, String nama, String npm) {
        setPreferredSize(new Dimension(1300, 0));
        setBackground(Color.white);
        t.start(); //fungsinya untuk menjalankan atau memulai animasi
        //t didapat dari inisialisasi dari thread
    }
   
    public void paintComponent(Graphics c) {
        super.paintComponent(c);
        Graphics2D c2 = (Graphics2D) c;
        GeneralPath gp1 = new GeneralPath();
        GeneralPath gp2 = new GeneralPath();
        GradientPaint g3 = new GradientPaint(210, 300, Color.darkGray, 240, 320, Color.black);
        GradientPaint g2 = new GradientPaint(220, 310, Color.darkGray, 270, 340, Color.black);

        
        
        
        
        //langit
        GradientPaint hitamLangit = new GradientPaint(0, 300, Color.white, 0, 0, Color.black);
        java.awt.geom.Rectangle2D.Double langit = new java.awt.geom.Rectangle2D.Double(0, 0, 900, 500);
        c2.draw(langit);
        c2.setPaint(hitamLangit);
        c2.fill(langit);

        
        //laut
        c2.setColor(Color.BLUE);
        java.awt.geom.Rectangle2D.Double laut=new java.awt.geom.Rectangle2D.Double(0, 350, 900, 150);
        c2.fill(laut);

        //bulan
        Shape e1 = new Ellipse2D.Double(550, 50, 100, 100);
        GradientPaint g1 = new GradientPaint(535, 80, Color.YELLOW, 550, 130, Color.WHITE);
        c2.setPaint(g1);
        c2.fill(e1);

        

        //awan1 : pojok kiri
        c2.setColor (new Color(156, 146, 143));
        Shape e6 = new Ellipse2D.Double(x, 75, 60, 30);
        c2.fill(e6);
        Shape e7 = new Ellipse2D.Double(x+35, 65, 50, 50); // x,y,lengkungan
        c2.fill(e7);
        Shape e7a = new Ellipse2D.Double(x+15, 65, 50, 50);
        c2.fill(e7a);
        Shape e7b = new Ellipse2D.Double(x+55, 65, 50, 50);
        c2.fill(e7b);
        Shape e8 = new Ellipse2D.Double(x+60, 75, 60, 30);
        c2.fill(e8);

        //awan2 : atas bulan
        c2.setColor (new Color(156, 146, 143));
        Shape e9 = new Ellipse2D.Double(y, 20, 60, 30);
        c2.fill(e9);
        Shape e10 = new Ellipse2D.Double(y+35, 10, 50, 50);
        c2.fill(e10);
        Shape e10a = new Ellipse2D.Double(y+15, 10, 50, 50);
        c2.fill(e10a);
        Shape e10b = new Ellipse2D.Double(y+55, 10, 50, 50);
        c2.fill(e10b);
        Shape e11 = new Ellipse2D.Double(y+60, 20, 60, 30);
        c2.fill(e11);

        //awan3 menutupi bulan : sebelah kiri bawah
        c2.setColor (new Color(156, 146, 143));
        Shape e12 = new Ellipse2D.Double(520, 130, 60, 30);// x,y,lengkungan
        c2.fill(e12);
        Shape e13 = new Ellipse2D.Double(555, 120, 50, 50);
        c2.fill(e13);
        Shape e13a = new Ellipse2D.Double(535, 120, 50, 50);
        c2.fill(e13a);
        Shape e13b = new Ellipse2D.Double(575, 120, 50, 50);
        c2.fill(e13b);
        Shape e14 = new Ellipse2D.Double(580, 130, 60, 30);
        c2.fill(e14);

        //awan4 menutupi bulan : sebelah kanan atas
        c2.setColor (new Color(156, 146, 143));
        Shape e15 = new Ellipse2D.Double(580, 100, 60, 30);// x,y,lengkungan
        c2.fill(e15);
        Shape e16 = new Ellipse2D.Double(605, 90, 50, 50);
        c2.fill(e16);
        Shape e16a = new Ellipse2D.Double(595, 90, 50, 50);
        c2.fill(e16a);
        Shape e16b = new Ellipse2D.Double(635, 90, 50, 50);
        c2.fill(e16b);
        Shape e17 = new Ellipse2D.Double(640, 100, 60, 30);
        c2.fill(e17);

        //Cerobong Asap
       c2.setColor (new Color(218,165,32));
        int[] exes3 = {y+200,y+200,y+205,y+205,y+220,y+220,y+225,y+225};
        int[] whys3 = {290  ,270  ,270  ,260  ,260  ,270,  270,   290};
          int pts3 = exes3.length;
           for (int i = 0; i < 4; i++) {
          c2.fillPolygon(exes3, whys3, pts3);
           for (int j = 0; j < pts3; j++) {
        exes3[j] += 35;

        }}
        
        c2.setColor(Color.black);
        for (int i = 0; i<4; i++){
        c2.fillRect(y+205+i*35,260,15,10);
        }
        
        //atap kapal
        c2.setColor(Color.white);
        gp2.moveTo(y+185, 290);
        gp2.lineTo(y+195, 280);
        gp2.lineTo(y+335, 280);
        gp2.lineTo(y+340, 290);
        gp2.closePath();
        c2.fill(gp2);
        c2.setColor(Color.black);
        c2.draw(gp2);
       
        //Badan Kapal
        gp1.moveTo(y+100, 310);
        gp1.lineTo(y+144, 362);
        gp1.lineTo(y+356, 362);
        gp1.lineTo(y+400, 310);
        gp1.closePath();
        c2.draw(gp1);
        c2.setPaint(g2);
        c2.fill(gp1);
       
        //bagian tengah kapal
        GradientPaint g4= new GradientPaint(170, 120, Color.WHITE, 10, 190, Color.WHITE,true);
        Shape r3= new java.awt.geom.RoundRectangle2D.Double(y+145, 300, 210, 15,10,10);
        Shape r10= new java.awt.geom.RoundRectangle2D.Double(y+175, 290, 170, 15,10,10);
        c2.setPaint(g4);
        c2.fill(r10);
        c2.setColor(Color.black);
        c2.draw(r10);
        
        c2.setPaint(g4);
        c2.fill(r3);
        
        c2.setColor(Color.black);
        c2.draw(r3);

        
        c2.setColor(Color.red);
        int[] exes = {y+135,y+365,y+355,y+145};
         int[] whys = {348,348,362,362};
          int pts = exes.length;
          c2.fillPolygon(exes, whys, pts);
          
          c2.setColor(Color.white);
          int[] exes2 = {y+100,y+400,y+395,y+105};
         int[] whys2 = {310,310,315,315};
          int pts2 = exes2.length;
          c2.fillPolygon(exes2, whys2, pts2);
        
          c2.setColor(Color.black);
        c2.draw(gp1);
        
        
        //tiang kapal depan
        c2.setColor (new Color(77,55,55));
        for (int i = 0; i<3; i++){
        c2.drawLine(y+125+i*1, 310, y+130+i*1, 235);
        }
        
        //tiang kapal belakang
        c2.setColor (new Color(77,55,55));
        for (int i = 0; i<3; i++){
        c2.drawLine(y+375+i*1, 310, y+380+i*1, 235);
        }
        
        //Kabel Decoration
        c2.drawArc(y+133,235,490,15,180,90);
        c2.drawLine(y+100, 310, y+130, 235);
        c2.drawLine( y+380, 235, y+400,310);
        
        c2.setColor(Color.BLACK); //jendela atas kabal
        Shape j1=new java.awt.geom.Rectangle2D.Double(y+295, 283, 30, 6);
        c2.fill(j1);
        Shape j2=new java.awt.geom.Rectangle2D.Double(y+240,283, 10, 6);
        c2.fill(j2);
        Shape j3=new java.awt.geom.Rectangle2D.Double(y+220, 283, 10, 6);
        c2.fill(j3);
        Shape j4=new java.awt.geom.Rectangle2D.Double(y+200,283, 10, 6);
        c2.fill(j4);
        
        c2.setColor(Color.black);
        for (int i = 0; i<12; i++){
        c2.fillRect(y+180+i*10,293,5,6);
        }
        
        for (int i = 0; i<20; i++){
        c2.fillRect(y+160+i*8,303,3,6);
        }
        
       
        //tepian laut
        c2.setColor (new Color(0, 128, 0));
        c2.fillArc(655, 350, 500, 60, 270, -180);
        c2.fillArc(635, 370, 550, 94, 270, -180);
        c2.fillArc(605, 420, 590, 100, 270, -180);

        //gelombang laut
        c2.setColor(Color.white);
        c2.drawArc(0, 355, 20, 20, 180, 180);
        c2.drawArc(0, 375, 20, 20, 180, 180);
        c2.drawArc(0, 395, 20, 20, 180, 180);
        c2.drawArc(0, 415, 20, 20, 180, 180);
        c2.drawArc(0, 435, 20, 20, 180, 180);
        c2.drawArc(0, 455, 20, 20, 180, 180);
       
        c2.drawArc(20, 355, 20, 20, 180, 180);
        c2.drawArc(20, 375, 20, 20, 180, 180);
        c2.drawArc(20, 395, 20, 20, 180, 180);
        c2.drawArc(20, 415, 20, 20, 180, 180);
        c2.drawArc(20, 435, 20, 20, 180, 180);
        c2.drawArc(20, 455, 20, 20, 180, 180);
       
        c2.drawArc(40, 355, 20, 20, 180, 180);
        c2.drawArc(40, 375, 20, 20, 180, 180);
        c2.drawArc(40, 395, 20, 20, 180, 180);
        c2.drawArc(40, 415, 20, 20, 180, 180);
        c2.drawArc(40, 435, 20, 20, 180, 180);
        c2.drawArc(40, 455, 20, 20, 180, 180);
       
        c2.drawArc(60, 355, 20, 20, 180, 180);
        c2.drawArc(60, 375, 20, 20, 180, 180);
        c2.drawArc(60, 395, 20, 20, 180, 180);
        c2.drawArc(60, 415, 20, 20, 180, 180);
        c2.drawArc(60, 435, 20, 20, 180, 180);
        c2.drawArc(60, 455, 20, 20, 180, 180);
       
        c2.drawArc(80, 355, 20, 20, 180, 180);
        c2.drawArc(80, 375, 20, 20, 180, 180);
        c2.drawArc(80, 395, 20, 20, 180, 180);
        c2.drawArc(80, 415, 20, 20, 180, 180);
        c2.drawArc(80, 435, 20, 20, 180, 180);
        c2.drawArc(80, 455, 20, 20, 180, 180);
       
        c2.drawArc(100, 355, 20, 20, 180, 180);
        c2.drawArc(100, 375, 20, 20, 180, 180);
        c2.drawArc(100, 395, 20, 20, 180, 180);
        c2.drawArc(100, 415, 20, 20, 180, 180);
        c2.drawArc(100, 435, 20, 20, 180, 180);
        c2.drawArc(100, 455, 20, 20, 180, 180);
       
        c2.drawArc(120, 355, 20, 20, 180, 180);
        c2.drawArc(120, 375, 20, 20, 180, 180);
        c2.drawArc(120, 395, 20, 20, 180, 180);
        c2.drawArc(120, 415, 20, 20, 180, 180);
        c2.drawArc(120, 435, 20, 20, 180, 180);
        c2.drawArc(120, 455, 20, 20, 180, 180);
       
        c2.drawArc(140, 355, 20, 20, 180, 180);
        c2.drawArc(140, 375, 20, 20, 180, 180);
        c2.drawArc(140, 395, 20, 20, 180, 180);
        c2.drawArc(140, 415, 20, 20, 180, 180);
        c2.drawArc(140, 435, 20, 20, 180, 180);
        c2.drawArc(140, 455, 20, 20, 180, 180);
       
        c2.drawArc(160, 355, 20, 20, 180, 180);
        c2.drawArc(160, 375, 20, 20, 180, 180);
        c2.drawArc(160, 395, 20, 20, 180, 180);
        c2.drawArc(160, 415, 20, 20, 180, 180);
        c2.drawArc(160, 435, 20, 20, 180, 180);
        c2.drawArc(160, 455, 20, 20, 180, 180);
       
        c2.drawArc(180, 355, 20, 20, 180, 180);
        c2.drawArc(180, 375, 20, 20, 180, 180);
        c2.drawArc(180, 395, 20, 20, 180, 180);
        c2.drawArc(180, 415, 20, 20, 180, 180);
        c2.drawArc(180, 435, 20, 20, 180, 180);
        c2.drawArc(180, 455, 20, 20, 180, 180);
       
        c2.drawArc(200, 355, 20, 20, 180, 180);
        c2.drawArc(200, 375, 20, 20, 180, 180);
        c2.drawArc(200, 395, 20, 20, 180, 180);
        c2.drawArc(200, 415, 20, 20, 180, 180);
        c2.drawArc(200, 435, 20, 20, 180, 180);
        c2.drawArc(200, 455, 20, 20, 180, 180);
       
        c2.drawArc(220, 355, 20, 20, 180, 180);
        c2.drawArc(220, 375, 20, 20, 180, 180);
        c2.drawArc(220, 395, 20, 20, 180, 180);
        c2.drawArc(220, 415, 20, 20, 180, 180);
        c2.drawArc(220, 435, 20, 20, 180, 180);
        c2.drawArc(220, 455, 20, 20, 180, 180);
       
        c2.drawArc(240, 355, 20, 20, 180, 180);
        c2.drawArc(240, 375, 20, 20, 180, 180);
        c2.drawArc(240, 395, 20, 20, 180, 180);
        c2.drawArc(240, 415, 20, 20, 180, 180);
        c2.drawArc(240, 435, 20, 20, 180, 180);
        c2.drawArc(240, 455, 20, 20, 180, 180);
       
        c2.drawArc(260, 355, 20, 20, 180, 180);
        c2.drawArc(260, 375, 20, 20, 180, 180);
        c2.drawArc(260, 395, 20, 20, 180, 180);
        c2.drawArc(260, 415, 20, 20, 180, 180);
        c2.drawArc(260, 435, 20, 20, 180, 180);
        c2.drawArc(260, 455, 20, 20, 180, 180);
       
        c2.drawArc(280, 355, 20, 20, 180, 180);
        c2.drawArc(280, 375, 20, 20, 180, 180);
        c2.drawArc(280, 395, 20, 20, 180, 180);
        c2.drawArc(280, 415, 20, 20, 180, 180);
        c2.drawArc(280, 435, 20, 20, 180, 180);
        c2.drawArc(280, 455, 20, 20, 180, 180);
       
        c2.drawArc(300, 355, 20, 20, 180, 180);
        c2.drawArc(300, 375, 20, 20, 180, 180);
        c2.drawArc(300, 395, 20, 20, 180, 180);
        c2.drawArc(300, 415, 20, 20, 180, 180);
        c2.drawArc(300, 435, 20, 20, 180, 180);
        c2.drawArc(300, 455, 20, 20, 180, 180);
       
        c2.drawArc(320, 355, 20, 20, 180, 180);
        c2.drawArc(320, 375, 20, 20, 180, 180);
        c2.drawArc(320, 395, 20, 20, 180, 180);
        c2.drawArc(320, 415, 20, 20, 180, 180);
        c2.drawArc(320, 435, 20, 20, 180, 180);
        c2.drawArc(320, 455, 20, 20, 180, 180);
       
        c2.drawArc(340, 355, 20, 20, 180, 180);
        c2.drawArc(340, 375, 20, 20, 180, 180);
        c2.drawArc(340, 395, 20, 20, 180, 180);
        c2.drawArc(340, 415, 20, 20, 180, 180);
        c2.drawArc(340, 435, 20, 20, 180, 180);
        c2.drawArc(340, 455, 20, 20, 180, 180);
       
        c2.drawArc(360, 355, 20, 20, 180, 180);
        c2.drawArc(360, 375, 20, 20, 180, 180);
        c2.drawArc(360, 395, 20, 20, 180, 180);
        c2.drawArc(360, 415, 20, 20, 180, 180);
        c2.drawArc(360, 435, 20, 20, 180, 180);
        c2.drawArc(360, 455, 20, 20, 180, 180);
       
        c2.drawArc(380, 355, 20, 20, 180, 180);
        c2.drawArc(380, 375, 20, 20, 180, 180);
        c2.drawArc(380, 395, 20, 20, 180, 180);
        c2.drawArc(380, 415, 20, 20, 180, 180);
        c2.drawArc(380, 435, 20, 20, 180, 180);
        c2.drawArc(380, 455, 20, 20, 180, 180);
       
        c2.drawArc(400, 355, 20, 20, 180, 180);
        c2.drawArc(400, 375, 20, 20, 180, 180);
        c2.drawArc(400, 395, 20, 20, 180, 180);
        c2.drawArc(400, 415, 20, 20, 180, 180);
        c2.drawArc(400, 435, 20, 20, 180, 180);
        c2.drawArc(400, 455, 20, 20, 180, 180);
       
        c2.drawArc(420, 355, 20, 20, 180, 180);
        c2.drawArc(420, 375, 20, 20, 180, 180);
        c2.drawArc(420, 395, 20, 20, 180, 180);
        c2.drawArc(420, 415, 20, 20, 180, 180);
        c2.drawArc(420, 435, 20, 20, 180, 180);
        c2.drawArc(420, 455, 20, 20, 180, 180);
       
        c2.drawArc(440, 355, 20, 20, 180, 180);
        c2.drawArc(440, 375, 20, 20, 180, 180);
        c2.drawArc(440, 395, 20, 20, 180, 180);
        c2.drawArc(440, 415, 20, 20, 180, 180);
        c2.drawArc(440, 435, 20, 20, 180, 180);
        c2.drawArc(440, 455, 20, 20, 180, 180);
       
        c2.drawArc(460, 355, 20, 20, 180, 180);
        c2.drawArc(460, 375, 20, 20, 180, 180);
        c2.drawArc(460, 395, 20, 20, 180, 180);
        c2.drawArc(460, 415, 20, 20, 180, 180);
        c2.drawArc(460, 435, 20, 20, 180, 180);
        c2.drawArc(460, 455, 20, 20, 180, 180);
       
        c2.drawArc(480, 355, 20, 20, 180, 180);
        c2.drawArc(480, 375, 20, 20, 180, 180);
        c2.drawArc(480, 395, 20, 20, 180, 180);
        c2.drawArc(480, 415, 20, 20, 180, 180);
        c2.drawArc(480, 435, 20, 20, 180, 180);
        c2.drawArc(480, 455, 20, 20, 180, 180);
       
        c2.drawArc(500, 355, 20, 20, 180, 180);
        c2.drawArc(500, 375, 20, 20, 180, 180);
        c2.drawArc(500, 395, 20, 20, 180, 180);
        c2.drawArc(500, 415, 20, 20, 180, 180);
        c2.drawArc(500, 435, 20, 20, 180, 180);
        c2.drawArc(500, 455, 20, 20, 180, 180);
       
        c2.drawArc(520, 355, 20, 20, 180, 180);
        c2.drawArc(520, 375, 20, 20, 180, 180);
        c2.drawArc(520, 395, 20, 20, 180, 180);
        c2.drawArc(520, 415, 20, 20, 180, 180);
        c2.drawArc(520, 435, 20, 20, 180, 180);
        c2.drawArc(520, 455, 20, 20, 180, 180);
       
        c2.drawArc(540, 355, 20, 20, 180, 180);
        c2.drawArc(540, 375, 20, 20, 180, 180);
        c2.drawArc(540, 395, 20, 20, 180, 180);
        c2.drawArc(540, 415, 20, 20, 180, 180);
        c2.drawArc(540, 435, 20, 20, 180, 180);
        c2.drawArc(540, 455, 20, 20, 180, 180);
       
        c2.drawArc(560, 355, 20, 20, 180, 180);
        c2.drawArc(560, 375, 20, 20, 180, 180);
        c2.drawArc(560, 395, 20, 20, 180, 180);
        c2.drawArc(560, 415, 20, 20, 180, 180);
        c2.drawArc(560, 435, 20, 20, 180, 180);
        c2.drawArc(560, 455, 20, 20, 180, 180);
               
        c2.drawArc(580, 355, 20, 20, 180, 180);
        c2.drawArc(580, 375, 20, 20, 180, 180);
        c2.drawArc(580, 395, 20, 20, 180, 180);
        c2.drawArc(580, 415, 20, 20, 180, 180);
        c2.drawArc(580, 435, 20, 20, 180, 180);
        c2.drawArc(580, 455, 20, 20, 180, 180);
               
        c2.drawArc(600, 355, 20, 20, 180, 180);
        c2.drawArc(600, 375, 20, 20, 180, 180);
        c2.drawArc(600, 395, 20, 20, 180, 180);
        c2.drawArc(600, 415, 20, 20, 180, 180);
        c2.drawArc(600, 435, 20, 20, 180, 180);
               
        c2.drawArc(620, 355, 20, 20, 180, 180);
        c2.drawArc(620, 375, 20, 20, 180, 180);
        c2.drawArc(620, 395, 20, 20, 180, 180);
        c2.drawArc(620, 415, 20, 20, 180, 180);
       
        c2.drawArc(640, 355, 20, 20, 180, 180);
        c2.drawArc(640, 375, 20, 20, 180, 180);
       
        //pohon & batu
        c2.setColor(Color.black);
        c2.fillOval(832, 360, 25, 15);
       
        c2.setColor(new Color(74, 37, 0));
        c2.fillRect(840, 300, 10, 80);
       
        c2.setColor(new Color(0, 255, 0));
        c2.setStroke(new BasicStroke(3.0f));
        c2.fillOval(810, 275, 60, 50);
        c2.fillOval(800, 305, 60, 30);
        c2.fillOval(830, 295, 60, 30);
       
        c2.setColor(Color.black);
        c2.fillOval(820, 370, 25, 15);
        c2.fillOval(842, 370, 25, 15);
       
        //rumput
        c2.setColor(Color.green);
        c2.drawArc(840, 405, 35, 20, 180, -180);
        c2.drawArc(820, 415, 35, 20, 180, -180);
        c2.drawArc(810, 405, 35, 20, 180, -180);
        c2.drawArc(790, 415, 35, 20, 180, -180);
       
        //text
       
   
    }
    public void run() {
        while (true) {
            if (x <= 700) { //angka disini maksudnya jauh dekatnya kapal berjalan
                y --;//kalau ini diganti ++ arah dia akan melawan arah
                x++; //jika keadaan benar dia akan mengulang
                //x disini berarti miliknya awan1 yang pojok kiri
                //y disini berarti miliknya kapal
            }else {
                x=0;
                y=500; //ini akan mengulang darimana awalnya dia start, maksudnya mengulang
                //lagi tergantung nilai y yang diberikan
            }
            try {
                repaint(); //untuk mewarnai lagi
                Thread.sleep(20); //fungsinya untuk tidur selama 25 m/s (kecepatan)
            } catch (Exception e) {
            }
        }
    }
}