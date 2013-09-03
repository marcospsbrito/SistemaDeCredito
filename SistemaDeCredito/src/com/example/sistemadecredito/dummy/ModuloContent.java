package com.example.sistemadecredito.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuloContent {
		public String id;
		public String content;
		public List<ItemModuloContent> ITEMS = new ArrayList<ItemModuloContent>();

		public Map<String, ItemModuloContent> ITEM_MAP = new HashMap<String, ItemModuloContent>();

		

		public void addItem(ItemModuloContent item) {
			ITEMS.add(item);
			ITEM_MAP.put(item.getId(), item);
		}

		public ModuloContent(String id, String content) {
			this.id = id;
			this.content = content;
		}

		public ModuloContent(String id, String content, List<String> asList) {
			this.id = id;
			this.content = content;
			int i = 1;
			for (String itemModulo : asList) {
				ITEMS.add(new ItemModuloContent(""+i, itemModulo));
			}
		}

		@Override
		public String toString() {
			return content;
		}
}
