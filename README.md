1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian? Akan error, karena 'bil' berjenis data integer disetiap index, jika dimasukkan data dengan koma yang seharusnya berjenis data double/float maka akan menyebabkan error.
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array. Done
3. Ubah statement pada langkah No 4 menjadi seperti berikut
for (int i = 0; i < 4; i++) {
    System.out.println (bil [i]);
}
Apa keluaran dari prorgam? Jelaskan maksud dari statement tersebut. Keluaran dari program tetap sama seperti di awal, namun jika saya ubah ke 5 tadi akan ada 'Exception in thread "main"...' mungkin itu dikarenakan index yang di isikan pada variabel hanya 4 variabel, jika i < 4 maka akan terbaca bahwa harus ada output sampai index ke 3 (dimana 3 < 4) yang dimulai dari index 0.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian? Akan sama wakttu saya mencoba i < 5, dimana i akan diminta mengeluarkan variabel sampai index 4 yang tetap dimulai dari index 0, itu akan membuat index 4 tidak akan memiliki variabel.