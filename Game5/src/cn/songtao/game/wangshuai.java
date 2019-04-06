package cn.songtao.game;

import java.awt.Graphics; 	 	
import java.awt.Image;
import java.awt.event.KeyEvent;

public class wangshuai extends GameObject{
	int speed =2;
	boolean left,right,up,down;
	boolean live = true;
	
	 public void drawSelf(Graphics g) {
		 
		 if(live) {
		 g.drawImage(img, (int)x, (int)y, null);
		 if(left) {
			x-=speed;
		 }
		 if(right) {
			 x+=speed;
		 }
		 if(up) {
			 y-=speed;
		 }
		 if(down) {
			 y+=speed;
		 }
	 }else {
		 
	 }
	}
	 
	 
	 public wangshuai(Image img,double x,double y) {
		 this.img = img;
		 this.x = x;
		 this.y = y;
		 this.widht=img.getWidth(null);
		 this.speed=-10;
		 this.hight=img.getHeight(null);
		 
	 }
	 
	 public void addDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			up = true;
			break;
		case KeyEvent.VK_D:
			right = true;
			break;
		case KeyEvent.VK_A:
			left = true;
			break;
		case KeyEvent.VK_S:
			down = true;
			break;

		default:
			break;
		}
	 }
	 
	 public void minusDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			up = false;
			break;
		case KeyEvent.VK_D:
			right = false;
			break;
		case KeyEvent.VK_A:
			left = false;
			break;
		case KeyEvent.VK_S:
			down = false;
			break;

		default:
			break;
		}
	 }
}
