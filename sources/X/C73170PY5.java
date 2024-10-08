package X;

import android.media.AudioManager;

/* renamed from: X.PY5  reason: case insensitive filesystem */
public final class C73170PY5 implements Runnable {
    public final /* synthetic */ C67637MrQ A00;
    public final /* synthetic */ OHF A01;

    public C73170PY5(C67637MrQ mrQ, OHF ohf) {
        this.A01 = ohf;
        this.A00 = mrQ;
    }

    public final void run() {
        float f;
        AudioManager audioManager = this.A01.A04;
        int i = 0;
        if (audioManager.isBluetoothScoOn()) {
            i = 6;
        }
        int streamVolume = audioManager.getStreamVolume(i);
        C67637MrQ mrQ = this.A00;
        if (streamVolume != mrQ.A00) {
            mrQ.A00 = streamVolume;
            int streamMaxVolume = audioManager.getStreamMaxVolume(i);
            if (streamMaxVolume > 0) {
                f = ((float) streamVolume) / ((float) streamMaxVolume);
            } else {
                f = -1.0f;
            }
            OOE ooe = mrQ.A01.A00;
            ooe.A05.A00("Volume level changed to %f", Float.valueOf(f));
            ooe.audioManagerQplLogger.CmO("set_volume", String.valueOf(f));
        }
    }
}
