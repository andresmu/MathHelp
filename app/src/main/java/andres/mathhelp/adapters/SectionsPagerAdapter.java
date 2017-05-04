package andres.mathhelp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import andres.mathhelp.views.tabs.AddSubtractFragment;
import andres.mathhelp.views.tabs.MultiplicationDivisionFragment;
import andres.mathhelp.views.tabs.ResultFragment;

/**
 * Created by Andrés on 27-04-2017.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return AddSubtractFragment.newInstance();
            case 1:
                return MultiplicationDivisionFragment.newInstance();
            case 2:
                return ResultFragment.newInstance();
            default:
                return AddSubtractFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Suma y Resta";
            case 1:
                return "Multiplica y Divide";
            case 2:
                return "Tus Resultados";
        }
        return null;
    }
}
