package org.HydrogenLauncher.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VersionSelectionWindow extends JDialog {

    private JButton confirmButton;
    public VersionSelectionWindow() {
        // 设置窗口属性
        super();
        this.setTitle("VersionSelection");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setLayout(null);

        confirmButton = new JButton("确认");
        confirmButton.setSize(80, 40);
        confirmButton.setLocation(680, 490);
        this.add(confirmButton);

        String[] gameName = {"game001", "game002", "game003", "game004", "game005"};
        JList<String> gameList = new JList<>(gameName);
        gameList.setSize(200, 100);

        this.add(gameList);

        setButtonAction();

        setVisible(true);
    }

    private void setButtonAction() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
