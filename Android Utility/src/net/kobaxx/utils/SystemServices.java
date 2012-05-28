package net.kobaxx.utils;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;

/**
 * System Service shortcut.
 * Support android 1.6+.
 * 
 * @author kobaxx
 * @version 0.1
 */
public class SystemServices {
	
	public static boolean isSilentOrViberateMode(Context context){
		AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
		int mode = audioManager.getRingerMode();
		return mode == AudioManager.RINGER_MODE_SILENT || mode == AudioManager.RINGER_MODE_VIBRATE;
	}
	
	public static int getRingtoneVolumue(Context context){
        AudioManager audio = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        return audio.getStreamVolume(AudioManager.STREAM_RING);
	}
	
	public static Vibrator vibrate(Context context, long[] pattern, int loop){
		
		Vibrator vibe = ((Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE));
		vibe.vibrate(pattern, loop);
		return vibe;
	}
	
}
