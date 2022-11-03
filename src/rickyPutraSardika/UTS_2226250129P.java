package rickyPutraSardika;
import java.util.Scanner;
public class UTS_2226250129P 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int jumlahMahasiswa_ricky = 0, npm_ricky, softskill_ricky, kuis_ricky, tugas_ricky, uts_ricky, uas_ricky;
		String nama_ricky, status_ricky = null, nilaiHuruf_ricky = null;
		double nilaiAkhir_ricky;
		double softskill1_ricky, kuis1_ricky, tugas1_ricky, uts1_ricky, uas1_ricky;

		
		
		System.out.println("========================= Data Mahasiswa =========================");
		System.out.print("Masukkan Jumlah Mahasiswa : ");
		jumlahMahasiswa_ricky = ricky.nextInt();
		System.out.println("=====================================================================");
		
		
		for(int i = 1; i<=jumlahMahasiswa_ricky; i++)
		{
			System.out.println("Data mahasiswa ke-" + i);
			
			System.out.print("Masukkan Nama \t: ");
			nama_ricky = ricky.next();
			System.out.print("Masukkan NPM \t: ");
			npm_ricky= ricky.nextInt();
			
			System.out.println("Masukkan Nilai ");
			System.out.print("   Softskill \t: " );
			softskill_ricky= ricky.nextInt();
			System.out.print("   Kuis \t: " );
			kuis_ricky= ricky.nextInt();
			System.out.print("   Tugas \t: " );
			tugas_ricky= ricky.nextInt();
			System.out.print("   UTS \t\t: " );
			uts_ricky= ricky.nextInt();
			System.out.print("   UAS \t\t: " );
			uas_ricky= ricky.nextInt();
			
			softskill1_ricky = softskill_ricky*0.1;
			kuis1_ricky= kuis_ricky*0.1;
			tugas1_ricky= tugas_ricky*0.2;
			uts1_ricky= uts_ricky*0.3;
			uas1_ricky= uas_ricky*0.3;
			
			nilaiAkhir_ricky = softskill1_ricky + kuis1_ricky + tugas1_ricky + uts1_ricky + uas1_ricky;
			
			if(nilaiAkhir_ricky >= 80)
			{
				nilaiHuruf_ricky = "A";
			}
			else if(nilaiAkhir_ricky < 80 && nilaiAkhir_ricky >=76)
			{
				nilaiHuruf_ricky = "A-";
			}
			else if(nilaiAkhir_ricky < 76 && nilaiAkhir_ricky >=72)
			{
				nilaiHuruf_ricky = "B+";
			}	
			else if(nilaiAkhir_ricky < 72 && nilaiAkhir_ricky >=68)
			{
				nilaiHuruf_ricky = "B";
			}	
			else if(nilaiAkhir_ricky < 68 && nilaiAkhir_ricky >=64)
			{
				nilaiHuruf_ricky = "B-";
			}	
			else if(nilaiAkhir_ricky < 64 && nilaiAkhir_ricky >=60)
			{
				nilaiHuruf_ricky = "C+";
			}	
			else if(nilaiAkhir_ricky < 60 && nilaiAkhir_ricky >=56)
			{
				nilaiHuruf_ricky = "C";
			}	
			else if(nilaiAkhir_ricky < 56 && nilaiAkhir_ricky >=46)
			{
				nilaiHuruf_ricky = "D";
			}	
			else if(nilaiAkhir_ricky < 46)
			{
				nilaiHuruf_ricky = "E";
			}
			
			if(nilaiHuruf_ricky.equalsIgnoreCase("C"))
			{
				status_ricky = "TIDAK LULUS";
			}	
			else if(nilaiHuruf_ricky.equalsIgnoreCase("D"))
			{
				status_ricky = "TIDAK LULUS";
			}	
			else if(nilaiHuruf_ricky.equalsIgnoreCase("E"))
			{
				status_ricky = "TIDAK LULUS";
			}	
			else
			{
				status_ricky = "LULUS";
			}	
			
			
			System.out.println("Nilai Akhir \t: " + nilaiAkhir_ricky);
			System.out.println("Nilai Huruf \t: " + nilaiHuruf_ricky );
			System.out.println("Status \t\t: " + status_ricky);
			System.out.println("=====================================================================");
			
				
		}
		
	}
}
