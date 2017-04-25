package draw.view;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import draw.controller.DrawController;

public class DrawPanel extends JPanel
{
	private DrawController baseController;
	private SpringLayout baseLayout;
	private JButton rectangleButton, triangleButton, ellipseButton, circleButton, polygonButton, reset;
	private ShapePanel recPanel;
	
	
	public DrawPanel(DrawController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rectangleButton = new JButton("Rectangle");
		triangleButton = new JButton("Triangle");
		
		ellipseButton = new JButton("Ellipse");
		reset = new JButton("Reset");
		
		polygonButton = new JButton("Polygon");
	
		recPanel = new ShapePanel(baseController);
		circleButton = new JButton("Circle");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(new Dimension(1000, 1000));
		this.add(rectangleButton);
		this.add(triangleButton);
		this.add(circleButton);
		this.add(ellipseButton);
		this.add(polygonButton);
		this.add(reset);
		this.add(recPanel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rectangleButton, 450, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rectangleButton, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, recPanel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, recPanel, -688, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, recPanel, 937, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, recPanel, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, triangleButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, triangleButton, -15, SpringLayout.NORTH, rectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, ellipseButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, ellipseButton, -6, SpringLayout.NORTH, circleButton);
		baseLayout.putConstraint(SpringLayout.WEST, circleButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, circleButton, -6, SpringLayout.NORTH, triangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, polygonButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, polygonButton, -6, SpringLayout.NORTH, ellipseButton);
		
	}
	
	private void setupListeners()
	{
		rectangleButton.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent clicked)
				{
					recPanel.addRectangles();
				}
			}
		);
		
		triangleButton.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent clicked)
			{
				recPanel.addTriangles();
			}
		}
		);	
		
		circleButton.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent clicked)
			{
				recPanel.addCircles();
			}
		}
		);	
		
		polygonButton.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent clicked)
			{
				recPanel.addPolygons();
			}
		}
		);	
		
		ellipseButton.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent clicked)
			{
				recPanel.addEllipse();
			}
		}
		);	
		
		reset.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent clicked)
			{
				recPanel.reset();
			}
		}
		);	
	}
}
