package X;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* renamed from: X.4Mj  reason: invalid class name and case insensitive filesystem */
public final class C263534Mj {
    public final AudioManager A00;

    public C263534Mj(AudioManager audioManager) {
        0qQ.A0B(audioManager, 1);
        this.A00 = audioManager;
    }

    public final int A00(C39894ADw aDw) {
        0qQ.A0B(aDw, 0);
        return this.A00.abandonAudioFocusRequest((AudioFocusRequest) aDw.A01);
    }

    public final int A01(C39894ADw aDw) {
        return this.A00.requestAudioFocus((AudioFocusRequest) aDw.A01);
    }
}
