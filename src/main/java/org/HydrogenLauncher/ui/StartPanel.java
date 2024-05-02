package org.HydrogenLauncher.ui;

import org.HydrogenLauncher.HydrogenLauncher;
import org.HydrogenLauncher.Launch.GameRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {
    private JButton startButton;
    private JButton selectButton;
    VersionSelectionWindow versionSelectionwindow;

    public StartPanel() {
        super();
        this.setLayout(null);
        startButton = new JButton("Start");
        startButton.setSize(160, 50);
        startButton.setLocation(HydrogenLauncher.windowWidth/2-80, 200);
        selectButton = new JButton("Select Version");
        selectButton.setSize(160, 50);
        selectButton.setLocation(HydrogenLauncher.windowWidth/2-80, 300);

        this.add(startButton);
        this.add(selectButton);

        // 遍历所有组件，设置焦点属性为false
        for (Component component : this.getComponents()) {
            component.setFocusable(false);
        }

        setButtonAction();
    }

    private void setButtonAction() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("启动游戏");
            }
        });
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮按下");
                versionSelectionwindow = new VersionSelectionWindow();
            }
        });
    }
}
