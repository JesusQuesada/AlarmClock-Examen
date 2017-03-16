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
public class SetAlarm {
    
    boolean alarm;
    /**
     * Creo un método que recibe un boolean y no devuelve nada en el que indico que si la alarma está encendida muestre una campana y si está apagada no muestre nada.
     * @param bell 
     */
    public void alarmOnOff(boolean bell){
        if (alarm==true)
            System.out.println(bell==true);
        else
            System.out.println();
    }
    /**
     * Creo un método que recibe un boolean y no devuelve nada en el que indico que si la alarma está encendida y el botón stop es pulsado, la alarma se apaga.
     * @param stop 
     */
    public void stopAlarm(boolean stop){
        boolean alarm = false;
        if (alarm==true&&stop==true)
            alarmOnOff(alarm==false);
    }
    /**
     * Creo un método que recibe un boolean y devuelve nada en el que indico que si la alarma está encendida, el display mostrará un símbolo de melodía.
     * @param tone 
     */
    public void alarmTone(boolean tone){
        boolean alarm = false;
        if (alarm==true)
            System.out.println(tone==true);
    }
    /**
     * Creo un método que recibe un int y no devuelve nada en el que indico que
     * si el botón de incrementar hora es pulsado la hora se incremente, salvo
     * que la hora sea 23 que directamente vuelve a 0.
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
     * Creo un método que recibe un int y no devuelve nada en el que indico que si el botón de incrementar minutos es pulsado los minutos se incrementen, salvo que el minuto sea 59 que directamente vuelve a 0.
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
