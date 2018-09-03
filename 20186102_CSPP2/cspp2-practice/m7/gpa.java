class gpa {
	private String name, id;
	private double m1, m2, m3;
	private gpa(String n, String identity, final double marks1, final double marks2, final double marks3) {
		name = n;
		id = identity;
		m1 = marks1;
		m2 = marks2;
		m3 = marks3;
	}
	public static void main(String[] args) {
		gpa gpa1 = new gpa(args[0], args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]));
		System.out.println((gpa1.m1 + gpa1.m2 + gpa1.m3) / 3);
	}
}