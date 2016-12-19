package com.swingtest;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridBagLayouttest {
	private JFrame jf;
	
	private void setjf(){
		jf.setVisible(true);
		jf.setSize(800, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void getgridtest(){
		jf = new JFrame("网格组布局");
		Container container = jf.getContentPane();
		GridBagLayout gbla = new GridBagLayout();
		
		//jf.setLayout(gbla);
		container.setLayout(gbla);
		final JButton bt = new JButton("A");
		final GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 10;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		container.add(bt, gbc);
		
		final JButton bt_1 = new JButton("B");
		final GridBagConstraints gbc_1 = new GridBagConstraints();
		gbc_1.gridx = 1;
		gbc_1.gridy = 0;
		gbc_1.insets = new Insets(0,5,0,0);
		gbc_1.weightx = 20;
		gbc_1.fill = GridBagConstraints.HORIZONTAL;
		container.add(bt_1, gbc_1);
		
		final JButton bt_2 = new JButton("C");
		final GridBagConstraints gbc_2 = new GridBagConstraints();
		gbc_2.gridx = 2;
		gbc_2.gridy = 0;
		gbc_2.gridheight = 2;
		gbc_2.insets = new Insets(0,5,0,0);
		gbc_2.weightx = 30;
		gbc_2.fill = GridBagConstraints.BOTH;
		container.add(bt_2, gbc_2);
		
		final JButton bt_3 = new JButton("D");
		final GridBagConstraints gbc_3 = new GridBagConstraints();
		gbc_3.gridx = 3;
		gbc_3.gridy = 0;
		gbc_3.gridheight = 4;
		gbc_3.insets = new Insets(0,5,0,5);
		gbc_3.weightx = 40;
		gbc_3.fill = GridBagConstraints.BOTH;
		container.add(bt_3, gbc_3);
		
		final JButton bt_4 = new JButton("E");
		final GridBagConstraints gbc_4 = new GridBagConstraints();
		gbc_4.gridx = 0;
		gbc_4.gridy = 1;
		gbc_4.gridwidth = 2;
		gbc_4.insets = new Insets(5,0,0,0);
		//gbc_4.weightx = 40;
		gbc_4.fill = GridBagConstraints.HORIZONTAL;
		container.add(bt_4, gbc_4);
		
		final JButton bt_5 = new JButton("F");
		final GridBagConstraints gbc_5 = new GridBagConstraints();
		gbc_5.gridx = 0;
		gbc_5.gridy = 2;
		//gbc_5.gridheight = 4;
		gbc_5.insets = new Insets(5,0,0,0);
		//gbc_5.weightx = 40;
		gbc_5.fill = GridBagConstraints.HORIZONTAL;
		container.add(bt_5, gbc_5);
		
		final JButton bt_6 = new JButton("G");
		final GridBagConstraints gbc_6 = new GridBagConstraints();
		gbc_6.gridx = 1;
		gbc_6.gridy = 2;
		gbc_6.gridwidth = 2;
		gbc_6.gridheight = 2;
		gbc_6.insets = new Insets(5,5,0,0);
		//gbc_6.weightx = 40;
		gbc_6.fill = GridBagConstraints.BOTH;
//		gbc_6.fill = GridBagConstraints.VERTICAL;// 只调整组件的高度
//		gbc_6.ipadx = 30;// 增加组件的首选宽度
//		gbc_6.anchor = GridBagConstraints.EAST;// 显示在东方
		container.add(bt_6, gbc_6);
		
		final JButton bt_7 = new JButton("H");
		final GridBagConstraints gbc_7 = new GridBagConstraints();
		gbc_7.gridx = 0;
		gbc_7.gridy = 3;
		//gbc_7.gridwidth = 2;
		//gbc_7.gridheight = 2;
		gbc_7.insets = new Insets(5,0,0,0);
		//gbc_7.weightx = 40;
		gbc_7.fill = GridBagConstraints.HORIZONTAL;
		container.add(bt_7, gbc_7);
		
		setjf();
	}
	
	public static void main(String[] args) {
		new GridBagLayouttest().getgridtest();
	}
}
