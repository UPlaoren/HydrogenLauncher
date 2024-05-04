package org.HydrogenLauncher.Launch;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import org.tinylog.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Version {
    private String name;
    private File rootDir;
    private File jar;
    private File json;
    private String clientVersion;
    private String mainClass;
    private String minecraftArguments;
    private ArrayList<String> libraries = new ArrayList<>();
    public Version(File file) {
        rootDir = file;
        name = rootDir.getName();

        jar = new File(rootDir + "/" + name + ".jar");
        if(jar.exists())
        {
            Logger.info("找到版本文件");
        } else {
            Logger.info("找不到版文件!!!!!!!!!");
        }

        json = new File(rootDir + "/" + name + ".json");
        if(json.exists())
        {
            Logger.info("找到JSON文件");
        } else {
            Logger.info("找不到JSON文件!!!!!!!!!");
        }
        getOptionFromJSON();
    }

    private void getOptionFromJSON(){
        try {
            // 读取 JSON 文件内容为字符串
            String jsonString = new String(Files.readAllBytes(json.toPath()));

            // 使用 Fastjson 将 JSON 字符串转换为 JSON 对象
            JSONObject jsonObject = JSON.parseObject(jsonString);

            // 获取游戏版本
            clientVersion = jsonObject.get("id").toString();
            Logger.info("clientVersion:" + clientVersion);

            // 获取主类
            mainClass = jsonObject.get("mainClass").toString();
            Logger.info("mainClass:" + mainClass);

            // 获取游戏参数
            minecraftArguments = jsonObject.get("minecraftArguments").toString();
            Logger.info("minecraftArguments:" + minecraftArguments);

            // 获取Libraries
            JSONArray arr = jsonObject.getJSONArray("libraries");
            for (Object obj : arr) {
                libraries.add(JSON.parseObject(obj.toString()).get("name").toString());
            }


        } catch (IOException e) {
            Logger.error("Failed to read JSON file!!!");
        }
    }
}
