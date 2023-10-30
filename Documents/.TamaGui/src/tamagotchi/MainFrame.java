package tamagotchi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainFrame {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel2;
	private JLabel label;
	private JButton button;


	
	public MainFrame()   {
		initialize();
	}

	public void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Tamagotchi Clone Development Team presents");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 10, 10, 10));
		panel.setBackground(Color.BLACK);
		frame.add(panel, BorderLayout.CENTER);
		//can contain text, graphic or both
		label = new JLabel("Tamagotchi Clone");
		panel.add(label);
		//below sets color of text in this case
		label.setForeground(Color.BLUE);
		//changing font type, and boLD, to font 36
		label.setFont(new Font("Sans-serif", Font.BOLD, 36));

		ImageIcon labelIcon = new ImageIcon("tama.png");
		label.setIcon(labelIcon);
		//set space between icon and text
		label.setIconTextGap(10);
		//for horizontal constants can be:
		//left, center, right, leading or trailing
		label.setHorizontalTextPosition(SwingConstants.CENTER);		
		//vertical top, center or bottom
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		button = new JButton("New Game");
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setPreferredSize(new Dimension(200, 100));
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		button.addActionListener(new ActionListener()   {
			
			@Override
			public void actionPerformed(ActionEvent e)   {
//				label.setText("New Game Selected!");
				JFrame openGame = new JFrame("The Game Start Window Would Be Here");
				openGame.setTitle("Meet your new friend here");
				openGame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				openGame.setSize(800, 500);
				openGame.setLocationRelativeTo(null);
				JPanel thePanel = new JPanel();
				JLabel theLabel = new JLabel();
				
				ImageIcon theIcon = new ImageIcon("tamagotchi.jfif"); // load the image to a imageIcon
				Image image = theIcon.getImage(); // transform it 
				Image newimg = image.getScaledInstance(200, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
				theIcon = new ImageIcon(newimg);  // transform it back
				
				theLabel.setIcon(theIcon);
				thePanel.add(theLabel);
				
				thePanel.setBorder(BorderFactory.createEmptyBorder(100, 10, 10, 10));
				thePanel.setBackground(Color.DARK_GRAY);
				
				openGame.add(thePanel, BorderLayout.NORTH);				
				openGame.setVisible(true);				
				System.out.println("New Game was selected via button push");

				JPanel p1 = new JPanel();					
				JTextField textField;
				JLabel label1 = new JLabel();
				p1.setLayout(new FlowLayout());
				p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				//JTextField allows you to edit a single line of text
				//----------------Start of JTextField--------------//
				textField = createJTextField();	
				
				p1.add(textField);
				label1.setFont(new Font("Arial", Font.BOLD, 24));
				p1.add(label1);				
				openGame.add(p1, BorderLayout.SOUTH);				
			}
		});		
		
		panel2 = new JPanel();
		panel2.add(button);
		panel2.setBackground(Color.BLACK);
		frame.add(panel2, BorderLayout.SOUTH);
	}

	private JTextField createJTextField() {		
		//argument = text field length in characters
		JTextField textField = new JTextField(20);		
		textField.setFont(new Font("Arial", Font.BOLD, 24));
		//set text color
		textField.setForeground(Color.BLACK);
		//background color behind text
		textField.setBackground(Color.CYAN);
		//hint to what is required for entry
		textField.setToolTipText("Enter your friend's name here");
		//set margin #pix T/Lt/Bt/Rt, give space around text
		textField.setMargin(new Insets(5, 10, 5, 10));		
		textField.setHorizontalAlignment(JTextField.CENTER);		
		//set action listener for Enter key being pressed
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)   {				
				String name = textField.getText();
				System.out.println("Name entered was:  " + name);
				//this will appear  in the textField after the above is performed
				textField.setText("See console for name entered");
			}
		});
		
		return textField;
	}
	
	
	public void show()   {
		this.frame.setVisible(true);
	}
	
}