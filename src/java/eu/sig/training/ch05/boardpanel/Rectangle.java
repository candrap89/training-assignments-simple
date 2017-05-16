package eu.sig.training.ch05.boardpanel;

import java.awt.Point;

public class Rectangle {
	private Point position;
	private int width;
	private int hight;
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public Rectangle(Point position, int width, int hight) {
		super();
		this.position = position;
		this.width = width;
		this.hight = hight;
	}
	
	
	
}
