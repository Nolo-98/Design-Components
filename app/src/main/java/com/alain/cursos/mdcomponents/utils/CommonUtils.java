package com.alain.cursos.mdcomponents.utils;

/* *
 * Projecto: MD Components
 * Daniel Fernandez Guarneros
 *
 * Desarrollo de Sofware Multiplataforma 4A
 * Diseño de Apps
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.alain.cursos.mdcomponents.fragments.BottomNavigationBarFragment;
import com.alain.cursos.mdcomponents.fragments.ButtonFragment;
import com.alain.cursos.mdcomponents.fragments.CheckboxFragment;
import com.alain.cursos.mdcomponents.fragments.FloatingActionButtonFragment;
import com.alain.cursos.mdcomponents.fragments.SnackBarFragment;
import com.alain.cursos.mdcomponents.fragments.TextFieldFragment;

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
            case TextFieldFragment.TAG:
                fragment = new TextFieldFragment();
                break;
            case CheckboxFragment.TAG:
                fragment = new CheckboxFragment();
                break;

            //STATIC
            case BottomNavigationBarFragment.TAG:
                fragment = new BottomNavigationBarFragment();
                break;
            case SnackBarFragment.TAG:
                fragment = new SnackBarFragment();
                break;
            case FloatingActionButtonFragment.TAG:
                fragment = new FloatingActionButtonFragment();
                break;
        }

        return fragment;
    }
}
