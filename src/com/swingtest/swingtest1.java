package com.swingtest;

import java.awt.*;

import javax.swing.*;

public class swingtest1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void createJFrame(String title){
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("hellojframe!!!");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.orange);
		jf.setVisible(true);
		jf.setSize(300, 200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new swingtest1().createJFrame("hello");
	}

}
