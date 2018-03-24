package tugas;

public class transportaksi {
    public static void main(String[] args) {
        transportasiudara Pesawat = new transportasiudara();
        transportasiudara Helikopter = new transportasiudara();
        transportasiudara Roket = new transportasiudara();
        
        Pesawat.Jenis = "Airbus 747";
        Pesawat.Kelas = "First Class";
        Pesawat.JmlKursi = 30;
        Pesawat.JmlAwak = 50;
        Pesawat.Warna = "Putih Pink";
        
        Helikopter.Jenis = "Helikoper Tempur";
        Helikopter.Kelas = "Tempur";
        Helikopter.JmlKursi = 8;
        Helikopter.JmlAwak = 8;
        Helikopter.Warna = "Hijau";
        
        Roket.Jenis = "Roket Luar Angkasa";
        Roket.Kelas = "Bussiness";
        Roket.JmlKursi = 20;
        Roket.JmlAwak = 20;
        Roket.Warna = "Putih";
        
        Pesawat.datapesawat();
        Helikopter.dataheli();
        Roket.dataroket();
    }
}
