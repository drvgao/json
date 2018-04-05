package org.igt.rdurgam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.igt.jentity.PlayerEntity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class UpdateJsonFile {

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
			reader = new JsonReader(new FileReader("src/test/resources/td/player_details2.json"));
			data = gson.fromJson(reader, playerListType);

			System.out.println(data.size());
			System.out.println(data.get(1).getEmail());
			System.out.println(data.get(1).getUsed());
			data.get(1).setUsed("yes");
			
		/*	FileWriter writer = new FileWriter("src/test/resources/td/player_details2.json");
				gson.toJson(data, writer);
				writer.flush();*/
			updateJsonInFile(data, gson);
			// data.set(1, element);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

	public static void updateJsonInFile(List<PlayerEntity> playersList, Gson gson) {
		// 1. Convert object to JSON string
	/*	Gson gson = new Gson();
		String json = gson.toJson(playersList);
		System.out.println(json);
		System.out.println();*/

		// 2. Convert object to JSON string and save into a file directly
		File resourcesDirectory = new File("src/test/resources/td/player_details2.json");
		try {
				FileWriter writer = new FileWriter(resourcesDirectory.getAbsolutePath());
				
			System.out.println("writing to json... @ " + resourcesDirectory.getAbsolutePath());
			gson.toJson(playersList, writer);
			writer.flush();
			System.out.println("File Updated.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
