package org.HydrogenLauncher.Launch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher {
    public Launcher() {
    }

    public void launch() {
        String javaPath = "\"D:\\Kit\\JDK21\\bin\\java.exe\"";
        String jvmArguments = "-XX:+UseG1GC -XX:-UseAdaptiveSizePolicy -XX:-OmitStackTraceInFastThrow -Dfml.ignoreInvalidMinecraftCertificates=True -Dfml.ignorePatchDiscrepancies=True -Dlog4j2.formatMsgNoLookups=true -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump -Xmn256m -Xmx512m";
        String nativesPath = "\"-Djava.library.path=D:\\GAME\\Minecraft\\.minecraft\\versions\\1.12.2\\1.12.2-natives\"";
        String librariesPah = "-cp \"D:\\GAME\\Minecraft\\.minecraft\\libraries\\com\\mojang\\patchy\\1.3.9\\patchy-1.3.9.jar\"";
        String mainClass = "net.minecraft.client.main.Main";
        String userName = "--username 123";
        String version = "--version 1.12.2";
        String gameDir = "--gameDir \"D:\\GAME\\Minecraft\\.minecraft\"";
        String assetDir = "--assetsDir \"D:\\GAME\\Minecraft\\.minecraft\\assets\"";
        String assetIndex = "--assetIndex 1.12";
        String uuid = "--uuid 00000XXXXXXXXXXXXXXXXXXXXXX0E0FA";
        String accessToken = "--accessToken 00000XXXXXXXXXXXXXXXXXXXXXX0E0FA";
        String userType = "--userType msa";
        String versionType = "--versionType PCL";
        String windowHeight = "--height 480";
        String windowWidth = "--width 854";
        String command = javaPath + jvmArguments + nativesPath + librariesPah + mainClass + userName + version + gameDir + assetDir + assetIndex + uuid + accessToken + userType + versionType + windowHeight + windowWidth;
    }
}
