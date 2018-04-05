package org.igt.rdurgam;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ReadFromJsonFile {
	public static void main(String[] args) {
		Gson json = new Gson();
		JsonReader reader;
		try {
			reader = new JsonReader(new FileReader("src/test/resources/td/staff.json"));
			Staff data = json.fromJson(reader, Staff.class);
			System.out.println("name: "+data.getName());
			System.out.println("age should be 35 ? " + data.getAge());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
