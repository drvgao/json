package org.igt.rdurgam;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonArrayFilter {
	public static void main(String[] args) {
		jsonFilter();
	}
	public static void jsonFilter() {
	String json = "[{\"name\":\"mkyong\"}, {\"name\":\"laplap\"}]";
	Gson gson = new Gson();
	List<Staff> list = gson.fromJson(json, new TypeToken<List<Staff>>(){}.getType());
	list.forEach(x -> System.out.println(x.getName()));
	}
}
