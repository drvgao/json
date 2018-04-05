package org.igt.rdurgam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class ReadFromReviewJsonFile {
	public static void main(String[] args) {
		
		final Type REVIEW_TYPE = new TypeToken<List<Review>>() {
		}.getType();
		Gson gson = new Gson();
		JsonReader reader;
		try {
			reader = new JsonReader(new FileReader("src/test/resources/td/review.json"));
			List<Review> data = gson.fromJson(reader, REVIEW_TYPE); // contains the whole reviews list
			System.out.println(data.get(0).getReviewerName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
