package CollegeInformation;

public class College {
		
		private void collegeName() {
			System.out.println("Maharaja ENgg., college");
		}
		
		private void collegeCode() {
			System.out.println("College code - 4356");
		}
		
		private void collegeRank() {
			System.out.println("COllege rank - 403");
		}
	
		public static void main(String[] args) {
			College c = new College();
			Student s = new Student();
			Hostel h = new Hostel();
			Dept d = new Dept();
		
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		s.studentName();
		s.studentId();
		s.studentDept();
		h.hostelName();
		d.deptName();
		
		System.out.println("College Information Program in day1 pgm 8");
		}
	}
