package tester;

import java.util.Scanner;

import com.app.core.Emp;
import static utils.EmpValidationConstraints.*;

public class TestEmps {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Emp[] emps = new Emp[100];
			int counter=0;
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options : 1 Add Emp Details 2. Show 3.Exit");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter emp details : id name sal joindate(day-mon-yr)");
						Emp e = new Emp(sc.nextInt(), validateName(sc.next()), sc.nextDouble(),
								parseNValidateDate(sc.next()));
						System.out.println("emp reg successful");
						emps[counter++]=e;
						break;

					case 2:
						for(Emp e1 : emps)
							if(e1 != null)
								System.out.println(e1);

						break;
					case 3:
						exit = true;

						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				//to read off all pending tokens from Scaner's buffer : till end of line
				sc.nextLine();
			}
		}
	}

}
