package com.swingtest;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class CardLayouttest {
	private JFrame jf;
	private JPanel cpl;
	private CardLayout cla;
	public void getcard(){
		jf = new JFrame("卡片式布局");
		Container container = jf.getContentPane();
		cla = new CardLayout();
		cpl = new JPanel(cla);
		container.add(cpl, BorderLayout.CENTER);
		String[] labelnames = {"卡片A","卡片B","卡片C"};
		for(int i =0;i<labelnames.length;i++){
			final JLabel lb = new JLabel(labelnames[i]);
			lb.setHorizontalAlignment(SwingConstants.CENTER);
			lb.setFont(new Font("", Font.BOLD, 16));
			lb.setForeground(new Color(255,0,0));
			cpl.add(lb,labelnames[i]);
		}
		final JPanel btpl = new JPanel();
		container.add(btpl, BorderLayout.SOUTH);
		String[] btnames = {"第一个","前一个","卡片A","卡片B","卡片C","后一个","最后一个"};
		for(int i =0;i<btnames.length;i++){
			final JButton bt = new JButton(btnames[i]);
			bt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String buttontext = bt.getText();
					if(buttontext.equals(btnames[0])){
						cla.first(cpl);
					}
					else if(buttontext.equals(btnames[1])){
						cla.previous(cpl);
					}
					else if(buttontext.equals(btnames[2])){
						cla.show(cpl, btnames[2]);
					}
					else if(buttontext.equals(btnames[3])){
						cla.show(cpl, btnames[3]);
					}
					else if(buttontext.equals(btnames[4])){
						cla.show(cpl, btnames[4]);
					}
					else if(buttontext.equals(btnames[5])){
						cla.next(cpl);
					}
					else if(buttontext.equals(btnames[6])){
						cla.last(cpl);
					}
				}
			});
			btpl.add(bt,btnames[i]);
		}
		
		setjf();
	}
	
	private void setjf(){
		jf.setVisible(true);
		jf.setSize(800, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CardLayouttest().getcard();
	}
}
