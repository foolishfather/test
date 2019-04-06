package cn.songtao.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
 Image img;
 double x,y;
 int speed;
 int widht,hight;
 
 public void drawSelf(Graphics g) {
	 g.drawImage(img, (int)x, (int)y, null);
 }

public GameObject(Image img, double x, double y, int speed, int widht, int hight) {
	super();
	this.img = img;
	this.x = x;
	this.y = y;
	this.speed = speed;
	this.widht = widht;
	this.hight = hight;
}

public GameObject(Image img, double x, double y) {
	super();
	this.img = img;
	this.x = x;
	this.y = y;
}
 
 public GameObject() {

} 
 public Rectangle getRect() {
	 return new Rectangle((int)x,(int) y, widht , hight);
}
 
}
