package alejandro.murcia.appejerciciosdeclasealejandromurcia

class Numero {
    fun Verificar(num:Int):String{
        val result: String
        if (num % 2 == 0){
            result = "Su número ($num) es par."
        }
        else{
            result = "Su número ($num) es impar."
        }

        return result
    }
}