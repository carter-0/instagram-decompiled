package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.Mrh  reason: case insensitive filesystem */
public final class C67654Mrh extends AudioDeviceCallback {
    public String A00;
    public boolean A01;
    public final /* synthetic */ OZz A02;

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        0qQ.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        if (!this.A01) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                    this.A01 = true;
                    this.A00 = audioDeviceInfo.getAddress();
                    OJP ojp = this.A02.A0G;
                    if (ojp != null) {
                        ojp.A00(2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        0qQ.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        if (this.A01) {
            for (AudioDeviceInfo address : audioDeviceInfoArr) {
                if (0qQ.A0K(address.getAddress(), this.A00)) {
                    OJP ojp = this.A02.A0G;
                    if (ojp != null) {
                        ojp.A00(0);
                    }
                    this.A01 = false;
                    this.A00 = null;
                    return;
                }
            }
        }
    }

    public C67654Mrh(OZz oZz) {
        this.A02 = oZz;
    }
}
