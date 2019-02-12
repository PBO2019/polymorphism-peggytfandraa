public class Gaji {
    private int Hasilnya;

    public void menghitungGaji(int tarifpegawai){
        this.Hasilnya = 30*tarifpegawai;
        System.out.println("Selamat Gaji anda bulan ini sebesar" + " " + Hasilnya);
    }
}
