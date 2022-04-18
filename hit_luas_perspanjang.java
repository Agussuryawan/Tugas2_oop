package hit_luas_persegi_panjang;

/**
 *
 * @author Suryawan 20101290
 */
public class hit_luas_perspanjang {
    private double panjang;
    private double Lebar;
    double Hasil;
     
public void Setpanjang (double Pj){
    this.panjang = Pj;
}

public void Setlebar (double Lb){
    this.Lebar = Lb;
}

//contructor
public hit_luas_perspanjang(int Pj,int Lb){
    this.panjang = Pj;
    this.Lebar = Lb;
}
    
private double HitHasil(){
    this.Hasil=this.panjang * this.Lebar;
    return this.Hasil;
}
        
public void CetakHasil(){
    this.HitHasil();
        System.out.println("Hitung Luas Persegi Panjang");
        System.out.println("====================");
        System.out.println("Nilai Panjang       :"+this.panjang+"cm");
        System.out.println("Nilai Lebar         :"+this.Lebar+" cm");
        System.out.println("Jadi Luas Persegi   :"+this.Hasil+"cm");
    }
           
}

