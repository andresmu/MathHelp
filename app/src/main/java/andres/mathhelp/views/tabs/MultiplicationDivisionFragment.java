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
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import andres.mathhelp.R;
import andres.mathhelp.data.MulDivResult;


public class MultiplicationDivisionFragment extends Fragment {


    public MultiplicationDivisionFragment() {
        // Required empty public constructor
    }

    public static MultiplicationDivisionFragment newInstance() {
        return new MultiplicationDivisionFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiplication_division, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final SeekBar mulSb = (SeekBar) view.findViewById(R.id.mulSb);
        final TextView mulTv = (TextView) view.findViewById(R.id.mulTv);

        mulSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mulTv.setText(String.valueOf(progress));
                progressValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getContext(), "Tu respuesta es :" + progressValue, Toast.LENGTH_SHORT).show();
            }
        });

        final SeekBar divSb = (SeekBar) view.findViewById(R.id.divSb);
        final TextView divTv = (TextView) view.findViewById(R.id.divTv);

        divSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue2 = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                divTv.setText(String.valueOf(progress));
                progressValue2 = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getContext(), "Tu respuesta es :" + progressValue2, Toast.LENGTH_SHORT).show();
            }
        });

        Button muldivBtn = (Button) view.findViewById(R.id.mulDivBtn);
        muldivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul = mulSb.getProgress();
                int div = divSb.getProgress();

                showResult(mul, div);
            }
        });

    }

    private void showResult(int product, int ratio){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Tus resultados: ");
        alertDialog.setMessage(new MulDivResult(product, ratio).result());
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
}

}
