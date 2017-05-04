package andres.mathhelp.views.tabs;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import andres.mathhelp.R;
import andres.mathhelp.data.AddSubtractResult;


public class AddSubtractFragment extends Fragment {


    public AddSubtractFragment() {
        // Required empty public constructor
    }
    public static AddSubtractFragment newInstance() {
        return new AddSubtractFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_subtract, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.addSubRg);
        Button button = (Button) view.findViewById(R.id.addSubBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1){
                    RadioButton radioButton = (RadioButton) radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    showDialog(answer);
                    //Toast.makeText(getContext(), answer, Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(getContext(), "Debes seleccionar algo para responder", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void showDialog(String answer){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Tu respuesta es: ");
        alertDialog.setMessage(new AddSubtractResult(answer).Result());
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();


    }

}
