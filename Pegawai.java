public class Pegawai{
    protected int tarifpegawai;

    public static void main(String[] args) {
     Supervisor x = new Supervisor();
     Staff a = new Staff();
     Gaji gaji = new Gaji();

     gaji.menghitungGaji(x.tarifpegawai);
     gaji.menghitungGaji(a.tarifpegawai);

    }
}
