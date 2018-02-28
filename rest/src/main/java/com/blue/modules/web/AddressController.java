package com.blue.modules.web;

import com.blue.modules.json.JsonResult;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "地址相关接口")
@RestController("addressController")
@RequestMapping("/")
public class AddressController {

    @Autowired
    public Environment prop;


    @ApiOperation(value = "省市区列表", notes = "")
    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    public JsonResult<Object> getCityList(
            @ApiParam(value = "类型") @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "showChild", required = false) boolean showChild,
            @RequestParam(value = "publicFlag", required = false, defaultValue = "0") String publicFlag) {
        JsonResult<Object> result = new JsonResult<Object>();
        try {
            // 城市联动
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("type", type);
            resultMap.put("showChild", showChild);
            resultMap.put("publicFlag", publicFlag);
            resultMap.put("publicFlag", "{\"name\":\"xiao ming\"}");
            resultMap.put("param", prop.getProperty("test.param"));
            result.setReturnValue(resultMap);
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setSuccess(false);
            result.setErrorReason("系统错误，请联系管理员！");
        }
        return result;
    }

    @ApiOperation(value = "根据城市获取小区", notes = "")
    @RequestMapping(value = "/postTest", method = RequestMethod.POST)
    public JsonResult<Object> getEstate(@RequestBody QueryEstateReq request) {
        JsonResult<Object> result = new JsonResult<Object>();
        try {
            // 城市联动
            Map<String, Object> resultMap = new HashMap<>();
            List<Map<String, Object>> mapList = Lists.newArrayList();
            for (int i = 0; i < 5; i++) {
                Map<String, Object> map = Maps.newHashMap();
                map.put("id" + i, "abc" + i);
                map.put("name" + i, "qwe" + i);
                mapList.add(map);
            }
            resultMap.put("estateList", mapList);// 更多
            resultMap.put("request", request);// 总数
            resultMap.put("param", prop.getProperty("test.param"));
            result.setReturnValue(resultMap);
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setSuccess(false);
            result.setErrorReason("系统错误，请联系管理员！");
        }
        return result;
    }

}
