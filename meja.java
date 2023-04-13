/*
program : meja.java
tanggal : 11 april 2023
nama    : Yogi Sepdu Dehiya
NIM     : 22323038
*/

public class meja{  //class dari program kita, yaitu bernama meja
    public int kaki_meja(){ //membuat class bertipe integer dan bernama kaki_meja
        return 70;  //memiliki nilai kembali yaitu 70
    }
    public int alas_meja(){ //membuat class dengan nama alas_meja dan bertipe integer
        return 120; //memiliki nilai kembali yaitu 120
    }

    public static void main(String [] args){    
        //class dari program kita, yaitu public dan tidak memiliki nilai balikan(void)
        meja a=new meja();  
        //membuat variabel meja dengan nama a dan membuat variabel baru dengan nama new meja
        int kaki=a.kaki_meja(); 
        //mendeklarasikan variabel kaki dengan tipe integer dan memanggil variabel a dari class kaki_meja.
        int alas_meja=a.alas_meja();    
        //mendeklarasikan variabel alas_meja yang bertipe integer dan memanggil variabel a dengan class alas_meja

        System.out.print(kaki*alas_meja);   
        //sysout, digunakan untuk menampilkan output dari operasi kaki * alas_meja.
    }
}
