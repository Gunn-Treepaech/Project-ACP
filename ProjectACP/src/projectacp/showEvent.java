/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectacp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class showEvent {
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
    
    public showEvent(String title){
        this.title = title;
        fileName = "D:\\\\sometimedata.txt";
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
        eventLabel = new JLabel("Events");
        wordTextArea = new JTextArea(5, 0);
        northPanel = new JPanel();

        eventLabel.setFont(serif_30);
        northPanel.add(eventLabel);
        northPanel.setBackground(Color.PINK);
        wordTextArea.setEditable(false);

        try {
            //Local date instance
            LocalDate localDate = LocalDate.now(); 
            
            Path file1 = Paths.get(fileName); // sometimedata.txt
            BufferedReader reader = Files.newBufferedReader(file1, StandardCharsets.UTF_8);
            //Create formatter
            DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            //Get formatted String            
            String dayFormated = FOMATTER.format(localDate);
            String[] arrOfToday = dayFormated.split("/");
            int todayYear = Integer.parseInt(arrOfToday[2]);  
            int todayMonth = Integer.parseInt(arrOfToday[1]);
            int todayDay = Integer.parseInt(arrOfToday[0]);
            
            ArrayList<String> availableLineArrayList = new ArrayList<String>();
            
            while ((line = reader.readLine()) != null) { // sometimedata.txt
                String[] arrOfLine = line.split("-");
                String[] arrOfDate = arrOfLine[2].split("/");
                int year = Integer.parseInt(arrOfDate[2]);  
                int month = Integer.parseInt(arrOfDate[1]);
                int day = Integer.parseInt(arrOfDate[0]);
                if (year >= todayYear && month >= todayMonth && day >= todayDay) {
                    availableLineArrayList.add(arrOfLine[2] + " at " + arrOfLine[1] + ". You have to do " + arrOfLine[0] + ".  ");
                }
            }   
            Collections.sort(availableLineArrayList);
            
            int order = 1; 
            for (int i =0; i < availableLineArrayList.size(); ++i) {
                wordTextArea.append("  " + order + ". Date " + availableLineArrayList.get(i));
                wordTextArea.append(newline);
                ++order;
            }
            reader.close();
            
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
