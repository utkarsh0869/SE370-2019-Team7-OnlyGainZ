package com.company;
/**
 * NAMES: UTKARSH KARKI, MARCOS LOPEZ, DAVID FLORES
 * ID: KARKI002, LOPEZ816, FLORE510
 */

/**
 * Imported libraries.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.Random;

/**
 * This is our Random Bar Generator class.
 */
public class RandomBarGenerator extends JFrame implements ActionListener{

    /**
     * Declaration of JPanel variable.
     */
    private static JPanel pane;
    /**
     * Declaration of JButton variable.
     */
    private JButton generate;

    /**
     * Constructor for our class.
     */
    public RandomBarGenerator(){
        /**
         * Calls JFrame's constructor and sets the title for the frame to "Random Bar Generator".
         */
        super("Random Bar Generator");

        /**
         * This method initializes the different components we have.
         */
        initializeComponents();

        setSize(430, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void paintComponents(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int y = 60, x1 = 30;

        for ( int r = 1; r <= 11; r++, y += 10 )
            g2d.drawLine( 30, y, 390, y );

        for ( int c = 1; c <= 11; c++, x1 += 36 )
            g2d.drawLine( x1, 60, x1, 160 );
    }
    public void drawLines(Graphics gg){
        Graphics2D g2d = (Graphics2D) gg;

        g2d.setStroke(new BasicStroke(10f));

        Random r = new Random();
        int low = 60;
        int high = 154;
        int result = 0;

        for(int x = 60; x < 300; x += 20){
            result = r.nextInt(high-low)+low;
//            System.out.println(result); //added for error checking
            g2d.setColor(new Color(randRed(), randGreen(), randBlue()));
            g2d.draw(new Line2D.Double(x, 156d, x, result));
        }

    }
    private int randRed(){
        int red;
        Random r = new Random();
        red = r.nextInt(255);
        return red;
    }
    private int randGreen(){
        int green;
        Random r = new Random();
        green = r.nextInt(255);
        return green;
    }
    private int randBlue(){
        int blue;
        Random r = new Random();
        blue = r.nextInt(255);
        return blue;
    }

    private void initializeComponents(){

        /**
         * Initializes the JPanel with BorderLayout.
         */
        pane = new JPanel(new BorderLayout());
        //sets the back groud to grey
        pane.setBackground(Color.GRAY);
        //sets opaqueness to false
        pane.setOpaque(false);

        pane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Random Bar Generator"));//optional
        /**
         * JButton is initialized, and set the title to "Redraw"
         */
        generate = new JButton("Redraw");
        /**
         * The button is added to the panel. The BorderLayout allows us to add the button the end(south) of the panel.
         */
        pane.add(generate, BorderLayout.SOUTH);

        /**
         * generate will be added to the components that are being tracked for an action event.
         * When is user clicks the "Redraw" button, this method comes to action.
         */
        generate.addActionListener( this);

        //pane JPanel is added to the JFrame.
        add(pane);
    }

    /**
     * This method is executed every time the user clicks the "Redraw button".
     * It prints out "Clicked" when the button is clicked to the console just to confirm that the button was clicked.
     * It also calls the repaint method that repaints the components.
     * The effect of calling repaint() is that Swing automatically clears the graphic on the panel and executes the
     * paintComponent method to redraw the graphics on this panel.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
        repaint();
    }

    /**
     *The paintComponent is called "on-demand" i.e. when the system decides that the component needs to be redrawn.
     * (Could for instance be when the component is resized, or when the window is restored from a minimized state.)
     * To be clear: The component is not "painted, then used", it is "used, then painted when needed".
     */
    public void paint(Graphics g) {
        super.paint(g);
        paintComponents(g);
        drawLines(g);
    }

    public static void main(String[] args) {

        RandomBarGenerator rbg = new RandomBarGenerator();
        rbg.setVisible(true);
    }
}
