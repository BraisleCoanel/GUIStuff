package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button!");
		
		setupPanel();
	}
	
	/**
	 * Used to add all commponents to the screen and install a layout manager.
	 * Also set color
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.add(firstButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
