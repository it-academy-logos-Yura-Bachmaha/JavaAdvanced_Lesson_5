package task01.application;

import java.time.LocalDate;

import task01.domain.Magazine;
import task01.domain.Subscribe;
import task01.domain.User;
import task01.service.MagazineService;
import task01.service.SubscribeService;
import task01.service.UserService;
import task01.service.impl.MagazineServiceImpl;
import task01.service.impl.SubscribeServiceImpl;
import task01.service.impl.UserServiceImpl;

public class Application {

	public static void main(String[] args) {

		UserService userService = new UserServiceImpl();
		userService.create(new User("John", "Miller", "john_miller@gmail.com","1111","USER"));
		userService.create(new User("Peter", "Smith", "peter_smith@gmail.com","2222","USER"));
		userService.create(new User("David", "Brown", "david_brown@gmail.com","3333","ADMIN"));
		System.out.println("List of users after adding:");
		userService.readAll().forEach(System.out::println);
		System.out.println("\nID search result :\n" + userService.read(2) + "\n");
		userService.update(new User(2, "Peter", "Smith-Brown", "peter_smithBrown@gmail.com", "0000", "USER"));
		System.out.println("User after update :");
		userService.readAll().forEach(System.out::println);
		userService.delete(3);
		System.out.println("\nList of users after deleting:");
		userService.readAll().forEach(System.out::println);
		
		MagazineService magazineService = new MagazineServiceImpl();
		magazineService.create(new Magazine("Car", LocalDate.parse("2019-10-22"), 60.99));
		magazineService.create(new Magazine("Fashion", LocalDate.parse("2022-01-20"), 99.89));
		magazineService.create(new Magazine("News", LocalDate.parse("2022-12-13"), 53.59));
		System.out.println("\nList of magazines after adding:");
		magazineService.readAll().forEach(System.out::println);
		System.out.println("\nID search result :\n" + magazineService.read(1) + "\n");
		magazineService.update(new Magazine(2, "Art", LocalDate.parse("2018-07-07"), 177.89));
		System.out.println("Magazine after update :");
		magazineService.readAll().forEach(System.out::println);
		magazineService.delete(3);
		System.out.println("\nList of magazines after deleting:");
		magazineService.readAll().forEach(System.out::println);
		
		SubscribeService subscribeService = new SubscribeServiceImpl();
		subscribeService.create(new Subscribe(1, 1, true, LocalDate.parse("2019-11-20"), 6));
		subscribeService.create(new Subscribe(2, 2, true, LocalDate.parse("2020-09-13"), 9));
		System.out.println("\nList of subscribes after adding:");
		subscribeService.readAll().forEach(System.out::println);
		System.out.println("\nID search result :\n" + subscribeService.read(1) + "\n");
		subscribeService.update(new Subscribe(1, 1, 2, true, LocalDate.parse("2020-09-13") , 12));
		System.out.println("Subscribe after update :");
		subscribeService.readAll().forEach(System.out::println);
		subscribeService.delete(1);
		System.out.println("\nList of subscribes after deleting:");
		subscribeService.readAll().forEach(System.out::println);
	}
}