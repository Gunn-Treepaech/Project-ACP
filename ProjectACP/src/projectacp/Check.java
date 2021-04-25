/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectacp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Check {

    private String fileName;
    private ArrayList<String> whatToDo;
    private ArrayList<String> timeToDo;
    private ArrayList<String> dateOrDayToDo;
    private int index;

    public ArrayList<String> getWhatToDo() {
        return whatToDo;
    }

    public ArrayList<String> getTimeToDo() {
        return timeToDo;
    }

    public ArrayList<String> getDateToDo() {
        return dateOrDayToDo;
    }

    public int getIndex() {
        return index;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void fileToArray() {
        whatToDo = new ArrayList<String>();
        timeToDo = new ArrayList<String>();
        dateOrDayToDo = new ArrayList<String>();
        try {
            File dataSomeTime = new File(fileName); // "D:\\\\sometimedata.txt"
            Scanner dataReader = new Scanner(dataSomeTime);
            while (dataReader.hasNextLine()) {
                String[] a;
                String data = dataReader.nextLine();
                a = data.split("-");
                whatToDo.add(a[0]);
                timeToDo.add(a[1]);
                dateOrDayToDo.add(a[2]);
            }
            dataReader.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "An error occurred.");
        }
    }

    public int CheckwhattodoSometime(String checkTime, String checkDate) {
        this.fileName = "D:\\\\sometimedata.txt";
        fileToArray();
        int checkTimeAndDateSometime = 1;
        for (int i = 0; i < timeToDo.size(); i++) {
            String dateSomeTime = dateOrDayToDo.get(i);
            if (checkTime.equalsIgnoreCase(timeToDo.get(i))) {
                if (checkDate.equalsIgnoreCase(dateSomeTime)) {
                    checkTimeAndDateSometime = 0;
                    index = i;
                } else {
                    checkTimeAndDateSometime = 1;
                }
            }
        }
        return checkTimeAndDateSometime;
    }

    public int CheckwhattodoRegularly(String checkTime, String checkDay) {
        this.fileName = "D:\\\\regularlydata.txt";
        fileToArray();
        //    System.out.println(checkDay);
        int checkTimeAndDayRegularly = 1;
        for (int j = 0; j < dateOrDayToDo.size(); j++) {
            if (checkTime.equalsIgnoreCase(timeToDo.get(j))) {
                String[] day = dateOrDayToDo.get(j).split(",");
                for (int i = 0; i < day.length; i++) {
                    String dayRegulatly = day[i];
                    System.out.println(dayRegulatly);
                    if (checkDay.equalsIgnoreCase(dayRegulatly)) {
                        checkTimeAndDayRegularly = 0;
                        index = j;
                        break;
                    } else {
                        checkTimeAndDayRegularly = 1;
                    }
                }
            }
        }
        return checkTimeAndDayRegularly;
    }
}
