import Cursos.Cursos
import Estudantes.Estudantes

fun main(args: Array<String>) {

    val fabricio: Estudantes = Estudantes("Fabricio", "Calvanese",
        123, 50.0, 2)

    val rodrigo: Estudantes = Estudantes("Rodrigo", "Albuquerque",
        542, 60.0, 3)

    val cursoJapones = Cursos("Japonês", "Josinei", 2)
    val cursoIngles = Cursos("Inglês", "Alberto", 1)

    cursoJapones.cadastrar(fabricio)
    cursoIngles.cadastrar(rodrigo)


    try {
        cursoJapones.verificarAluno(fabricio)
        cursoJapones.verificarAluno(rodrigo)
    }catch (e: Exception){
        println(e.message)
    }
}
