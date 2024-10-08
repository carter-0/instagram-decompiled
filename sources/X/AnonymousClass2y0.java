package X;

import android.media.AudioManager;

/* renamed from: X.2y0  reason: invalid class name */
public final class AnonymousClass2y0 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C234492xx A00;

    public AnonymousClass2y0(C234492xx r1) {
        this.A00 = r1;
    }

    public final void onAudioFocusChange(int i) {
        if (i == -2 || i == -1) {
            C234492xx.A01(this.A00);
        }
    }
}
