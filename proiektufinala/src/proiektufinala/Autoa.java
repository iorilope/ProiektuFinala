/*
 * 2023(e)ko aza. 15(a)
 * 
 */
package proiektufinala;

import javax.swing.JOptionPane;


// TODO: Auto-generated Javadoc
/**
 * The Class Autoa.
 */
public class Autoa {
	
	/** The Modeloa. */
	private String Modeloa;
	
	/** The Marka. */
	private String Marka;
	
	/**
	 * Instantiates a new autoa.
	 */
	Autoa () {

		Modeloa = "Benz";
		Marka= "Mercedes";
	}
	
	/**
	 * Instantiates a new autoa.
	 *
	 * @param a the modeloa
	 * @param b the marka
	 */
	Autoa (String a,String b) {
		Modeloa = a;
		Marka = b;
	}
	
	/**
	 * Gets the modeloa.
	 *
	 * @return the modeloa
	 */
	public String getModeloa () {
		return Modeloa;
	}

	/**
	 * Gets the marka.
	 *
	 * @return the marka
	 */
	public String getMarka () {
		return Marka;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
		String Modeloa2 = JOptionPane.showInputDialog("Sartu zure Autoaren Modeloa");

		//Konprobatu modelo atala eta marka atala hutsak dauden
		try {
			if (Modeloa2 == null || Modeloa2.isEmpty()) {
				throw new IllegalArgumentException("Modelo atalak ezin du hutsik joan");
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}

		String Marka2 = JOptionPane.showInputDialog("Sartu zure Autoaren Marka");
		try {
			if (Marka2 == null || Marka2.isEmpty()) {
				throw new IllegalArgumentException("Marka atalak ezin du hutsik joan");
			}
			if (Marka2.matches(".*\\d.*")) {
				throw new IllegalArgumentException("Marka atalak ezin du zenbakirik izan");
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}

		
		JOptionPane.showMessageDialog(null, "Modeloa " + Modeloa2 + " Marka : " + Marka2);
	}


}
