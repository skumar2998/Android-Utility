package net.kobaxx.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * FileIO utility. 
 * Support android 1.6+.
 * 
 * @author kobaxx
 * @version 0.1
 * 
 */
public class FileUtils {

	public static void copyAssetFileToAppDir(Context con, String src, String dst) {

		AssetManager assetManager = con.getAssets();
		InputStream input = null;
		FileOutputStream output = null;

		try {

			input = assetManager.open(src);
			output = new FileOutputStream(dst);

			byte[] buffer = new byte[1024 * 4];
			int n = 0;
			while ((n = input.read(buffer)) > 0) {
				output.write(buffer, 0, n);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				output.flush();
				input.close();
				output.close();
			} catch (IOException e) {
			}

		}

	}

}
