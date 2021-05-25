/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5.latihan.algo2;

/**
 *
 * @author LENOVO
 */
public class soal1 {
    public static void main(String[] ar){
        SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50,1);
        lk.display();
        lk.insertAtPos(80,2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
    }
}
