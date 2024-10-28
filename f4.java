import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Font;

public class f4 extends Applet implements Runnable {
    int x1 = 0;
    int x2 = 0; 
    Thread jln;
    Font r, numbers,sponsor;
    String nomor1,nomor2,sponsor1,sponsor2;
    //membuat objek bergerak
                //Runnable untuk menggerakkan objek dengan kordinat
    public void start(){
       Thread jln = new Thread(this);
       jln.start();
    }
    public void run(){
            while (true){
            //gerak mobil1
            if (x1 < 2000){
                x1=x1+10;
            }else {
                x1=-400;
            }
                     
            //gerak mobil2        
            if (x2 < 2000) {
            x2 = x2 + 12;
            } else {
                x2 = -400;
            }         
            //menghapus objek yg sudah berlalu
            repaint();
            try{
                Thread.sleep(50);//semakin besar angka maka akan semakin lambat jalannya
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void init(){
        setSize(1400, 800);
        setBackground (Color.cyan);
        nomor1 ="80";
        nomor2 ="7";
        sponsor1= "Monster";
        sponsor2= "DUNLOP";
        sponsor = new Font("Helvetica", Font.BOLD | Font.ITALIC, 30);
        r = new Font("Helvetica", Font.BOLD, 23);
        numbers = new Font("Helvetica", Font.BOLD | Font.ITALIC, 10);
    }
    public void paint(Graphics g) {
        
        g.setColor(Color.orange);
        g.fillOval(50,30,80,80);
        
       g.setColor (Color.green);
       //g.fillArc(0,80,700,900,0,180);
       //g.fillArc(650,80,700,900,0,180);
       int[] gunungx ={0  ,  0, 40,80 ,100,120,170,300,355,370,410,430,450,470,490,510,600,820,850,860,880,910,930,950,960,970,980,1030,1400};
       int[] gunungy ={340,200,160,200,180,200,186,230,180,190,130,160,130,160,130,160,80 ,200,140,145,120,130,100,105,95 ,100,105,40,340};
       int gunungpt = gunungx.length;
        g.fillPolygon(gunungx, gunungy, gunungpt);
       
        g.fillArc(1200,225,600,275,0,180);
        
       //pembatas
       g.setColor (Color.black);
       g.fillRect (0,340,1500,35); 
       
       
        
       g.setColor (Color.yellow);
       int[] batasx = {0,5,150,145};
         int[] batasy = {375,340,340,375};
         int bataspt = batasx.length;
         
         for (int i = 0; i < 5; i++) {
         g.fillPolygon(batasx, batasy, bataspt);
         
         for (int j = 0; j < bataspt; j++) {
        batasx[j] += 300;

        }}
        
        for (int i = 0; i < 5; i++) {
        g.setColor(Color.green);
        g.drawLine(160+i*300,349,157+i*300,365);
        g.drawLine(165+i*300,346,162+i*300,369);
        g.drawLine(170+i*300,349,167+i*300,365);
    }
    
        for (int i = 0; i < 4; i++) {
        g.setColor(Color.white);
        g.setFont(sponsor);
        g.drawString(sponsor1,180+i*300,365);
    }
       
        
        for (int i = 0; i < 5; i++) {
        g.setColor(Color.black);
        g.setFont(sponsor);
        g.drawString(sponsor2,10+i*300,368);
    }
    
       //pasir
       g.setColor(new Color(194, 178, 128));
       g.fillRect (0,375,1500,50);
       g.fillRect (0,625,1500,175);
       
       
       //jalanan
       
       
       g.setColor (Color.red);
       g.fillRect (0,425,1500,25);
       g.fillRect (0,600,1500,25);
       
       
       g.setColor (Color.white);
         int[] sidex = {0,20,40,20};
         int[] sidey = {450,425,425,450};
         int sidept = sidex.length;
         
         for (int i = 0; i < 40; i++) {
         g.fillPolygon(sidex, sidey, sidept);
         
         for (int j = 0; j < sidept; j++) {
        sidex[j] += 40;

        }}
        
        int[] sidex2 = {0,20,40,20};
         int[] sidey2 = {625,600,600,625};
         int sidept2 = sidex2.length;
         
         for (int i = 0; i < 40; i++) {
         g.fillPolygon(sidex2, sidey2, sidept2);
         
         for (int j = 0; j < sidept2; j++) {
        sidex2[j] += 40;

        }}
        
        
       
       
        g.setColor (new Color(52,52,52));
        g.fillRect (0,450,1500,150);
        g.setColor (Color.white);
        g.fillRoundRect (0,515,100,10,5,5);
        g.fillRoundRect (150,515,100,10,5,5);
        g.fillRoundRect (300,515,100,10,5,5);
        g.fillRoundRect (450,515,100,10,5,5);
        g.fillRoundRect (600,515,100,10,5,5);
        g.fillRoundRect (750,515,100,10,5,5);
        g.fillRoundRect (900,515,100,10,5,5);
        g.fillRoundRect (1050,515,100,10,5,5);
        g.fillRoundRect (1200,515,100,10,5,5);
        g.fillRoundRect (1350,515,100,10,5,5);
       
        
        
        
        //++++++++++++++++++++++++++++++++++ MOBIL MERAH++++++++++++++++++++++++++++++++++++++++ 
        //helm
        g.setColor (Color.yellow);
        g.fillOval(x1+252,460,15,18);
        g.setColor (Color.black);
        g.drawLine(x1+262,467,x1+266,467);
        g.drawLine(x1+262,468,x1+266,468);
        
        g.setColor (Color.red);
        g.fillRect (x1+185,457,15,33);
       int[] exes ={x1+196,x1+196,x1+210,x1+225,x1+240,x1+245,x1+250,x1+250,x1+270,x1+270,x1+285,x1+315,x1+324,x1+339,x1+341,x1+343,x1+341,x1+335,x1+335,x1+345,x1+320,x1+322,x1+322,x1+288,x1+285,x1+283,x1+196};
       int[] whys ={500,485,482,475,462,460,459,479,479,469,472,479,481,484,486,488,490,490,495,500,500,495,490,493,496,499,500};
       int pts = exes.length;
        g.fillPolygon(exes, whys, pts);
        g.setColor (Color.black);
        g.drawPolygon(exes, whys, pts);
        
        
        //roda
        g.setColor (Color.black);
        g.fillOval(x1+294,484,25,25);
        g.fillOval(x1+196,484,25,25);
        
        //number
        g.fillRect(x1+250,482,18,16);
        g.setColor (Color.yellow);
        g.drawRect(x1+252,484,16,14);
        //Nomor
        g.setColor(Color.yellow);
        g.setFont(numbers);
        g.drawString(nomor2,x1+257,495);
        
        
        
        
        //++++++++++++++++++++++++++++++++++ MOBIL PUTIH++++++++++++++++++++++++++++++++++++++++ 
        
        //helmet
        g.setColor (Color.white);
        g.fillOval(x2+202,513,15,18);
        g.setColor (Color.black);
        g.drawOval(x2+202,513,15,18);
        g.drawLine(x2+212,520,x2+216,520);
        g.drawLine(x2+212,521,x2+216,521);
        //spoiler wings car2
        g.setColor (Color.white);
        g.fillRect (x2+135,510,15,33);
        g.setColor (Color.white);
       int[] exes2 ={x2+146,x2+146,x2+160,x2+175,x2+190,x2+195,x2+200,x2+200,x2+220,x2+220,x2+235,x2+265,x2+274,x2+289,x2+291,x2+293,x2+291,x2+285,x2+285,x2+295,x2+270,x2+272,x2+272,x2+238,x2+235,x2+233,x2+146};
       int[] whys2 ={553, 538, 535, 528, 515, 513, 512, 532, 532, 522, 525, 532, 534, 537, 539, 541, 543, 543, 548, 553, 553, 548, 543, 546, 549, 552, 553};
       int pts2 = exes2.length;
        g.fillPolygon(exes2, whys2, pts2);
        g.setColor (Color.black);
        g.drawPolygon(exes2, whys2, pts2);
        g.setColor (Color.black);
        g.fillOval(x2+244,537,25,25);
        g.fillOval(x2+146,537,25,25);
        
        g.setColor (Color.black);
        g.drawRect(x2+202,537,16,14);
        //Nomor
        g.setColor(Color.black);
        g.setFont(numbers);
        g.drawString(nomor1,x2+205,548);
        






        
        
        
        
        
        
    }}