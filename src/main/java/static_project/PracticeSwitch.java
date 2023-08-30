package static_project;

public class PracticeSwitch {
	public static void practiceswitch() {
		int[] jobArray = { 1, 5, 2, 3, 1, 2, 1, 5, 4, 3 };

		for (int i = 0; i < 10; i++) {
			int jobCode = jobArray[i];
			switch (jobCode) {
			case 1:
				System.out.println("勇者");
				break;
			case 2:
				System.out.println("バトルマスター");
				break;
			case 3:
				System.out.println("パラディン");
				break;
			case 4:
				System.out.println("海賊");
				break;
			case 5:
				System.out.println("魔法剣士");
				break;
			}
		}
	}
}
