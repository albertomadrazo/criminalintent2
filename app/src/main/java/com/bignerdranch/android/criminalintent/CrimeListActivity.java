package com.bignerdranch.android.criminalintent;

<<<<<<< HEAD
/**
 * Created by beto on 12/14/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {
=======

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
>>>>>>> chapter9
}
