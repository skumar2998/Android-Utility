package net.kobaxx.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/**
 * SQLite utility class.
* Support android 1.6+.
 * 
 * @author kobaxx
 * @version 0.1
 */
public class SQLiteUtils {

	public static String getDatabasePath(Context con, String dbName) {

		StringBuilder builder = new StringBuilder("/data/data/");
		builder.append(con.getPackageName());
		builder.append("/databases/");
		builder.append(dbName);
		return builder.toString();
	}

	public static boolean existDatabase(Context con, String dbName) {

		SQLiteDatabase db = null;

		String path = null;
		path = getDatabasePath(con, dbName);

		try {

			db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);

		} catch (SQLiteException e) {

			e.getStackTrace();

		} finally {
			try {
				db.close();
			} catch (Exception e) {
			}
		}
		return db != null;
	}

}
