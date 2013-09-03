package com.example.sistemadecredito.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MenuContent {

	public static List<ModuloContent> ITEMS = new ArrayList<ModuloContent>();

	public static Map<String, ModuloContent> ITEM_MAP = new HashMap<String, ModuloContent>();

	static {
		addItem(new ModuloContent("1", "Módulo de Consulta",Arrays.asList("1", "2","3")));
		addItem(new ModuloContent("2", "Módulo de Cancelamento"));
		addItem(new ModuloContent("3", "Módulo de Registro"));
	}

	private static void addItem(ModuloContent item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}
}
