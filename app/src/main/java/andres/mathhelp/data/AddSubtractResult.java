package andres.mathhelp.data;

/**
 * Created by Andrés on 03-05-2017.
 */

public class AddSubtractResult extends AddSubtractAnswer {

    public AddSubtractResult(String answer) {
        super(answer);
    }

    public String Result(){
        return Process();
    }

    private String Process(){
        String answer = getAnswer();
        if (answer.contains("10")){
            return "Incorrecta, tu debilidad esta en la resta ¡10-20 = -10!";
        } else if (answer.contains("5")){
            return "¡Correcta! ¡Excelente!";
        }else {
            return "No te preocupes, tener dudas es natural, continua con la siguiente pregunta ;)";
        }
    }
}
