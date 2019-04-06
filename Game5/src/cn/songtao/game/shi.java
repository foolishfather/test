package cn.songtao.game;

import java.awt.Graphics;
import java.awt.Image;

public class shi extends GameObject{
	int speed =4;
	double degree= Math.random()*Math.PI*2;
	public void drawSelf(Graphics g) {
		 g.drawImage(img, (int)x, (int)y, null);
		 x += speed*Math.cos(degree);
			y += speed*Math.sin(degree);
			
			if(x<0||x>Constant.GAME_WIDTH-30) {
				degree = Math.PI - degree; 
			}
			
			if(y<30||y>Constant.GAME_HEIGHT-30) {
				degree = - degree;
			}
	 }
	 public shi(Image img,double x,double y) {
		 this.img = img;
		 this.x = x;
		 this.y = y;
		 this.widht = img.getWidth(null);
		 this.hight = img.getHeight(null);
		 this.speed=3;
		 
	 }
}
