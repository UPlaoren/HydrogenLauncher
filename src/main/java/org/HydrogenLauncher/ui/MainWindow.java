package org.HydrogenLauncher.ui;

import org.HydrogenLauncher.HydrogenLauncher;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JTabbedPane tabbedPanel;
    private StartPanel startPanel;
    private JPanel downloadPanel;
    private JPanel settingPanel;
    private JPanel aboutPanel;

    public MainWindow() {

        // 设置主窗口属性
        super();
        this.setTitle("HydrogenLauncher");
        this.setSize(HydrogenLauncher.windowWidth, HydrogenLauncher.windowHight);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建各个面板
        tabbedPanel = new JTabbedPane();
        startPanel = new StartPanel();
        downloadPanel = new JPanel();
        settingPanel = new JPanel();
        aboutPanel = new JPanel();

        // 将选项卡面板添加到主面板
        tabbedPanel.addTab("启动", startPanel);
        tabbedPanel.addTab("下载", downloadPanel);
        tabbedPanel.addTab("设置", settingPanel);
        tabbedPanel.addTab("关于", aboutPanel);

        // 将选项卡面板添加到主窗口的内容面板
        getContentPane().add(tabbedPanel);

        this.setVisible(true);
    }

}
