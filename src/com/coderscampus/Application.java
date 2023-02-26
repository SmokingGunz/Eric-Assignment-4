package com.coderscampus;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();
		Student[] masterList = fileService.readStudents("student-master-list.csv");
		StudentService.writeStudents(masterList);

	}

}
