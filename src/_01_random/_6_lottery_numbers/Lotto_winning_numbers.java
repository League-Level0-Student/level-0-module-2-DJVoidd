package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto_winning_numbers {
public static void main(String[] args) {
	Random ran = new Random();			
	String lotto = "";
	for (int i=0; i<5; i++) {
	int winner = ran.nextInt( 75 - 25 + 1 ) + 10;
	lotto += winner + " ";
	
	}
JOptionPane.showMessageDialog(null, lotto);
	
	
	
	
	}
}