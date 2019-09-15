# Laporan Praktikum #3 - Enkapsulasi Pada Pemrograman Berorientasi Objek

## Kompetensi

Setelah melakukan percobaan pada modul ini, mahasiswa memahami konsep:
1. Konstruktor
2. Akses Modifier
3. Atribut/method pada class
4. Intansiasi atribut/method
5. Setter dan getter
6. Memahami notasi pada UML Class Diagram

## Ringkasan Materi

Peringkasan pada kode pemrograman yang meliputi Private Attribute, Access Modifier, Getter dan Setter, dan Constructor. Sehingga, kode yang dikerjakan tidak perlu dilihat secara detail.

## Percobaan

### 3.3 Pertanyaan Percobaan 2

1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?

    Jawaban : Karena status dalam mobil tersebut masih dalam kontakOff.

2. Mengapa atribut kecepatan dan kontakOn diset private?

    Jawaban : Karena akses tersebut hanya untuk menjalankan status privat saja (hanya sebagian), tidak untuk status public (mengakses semuanya)

3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100! 

    Jawaban :


### 3.6 Pertanyaan Percobaan 3 dan 4
    
1.	Apa yang dimaksud getter dan setter?

    Jawaban : 2 method yang bertugas untuk mengambil dan mengisi data ke dalam objek.

2.	Apa kegunaan dari method getSimpanan()?

    Jawaban : Menggunakan method tersebut sebagai tempat penyimpanan pada suatu objek “Simpanan” yang nantinya akan ditampilkan saat program tersebut dijalankan.

3.	Method apa yang digunakan untk menambah saldo?
Jawaban : Setor
 
4.	Apa yang dimaksud konstruktor?

    Jawaban : Method yang dimana deklarasinya tidak memiliki tipe return (tipe untuk mengembalikan lagi pada main objek)
 
5.	Sebutkan aturan dalam membuat konstruktor?

    Jawaban : 
    
    -Nama konstruktor harus sama dengan nama class.

    -Konstruktor tidak memiliki tipe data return.

    -Konstruktor tidak boleh menggunakan modifier seperti abstract, static, final, dan synchronized.
 
6.	Apakah boleh konstruktor bertipe private?

    Jawaban : Boleh. Namun, tidak lebih dari satu objek dapat dibuat pada satu waktu.
 
7.	Kapan menggunakan parameter dengan passsing parameter?

    Jawaban : Ketika pemrograman yang kita jalankan masih berstatus “null”, oleh sebab itu masih belum dapat dikonfirmasi darimana asal parameter tersebut.

8.	Apa perbedaan atribut class dan instansiasi atribut?

    Jawaban : 	
    
    Atribut Class = Cetakan untuk menciptakan suatu instansiasi dari objek.

    Instansiasi Atribut = Menjalankan dari hasil atribut yang telah ditambahkan suatu objek tersebut.

9.	Apa perbedaan class method dan instansiasi method?

    Jawaban : 	
    
    Class Method = Kumpulan pernyataan yang dikelompokkan bersama untuk melakukan operasi.
	
    Instansiasi Method = Menjalankan operasi yang telah dibuat pada pernyataan tersebut.


## Tugas

1.Screenshot class diagram sewa game :
![screenshot](img2/Tugas-Nomor1.PNG)

2.Screenshot :
![screenshot](img2/Tugas-Nomor2.PNG)
[link ke kode program SewaGame.java](../../src/2_Class_dan_Object/Tugas1/SewaGame1841720065Rifqie.java)

[link ke kode main program SewaGameMain.java](../../src/2_Class_dan_Object/Tugas1/SewaGameMain1841720065Rifqie.java)

3.Screenshot :
![screenshot](img2/Tugas-Nomor3.PNG)
[link ke kode program Lingkaran.java](../../src/2_Class_dan_Object/Tugas2/Lingkaran1841720065Rifqie.java)

[link ke kode main program LingkaranMain.java](../../src/2_Class_dan_Object/Tugas2/LingkaranMain1841720065Rifqie.java)

4.Screenshot :
![screenshot](img2/Tugas-Nomor4.PNG)
[link ke kode program BarangDiskon.java](../../src/2_Class_dan_Object/Tugas3/DiscountedPackage1841720065Rifqie.java)

[link ke kode main program BarangDiskonMain.java](../../src/2_Class_dan_Object/Tugas3/DiscountedPackageMain1841720065Rifqie.java)

## Kesimpulan

Kita dapat meringkas kode tersebut dengan metode Enkapsulasi yang dimana kita bisa melakukan modifikasi Modifier, mengimplementasikan Setter dan Gutter, serta membuat konstruktor dan menginisiasikannya ke dalam pemrograman tersebut. Sehingga tidak perlu lagi melihat bagaimana detail dari kode tersebut.
## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Rifqie Muhammad)***