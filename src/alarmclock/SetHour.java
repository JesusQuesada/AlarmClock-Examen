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
public class SetHour {

    /**
     * Creo un método que recibe un int y no devuelve nada en el que indico que
     * si el botón de incrementar hora es pulsado la hora se incremente, salvo
     * que la hora sea 23 que directamente vuelve a 0.
     *
     * @param hour
     */
    public void increaseHour(int hour) {
        boolean button1 = false;
        if (button1 == true && hour < 23) {
            hour++;
        } else {
            hour = 0;
        }
    }

    /**
     * Creo un método que recibe un int y no devuelve nada en el que indico que
     * si el botón de incrementar minutos es pulsado los minutos se incrementen,
     * salvo que el minuto sea 59 que directamente vuelve a 0.
     *
     * @param minutes
     */
    public void increaseMinutes(int minutes) {
        boolean button2 = false;
        if (button2 == true && minutes < 59) {
            minutes++;
        } else {
            minutes = 0;
        }
    }
}
