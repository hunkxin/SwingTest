package com.swingtest;

import java.awt.Container;
import static javax.swing.SpringLayout.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;

public class SpringLayouttest {
	private JFrame jf;
	
	private void setjf(){
		jf.setVisible(true);
		jf.setSize(800, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void getspringtest(){
		jf = new JFrame("弹簧布局");
		Container container = jf.getContentPane();
		SpringLayout springLayout = new SpringLayout();
		container.setLayout(springLayout);
		JLabel topicLabel = new JLabel("主题：");
		container.add(topicLabel);
		// 主题标签北侧——>容器北侧
		springLayout.putConstraint(NORTH, topicLabel, 5, NORTH, container);
		// 主题标签西侧——>容器西侧
		springLayout.putConstraint(WEST, topicLabel, 5, WEST, container);
		JTextField topicTextField = new JTextField();
		container.add(topicTextField);
		// 主题文本框北侧——>容器北侧
		springLayout.putConstraint(NORTH, topicTextField, 5, NORTH, container);
		// 主题文本框西侧——>主题标签东侧
		springLayout.putConstraint(WEST, topicTextField, 5, EAST, topicLabel);
		// 主题文本框东侧——>容器东侧
		springLayout.putConstraint(EAST, topicTextField, -5, EAST, container);
		JLabel contentLabel = new JLabel("内容：");
		container.add(contentLabel);
		springLayout.putConstraint(NORTH, contentLabel, 5, SOUTH, topicTextField);// 内容标签北侧——>主题文本框南侧
		// 内容标签西侧——>容器西侧
		springLayout.putConstraint(WEST, contentLabel, 5, WEST, container);
		JScrollPane contentScrollPane = new JScrollPane();
		contentScrollPane.setViewportView(new JTextArea());
		container.add(contentScrollPane);
		springLayout.putConstraint(NORTH, contentScrollPane, 5, SOUTH, topicTextField);// 滚动面板北侧——>主题文本框南侧
		springLayout.putConstraint(WEST, contentScrollPane, 5, EAST, contentLabel);// 滚动面板西侧——>内容标签东侧
		springLayout.putConstraint(EAST, contentScrollPane, -5, EAST, container);// 滚动面板东侧——>容器东侧
		JButton resetButton = new JButton("清空");
		container.add(resetButton);
		// “清空”按钮南侧——>容器南侧
		springLayout.putConstraint(SOUTH, resetButton, -5, SOUTH, container);
		JButton submitButton = new JButton("确定");
		container.add(submitButton);
		// “确定”按钮南侧——>容器南侧
		springLayout.putConstraint(SOUTH, submitButton, -5, SOUTH, container);
		// “确定”按钮东侧——>容器东侧
		springLayout.putConstraint(EAST, submitButton, -5, EAST, container);
		springLayout.putConstraint(SOUTH, contentScrollPane, -5, NORTH, submitButton);// 滚动面板南侧——>“确定”按钮北侧
		// “清空”按钮东侧——>“确定”按钮西侧
		springLayout.putConstraint(EAST, resetButton, -5, WEST, submitButton);
		
		setjf();
	}
	
	public static void main(String[] args) {
		new SpringLayouttest().getspringtest();
	}
}
