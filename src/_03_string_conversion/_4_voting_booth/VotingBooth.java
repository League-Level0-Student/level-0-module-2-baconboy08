package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("how old are you??");
		
		int ageAsInt = Integer.parseInt(age);
	
		if (ageAsInt >= 18){
		
		String president = JOptionPane.showInputDialog("Who do you want to be president?");	
			
		JOptionPane.showMessageDialog(null,"I want " + president + " to be president too!");	
			
			} else { 
			
		JOptionPane.showMessageDialog(null, "Then I don't care what you think. Nobody does ");
		
		}
		
	}
}
