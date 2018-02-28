package com.blue.modules.json;

import java.util.ArrayList;

/**
 * Created by mryong on 13-12-10.
 */
public class JsonArray extends ArrayList<JsonObject> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1607493257674599083L;

	JsonArray(){
        super();
    }

    public JsonArray addJsonObject(JsonObject jsonObject){
        super.add(jsonObject);
        return this;
    }
}
