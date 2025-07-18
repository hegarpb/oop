package com.java.oop;

class Mahasiswa{
    String nama;
    String nim;
    String jurusan;

    // constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama\t: "+this.nama);
        System.out.println("Nim\t: "+this.nim);
        System.out.println("Jurusan\t: "+this.jurusan);
    }

    // method tanpa return menggunakan parameter
    void setNama(String nama){
    this.nama=nama;
    }

    // method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }

    String getNim(){
        return this.nim;
    }
    
    // method dengan return menggunakan parameter
    String sayHi(String message){
        return message + " Juga,"+"Nama saya adalah "+this.nama;
    }

}
public class App 
{
    public static void main( String[] args )
    {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup","20170810075","Teknik Perdukunan");
        mahasiswa1.show();
        mahasiswa1.setNama("Tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());
        
        String data=mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }
}
