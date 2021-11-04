package Estudantes

class Estudantes (private var primeiroNome: String?, private var sobrenome: String?, private var ra: Int){

    var nota: Double = 0.0
    private var ano = 0

    constructor(primeiroNome: String?, ultimoNome: String?, ra: Int, nota: Double):
            this(primeiroNome, ultimoNome, ra){
                this.nota = nota
            }

    constructor(primeiroNome: String?, ultimoNome: String?, ra: Int, nota: Double, ano: Int):
            this(primeiroNome, ultimoNome, ra, nota){
                this.ano = ano
            }

    fun nomeCompleto() {
        println("Nome completo do estudante: $primeiroNome $sobrenome")
    }


    val seAprovado: Boolean
            get() {
                return nota >= 60.0
            }


    fun passouDeAno() {
        if (seAprovado) {
            ano += 1
            println("Parabéns")
        } else {
            println("Você foi reprovado")
        }
    }

}

