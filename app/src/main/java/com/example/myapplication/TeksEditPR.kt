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

    Column(
        modifier = modifier
            .background(greenBackground)
            .padding(dimensionResource(R.dimen.padding_small))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //bagian untuk alert pop up dialog
        if (showDialog) {
            AlertDialog(
                onDismissRequest = {
                    showDialog = false
                    textNama = ""
                    textJK = ""
                    textStatus = ""
                    textAlamat = ""
                },
                text = {
                    Column {
                        Text(text = "Nama   : $nama")
                        Text(text = "Gender : $jenis")
                        Text(text = "Status : $status")
                        Text(text = "Alamat : $alamat")
                    }
                },
                confirmButton = {
                    Button(
                        onClick = {
                            showDialog = false
                            textNama = ""
                            textJK = ""
                            textStatus = ""
                            textAlamat = ""
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = greenButton
                        )
                    ) {
                        Text("OK")
                    }
                }
            )
        }
        // card untuk membungkus form
        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            // Kartu tetap putih seperti di screenshot
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxHeight()
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            greenHeader,
                            shape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp)
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Formulir Pendaftaran",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.padding(vertical = dimensionResource(R.dimen.padding_medium))
                    )
                }
                Column (
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.padding_small))
                        .fillMaxHeight()
                ){
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState()),
                    ){
                        OutlinedTextField(
                            value = textNama,
                            singleLine = true,
                            shape = MaterialTheme.shapes.large,
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(text = "Nama Lengkap") },
                            onValueChange = {
                                textNama = it
                            }
                        )
                        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
                    }
                }
            }
        }
    }
}