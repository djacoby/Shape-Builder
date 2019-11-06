//David Jacoby
//03 October 2018
//GUI demo absolute position for 
//user controls modified to include
//action listeners to add functionality 
//to the GUI

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException; 

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ShapeBuilder extends JPanel implements ActionListener{
	
	//instantiate control objects
	private JPanel totalGUI, radioPanel, widthPanel, lengthPanel, heightPanel, radiusPanel;
	private JLabel titleLabel, radioLabel, widthLabel, heightLabel, radiusLabel, lengthLabel;
	private static JRadioButton rectangleButton, circleButton, boxButton, cylinderButton;
	private JTextField widthTextField, lengthTextField, heightTextField, radiusTextField;
	private JButton processButton;
	
	static private int width;
	static private int length;
	static private int height;
	static private int radius;
	
	private boolean dimensionError;
	
    public JPanel createContentPane() {
    	
    	totalGUI = new JPanel(null);
    	
    	//Create title label
    	titleLabel = new JLabel();
    	titleLabel.setSize(300, 50);
    	titleLabel.setLocation (60,20);
		Font titleFont = new Font("Verdana", Font.BOLD, 26);
		titleLabel.setFont(titleFont);
		titleLabel.setText(" The Figure Center");
		
		//Create radio panel to hold radio title and buttons
		radioPanel = new JPanel();
	    radioPanel.setLayout(null);
	    radioPanel.setLocation(10, 80);
	    radioPanel.setSize(90, 120);
	    totalGUI.add(radioPanel);
		
	    //Create radio label
		radioLabel = new JLabel("Select a figure");
		radioLabel.setSize(200, 50);
		radioLabel.setLocation(0,0);
		radioPanel.add(radioLabel);

        //Create radio buttons
        rectangleButton = new JRadioButton("Rectangle");
        rectangleButton.setSize(100,20);
        rectangleButton.setLocation(0,40);
        rectangleButton.addActionListener(this);
        radioPanel.add(rectangleButton);
        
        boxButton = new JRadioButton("Box");
        boxButton.setSize(100,20);
        boxButton.setLocation(0,60);
        boxButton.addActionListener(this);
        radioPanel.add(boxButton);
        
        circleButton = new JRadioButton("Circle");
        circleButton.setSize(100,20);
        circleButton.setLocation(0,80);
        circleButton.addActionListener(this);
        radioPanel.add(circleButton);
        
        cylinderButton = new JRadioButton("Cylinder");
        cylinderButton.setSize(100,20);
        cylinderButton.setLocation(0,100);
        cylinderButton.addActionListener(this);
        radioPanel.add(cylinderButton);
        
        //Add buttons to group
        ButtonGroup group = new ButtonGroup();
        group.add(rectangleButton);
        group.add(boxButton);
        group.add(circleButton);
        group.add(cylinderButton);
        
        // -------------------------------------------- //
        
        //Create width panel
        widthPanel = new JPanel();
	    widthPanel.setLayout(null);
	    widthPanel.setLocation(120, 95);
	    widthPanel.setSize(80, 50);
	    widthPanel.setVisible(false);
	    totalGUI.add(widthPanel);
	    
	    //Create width label
	    widthLabel = new JLabel("Enter Width");
		widthLabel.setLocation(0,0);
		widthLabel.setSize(80, 20);
        widthPanel.add(widthLabel);
	    
	    //Create width field
	    widthTextField = new JTextField();
        widthTextField.setLocation(0,30);
        widthTextField.setSize(70,20);
        widthPanel.add(widthTextField);
        
        // -------------------------------------------- //
        
        //Create length panel
        lengthPanel = new JPanel();
	    lengthPanel.setLayout(null);
	    lengthPanel.setLocation(250, 95);
	    lengthPanel.setSize(80, 50);
	    lengthPanel.setVisible(false);
	    totalGUI.add(lengthPanel);
	    
	    //Create length label
	    lengthLabel = new JLabel("Enter Length");
		lengthLabel.setLocation(0,0);
		lengthLabel.setSize(80, 20);
        lengthPanel.add(lengthLabel);
	    
	    //Create length field
	    lengthTextField = new JTextField();
        lengthTextField.setLocation(0,30);
        lengthTextField.setSize(70,20);
        lengthPanel.add(lengthTextField);
        
        // -------------------------------------------- //
        
        //Create radius panel
        radiusPanel = new JPanel();
	    radiusPanel.setLayout(null);
	    radiusPanel.setLocation(120, 150);
	    radiusPanel.setSize(80, 50);
	    radiusPanel.setVisible(false);
	    totalGUI.add(radiusPanel);
	    
	    //Create radius label
	    radiusLabel = new JLabel("Enter Radius");
		radiusLabel.setLocation(0,0);
		radiusLabel.setSize(80, 20);
        radiusPanel.add(radiusLabel);
	    
	    //Create radius field
	    radiusTextField = new JTextField();
        radiusTextField.setLocation(0,30);
        radiusTextField.setSize(70,20);
        radiusPanel.add(radiusTextField);
        
        // -------------------------------------------- //
        
        //Create height panel
        heightPanel = new JPanel();
	    heightPanel.setLayout(null);
	    heightPanel.setLocation(250, 150);
	    heightPanel.setSize(80, 50);
	    heightPanel.setVisible(false);
	    totalGUI.add(heightPanel);
	    
	    //Create height label
	    heightLabel = new JLabel("Enter Height");
		heightLabel.setLocation(0,0);
		heightLabel.setSize(80, 20);
        heightPanel.add(heightLabel);
	    
	    //Create height field
	    heightTextField = new JTextField();
        heightTextField.setLocation(0,30);
        heightTextField.setSize(70,20);
        heightPanel.add(heightTextField);

        // -------------------------------------------- //
        
        //Create process button panel
        processButton = new JButton(" Click to Process "); 
        processButton.setLocation(140, 220);		
        processButton.setSize(150, 30);
        processButton.setVisible(false);
        processButton.addActionListener(this);
		totalGUI.add(processButton);				 

        totalGUI.add(titleLabel);
        
    	return totalGUI;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (rectangleButton.isSelected()) {
        	widthPanel.setVisible(true);
        	lengthPanel.setVisible(true);
        	radiusPanel.setVisible(false);
        	heightPanel.setVisible(false);
        	processButton.setVisible(true);
        }
        
        else if (boxButton.isSelected()) {
        	widthPanel.setVisible(true);
    		lengthPanel.setVisible(true);
    		radiusPanel.setVisible(false);
    		heightPanel.setVisible(true);
    		processButton.setVisible(true);
    	}
        
        else if (circleButton.isSelected()) {
        	widthPanel.setVisible(false);
    		lengthPanel.setVisible(false);
    		radiusPanel.setVisible(true);
    		heightPanel.setVisible(false);
    		processButton.setVisible(true);
        }
        
        else if (cylinderButton.isSelected()) {
        	widthPanel.setVisible(false);
    		lengthPanel.setVisible(false);
    		radiusPanel.setVisible(true);
    		heightPanel.setVisible(true);
    		processButton.setVisible(true);
        }
        
        //-------------------------------------------------//
        //Process button processing for parsing string values to integers
        //and checking for exceptions if field is valid calls method to 
        //draw figure
        
        dimensionError = true;
        
        
        if (e.getSource() == processButton) {
        	
        	//Rectangle parsing & Exception 
			 if (rectangleButton.isSelected()) {
				dimensionError = false;
				
				try {
					width = Integer.parseInt(widthTextField.getText());
					lessThanOrEqualToZeroException("Width", width);
				} 
				catch (LessThanOrEqualToZeroException ex) {
					widthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}
				catch (InputMismatchException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				
				try {
					length = Integer.parseInt(lengthTextField.getText());
					lessThanOrEqualToZeroException("Length", length);
				} 
				catch (LessThanOrEqualToZeroException ex) {
					lengthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}
				catch (InputMismatchException ex) {
					lengthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					lengthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
			}
			 //Box parsing & exception handling
			if (boxButton.isSelected()) {
				dimensionError = false;
					
				try {
					width = Integer.parseInt(widthTextField.getText());
					lessThanOrEqualToZeroException("Width", width);
				} 
    			catch (LessThanOrEqualToZeroException ex) {
					widthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
    			}
				catch (InputMismatchException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
					
				try {
					length = Integer.parseInt(lengthTextField.getText());
					lessThanOrEqualToZeroException("Length", length);
				} 
				catch (LessThanOrEqualToZeroException ex) {
					lengthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}
				catch (InputMismatchException ex) {
					lengthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					lengthTextField.setBackground(Color.RED);
					dimensionError = true;					
				}
	
				try {
					height = Integer.parseInt(heightTextField.getText());
					lessThanOrEqualToZeroException("Height", height);
				} 
				catch (LessThanOrEqualToZeroException ex) {
					heightTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}
				catch (InputMismatchException ex) {
					heightTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					heightTextField.setBackground(Color.RED);
					dimensionError = true;					
				}
			}
			
			//Circle parsing & exception handling
			if (circleButton.isSelected()) {
				dimensionError = false;
				
				try {
					radius = Integer.parseInt(radiusTextField.getText());
					lessThanOrEqualToZeroException("Radius", radius);
				} 
				catch (LessThanOrEqualToZeroException ex) {
					radiusTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}
				catch (InputMismatchException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}
			}
			
			//Cylinder parsing & exception handling
			if (cylinderButton.isSelected()) {
				dimensionError = false;
				
				try {
					radius = Integer.parseInt(radiusTextField.getText());
					lessThanOrEqualToZeroException("Radius", radius);
				} 
				catch (LessThanOrEqualToZeroException ex) {
					radiusTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}
				catch (InputMismatchException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				
				try {
					height = Integer.parseInt(heightTextField.getText());
					lessThanOrEqualToZeroException("Height", height);
				} 
				catch (LessThanOrEqualToZeroException ex) {
					heightTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}
				catch (InputMismatchException ex) {
					heightTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				catch (NumberFormatException ex) {
					heightTextField.setBackground(Color.RED);
					dimensionError = true;					
				}	
			}
			 
			 if (!dimensionError) {
				createAndShowFigure();
			}
		}
    }
    
    private static void createAndShowFigure() {
    	JFrame frame2 = new JFrame("Lab 6 GUI - Drawing");
    	if (rectangleButton.isSelected()) {
    		Rectangle demo = new Rectangle(100, 200, width, length);
    		frame2.setContentPane(demo.drawFigure());
        }
    	else if (boxButton.isSelected()) {
    		Box demo = new Box(100, 200, width, length, height);
    		frame2.setContentPane(demo.drawFigure());
		} 
    	else if (circleButton.isSelected()) {
    		Circle demo = new Circle(radius);
    		frame2.setContentPane(demo.drawFigure());
		} 
    	else if (cylinderButton.isSelected()) {
    		Cylinder demo = new Cylinder(radius, height);
    		frame2.setContentPane(demo.drawFigure());
    	}
    	
    	//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame2.setSize(700,700);
    	frame2.setLocationRelativeTo(null);
    	frame2.setVisible(true);
    }
    
    private static void createAndShowGUI() {

		JFrame frame = new JFrame("Shape Builder");	

		ShapeBuilder demo = new ShapeBuilder();  	
		frame.setContentPane(demo.createContentPane());
		
		frame.setLocationRelativeTo(null);
		frame.setLocation(0,0);    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
    }
    
    public static void lessThanOrEqualToZeroException(String myField, int myNumber) 
    		throws LessThanOrEqualToZeroException {
    	
    	if (myNumber <= 0) {
			throw new LessThanOrEqualToZeroException(myField);
		}
    }
    
    public static void lessThanZeroException(String myField, int myNumber) 
    		throws LessThanZeroException {
    	
    	if (myNumber < 0) {
			throw new LessThanZeroException(myField);
		}
    }
    	

	public static void main(String[] args) {
		createAndShowGUI();
		
	}

}
