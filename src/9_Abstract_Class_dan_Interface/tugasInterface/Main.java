/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasInterface;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
      Kecepatan K = new Kecepatan("Sari");
      K.inFore();
      K.injakPedalGas();
      K.injakPedalRem();
      K.pindahGigi();
      K.putarKemudi();
    }
}
