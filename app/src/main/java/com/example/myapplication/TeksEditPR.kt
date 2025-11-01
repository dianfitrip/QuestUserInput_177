package com.example.myapplication



@Composable
fun FormDataDiriPR(modifier: Modifier = Modifier){
    // State untuk input
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
}