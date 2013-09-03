package com.example.sistemadecredito.dummy;

public class ItemModuloContent {

	private String id;
	private String descricaoItem;

	public ItemModuloContent(String id, String itemModulo) {
		this.id = id;
		this.setDescricaoItem(itemModulo);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

}
