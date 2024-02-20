import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Font;


public class Bis_Sekolah extends Applet implements Runnable {
    int x = 0;
    Thread jln;
     Font f;
    String s1,s2,loc,nama,npm;
    //membuat objek bergerak
                //Runnable untuk menggerakkan objek dengan kordinat
    public void start(){
       Thread jln = new Thread(this);
       jln.start();
    }
    public void run(){
            while (true){
            //gerak mobil
            if (x < 1600){
                x=x+10;
            }else {
                x=-100;
            }
                      
            //menghapus objek yg sudah berlalu
            repaint();
            try{
                Thread.sleep(60);//semakin besar angka maka akan semakin lambat jalannya
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    public void init(){
        setSize(1400, 800);
        s1 = "BUS SEKOLAH";
        s2 = "GRATIS";
        loc= "HALTE : BUSAN";
        f = new Font("Arial", Font.BOLD, 10);
        setBackground (Color.cyan);
    }
    public void paint(Graphics g) {
     
        
        
        //matahari
        g.setColor(Color.orange);
        g.fillOval(1300, 30, 125, 125);
        
        //rumput
        g.setColor(Color.green);
        g.fillRect (0,356,1400,65);
        
        
        //batang pohon
         g.setColor(Color.red);
           int a []={30,40,50,60};
           int b []={400,350,350,400};
           int point=a.length;
            for (int i = 0; i < 10; i++) {
           g.fillPolygon(a,b,point);
           for (int j = 0; j < point; j++) {
        a[j] += 150;

        }}
           
        
        //bunga sakura
           for (int i = 0; i < 10; i++) {
           g.setColor(Color.pink);
           g.fillOval(-10+i*150,300,120,80);
           g.fillOval(-10+i*150,270,130,80);
           g.fillOval(-10+i*150,240,110,100);
           g.fillOval(0+i*150,210,60,90);
           g.fillOval(40+i*150,210,90,90);
        }
        
        
        //lantai halte
        g.setColor(Color.gray);
       int[] jalanx ={600,630, 930,900};
       int[] jalany ={396,356, 356,396};
       int jalanpt = jalanx.length;
        g.fillPolygon(jalanx, jalany, jalanpt);
        g.setColor (Color.white);
        g.drawPolygon(jalanx, jalany, jalanpt);
        
        g.setColor(Color.gray);
        g.fillRect (600,396,300,25);
        g.setColor (Color.white);
        g.drawRect (600,396,300,25);
        
         g.setColor(Color.gray);
       int[] jalanx1 ={930,930, 900,900};
       int[] jalany1 ={356,381, 421,396};
       int jalanpt1 = jalanx1.length;
        g.fillPolygon(jalanx1, jalany1, jalanpt1);
        g.setColor (Color.white);
        g.drawPolygon(jalanx1, jalany1, jalanpt1);
        
        //dindinghalte
        g.setColor(Color.black);
        g.fillRect (630,315,280,20);
        
        //tianghalte1
       g.setColor(new Color(0, 122, 0));
       int[] tiangx ={630,660, 660,630};
       int[] tiangy ={390,366, 250,250};
       int tiangpt = tiangx.length;
        g.fillPolygon(tiangx, tiangy, tiangpt);
        
        //tianghalte2
        g.setColor(new Color(0, 122, 0));
       int[] tiangx2 ={910,910, 880,880};
       int[] tiangy2 ={360, 250, 250, 390};
       int tiangpt2 = tiangx2.length;
        g.fillPolygon(tiangx2, tiangy2, tiangpt2);
        
        
        
        //atap halte
        int[] jalanx3 ={600,630, 930,900};
       int[] jalany3 ={240,206, 206,240};
       int jalanpt3 = jalanx3.length;
        g.fillPolygon(jalanx3, jalany3, jalanpt3);
        g.setColor (Color.white);
        g.drawPolygon(jalanx3, jalany3, jalanpt3);
        
        g.setColor(new Color(0, 122, 0));
        g.fillRect (600,240,300,25);
        g.setColor (Color.white);
        g.drawRect (600,240,300,25);
        
        //plang halte
        
        g.setColor (Color.white);
        g.fillRoundRect (680,245,150,15,5,5);
        g.setColor (Color.white);
        g.drawRoundRect (680,245,150,15,5,5);
        g.setColor (Color.black);
        g.drawString(loc, 722, 257);
        
        
        
         g.setColor(new Color(0, 122, 0));
       int[] jalanx4 ={930,930, 900,900};
       int[] jalany4 ={206,231, 265,240};
       int jalanpt4 = jalanx4.length;
        g.fillPolygon(jalanx4, jalany4, jalanpt4);
        g.setColor (Color.white);
        g.drawPolygon(jalanx4, jalany4, jalanpt4);
        
        //jalanan
        g.setColor (Color.black);
        g.fillRect (0,450,1500,200);
        g.setColor (Color.white);
        g.fillRoundRect (0,540,100,10,5,5);
        g.fillRoundRect (150,540,100,10,5,5);
        g.fillRoundRect (300,540,100,10,5,5);
        g.fillRoundRect (450,540,100,10,5,5);
        g.fillRoundRect (600,540,100,10,5,5);
        g.fillRoundRect (750,540,100,10,5,5);
        g.fillRoundRect (900,540,100,10,5,5);
        g.fillRoundRect (1050,540,100,10,5,5);
        g.fillRoundRect (1200,540,100,10,5,5);
        g.fillRoundRect (1350,540,100,10,5,5);
        
        //trotoar
        g.setColor (Color.gray);
        g.fillRect (0,421,1500,30);
        
        for (int i = 0; i < 2; i++) {
        g.setColor (Color.white);
        g.drawLine(0+i*30,451,30+i*30,421);

    }
        
        //BIS SEKOLAH!
     
         g.setColor(new Color(255, 213, 0));
       int[] exes ={x+138,x+140,x+350,x+355,x+360,x+363,x+365,x+367,x+369,x+367,x+363,x+171,x+138};
       int[] whys ={402,400,400,402,405,408,415,428,485,483,507,507,500};
       int pts = exes.length;
        g.fillPolygon(exes, whys, pts);
        g.setColor (Color.black);
        g.drawPolygon(exes, whys, pts);
        
        g.setColor (Color.black);
       int[] exes2 ={x+145,x+355,x+361,x+362,x+363,x+364,x+365,x+363,x+145};
       int[] whys2 ={407,407,414,419,425,439,445,449,449};
       int pts2 = exes2.length;
        g.fillPolygon(exes2, whys2, pts2);
        
        g.setColor(new Color(255, 213, 0));
       int[] exes3 ={x+200,x+225,x+275,x+300};
       int[] whys3 ={400,395,395,400};
       int pts3 = exes3.length;
        g.fillPolygon(exes3, whys3, pts3);
        g.setColor (Color.black);
        g.drawPolygon(exes3, whys3, pts3);
        
        //jendela pak supir
        g.fillArc (x+323,423,82,50,180,90); //jendela2
        
        g.drawLine(x+322,423,x+322,481);
        
        g.drawLine(x+145,472,x+322,472);
        
        g.setColor (Color.white);
        //lockdoor pak supir
        g.fillRect(x+327,468,5,5);
        
        //jendela pintu
        g.setColor (Color.black);
        g.fillRect(x+232,430,23,42);
        g.fillRect(x+255,430,23,42);
        
        //pintu
        g.setColor (Color.white);
        g.drawRect(x+232,430,23,75);
        g.drawRect(x+255,430,23,75);
        g.drawLine(x+258,464,x+258,468);
        
        
        g.setColor(Color.black);
         g.drawString(s1, x+148, 459);
         g.drawString(s2, x+168, 469);
        
        g.setColor(Color.gray);
        g.fillOval(x+172,480,40,40);//ban belakang
        g.fillOval(x+295,480,40,40);
        g.setColor(Color.white);
        g.fillOval(x+177,486,30,30);//ban belakang
        g.fillOval(x+300,486,30,30);
}}