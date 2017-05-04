package andres.mathhelp.data;

/**
 * Created by Andrés on 03-05-2017.
 */

public class ResultFinal extends ResultAnswer {
    public ResultFinal(String answer) {
        super(answer);
    }

    public String ResultFinal(){
            return Process();
        }

        private String Process(){
            String answer = getAnswer();
            if (answer.contains("1")){
                return "Tu debilidad debe ser la resta de numeros negativos, te invito a que me contactes en el Boton con signo de pregunta";
            } else if (answer.contains("2")){
                return "Quizas no recuerdas bien como se comportan los números al multiplicarse o dividirse, asi como francciones, te invito a que me contactes en el Boton con signo de pregunta";
            }else if (answer.contains("3")){
                return "No esperes más, te invito a que me contactes en el Boton con signo de pregunta y aprenderas todo lo que puedas";
            }else{
                return "¡Excelente! Tus matematicas básicas estan correctas, pero ¡siempre podras mejorar! ¿quieres aprender potencias, raices, deribadas e integrales? Contactame en el Boton con signo de pregunta";
            }
        }
}

