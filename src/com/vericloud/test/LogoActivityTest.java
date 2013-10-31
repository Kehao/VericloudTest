package com.vericloud.test;

import android.view.View;

import com.vericloud.R.id;
import com.vericloud.activity.LogoActivity;

import com.vericloud.test.ActivityTest;

public class LogoActivityTest extends  ActivityTest<LogoActivity> {
	/**
	 * Create test for {@link LogoActivity}
	 */
	public LogoActivityTest() {
		super(LogoActivity.class);
	}


	public void testLogo() throws Throwable {
        View versionView = view(id.version);
        System.out.print(versionView);
        assertTrue(versionView.isEnabled());
	}

}
