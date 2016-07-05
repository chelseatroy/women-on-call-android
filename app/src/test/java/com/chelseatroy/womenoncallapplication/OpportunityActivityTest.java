package com.chelseatroy.womenoncallapplication;

import android.support.v4.app.Fragment;
import android.view.View;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.android.support.v4.api.Assertions.assertThat;


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class OpportunityActivityTest {

    private OpportunityActivity mActivity;

    @Before
    public void setUp() {
        mActivity = Robolectric.setupActivity(OpportunityActivity.class);
    }

    @Test
    public void displaysListFragment() {
        Fragment fragment = mActivity.getSupportFragmentManager().findFragmentById(R.id.list_fragment_container);
        assertThat(fragment).isInstanceOf(OpportunityListFragment.class);
    }
}