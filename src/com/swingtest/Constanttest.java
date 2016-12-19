package com.swingtest;

import java.awt.Container;
import static javax.swing.SpringLayout.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;

public class Constanttest {
	private JFrame jf;
	
	private void setjf(){
		jf.setVisible(true);
		jf.setSize(500, 375);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public void getConstant_1(){
		jf = new JFrame("弹簧布局");
		Container container = jf.getContentPane();
		SpringLayout springLayout = new SpringLayout();
		container.setLayout(springLayout);
		
		Spring vST = Spring.constant(20);// 创建一个支柱
		Spring hSP = Spring.constant(20, 100, 500);// 创建一个弹簧
		
		JButton lButton = new JButton("按钮L");
		container.add(lButton);
		springLayout.putConstraint(NORTH, lButton, vST, NORTH,
				container);// “按钮L”北侧——>容器北侧
		springLayout.putConstraint(WEST, lButton, hSP, WEST,
				container);// “按钮L”西侧——>容器西侧
		
		JButton rButton = new JButton("按钮R");
		container.add(rButton);
		// “按钮R”北侧——>“按钮R”北侧
		springLayout.putConstraint(NORTH, rButton, 0, NORTH, lButton);
		springLayout.putConstraint(WEST, rButton, Spring.scale(hSP, 2),
				EAST, lButton);// “按钮R”西侧——>“按钮L”东侧
		// 容器东侧——>“按钮R”东侧
		springLayout.putConstraint(EAST, container, hSP, EAST,
				rButton);
		setjf();
	}
	
	public void getConstant_2(){
		jf = new JFrame("弹簧布局");
		Container container = jf.getContentPane();
		SpringLayout springLayout = new SpringLayout();
		container.setLayout(springLayout);
		Spring vST = Spring.constant(20);// 创建一个支柱
		Spring hSP = Spring.constant(20, 100, 500);// 创建一个弹簧
		JButton lButton = new JButton("按钮L");
		container.add(lButton);
		springLayout.putConstraint(NORTH, lButton, vST, NORTH,
				container);// “按钮L”北侧——>容器北侧
		springLayout.putConstraint(WEST, lButton, hSP, WEST,
				container);// “按钮L”西侧——>容器西侧
		JButton rButton = new JButton("按钮R");
		container.add(rButton);
		// “按钮R”北侧——>“按钮R”北侧
		springLayout.putConstraint(NORTH, rButton, 0, NORTH, lButton);
		// “按钮R”西侧——>“按钮L”东侧
		springLayout.putConstraint(WEST, rButton, Spring.scale(hSP, 2),
				EAST, lButton);
		springLayout.putConstraint(EAST, container, hSP, EAST,
				rButton);// 容器东侧——>“按钮R”东侧
		Spring widthSP = Spring.constant(60, 300, 600);// 创建一个弹簧
		Spring heightST = Spring.constant(60);// 创建一个支柱
		// 获得“按钮L”的Constraints对象
		Constraints lButtonCons = springLayout.getConstraints(lButton);
		lButtonCons.setWidth(widthSP);// 设置控制组件宽度的弹簧
		lButtonCons.setHeight(heightST);// 设置控制组件高度的支柱
		// 获得“按钮R”的Constraints对象
		Constraints rButtonCons = springLayout.getConstraints(rButton);
		rButtonCons.setWidth(widthSP);// 设置控制组件宽度的弹簧
		rButtonCons.setHeight(heightST);// 设置控制组件高度的支柱
		setjf();
	}
	
	public static void main(String[] args) {
		//new Constanttest().getConstant_1();
		new Constanttest().getConstant_2();
	}
}
