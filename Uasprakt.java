import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Uasprakt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        int jum = 0, i = 0;
        double total_bayar = 0;

        int[] kode = new int[5];
        int[] qty = new int[5];
        int[] harga = new int[5];
        double[] sub_total = new double[5];
        double[] diskon = new double[5];
        String[] barang = new String[5];

        System.out.println("PROGRAM PENJUALAN BARANG");
        System.out.print("Masukan Jumlah Beli: ");
        jum = input.nextInt();
        System.out.println(" ");

        for (i = 0; i < jum; i++) {
            System.out.print("Masukan Kode Barang Ke-" + (i + 1) + " : ");
            kode[i] = input.nextInt();
            System.out.print("Masukan qty Ke-" + (i + 1) + " : ");
            qty[i] = input.nextInt();

            switch (kode[i]) {
                case 1:
                    barang[i] = "Obat Kutu";
                    harga[i] = 149999;
                    diskon[i] = 0.1;
                    break;
                case 2:
                    barang[i] = "Vitamin Bulu";
                    harga[i] = 246000;
                    diskon[i] = 0.05;
                    break;
                case 3:
                    barang[i] = "Nutriplus Gel";
                    harga[i] = 136000;
                    diskon[i] = 0;
                    break;
                case 4:
                    barang[i] = "Royal Canin Adult";
                    harga[i] = 267999;
                    diskon[i] = 0.20;
                    break;
                case 5:
                    barang[i] = "Obat Steril";
                    harga[i] = 200000;
                    diskon[i] = 0.1;
                    break;

                default:
                    System.out.println("Kode Barang Tidak Tersedia");
            }
        }

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.printf("%-3s %-20s %-15s %-7s %-10s %-15s%n", "No", "Nama Barang", "Harga", "QTY", "Diskon",
                "Sub Total");
        for (i = 0; i < jum; i++) {
            sub_total[i] = ((qty[i] * harga[i]) - (qty[i] * harga[i] * diskon[i]));
            total_bayar += sub_total[i];
            System.out.printf("%-3d %-20s %-15s %-7d %-10s %-15s%n",
                    i + 1,
                    barang[i],
                    kursIndonesia.format(harga[i]),
                    qty[i],
                    (int) (diskon[i] * 100) + "%",
                    kursIndonesia.format(sub_total[i]));
        }
        System.out.println(" ");
        System.out.println("Total Bayar: " + kursIndonesia.format(total_bayar));
    }
}
