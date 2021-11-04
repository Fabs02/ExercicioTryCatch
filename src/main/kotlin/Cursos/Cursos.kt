package Cursos

import Estudantes.Estudantes

class Cursos (private val nomeCurso: String?, private var nomeProfessor: String?, private var ano: Int){

    private val listaEstudantes = mutableListOf<Estudantes?>()

    fun cadastrar(estudante: Estudantes?) {
        listaEstudantes.add(estudante)
        println("Estudante cadastrado!")
    }

    fun cadastrar(estudantes: Array<Estudantes?>?) {
        if(estudantes != null){
            for(i in estudantes){
                listaEstudantes.add(i)
            }
        }
        println("Estudante cadastrado!")
    }

    fun removerEstudante(estudante: Estudantes?) {
        if(listaEstudantes.contains(estudante)){
            listaEstudantes.remove(estudante)
            println("Estudante removido")
        }else{
            println("O estudante não existe")
        }
    }

    fun countEstudantes(): Int {
        println("O número de estudante cadastrados é" +
                "${listaEstudantes.size}")
        return 0
    }

    fun melhorNota(){
        var melhorNota = listaEstudantes[0]?.nota
        for(i in listaEstudantes){
            if(i?.nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
        println("A maior nota do curso foi $melhorNota")
    }

    fun verificarAluno(estudante: Estudantes){
        if(listaEstudantes.contains(estudante)){
            println("Estudante existe na lista")
        }else{
            throw Exception("O estudante não existe")
        }
    }

}

