package com.gmail.mcgelloe;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.GL;

public class Main {

	public Main() {
		if (!(glfwInit())) {
			System.err.println("GLFW Failed to initialize!");
			System.exit(1);
		}
		long window = glfwCreateWindow(1280, 720, "My LWJGL Window", 0, 0);
		glfwShowWindow(window);
		glfwMakeContextCurrent(window);
		GL.createCapabilities();

		Player newPlayer = new Player();
		Ball newBall = new Ball();

		while (!(glfwWindowShouldClose(window))) {

			if (glfwGetKey(window, GLFW_KEY_ESCAPE) == GL_TRUE) {
				glfwSetWindowShouldClose(window, true);
			}

			if (glfwGetKey(window, GLFW_KEY_W) == GL_TRUE) {
				if (newPlayer.getPos() < 0.5f) {
					newPlayer.moveUp();
				}
			}

			if (glfwGetKey(window, GLFW_KEY_S) == GL_TRUE) {
				if (newPlayer.getPos() > -0.5f) {
					newPlayer.moveDown();
				}
			}

			glfwPollEvents();

			glClear(GL_COLOR_BUFFER_BIT);

			newPlayer.draw();
			newBall.draw();
			newBall.poll();

			glfwSwapBuffers(window);
		}

		glfwTerminate();

	}

	public static void main(String[] args) {
		new Main();
	}
}
