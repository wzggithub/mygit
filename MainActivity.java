package com.youku.linktest;

import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG ="lzc";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

			
		Log.i("test");

		//注释

		//注释
		//注释
		
		TextView text = (TextView) findViewById(R.id.txt);
		String str = "@aman_vivek how are u  #aman_vivek <www.baidu.com> http://www.baidu.com> <https://www.tekritisoftware.com sdfdf";
		text.setText(str);
		
		extractUrl2Link(text);
	}

    private void extractUrl2Link(TextView v) {
		Pattern wikiWordMatcher = Pattern.compile("(((http\\:\\/\\/)|(https\\:\\/\\/)|(www\\.))[a-zA-Z0-9_\\.]+)");
		String mentionsScheme = String.format("%s/?%s=", Defs.MENTIONS_SCHEMA, Defs.PARAM_UID);
		Linkify.addLinks(v, wikiWordMatcher, mentionsScheme);
	} 
}
