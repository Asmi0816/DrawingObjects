package draw.view;
import java.awt.Dimension;

import javax.swing.JFrame;
import draw.controller.DrawController;
import draw.view.DrawPanel;

public class DrawFrame extends JFrame
{
	private DrawPanel basePanel;
	private DrawController baseController;
	
	public DrawFrame(DrawController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new DrawPanel(baseController);
		
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Shapes are amazing");
		this.setSize(new Dimension(1000, 1000));
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
