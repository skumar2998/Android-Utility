package net.kobaxx.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import android.content.Context;

/**
 * Object serializer class. 
 * Support android 1.6+.
 * 
 * @version 0.1
 * @author kobaxx
 */
public class SerializeUtils {

	public static void writeObject(Context con, Serializable data, String fileName) throws IOException {

		FileOutputStream fos = con.openFileOutput(fileName, Context.MODE_PRIVATE);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(data);
		oos.close();
	}

	public static Serializable readObject(Context con, String fileName) throws Exception {

		Serializable data = null;
		FileInputStream fis = con.openFileInput(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		data = (Serializable) ois.readObject();
		ois.close();
		return data;
	}

}
