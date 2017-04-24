package draw.controller;

import draw.view.DrawFrame;

public class DrawController 
{
	private DrawFrame baseFrame;
	
	public void start()
	{
		baseFrame = new DrawFrame(this);
	}

}
