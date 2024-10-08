package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.os.SystemClock;

/* renamed from: X.7n1  reason: invalid class name and case insensitive filesystem */
public final class C341517n1 extends AudioDeviceCallback {
    public final /* synthetic */ C341427mr A00;

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            audioDeviceInfo.getType();
            C341457mv r2 = this.A00.A0I;
            r2.A02 = Integer.valueOf(audioDeviceInfo.getType());
            r2.A04 = true;
            r2.A00 = SystemClock.elapsedRealtime();
        }
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            audioDeviceInfo.getType();
            C341457mv r2 = this.A00.A0I;
            r2.A02 = Integer.valueOf(audioDeviceInfo.getType());
            r2.A04 = false;
            r2.A00 = SystemClock.elapsedRealtime();
        }
    }

    public C341517n1(C341427mr r1) {
        this.A00 = r1;
    }
}
