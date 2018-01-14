package com.gmail.mcgelloe;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class Ball {

	public float x;
	public float y;
	public double angle;

	public Ball() {
		this.angle = Math.PI / 2;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void increaseX(float x) {
		this.x += x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void increaseY(float y) {
		this.y += y;
	}

	public float getX() {
		return this.x;
	}

	public float getY() {
		return this.y;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getAngle() {
		return this.angle;
	}

	public void draw() {

		glBegin(GL_QUADS);
		glColor4f(1, 1, 1, 0);

		glVertex2f(-1 / 16f + getX(), +1 / 9f + getY());

		glVertex2f(+1 / 16f + getX(), +1 / 9f + getY());

		glVertex2f(+1 / 16f + getX(), -1 / 9f + getY());

		glVertex2f(-1 / 16f + getX(), -1 / 9f + getY());

		glEnd();

	}

	public void poll() {

		if (getX() > (+15 / 16f)) {
			
		}

		if (getX() < (-15 / 16f)) {
			
		}

		if (getY() > (+8 / 9f)) {
			
		}

		if (getY() < (-8 / 9f)) {

		}

		increaseX((float) (Math.cos(getAngle()) * 0.005f));
		increaseY((float) (Math.sin(getAngle()) * 0.005f));

		System.out.println(Math.toDegrees(angle));
	}

}
