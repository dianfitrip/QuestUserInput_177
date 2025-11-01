package com.example.myapplication



@Composable
fun FormDataDiriPR(modifier: Modifier = Modifier){
    // State untuk input
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
    //variabel yg disimpan dari komponen ui
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    // state kontrol Dialog
    var showDialog by remember { mutableStateOf(false) }
    // List pilihan gander dan status
    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val statusOptions: List<String> = listOf("Janda", "Lajang", "Duda")
    //WARNA HIJAU
    val greenHeader = Color(0xFFC8E6C9)
    val greenButton = Color(0xFF4CAF50)
    val greenBackground = Color(0xFFE8F5E9)
}