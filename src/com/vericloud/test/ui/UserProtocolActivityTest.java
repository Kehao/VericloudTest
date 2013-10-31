package com.vericloud.test.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import com.vericloud.R;
import com.vericloud.activity.UserProtocolActivity;

@RunWith(RobolectricTestRunner.class)
public class UserProtocolActivityTest {

	@Test
	public void clickingButton_shouldChangeResultsViewText() throws Exception {
		Activity activity = Robolectric
				.buildActivity(UserProtocolActivity.class).create().get();
		//Button pressMeButton = (Button) activity.findViewById(id.start_use);
		TextView textView1 = (TextView) activity.findViewById(R.id.textView1);
	    String textView1Text = textView1.getText().toString();

		assertThat(textView1Text, equalTo("我已经阅读并同意《用户协议》"));
	}
}

// public class UserProtocolActivityTest extends
// ActivityTest<UserProtocolActivity> {
//
// public UserProtocolActivityTest() {
// super(UserProtocolActivity.class);
// }
//
// public void testVersion() throws Throwable {
//
// assertNull(view(id.version));
// }
//
// }
