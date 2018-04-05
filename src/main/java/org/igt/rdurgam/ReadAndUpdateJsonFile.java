package org.igt.rdurgam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.igt.jentity.PlayerEntity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class ReadAndUpdateJsonFile {

	public static void main(String[] args) {
		writePlayersToJson();
	}

	public static List<PlayerEntity> writePlayersToJson() {
		final Type playerListType = new TypeToken<List<PlayerEntity>>() {
		}.getType();

		Gson gson = new Gson();
		JsonReader reader;
		List<PlayerEntity> data = null;
		try {
			//1. read from file
			reader = new JsonReader(new FileReader("src/test/resources/td/player_details2.json"));
			data = gson.fromJson(reader, playerListType);

			System.out.println(data.size());
			System.out.println(data.get(2).getEmail());
			System.out.println(data.get(2).getfName());
			System.out.println(data.get(2).getlName());
			
			//2. update the value in to json object
			data.get(2).setUsed("yes");

			//3. update into the file from json object
			FileWriter writer = new FileWriter("src/test/resources/td/player_details2.json");
			gson.toJson(data, writer);
			writer.flush();
			System.out.println("File Updated.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

}
