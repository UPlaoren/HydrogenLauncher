package org.HydrogenLauncher.Launch;

import org.tinylog.Logger;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GameRepository {
    private File rootDirectory;
    private File versionsDir;
    private File librariesDir;
    private File assetsDir;
    private Map<String, Version> versions = new HashMap<String, Version>();

    public GameRepository() {
        rootDirectory = new File(".minecraft");
        versionsDir = new File(".minecraft/versions");
        librariesDir = new File(".minecraft/libraries");
        assetsDir = new File(".minecraft/assets");

        if (!versionsDir.mkdirs()) {
            Logger.info("versions folder already exists");
        }
        if (!librariesDir.mkdirs()) {
            Logger.info("libraries folder already exists");
        }
        if (!assetsDir.mkdirs()) {
            Logger.info("assets folder already exists");
        }
    }

    public void updateVersions() {
        File[] files = versionsDir.listFiles();
        if (files != null) {
            for (File file : files) {
                // 如果是文件夹，则创建版本对象并添加进版本列表
                if (file.isDirectory()) {
                    versions.put(file.getName(), new Version(file));
                }
            }
        }
    }

    public Version getVersion(String name) {
        return  versions.get(name);
    }
}
