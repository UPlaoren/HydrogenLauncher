package org.HydrogenLauncher;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;

import com.formdev.flatlaf.FlatDarkLaf;
import org.HydrogenLauncher.Launch.GameRepository;
import org.HydrogenLauncher.Launch.Launcher;
import org.HydrogenLauncher.ui.MainWindow;
import org.tinylog.Logger;

public class HydrogenLauncher {
    public static final int windowWidth = 960;
    public static final int windowHight = 640;

    public static void main(String[] args) throws IOException {

        Logger.info("HydrogenLauncher,Starting!");

        GameRepository defaultRepository = new GameRepository();
        defaultRepository.updateVersions();

        // 设置FlatLaf
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
            //UIManager.put("TitlePane.centerTitle", true);
            UIManager.put("TabbedPane.tabAreaAlignment", "fill");
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        // 创建UI界面
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });

        new Launcher().launch();

    }
}