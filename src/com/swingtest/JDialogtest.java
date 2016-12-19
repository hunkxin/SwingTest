package com.swingtest;

import java.awt.Container;

import javax.swing.*;

public class JDialogtest extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDialogtest(MyFrame frame){
		super(frame,"第一个JDialog窗体",true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(120, 120, 300, 100);
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
