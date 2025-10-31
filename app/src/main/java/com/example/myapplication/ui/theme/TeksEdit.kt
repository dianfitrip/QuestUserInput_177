package com.example.myapplication.ui.theme




@Composable
fun FormDataDiri(modifier: Modifier = Modifier
){
    // variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}