import java.time.LocalDate
import java.time.temporal.ChronoUnit

//Função para inserir o Dia!
fun dia(): String? {
    println("Insira o Dia para pesquisa")
    var dia = readLine()

    while (dia?.toIntOrNull()!! > 31) {
        println("Não entendi, insira um dia de 1 a 31")
        dia()
    }

    return dia

}

//Função para inserir o Mês!
fun mes(): String? {
    println("Insira o Mês para pesquisa")
    var mes = readLine()

    while (mes?.toIntOrNull()!! > 12) {
        println("Não entendi, insira um mês de 1 a 12")
        return mes()
    }
    return mes
}


//Função para inserir o Ano!
fun ano(): String? {
    println("Insira o Ano para pesquisa")
    var ano = readLine()

    while (ano?.toIntOrNull()!! > 2022) {
        println("Não entendi, insira um ano de 0 até 2022")
        ano()
    }
    return ano
}










