package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	
	public GUIPanel(GUIController appController)
	{
		super();
		this.appController = appController;
	}
}
