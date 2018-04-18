package ldcr.BridgingSkin.data;

import java.util.LinkedHashSet;

import ldcr.lib.com.google.gson.annotations.SerializedName;

public class PlayerSkin {
    @SerializedName("uuid")
    public final String uuid;
    @SerializedName("currentSelected")
    public SkinSet currentSkin;
    @SerializedName("allSkins")
    public final LinkedHashSet<SkinSet> allSkin;
    public PlayerSkin(final String uuid, final SkinSet current,final LinkedHashSet<SkinSet> all) {
	this.uuid = uuid;
	currentSkin = current;
	allSkin = all;
    }
    public PlayerSkin(final String uuid) {
	this.uuid = uuid;
	currentSkin = new SkinSet();
	allSkin = new LinkedHashSet<SkinSet>();
	allSkin.add(currentSkin);
    }
    public PlayerSkin() {
	uuid="#NULL";
	currentSkin = new SkinSet();
	allSkin = new LinkedHashSet<SkinSet>();
	allSkin.add(currentSkin);
    }
    /*
    public JsonObject serialize() {
	final JsonObject json = new JsonObject();
	json.add("uuid", new JsonPrimitive(uuid));
	json.add("current", currentSkin.serialize());
	final JsonArray array = new JsonArray();
	for (final SkinSet skin : allSkin) {
	    array.add(skin.serialize());
	}
	json.add("all", array);
	return json;
    }

    public static PlayerSkin deserialize(final JsonObject json) {
	final String uuid = json.get("uuid").getAsString();
	final SkinSet skin = SkinSet.deserialize(json.get("current").getAsJsonObject());
	final JsonArray array = json.get("all").getAsJsonArray();
	final HashSet<SkinSet> skins = new HashSet<SkinSet>();
	for (final JsonElement el : array) {
	    final SkinSet skin2 = SkinSet.deserialize(el.getAsJsonObject());
	    skins.add(skin2);
	}
	return new PlayerSkin(uuid,skin,skins);
    }*/
}