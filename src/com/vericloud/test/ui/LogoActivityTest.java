package com.vericloud.test.ui;

import com.vericloud.R.id;
import com.vericloud.activity.LogoActivity;

import com.vericloud.test.ActivityTest;
//import com.vericloud.util.CommonLog;
//import com.vericloud.util.LogFactory;

public class LogoActivityTest extends ActivityTest<LogoActivity> {
	// private static final CommonLog log = LogFactory.instance();

	/**
	 * Create test for {@link LogoActivity}
	 */
	public LogoActivityTest() {
		super(LogoActivity.class);
	}

	public void testVersion() throws Throwable {
		assertNotNull(view(id.version));
	}

}
