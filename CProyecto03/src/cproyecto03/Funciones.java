
package cproyecto03;

import java.util.Arrays;

public class Funciones {
    
     public static float calcularMedia(float[] datos) {
        float suma = 0;
        for (float dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }
    
    public static float calcularModa(float[] datos) {
        int maxCount = 0;
        float moda = datos[0];
        for (int i = 0; i < datos.length; i++) {
            int count = 0;
            for (int j = 0; j < datos.length; j++) {
                if (datos[j] == datos[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = datos[i];
            }
        }
        return moda;
    }
    

    public static float calcularMediana(float[] datos) {
        Arrays.sort(datos);
        int n = datos.length;
        if (n % 2 == 0) {
            return (datos[n/2 - 1] + datos[n/2]) / 2.0f;
        } else {
            return datos[n/2];
        }
    }
    
    public static float calcularDesviacionEstandar(float[] datos) {
        float media = calcularMedia(datos);
        float sumatoria = 0;
        for (float dato : datos) {
            sumatoria += Math.pow(dato - media, 2);
        }
        return (float) Math.sqrt(sumatoria / datos.length);
    }
    
    public static float calcularVarianza(float[] datos) {
        float media = calcularMedia(datos);
        float sumatoria = 0;
        for (float dato : datos) {
            sumatoria += Math.pow(dato - media, 2);
        }
        return sumatoria / datos.length;
    }
}
