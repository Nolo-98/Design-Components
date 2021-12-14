package com.alain.cursos.mdcomponents.utils;

/* *
 *David Ortiz
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.alain.cursos.mdcomponents.ButtonFragment;

public class CommonUtils {

    public static void setFragment(AppCompatActivity activity, String nameFragment, int contentRes){
        Fragment fragment = getFragmentById(nameFragment);
        activity.getSupportFragmentManager().beginTransaction()
                .add(contentRes, fragment)
                .commit();
    }

    private static Fragment getFragmentById(String nameFragment) {
        Fragment fragment = null;

        switch (nameFragment){
            //SCROLL
            case ButtonFragment.TAG:
                fragment = new ButtonFragment();
                break;

            //STATIC
        }

        return fragment;
    }
}
