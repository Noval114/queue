import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

    public class queue1 {
        public static void main(String[] args) throws IOException {
            Queue<String> antrian = new LinkedList<String>();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Masukkan perintah (tambah, layani, lihat, jumlah, keluar): ");
                String perintah = br.readLine();

                if (perintah.equals("tambah")) {
                    System.out.println("Masukkan nama pelanggan yang akan ditambahkan ke antrian: ");
                    String namaPelanggan = br.readLine();
                    antrian.add(namaPelanggan);
                    System.out.println(namaPelanggan + " telah ditambahkan ke dalam antrian.");
                } else if (perintah.equals("layani")) {
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        String depan = antrian.remove();
                        System.out.println(depan + " telah dilayani.");
                    }
                } else if (perintah.equals("lihat")) {
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        String depan = antrian.peek();
                        System.out.println("Pelanggan selanjutnya yang akan dilayani: " + depan);
                    }
                } else if (perintah.equals("jumlah")) {
                    System.out.println("Jumlah pelanggan dalam antrian: " + antrian.size());
                } else if (perintah.equals("keluar")) {
                    break;
                } else {
                    System.out.println("Perintah tidak valid.");
                }
            }
        }
    }

}