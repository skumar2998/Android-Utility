package net.kobaxx.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * Read a character from a text file asset. 
 * Support android 1.6+.
 * 
 * @author kobaxx
 * @version 0.1
 */
public class AssetTextReader {

	/**
	 * Read a character from a text file asset
	 * 
	 * @param con
	 * @param textfileName
	 * @return
	 * @throws IOException
	 */
	public static String readFile(Context con, String textfileName) throws IOException {

		AssetManager assetManager = con.getResources().getAssets();
		InputStream inputStream = assetManager.open(textfileName);

		StringBuilder builder = new StringBuilder();
		String line = null;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

			while ((line = br.readLine()) != null) {
				builder.append(line).append("\n");
			}

		} finally {

			if (br != null)
				br.close();

		}
		return builder.toString();

	}

}
