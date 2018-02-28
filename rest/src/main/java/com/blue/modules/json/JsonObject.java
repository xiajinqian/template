package com.blue.modules.json;

import java.util.HashMap;


public class JsonObject extends HashMap<String, Object> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1715940757407575070L;

	public JsonObject() {
        super();
    }

    public JsonObject add(String key, Object val) {
        super.put(key, val);
        return this;
    }

    public JsonObject appendJsonArray(String key, JsonObject val) {
        JsonArray jsonArray = (JsonArray) super.get(key);
        if (jsonArray == null) {
            jsonArray = Json.createJsonArray();
            this.add(key,jsonArray);
        }
        jsonArray.add(val);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (String key : this.keySet()) {
            sb.append("\"" + key + "\"");
            sb.append(":");
            Object value = this.get(key);
            sb.append(value instanceof CharSequence ? "\"" + value + "\"" : value);
            sb.append(',');
        }
        if (this.size() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}");
        return sb.toString();
    }
}
