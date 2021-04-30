package javaCamp3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor();
		instructor1.id=1;
		instructor1.userName="enginde";
		instructor1.password="12345";
		instructor1.firstName="Engin";
		instructor1.lastName="Demiroð";
		instructor1.email="engindemirog@gmail.com";
		instructor1.shortBiography="Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahip";
		
		Student student1=new Student();
		student1.id=1;
		student1.userName="nazim";
		student1.password="12345";
		student1.email="duman.nazim@gmail.com";
		student1.firstName="Nazim";
		student1.lastName="Duman";
		student1.course="Java & React";
		
		UserManager userManager=new UserManager();
		
		User [] users= {instructor1, student1};
		userManager.addMultiple(users);
		
		System.out.println(student1.getUserName()+" için "+ student1.getCourse()+" tanýmlandý.");
		System.out.println(instructor1.getUserName()+" kýsa biyografi: "+ instructor1.getShortBiography());
	}

}
