package cn.songtao.game;

import java.awt.Graphics;
import java.awt.Image;

public class shit extends GameObject {
	double degree= Math.random()*Math.PI*2;
	int speed = 4;
	public shit(Image shitImage, double x, double y) {
		this.x = x;
		this.y = y;
		this.img = img;
		
		
		
		
	}
	
	public void drawSlef(Graphics g) {
		System.out.println("ssss");
		g.drawImage(img, (int)x, (int)y, null);
		
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		if(x<0||x>Constant.GAME_WIDTH) {
			degree = Math.PI - degree; 
		}
		
		if(y<0||y>Constant.GAME_HEIGHT) {
			degree = - degree;
		}
	}
}
