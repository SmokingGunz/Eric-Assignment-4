package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public Student[] readStudents(String file) throws IOException {

		Student[] students = new Student[101];

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader(file));
			int i = 0;
			String line = null;
			while ((line = fileReader.readLine()) != null) {
				String[] lineData = line.split(",");
				Student student = new Student(lineData[0], lineData[1], lineData[2], lineData[3]);
				students[i] = student;
				i++;
			}

		} finally {
			if (fileReader != null)
				fileReader.close();
		}
		return students;

	}

}
