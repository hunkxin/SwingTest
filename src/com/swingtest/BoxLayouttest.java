package com.swingtest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class BoxLayouttest {
	private JFrame jf;
	public void getbox(){
		jf = new JFrame("箱式布局");
		Container container = jf.getContentPane();
		Box topicbox = Box.createHorizontalBox();
		container.add(topicbox,BorderLayout.NORTH);
		topicbox.add(Box.createHorizontalStrut(5));
		JLabel topiclabel = new JLabel("主题");
		topicbox.add(topiclabel);
		topicbox.add(Box.createHorizontalStrut(5));
		JTextField topictf = new JTextField(30);
		topicbox.add(topictf);
		Box box = Box.createVerticalBox();
		container.add(box,BorderLayout.CENTER);
		box.add(Box.createVerticalStrut(5));
		//box.add(Box.createRigidArea(new Dimension(15,15)));
		//box.add(Box.createGlue());
		Box contentbox = Box.createHorizontalBox();
		contentbox.setAlignmentX((float) 1);
		box.add(contentbox);
		contentbox.add(Box.createHorizontalStrut(5));
		JLabel contentlb = new JLabel("内容");
		contentlb.setAlignmentY((float) 0.5);
		contentbox.add(contentlb);
		contentbox.add(Box.createHorizontalStrut(5));
		JScrollPane sp = new JScrollPane();
		sp.setAlignmentY((float) 0.5);
		contentbox.add(sp);
		JTextArea ta = new JTextArea();
		ta.setLineWrap(true);
		sp.setViewportView(ta);
		box.add(Box.createVerticalStrut(5));
		//box.add(Box.createRigidArea(new Dimension(15,15)));
		//box.add(Box.createGlue());
		JButton bt = new JButton("确定");
		bt.setAlignmentX((float) 1);
		box.add(bt);
		//box.add(Box.createGlue());
		setjf();
	}
	
	private void setjf(){
		jf.setVisible(true);
		jf.setSize(500, 600);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BoxLayouttest().getbox();
	}
}
