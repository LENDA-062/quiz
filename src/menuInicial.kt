var opcaoSelecionada = ""
fun menuInicial() {
    while(opcaoSelecionada != "x") {
        println("BEM VINDO AO CRIADOR DE QUIZ")
        opcaoSelecionada = readLine()!!.lowercase()
    }
    println("Encerrando...")
}