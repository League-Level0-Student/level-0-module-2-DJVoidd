package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class StupidChild {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("Enter your age");
	int num = Integer.parseInt(age);
	if(num > 17) {
		JOptionPane.showInputDialog("Who do you want to vote for?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think dumb child!");
	}
}
}
