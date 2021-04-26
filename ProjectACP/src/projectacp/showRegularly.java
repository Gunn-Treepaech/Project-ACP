/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectacp;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;

/**
 *
 * @author SkkN SI
 */
public class showRegularly {

    protected String newline = "\n";
    protected JPanel northPanel;
    protected JFrame window;
    protected JLabel eventLabel;
    protected String line;
    protected JTextArea wordTextArea;
    protected String title;
    protected Font serif_30, serif_20;
    protected JScrollPane wordSp;
    protected String fileName;

    protected showRegularly(String title) {
        this.title = title;
        fileName = "D:\\\\sometimedata.txt"; //C:/Users/SkkN SI/Java project/src/regularlyFile.txt
    }

    protected void createAndShowGUI() {
        addComponents();
        setFrameFeatures();
    }

    protected void addComponents() {
        serif_30 = new Font("Serif", Font.BOLD, 30);
        serif_20 = new Font("Serif", Font.PLAIN, 20);
        window = new JFrame(title);
        window.setLayout(new BorderLayout());
        eventLabel = new JLabel("Regularly");
        wordTextArea = new JTextArea(5, 0);
        northPanel = new JPanel();

        eventLabel.setFont(serif_30);
        northPanel.add(eventLabel);
        northPanel.setBackground(Color.CYAN);
        wordTextArea.setEditable(false);

        try {
            Path file = Paths.get(fileName);
            BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8);

            while ((line = reader.readLine()) != null) {
                wordTextArea.append(line + newline);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        }

        wordTextArea.setFont(serif_20);
        wordTextArea.setForeground(Color.BLACK);
        wordTextArea.setBackground(Color.PINK);

        window.add(northPanel, BorderLayout.CENTER);
        window.add(wordTextArea, BorderLayout.SOUTH);
    }

    protected void setFrameFeatures() {
        window.pack();
        window.setLocationRelativeTo(null); // ตั้งให้ตำแหน่งอยู่ตรงกลาง
        window.setVisible(true); // ทำให้มองเห็นได้
//        window.setLocation(100, 200); // กำหนดตำแหน่ง
//        this.setSize(150, 150);
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected void readingFile() {
        try {
            Path file = Paths.get(fileName);
            BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8);
            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        }
    }

    protected void writingFile() {
        try {
            Path file = Paths.get(fileName);
            // เขียนใหม่อย่างเดียว
            BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8);
            // เขียนทับอันเก่า
//            BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.APPEND);

            for (int i = 0; i < 10; i++) {
                writer.write("Regularly " + (i + 1));
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
