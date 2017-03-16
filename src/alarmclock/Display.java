/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

/**
 *
 * @author jquesadaabeijon
 */
public class Display extends AlarmClock {

    String hour;
    String alarm;
    String alarmmode;
    String hourmode;
/**
 * Creo un método que no recibe ni devuelve nada, con un botón que funciona de selector. Si está "true" muestra la alarma y si está "false" muestra la hora.
 */
    public void switchBetweenHourandAlarm() {
        boolean button3 = false;
        if (button3 == false) {
            visualizeHour();
        } else {
            visualizeAlarm();
        }
    }
/**
 * Creo un método que visualiza la hora para que sea llamado por el método anterior.
 */
    public void visualizeHour() {
        System.out.println(hour + hourmode);
    }
/**
 * Creo un método que visualiza la alarma para que sea llamado por el método anterior.
 */
    public void visualizeAlarm() {
        System.out.println(alarm + alarmmode);
    }

}
