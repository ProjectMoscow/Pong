package com.gmail.mcgelloe;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class Player {

	public float pos;

	public float getPos() {
		return pos;
	}

	public void moveUp(float value) {
		this.pos += value;
	}

	public void moveDown(float value) {
		this.pos -= value;
	}

	public void moveUp() {
		this.pos += 0.01f;
	}

	public void moveDown() {
		this.pos -= 0.01f;
	}

	public void draw() {

		glBegin(GL_QUADS);
		glColor4f(1, 1, 1, 0);

		glVertex2f(-0.925f, 0.5f + getPos());

		glVertex2f(-0.825f, 0.5f + getPos());

		glVertex2f(-0.825f, -0.5f + getPos());

		glVertex2f(-0.925f, -0.5f + getPos());

		glEnd();
	}

}
