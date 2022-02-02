package com.teamabnormals.boatload.core.other;

import com.google.common.collect.Lists;
import com.teamabnormals.boatload.common.item.BLBoatItem;
import com.teamabnormals.boatload.common.item.ChestBoatItem;
import com.teamabnormals.boatload.common.item.FurnaceBoatItem;
import com.teamabnormals.boatload.common.item.LargeBoatItem;
import com.teamabnormals.boatload.core.Boatload;

import java.util.List;
import java.util.stream.Collectors;

public class BLUtil {

	public static List<BLBoatItem> getItems() {
		List<BLBoatItem> items = Lists.newArrayList();
		Boatload.REGISTRY_HELPER.getItemSubHelper().getDeferredRegister().getEntries().forEach(registryObject -> items.add((BLBoatItem) registryObject.get()));
		return items;
	}

	public static List<BLBoatItem> getChestBoats() {
		return getItems().stream().filter(item -> item instanceof ChestBoatItem).collect(Collectors.toList());
	}

	public static List<BLBoatItem> getFurnaceBoats() {
		return getItems().stream().filter(item -> item instanceof FurnaceBoatItem).collect(Collectors.toList());
	}

	public static List<BLBoatItem> getLargeBoats() {
		return getItems().stream().filter(item -> item instanceof LargeBoatItem).collect(Collectors.toList());
	}
}
