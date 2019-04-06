package cn.songtao.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;

/**
 *设置窗口
 * @author songtao
 *
 */
public class MyGameFrame extends Frame {
		Image wangshuaiImage = GameUtil.getImage("images/wangshuai.jpg");
		Image ww = GameUtil.getImage("images/ww.jpg");
		Image shitimage = GameUtil.getImage("images/shit.png");

		
		
		wangshuai w = new wangshuai(wangshuaiImage,550,550);
		Explode bao;
		shi s = new shi(shitimage,200,200);
		shi s1 = new shi(shitimage,200,200);
		shi s2= new shi(shitimage,200,200);
		shi s3 = new shi(shitimage,200,200);
		shi s4 = new shi(shitimage,200,200);
		shi s5 = new shi(shitimage,200,200);
		shi s6 = new shi(shitimage,200,200);
		shi s7 = new shi(shitimage,200,200);
		shi s8 = new shi(shitimage,200,200);
		shi s9 = new shi(shitimage,200,200);
		shi s10 = new shi(shitimage,200,200);
		shi s11 = new shi(shitimage,200,200);
		shi s12 = new shi(shitimage,200,200);
		shi s13 = new shi(shitimage,200,200);
		shi s14= new shi(shitimage,200,200);
		shi s15 = new shi(shitimage,200,200);
		shi s16 = new shi(shitimage,200,200);
		shi s17 = new shi(shitimage,200,200);
		shi s18 = new shi(shitimage,200,200);
		shi s19 = new shi(shitimage,200,200);
		shi s20 = new shi(shitimage,200,200);
		shi s21 = new shi(shitimage,200,200);
		shi s22 = new shi(shitimage,200,200);
		shi s23 = new shi(shitimage,200,200);
		Date startTime = new Date();
		Date endTime;
		int period;
		
		
		
	@Override
		public void paint(Graphics g) {
			Color c = g.getColor();
			g.drawImage(ww, 0, 0, null);
			w.drawSelf(g);
			s.drawSelf(g);
			boolean peng = s.getRect().intersects(w.getRect());
			s1.drawSelf(g);
			boolean peng1 = s1.getRect().intersects(w.getRect());
			s2.drawSelf(g);
			boolean peng2 = s2.getRect().intersects(w.getRect());
			s3.drawSelf(g);
			boolean peng3 =s3.getRect().intersects(w.getRect());
			s4.drawSelf(g);
			boolean peng4 =s4.getRect().intersects(w.getRect());
			s5.drawSelf(g);
			boolean peng5 =s5.getRect().intersects(w.getRect());
			s6.drawSelf(g);
			boolean peng6 =s6.getRect().intersects(w.getRect());
			s7.drawSelf(g);
			boolean peng7 =s7.getRect().intersects(w.getRect());
			s8.drawSelf(g);
			boolean peng8 =s8.getRect().intersects(w.getRect());
			s9.drawSelf(g);
			boolean peng9 =s9.getRect().intersects(w.getRect());
			s10.drawSelf(g);
			boolean peng10 =s10.getRect().intersects(w.getRect());
			s11.drawSelf(g);
			boolean peng11 =s11.getRect().intersects(w.getRect());
			s12.drawSelf(g);
			boolean peng12 =s12.getRect().intersects(w.getRect());
			s13.drawSelf(g);
			boolean peng13 =s13.getRect().intersects(w.getRect());
			s14.drawSelf(g);
			boolean peng14 =s14.getRect().intersects(w.getRect());
			s15.drawSelf(g);
			boolean peng15 =s15.getRect().intersects(w.getRect());
			s16.drawSelf(g);
			boolean peng16 =s16.getRect().intersects(w.getRect());
			s17.drawSelf(g);
			boolean peng17 =s17.getRect().intersects(w.getRect());
			s18.drawSelf(g);
			boolean peng18 =s18.getRect().intersects(w.getRect());
			s19.drawSelf(g);
			boolean peng19 =s19.getRect().intersects(w.getRect());
			s20.drawSelf(g);
			boolean peng20 =s20.getRect().intersects(w.getRect());
			s21.drawSelf(g);
			boolean peng21 =s21.getRect().intersects(w.getRect());
			s22.drawSelf(g);
			boolean peng22 =s22.getRect().intersects(w.getRect());
			s23.drawSelf(g);
			boolean peng23 =s23.getRect().intersects(w.getRect());
			if(peng||peng1||peng2||peng3||peng4||peng5||peng6||peng7||peng8||peng9||peng10||peng11||peng12||peng13||peng14||peng15||peng16||peng17||peng18||peng19||peng20||peng21||peng22||peng23) {
				w.live=false;
				if(bao == null) {
					bao = new Explode(w.x,w.y);
					endTime = new Date();
					period =(int)((endTime.getTime() - startTime.getTime())/1000);
				}
				bao.darw(g);
			}
			if(!w.live) {
				g.setColor(Color.YELLOW);
				Font f = new Font("行书",Font.BOLD,50);
				g.setFont(f);
				g.drawString("王帅被屎淹没不知所措",(int)90,(int)300);
				g.drawString("\t"+"\t"+"王帅挣扎时间："+period+"秒", (int)120,(int)350);
			}
			g.setColor(c);
			}
	
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				//System.out.println("我是你尕爹");
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			w.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			w.minusDirection(e);
		}
		
	}
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}   
	
	public void lunchFrame(){
		this.setTitle("王帅躲屎记");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(600, 200);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		new PaintThread().start();
		addKeyListener(new KeyMonitor());
		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.lunchFrame();
	}
}
