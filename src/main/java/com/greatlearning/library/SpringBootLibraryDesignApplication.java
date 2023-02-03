package com.greatlearning.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.model.FullName;
import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.DeleteService;
import com.greatlearning.library.service.LibraryCountService;
import com.greatlearning.library.service.LibraryCreateService;
import com.greatlearning.library.service.LibraryExist;
import com.greatlearning.library.service.ReadServiceInterface;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j

public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	@Autowired
	ReadServiceInterface readService;

	@Autowired
	LibraryCreateService createService;
	
	@Autowired
	LibraryCountService countService;
	
	@Autowired
	DeleteService deleteLibrary;
	
	@Autowired
	LibraryExist libraryExist;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		// System.out.println("hlo");
		// System.out.println("hlo dev tool");
	}

	@Override
	public void run(String... args) throws Exception {	
//	    extractedConstructorInjection();		
//		readAndPagingDB();
//		extractedSaveAndFlushMethod();	
//		countServiceImpl();
		
//		log.info("Check if library exist by id : {}", libraryExist.checkLibraryExistbyID(12));
		
		log.info("Check if library exist by book name : {}", libraryExist.checkLibraryWithbookNameByExample(""));
		
		
		
//		log.info("Check if library exist by book name : {}", 
//				deleteLibrary.deleteLibrary(LibraryEntity.builder()
//						.commaSepratedBookName("ABC, XYZ").id(9)
//						.libraryName("D Library").build()));
		
		
		//pruneTable
//		log.info("Delete all records in DB: {}", deleteLibrary.pruneTable());
		
//		deleteAllThese	
		List<LibraryEntity> libraries = new ArrayList<LibraryEntity>();
		
		libraries.add(LibraryEntity.builder().commaSepratedBookName("").id(4).libraryName("DC Comics").build());
		libraries.add(LibraryEntity.builder().commaSepratedBookName("Star-Wars").id(5).libraryName("Fiction").build());
		
//		log.info("Delete all these records: {}", deleteLibrary.deleteAllThese(libraries));
		
//		deleteAllInBatch()
//		log.info("Delete all these records: {}", deleteLibrary.deleteAllInBatch());
		
//		deleteByID()
//		log.info("Delete all these records: {}", deleteLibrary.deleteByID(4));
		
		
//		deleteAllTheseInBatch
//		log.info("Delete all these records: {}", deleteLibrary.deleteAllTheseInBatch(libraries));
		
		
		
		
	}

	private void countServiceImpl() {
		//getCountOfLibrary
		log.info("Count of Library in DB: {}", countService.getCountOfLibrary());
		
//		countLibraryWithNoBooks
		log.info("Count of Library in DB with no Books: {}", countService.countLibraryWithNoBooks());
	}

	private void extractedConstructorInjection() {
		//All Args Constructor Injection
		  
//		 GreatLearning allArgsConstructorInjection = new GreatLearning( "Spring Boot framework Constructor Injection", "Information Technology", "GreatLearning Wale Guru Ji");
		 
//		 System.out.println("All Args Constructor Injection " +
//		 allArgsConstructorInjection);
		 
//		 //TeleScoping Constructor Injection
//		 GreatLearning telescopingConstructor = new
//		 GreatLearning("Learning Telescoping Constructor",
//		 "Apne GreatLearning Wale Guru Ji");
//		 System.out.println("TeleScoping Constructor Injection " +
//		 telescopingConstructor);
//		 // Using Builder (Lombok Anotation)
//		 GreatLearning glTeleScoping = GreatLearning.builder()
//		 .courseName("Learning how to use Builder Anotation")
//		 .courseType("Information Technology")
//		 .instructorName("Apne Dhasu Wale Guru Ji |=>Smarth Narula<=|")
//		 .build();
		
		 System.out. println("TeleScoping Constructor Using Lombok ka Jadui Anotation ->Builder<- ");
	}

	private void readAndPagingDB() {
		GreatLearning glComplexObj = GreatLearning.builder()
		 // Ab Aayego Majo With Full Complex Object :)
		 .courseName("Apun Sikhega Complex Object")
		 .courseType("IT")
		 .instructorName(FullName.builder()
		 .firstName("Smarth")
		 .lastName("Narula")
		 .build())
		 .build();
		 
		 System.out.println("Complex Object " +glComplexObj);
		 
		 System.out.println("-----------------------");
		 
		 log.info("Complex Object ->{} ", glComplexObj);
		 //->{} is kind of lambada expression thing
		 

		// log.info("Read liberary using logger ->{}", readService.getAllLiberary());

		// log.info("How Liberary with no book look likes");
		// readService.getAllLiberaryWithNoBook();

		// log.info("fetch all liberaries with no books ->{}",
		// readService.getAllLiberaryWithNoBook());
		
		//Print in page format
		// log.info("Fetch liberary in page format -> {}",
		// readService.getLibraryPager().get().collect(Collectors.toList()));

		//Print in page format - with boilerplate codes
		// Page<LibraryEntity> pager = readService.getLibraryPager();
		// List<LibraryEntity> liberary =pager.get().collect(Collectors.toList());
		// log.info("New wala pager -> {}", liberary);

		//Custom Pager
		// log.info("Custom Page format -> {}", 
		// readService.getCustomLibraryPager(0, 2).get().collect(Collectors.toList()));

		//getLatestAddedFirst
		// log.info("Fetch latest added query -> {} ", readService.getLatestAddedFirst());

		//getCustomSortedByID
		log.info("Fetch library with custom ID : {}", readService.getCustomSortedByID(Direction.ASC));

		//getSortedByName
		log.info("Sort liberary with name : {}", readService.getSortedByName());

		// getCustomSortedByName
		log.info("Fetch library with custom name : {}", readService.getCustomSortedByName(Direction.ASC));
		
		// getLibraryPagedAndSortedByNameAndWithTheseBooks
		log.info("Fetch library with getLibraryPagedAndSortedByNameAndWithTheseBooks method : {}", 
		readService.getLibraryPagedAndSortedByNameAndWithTheseBooks("ABC, XYZ").get().collect(Collectors.toList()));
		
		//getLibraryPagedAndSortedByName
		log.info("getLibraryPagedAndSortedByName : {}", readService.getLibraryPagedAndSortedByName().get().collect(Collectors.toList()));

		//getCustomLibraryPagedAndSortedByNameAndWithTheseBooks
		log.info("get Custom Library Paged And Sorted By Name And With These Books : {}", 
		readService.getCustomLibraryPagedAndSortedByNameAndWithTheseBooks("ABC, XYZ", 0, 3)
		.get().collect(Collectors.toList()));

		//getCustomLibrarySortedByNameAndWithTheseBooks
		log.info("get Custom Library Sorted By Name And With These Books : {}", 
		readService.getCustomLibrarySortedByNameAndWithTheseBooks("ABC, XYZ"));

		//getLibraryByID
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(3);
		log.info("get Library By IDs : {}", readService.getLibraryByIDs(ids));

		// getLibraryByIDMethod
		int id = 2;
		Optional<LibraryEntity> OptionalWaliLib = readService.getLibraryByIDMethod(id);
		if(OptionalWaliLib.isPresent()){
			log.info("get Library By ID Method : {}", OptionalWaliLib.get());
		}else {
			log.info("Given ID is not found");
		}
		
		// getALibraryWithTheseBooks
		Optional<LibraryEntity> OptionalWaliLibWithBOOKName = readService.getALibraryWithTheseBooks("Civil-War, Avengers, Spider-Man");
		if(OptionalWaliLibWithBOOKName.isPresent()){
			log.info("get Library By BookName : {}", OptionalWaliLibWithBOOKName.get());
		}else {
			log.info("Given Book name is not found");
		}
	}

	private void extractedSaveAndFlushMethod() {
		//addSingleLibrary
		log.info("Create a new library {}", 
		createService.addSingleLibrary(LibraryEntity
		.builder().id(10).commaSepratedBookName("Teen Titans, Arrowverse")
		.libraryName("Superheros")
		.build()));

		log.info("Read library : {}", readService.getAllLiberary());
		
		//addAllLibrary
		List<LibraryEntity> libraries = new ArrayList<LibraryEntity>();
		libraries.add(LibraryEntity.builder().id(11).commaSepratedBookName("WAR, TIGER, PATHAAN").libraryName("YRF SPY Universe").build());
		libraries.add(LibraryEntity.builder().id(12).commaSepratedBookName("Kaithi, Vikram").libraryName("Lokesh Universe").build());
		
		// log.info("Add All libraries", createService.addAllLibrary(libraries));
		
		//addLibraryWithSaveAndFlush
		log.info("Add All libraries with Save and Flush Combined", createService.addLibraryWithSaveAndFlush(LibraryEntity.builder().id(13).commaSepratedBookName("Amazon, Flipkart").libraryName("E-Commerce Library").build()));



		log.info("Read library : {}", readService.getAllLiberary());
	}


}
