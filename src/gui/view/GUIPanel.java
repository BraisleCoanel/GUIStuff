package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click me boi!");
		appLayout = new SpringLayout();
		
		setupListeners();
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set color
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(appLayout);
		this.add(firstButton);
	}
	
	/**
	 * Used to hold the constraint positioning for SpringLayout.
	 * AKA a giant dumping ground for all the xxxx.putContstraint(...) lines.
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 190, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -250, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)		
			{
				changeScreenColor();
			}
				});
	}
	
	private void changeScreenColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
				
	}
	
}
