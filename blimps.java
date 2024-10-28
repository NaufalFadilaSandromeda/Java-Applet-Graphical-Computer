import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Font;
import java.awt.Image;

public class blimps extends Applet implements Runnable {
    int x = 0;
    Thread jln;
    Font brand;
    String namablimp;
    Image picture;

    public void start() {
        jln = new Thread(this);
        jln.start();
    }

    public void run() {
        while (true) {
            // Moving the blimp
            if (x > -1400) {
                x = x - 2;
            } else {
                x = 450;
            }
            repaint();
            try {
                Thread.sleep(100); // Adjust the speed
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void init() {
        setSize(1400, 800);
        namablimp = "ATOMIC";
        brand = new Font("Helvetica", Font.BOLD | Font.ITALIC, 90);
        setBackground(new Color(217, 217, 217));
        picture = getImage(getDocumentBase(), "java150.png");
    }
    public void paint(Graphics g) {
        
         //Tempat Kemudi Balon
       g.setColor(Color.gray);
        
        int[] exes = {x+930,x+940,x+1050,x+1080};
         int[] whys = {305,350,350,305};
         int pts = exes.length;

         g.fillPolygon(exes, whys, pts);
         g.setColor (Color.black);
         g.drawPolygon(exes, whys, pts);
         
         //livery
         g.setColor(Color.blue);
         g.fillRect(x+945,330,80,15);
         
         int[] exes2 = {x+945,x+1060,x+1048,x+945};
         int[] whys2 = {330,330,345,345};
         int pts2 = exes2.length;

         g.fillPolygon(exes2, whys2, pts2);
         
         g.setColor(Color.yellow);
         int[] exes3 = {x+1030,x+1070,x+1058,x+1030};
         int[] whys3 = {315,315,330,330};
         int pts3 = exes3.length;

         g.fillPolygon(exes3, whys3, pts3);
        
         
         //kaca
         g.setColor (Color.cyan);
         g.fillRect(x+945,315,25,15);
         g.fillRect(x+975,315,15,15);
         g.fillRect(x+995,315,15,15);
         g.fillRect(x+1015,315,15,15);
         g.setColor (Color.black);
         g.drawRect(x+945,315,25,15);
         g.drawRect(x+975,315,15,15);
         g.drawRect(x+995,315,15,15);
         g.drawRect(x+1015,315,15,15);
         
         //int[] exes4 = {1145,1170,1240,1240,1230};
         
         //sirip balon
         g.setColor(Color.yellow);
         int[] exes4 = {x+1180,x+1205,x+1275,x+1275,x+1265};
         int[] whys4 = {125,75,75,110,125};
         int pts4 = exes4.length;
                  g.fillPolygon(exes4, whys4, pts4);
                  g.setColor(Color.black);
                  g.drawPolygon(exes4, whys4, pts4);
                  
         g.setColor(Color.blue);
         int[] stripex = {x+1200,x+1215,x+1263,x+1263};
         int[] stripey = {125,75,75,125};
         int strpts = stripex.length;
                  g.fillPolygon(stripex, stripey, strpts);
                  g.setColor(Color.black);
                  g.drawPolygon(stripex, stripey, strpts);
         
                 
     
                  
         g.setColor(Color.yellow);
         int[] exes5 = {x+1180,x+1205,x+1275,x+1275,x+1265};
         int[] whys5 = {245,295,295,260,245};
         int pts5 = exes5.length;
                  g.fillPolygon(exes5, whys5, pts5);
                  g.setColor(Color.black);
                  g.drawPolygon(exes5, whys5, pts5);
                  
         g.setColor(Color.blue);
         int[] stripex2 = {x+1200,x+1215,x+1263,x+1263};
         int[] stripey2 = {245,295,295,245};
         int strpts2 = stripex2.length;
                  g.fillPolygon(stripex2, stripey2, strpts2);
                  g.setColor(Color.black);
                  g.drawPolygon(stripex2, stripey2, strpts2);
         
         //badan balon
         g.setColor (Color.gray);
         g.fillArc(x+1020,320,55,35,90,180);
         g.setColor (Color.black);
         g.drawArc(x+1020,320,55,35,90,180);
         g.drawLine(x+1045,320,x+1045,355);
        
        g.setColor(Color.white);
        g.fillOval(x+700,60,600,250);
        g.setColor(Color.yellow);
        g.fillOval(x+700,75,600,220);
        g.setColor(Color.blue);
        g.fillOval(x+700,100,600,160);
        
        g.setColor(Color.black);
        g.drawOval(x+700,60,600,250);
        g.drawOval(x+700,75,600,220);
        
        
  
        g.setColor(Color.black);
         g.drawRoundRect(x+1150,175,100,20,100,100);
         
         

         // Trademark
        g.setColor(Color.white);
        g.fillRoundRect(x+830,120,280,125,10,10);
        g.setFont(brand);
        if (picture != null) {
            g.drawImage(picture, x + 770, 100, this);
        }
        
        
        //awan
        g.setColor(Color.gray);
        g.fillOval(100,50,30,30);
        g.fillOval(120,40,30,30);
        g.fillOval(140,60,30,30);
        g.fillOval(120,60,30,30);
        g.fillOval(140,40,30,30);
        g.fillOval(160,50,30,30);
        

        g.fillOval(250,50,30,30);
        g.fillOval(270,40,30,30);
        g.fillOval(290,60,30,30);
        g.fillOval(270,60,30,30);
        g.fillOval(290,40,30,30);
        g.fillOval(310,50,30,30);
        
        
        
        g.fillOval(20,250,90,90);
        g.fillOval(65,230,90,90);
        g.fillOval(110,230,90,90);
        g.fillOval(65,270,90,90);
        g.fillOval(110,270,90,90);
        g.fillOval(155,250,90,90);
        
        
        
        g.fillOval(310,280,60,60);
        g.fillOval(340,270,60,60);
        g.fillOval(370,270,60,60);
        g.fillOval(340,290,60,60);
        g.fillOval(370,290,60,60);
        g.fillOval(390,280,60,60);
        
        
        
        
        
        //gedung
        
        g.setColor(Color.gray);
        g.fillRect(0,680,45,100);
        
        
        g.setColor(Color.gray);
        g.fillRect(103,600,95,200);
        g.setColor(Color.black);
        g.fillRect(115,610,20,20);
        g.fillRect(140,610,20,20);
        g.fillRect(165,610,20,20);
        g.fillRect(115,635,20,20);
        g.fillRect(140,635,20,20);
        g.fillRect(165,635,20,20);
        g.fillRect(115,660,20,20);
        g.fillRect(140,660,20,20);
        g.fillRect(165,660,20,20);
        g.fillRect(115,685,20,20);
        g.fillRect(140,685,20,20);
        g.fillRect(165,685,20,20);
        
        g.setColor(Color.gray);
        g.fillRect(460,650,20,200);
        g.fillRect(480,635,30,200);
        g.fillRect(510,620,30,200);
        g.fillRect(540,635,30,200);
        g.fillRect(570,650,20,200);
        
        g.fillRect(630,620,70,200);
        
        
         g.setColor(new Color(92, 54, 61));
         g.fillRect(230,650,80,200);
         g.fillRect(315,650,80,200);
         
         
          
        
        
    }
}