package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9xu  reason: invalid class name and case insensitive filesystem */
public abstract class C394329xu {
    public static final boolean A00(Context context) {
        0qQ.A0B(context, 0);
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
        0qQ.A07(devices);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 4) {
                return true;
            }
        }
        return false;
    }
}
