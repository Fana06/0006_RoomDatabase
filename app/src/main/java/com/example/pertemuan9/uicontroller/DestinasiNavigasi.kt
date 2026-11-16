
package com.example.pertemuan9.uicontroller

interface DestinasiNavigasi {

    /**
     * Nama unik yang digunakan untuk menentukan
     * jalur navigasi menuju composable.
     */
    val route: String

    /**
     * Resource string yang berisi judul
     * untuk ditampilkan pada halaman.
     */
    val titleRes: Int
}
