package org.igt.rdurgam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class WriteJsonToFile {

	public static void main(String[] args) {

		Staff staff = createDummyObject();

		// 1. Convert object to JSON string
		Gson gson = new Gson();
		String json = gson.toJson(staff);
		System.out.println(json);
		System.out.println();

		// 2. Convert object to JSON string and save into a file directly
		File resourcesDirectory = new File("src/test/resources/td/staff.json");
		try (FileWriter writer = new FileWriter(resourcesDirectory.getAbsolutePath())) {
			System.out.println("writing to json... @ " + resourcesDirectory.getAbsolutePath());
			gson.toJson(staff, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//to write in to json object
	private static Staff createDummyObject() {
		Staff staff = new Staff();

		staff.setName("mkyong");
		staff.setAge(35);
		staff.setPosition("Founder3");
		staff.setSalary(new BigDecimal("10000"));

		List<String> skills = new ArrayList<>();
		skills.add("java");
		skills.add("python");
		skills.add("shell");

		staff.setSkills(skills);
		return staff;
	}
	
}