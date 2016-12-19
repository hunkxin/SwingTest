package com.swingtest;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{

	public MyFrame() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("弹出对话框");
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new JDialogtest(MyFrame.this).setVisible(true);
			}
		});
		container.add(bl);
		container.setBackground(Color.orange);
		setVisible(true);
		setSize(500, 600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
}
