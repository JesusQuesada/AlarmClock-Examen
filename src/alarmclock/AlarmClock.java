/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

import javax.swing.JOptionPane;

/**
 *
 * @author jquesadaabeijon
 */
public class AlarmClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SetAlarm alarm1 = new SetAlarm();
        SetHour hour1 = new SetHour();
        Display dis1 = new Display();

        int op = 0;
        int var = 0;
        boolean var2 = false;
/**
 * Creo un switch case que sirve para elegir entre las diferentes opciones del despertador.
 */
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Set Hour \n2. Set Alarm \n3. Alarm ON/OFF \n4. Stop Alarm \5. Select Hour/Alarm \n6. Salir"));
                op = 0;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                op = 0;
            }
            switch (op) {

                case 1:
                    hour1.increaseHour(var);
                    hour1.increaseMinutes(var);
                    break;
                case 2:
                    alarm1.increaseHour(var);
                    alarm1.increaseMinutes(var);
                    break;
                case 3:
                    alarm1.alarmOnOff(var2);
                    break;
                case 4:
                    alarm1.stopAlarm(var2);
                case 5:
                    dis1.switchBetweenHourandAlarm();
                case 6:
                    System.exit(0);
            }

        } while (op < 6);
    }

}
