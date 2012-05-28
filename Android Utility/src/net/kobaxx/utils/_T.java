package net.kobaxx.utils;

import android.util.Log;

/**
 * Android Log Class Extension. Support android 1.6+.
 * 
 * @version 0.1
 * @author kobaxx
 * 
 * 
 */
public class _T {

	private static boolean eneble;

	private static Logger sNullLogger;

	private static Logger sLogcatLogger;

	private static Logger sLogger = getNullLogger();

	public static void i(String tag, Object... msg) {

		sLogger.i(tag, msg);
	}

	public static void i(Object obj, Object... msg) {

		sLogger.i(obj, msg);
	}

	public static void i(Class<?> clazz, Object... msg) {

		sLogger.i(clazz, msg);
	}

	public static void w(String tag, Object... msg) {

		sLogger.w(tag, msg);
	}

	public static void w(Object obj, Object... msg) {

		sLogger.w(obj, msg);
	}

	public static void w(Class<?> clazz, Object... msg) {

		sLogger.w(clazz, msg);
	}

	public static void v(String tag, Object... msg) {

		sLogger.v(tag, msg);
	}

	public static void v(Object obj, Object... msg) {

		sLogger.v(obj, msg);
	}

	public static void v(Class<?> clazz, Object... msg) {

		sLogger.v(clazz, msg);
	}

	public static void d(String tag, Object... msg) {

		sLogger.d(tag, msg);
	}

	public static void d(Object obj, Object... msg) {

		sLogger.d(obj, msg);
	}

	public static void d(Class<?> clazz, Object... msg) {

		sLogger.d(clazz, msg);
	}

	public static void e(String tag, Object... msg) {

		sLogger.e(tag, msg);
	}

	public static void e(Object obj, Object... msg) {

		sLogger.e(obj, msg);
	}

	public static void e(Class<?> clazz, Object... msg) {

		sLogger.e(clazz, msg);
	}

	private static Logger getNullLogger() {

		if (sNullLogger == null) {
			sNullLogger = new NullLogger();
		}
		return sNullLogger;
	}

	private static Logger getLogcatLogger() {

		if (sLogcatLogger == null) {
			sLogcatLogger = new LogCat();
		}
		return sLogcatLogger;
	}

	private static String join(Object... msg) {

		StringBuilder buider = new StringBuilder();
		int len = msg.length;
		for (int i = 0; i < len; i++) {
			buider.append(msg[i]);
			if (i < (len - 1)) {
				buider.append(", ");
			}
		}
		return buider.toString();
	}

	public static boolean isEneble() {

		return eneble;
	}

	public static void setEneble(boolean eneble) {

		_T.eneble = eneble;
		if (eneble) {
			sLogger = getLogcatLogger();
		} else {
			sLogger = getNullLogger();
		}
	}

	public static interface Logger {

		public void i(String tag, Object... msg);

		public void i(Object obj, Object... msg);

		public void i(Class<?> clazz, Object... msg);

		public void w(String tag, Object... msg);

		public void w(Object obj, Object... msg);

		public void w(Class<?> clazz, Object... msg);

		public void v(String tag, Object... msg);

		public void v(Object obj, Object... msg);

		public void v(Class<?> clazz, Object... msg);

		public void d(String tag, Object... msg);

		public void d(Object obj, Object... msg);

		public void d(Class<?> clazz, Object... msg);

		public void e(String tag, Object... msg);

		public void e(Object obj, Object... msg);

		public void e(Class<?> clazz, Object... msg);

	}

	private static class LogCat implements Logger {

		@Override
		public void i(String tag, Object... msg) {

			String out = join(msg);
			Log.i(tag, out);
		}

		@Override
		public void i(Object obj, Object... msg) {

			String out = join(msg);
			Log.i(obj.getClass().getSimpleName(), out);
		}

		@Override
		public void i(Class<?> clazz, Object... msg) {

			String out = join(msg);
			Log.i(clazz.getSimpleName(), out);

		}

		@Override
		public void w(String tag, Object... msg) {

			String out = join(msg);
			Log.w(tag, out);
		}

		@Override
		public void w(Object obj, Object... msg) {

			String out = join(msg);
			Log.w(obj.getClass().getSimpleName(), out);
		}

		@Override
		public void w(Class<?> clazz, Object... msg) {

			String out = join(msg);
			Log.w(clazz.getSimpleName(), out);

		}

		@Override
		public void v(String tag, Object... msg) {

			String out = join(msg);
			Log.v(tag, out);
		}

		@Override
		public void v(Object obj, Object... msg) {

			String out = join(msg);
			Log.v(obj.getClass().getSimpleName(), out);
		}

		@Override
		public void v(Class<?> clazz, Object... msg) {

			String out = join(msg);
			Log.v(clazz.getSimpleName(), out);
		}

		@Override
		public void d(String tag, Object... msg) {

			String out = join(msg);
			Log.d(tag, out);
		}

		@Override
		public void d(Object obj, Object... msg) {

			String out = join(msg);
			Log.d(obj.getClass().getSimpleName(), out);
		}

		@Override
		public void d(Class<?> clazz, Object... msg) {

			String out = join(msg);
			Log.d(clazz.getSimpleName(), out);
		}

		@Override
		public void e(String tag, Object... msg) {

			String out = join(msg);
			Log.e(tag, out);
		}

		@Override
		public void e(Object obj, Object... msg) {

			String out = join(msg);
			Log.e(obj.getClass().getSimpleName(), out);
		}

		@Override
		public void e(Class<?> clazz, Object... msg) {

			String out = join(msg);
			Log.e(clazz.getSimpleName(), out);
		}

	}

	private static class NullLogger implements Logger {

		@Override
		public void i(String tag, Object... msg) {

		}

		@Override
		public void i(Object obj, Object... msg) {

		}

		@Override
		public void i(Class<?> clazz, Object... msg) {

		}

		@Override
		public void w(String tag, Object... msg) {

		}

		@Override
		public void w(Object obj, Object... msg) {

		}

		@Override
		public void w(Class<?> clazz, Object... msg) {

		}

		@Override
		public void v(String tag, Object... msg) {

		}

		@Override
		public void v(Object obj, Object... msg) {

		}

		@Override
		public void v(Class<?> clazz, Object... msg) {

		}

		@Override
		public void d(String tag, Object... msg) {

		}

		@Override
		public void d(Object obj, Object... msg) {

		}

		@Override
		public void d(Class<?> clazz, Object... msg) {

		}

		@Override
		public void e(String tag, Object... msg) {

		}

		@Override
		public void e(Object obj, Object... msg) {

		}

		@Override
		public void e(Class<?> clazz, Object... msg) {

		}

	}

}
