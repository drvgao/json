package org.igt.rdurgam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import org.igt.jentity.PlayerEntity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class ReadFromPlayerJsonFile {
	public static void main(String[] args) {
		
		final Type playerListType = new TypeToken<List<PlayerEntity>>() {
		}.getType();
		
		Gson gson = new Gson();
		JsonReader reader;
		try {
			reader = new JsonReader(new FileReader("src/test/resources/td/player_details2.json"));
			List<PlayerEntity> data = gson.fromJson(reader, playerListType);
			
			System.out.println(data.size());
			System.out.println(data.get(1).getEmail());
			System.out.println(data.get(1).getUsed());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
