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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

public class showToday {

    protected String newline = "\n";
    protected JPanel northPanel;
    protected JFrame window;
    protected JLabel eventLabel;
    protected String line;
    protected JTextArea wordTextArea;
    protected String title;
    protected Font serif_30, serif_20;
    protected JScrollPane wordSp;
    protected String fileName1;
    protected String fileName2;

    protected showToday(String title) {
        this.title = title;
        fileName1 = "D:\\\\sometimedata.txt";
        fileName2 = "D:\\\\regularlydata.txt";
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
        eventLabel = new JLabel("Activities today");
        wordTextArea = new JTextArea(5, 0);
        northPanel = new JPanel();

        eventLabel.setFont(serif_30);
        northPanel.add(eventLabel);
        northPanel.setBackground(Color.PINK);
        wordTextArea.setEditable(false);

        try {
            //Local date instance
            LocalDate localDate = LocalDate.now(); 
            
            Path file1 = Paths.get(fileName1); // sometimedata.txt
            BufferedReader reader1 = Files.newBufferedReader(file1, StandardCharsets.UTF_8);
            //Create formatter
            DateTimeFormatter FOMATTER1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            //Get formatted String            
            String dayFormated1 = FOMATTER1.format(localDate);
            
            Path file2 = Paths.get(fileName2); // regularlydata.txt
            BufferedReader reader2 = Files.newBufferedReader(file2, StandardCharsets.UTF_8);
            //Create formatter
            DateTimeFormatter FOMATTER2 = DateTimeFormatter.ofPattern("EEEE");
            //Get formatted String            
            String dayFormated2 = FOMATTER2.format(localDate);
            
            ArrayList<String> allLineArrayList = new ArrayList<String>();
            while ((line = reader1.readLine()) != null) { // sometimedata.txt
                String[] arrOfLine = line.split("-");
                allLineArrayList.add(arrOfLine[1] + "-" + arrOfLine[0] + "-" + arrOfLine[2]);
            }
            while ((line = reader2.readLine()) != null) { // regularlydata.txt
                String[] arrOfLine = line.split("-");
                allLineArrayList.add(arrOfLine[1] + "-" + arrOfLine[0] + "-" + arrOfLine[2]);
            }
            Collections.sort(allLineArrayList);

            int order = 1; 
            for (int i =0; i < allLineArrayList.size(); ++i) {
                String[] arrOfLine = allLineArrayList.get(i).split("-");
                if (arrOfLine[2].equals(dayFormated1) || arrOfLine[2].equals(dayFormated2)) {
                    wordTextArea.append(order + ". At " + arrOfLine[0] + " you have to do " + arrOfLine[1] + ".");
                    wordTextArea.append(newline);
                    ++order;
                }
            }
            
            reader1.close();
            reader2.close();

        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        }

        wordTextArea.setFont(serif_20);
        wordTextArea.setForeground(Color.BLACK);
        wordTextArea.setBackground(Color.WHITE);

        window.add(northPanel, BorderLayout.CENTER);
        window.add(wordTextArea, BorderLayout.SOUTH);
    }

    protected void setFrameFeatures() {
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
