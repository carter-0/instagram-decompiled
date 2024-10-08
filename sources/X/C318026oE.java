package X;

import android.media.AudioManager;

/* renamed from: X.6oE  reason: invalid class name and case insensitive filesystem */
public final class C318026oE implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C318006oC A00;

    public C318026oE(C318006oC r1) {
        this.A00 = r1;
    }

    public final void onAudioFocusChange(int i) {
        if (i == -2 || i == -1) {
            C318006oC.A02(this.A00);
        }
    }
}
