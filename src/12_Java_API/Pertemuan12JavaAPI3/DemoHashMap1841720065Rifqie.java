/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan12JavaAPI3;
import java.util.HashMap;
/**
 *
 * @author Dell
 */
public class DemoHashMap1841720065Rifqie {
    public static void main(String[] args) {
    HashMap hMapItem = new HashMap();
    hMapItem.put("1","Biskuit");
    hMapItem.put("2","Shampo");
    hMapItem.put("3","Soap");
    System.out.println(hMapItem);
    System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());
    
    Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from Hashmap\n", mObject);
        System.out.format("HashMap Item Total : %d\n", hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n",hMapItem.size());
    
        
    }
}
