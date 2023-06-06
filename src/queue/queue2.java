package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class queue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer>[] antrian = new Queue[5];
        for(int i=0; i<5; i++) {
            antrian[i] = new LinkedList<>();
        }
        while (true) {
            System.out.println("Masukkan perintah (tambah, layani, lihat, jumlah, keluar): ");
            String perintah = reader.readLine();

            if (perintah.equals("tambah")) {
                System.out.println("Masukkan nomor studio (1-5) : ");
                int studio = Integer.parseInt(reader.readLine());
                System.out.println("Masukkan nomor kursi yang akan dipesan: ");
                int nomorKursi = Integer.parseInt(reader.readLine());
                antrian[studio-1].add(nomorKursi);
                System.out.println("Nomor kursi " + nomorKursi + " telah ditambahkan ke dalam antrian studio " + studio + ".");
            } else if (perintah.equals("layani")) {
                int studio = 0;
                for(int i=0; i<5; i++){
                    if(!antrian[i].isEmpty()){
                        studio = i+1;
                        break;
                    }
                }
                if (antrian[studio-1].isEmpty()) {
                    System.out.println("Antrian studio " + studio + " kosong.");
                } else {
                    int depan = antrian[studio-1].remove();
                    System.out.println("Kursi " + depan + " di studio " + studio + " telah diproses.");
                }
            } else if (perintah.equals("lihat")) {
                int studio = 0;
                for(int i=0; i<5; i++){
                    if(!antrian[i].isEmpty()){
                        studio = i+1;
                        break;
                    }
                }
                if (antrian[studio-1].isEmpty()) {
                    System.out.println("Antrian studio " + studio + " kosong.");
                } else {
                    int depan = antrian[studio-1].peek();
                    System.out.println("Kursi selanjutnya yang akan diproses di studio " + studio + ": " + depan);
                }
            } else if (perintah.equals("jumlah")) {
                int total = 0;
                for(int i=0; i<5; i++){
                    total += antrian[i].size();
                }
                System.out.println("Jumlah kursi dalam antrian: " + total);
            } else if (perintah.equals("keluar")) {
                break;
            } else {
                System.out.println("Perintah tidak valid.");
            }
        }
    }
}


