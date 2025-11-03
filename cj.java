package cj7;
import java.util.Scanner;
public class cj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Input: ");
		        String input = scanner.nextLine();

		        String state = "q0"; // Start state

		        for (char ch : input.toCharArray()) {
		            switch (state) {
		                case "q0":
		                    if (ch == '0') {
		                        state = "q1";
		                    } else if (ch == '1') {
		                        state = "q0";
		                    }
		                    break;
		                case "q1":
		                    if (ch == '0') {
		                        state = "q1";
		                    } else if (ch == '1') {
		                        state = "q2";
		                    }
		                    break;
		                case "q2":
		                    if (ch == '0') {
		                        state = "q1";
		                    } else if (ch == '1') {
		                        state = "q0";
		                    }
		                    break;
		            }
		        }

		        if (state.equals("q2")) {
		            System.out.println("Output: Accepted");
		        } else {
		            System.out.println("Output: Rejected");
		        }

		        scanner.close();
		    }
		}

	

