import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Font;

public class Kapal_Selam extends Applet implements Runnable {
    int x = 0;
    int y = 0;
    Thread jln;
    //membuat objek bergerak
                //Runnable untuk menggerakkan objek dengan kordinat
    public void start(){
       Thread jln = new Thread(this);
       jln.start();
    }
    public void run(){
            while (true){
            //gerak Kapal Selam
            if (x > -1400){
                x=x-20;
                y=y+2;
            }else {
                x=450;
                y=-20;
            }
                      
       
            
            //menghapus objek yg sudah berlalu
            repaint();
            try{
                Thread.sleep(100);//semakin besar angka maka akan semakin lambat jalannya
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    public void init(){
        setSize(1400, 800);
        setBackground (new Color(253, 94, 83));
    }
    public void paint(Graphics g) {
        //Matahari
        g.setColor(Color.yellow);
        g.fillOval(550,250,200,200);
        
        //Burung
        g.setColor (Color.black);
        g.drawArc(900, 150, 50, 30, 0, 180);
        g.drawArc(950, 150, 50, 30, 0, 180);
        g.drawLine(940,165,960,165);
        
        g.drawArc(800, 180, 50, 30, 0, 180);
        g.drawArc(850, 180, 50, 30, 0, 180);
        g.drawLine(840,195,860,195);
        
        //Laut
        g.setColor (Color.cyan);
        
       g.fillRect (0,340,1400,150);

       //pulau
       g.setColor (new Color(0, 128, 0));

        g.fillArc(1255, 320, 500, 60, 270, -180);
        g.fillArc(1235, 340, 550, 94, 270, -180);
        g.fillArc(1205, 390, 590, 100, 270, -180);
        
        

        ////gelombang ombak
        g.setColor(Color.white);
        for (int i = 0; i < 60; i++) {
        g.drawArc(0+i*20, 355, 20, 20, 180, 180);
        g.drawArc(0+i*20, 375, 20, 20, 180, 180);
        g.drawArc(0+i*20, 395, 20, 20, 180, 180);
        g.drawArc(0+i*20, 415, 20, 20, 180, 180);
        g.drawArc(0+i*20, 435, 20, 20, 180, 180);
        g.drawArc(0+i*20, 455, 20, 20, 180, 180);
    }
      
       //Kapal SELAM !
     g.setColor(Color.gray);
         int[] exes2 = {x+1145,x+1190,x+1190,x+1180,x+1145};
         int[] whys2 = {y+500,y+500,y+450,y+445,y+500};
         int pts2 = exes2.length;
                  g.fillPolygon(exes2, whys2, pts2);
                  g.setColor(Color.black);
                  g.drawPolygon(exes2, whys2, pts2);
         
         
         g.setColor(Color.gray);
         int[] exes3 = {x+1145,x+1190,x+1190,x+1180,x+1145};
         int[] whys3 = {y+500,y+500,y+550,y+545,y+500};
         int pts3 = exes3.length;
                g.fillPolygon(exes3, whys3, pts3);
                g.setColor(Color.black);
                g.drawPolygon(exes3, whys3, pts3);
    
    g.setColor(Color.gray);
    g.fillArc(x+920,y+450,255,100,270,180);
    g.setColor(Color.black);
    g.drawArc(x+920,y+450,255,100,270,180);
    
    
    g.setColor (Color.gray);
    g.fillRoundRect(x+700,y+450,450,100,145,200);
    g.setColor (Color.black);
    g.drawRoundRect(x+700,y+450,450,100,145,200);
    
    
    
    g.setColor(Color.gray);
  
    
         int[] exes = {x+825,x+850,x+950,x+975};
         int[] whys = {y+450,y+400,y+400,y+450};
         int pts = exes.length;
         
         
  
         g.fillPolygon(exes, whys, pts);
         g.setColor (Color.black);
         g.drawPolygon(exes, whys, pts);
         
         
         for (int i = 0; i < 5; i++) {
         g.drawLine(x+839,y+420+i*1,x+894,y+420+i*1);
        }
        
        g.fillOval(x+915,y+420,5,5);
        g.fillOval(x+935,y+420,5,5);
         
        g.setColor(Color.gray);
         g.fillRect(x+875,y+380,4,20);
         
         
         g.fillRect(x+910,y+385,3,15);
         
         
         g.fillRect(x+930,y+370,2,30);
        
         
        
         
         
         //laut 2
         
    g.setColor (Color.cyan);
   g.fillRect (0,490,1400,300);
 
   //gelombang ombak 2
   
 g.setColor(Color.white);
        for (int i = 0; i < 30; i++) {
        g.drawArc(0+i*20, 475, 20, 20, 180, 180);
        g.drawArc(0+i*20, 490, 20, 20, 180, 180);
        g.drawArc(0+i*20, 515, 20, 20, 180, 180);
        
    }
 
        for (int i = 0; i < 75; i++) {
        g.drawArc(0+i*20, 540, 20, 20, 180, 180);
        g.drawArc(0+i*20, 565, 20, 20, 180, 180);
        g.drawArc(0+i*20, 585, 20, 20, 180, 180);
        g.drawArc(0+i*20, 605, 20, 20, 180, 180);
        g.drawArc(0+i*20, 630, 20, 20, 180, 180);
        g.drawArc(0+i*20, 655, 20, 20, 180, 180);
        g.drawArc(0+i*20, 680, 20, 20, 180, 180);
        g.drawArc(0+i*20, 705, 20, 20, 180, 180);
    }
     
}}