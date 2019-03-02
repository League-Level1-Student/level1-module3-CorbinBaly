
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {
	JLabel label = new JLabel();
	/*
	 * We are going to hide secrets within the magic box. When the user clicks on a
	 * secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks. 2. When the mouse is clicked, use
	 * the Media Palace (read the code in the default package) to play sounds, show
	 * images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the
	 * color of the current pixel.
	 */

	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());

	}

	JFrame frameTwo = new JFrame();
	AudioClip clip;

	@Override
	public void run() {
		try {
			loadBackgroundImage("src/magic-box.jpg");
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}

	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
		label = loadImageFromWithinProject("ShaggyInstinct copy.jpeg");
		label.setVisible(false);
		frame.add(label);
		JFrame frame2 = new JFrame();
		frame2.setVisible(false);
		frame2.add(label);
		clip = loadSound("Naruto Akatsuki Theme song FULL (online-audio-converter.com) (1).wav");
		JOptionPane.showMessageDialog(null, "Find him, find the one they call shaggy. Defeat him.");
	}

	public AudioClip loadSound(String fileName) {
		return JApplet.newAudioClip(getClass().getResource(fileName));
	}

	private void loadBackgroundImage(String imageFile) throws Exception {

		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	public void playSoundFromInternet(String soundURL) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new URL(soundURL));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(500);
		} catch (Exception ex) {
			System.out.println("Problem playing sound: " + soundURL);
			ex.printStackTrace();
		}
	}

	public JLabel loadImageFromWithinProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public void playMusicOnComputer(String fileName) {
		File fileToPlay = new File(fileName);
		try {
			java.awt.Desktop.getDesktop().open(fileToPlay);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public JLabel loadImageFromHardDrive(String filePath) {
		Icon icon = new ImageIcon(filePath);
		return new JLabel(icon);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("clicked");
		int color = backgroundImage.getRGB(e.getX(), e.getY());
		System.out.println(color);
		
			JOptionPane.showMessageDialog(null, "Like, zoinks dude. You found me! Now it's time for you to die dude!");
			clip.play();
			try {
				loadBackgroundImage("src/ShaggyInstinct copy.jpeg");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
