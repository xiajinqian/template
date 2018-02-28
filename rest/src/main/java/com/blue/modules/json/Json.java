package com.blue.modules.json;

import java.util.Map;

/**
 * JsonObject及JsonArray工厂
 * Created by mryong on 13-12-10.
 */
public class Json {
    public static JsonObject createJsonObject() {
        return new JsonObject();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static JsonObject createJsonObject(Map map) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.putAll(map);
        return jsonObject;
    }

    public static JsonArray createJsonArray() {
        return new JsonArray();
    }

}
