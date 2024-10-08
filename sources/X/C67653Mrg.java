package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.Mrg  reason: case insensitive filesystem */
public final class C67653Mrg extends AudioDeviceCallback {
    public final /* synthetic */ C70843ONv A00;

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        0qQ.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.isSink()) {
                C70843ONv oNv = this.A00;
                oNv.A01 = 00k.A0T(audioDeviceInfo, oNv.A01);
            }
        }
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        0qQ.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.isSink()) {
                00k.A0f(this.A00.A01, audioDeviceInfo);
            }
        }
    }

    public C67653Mrg(C70843ONv oNv) {
        this.A00 = oNv;
    }
}
