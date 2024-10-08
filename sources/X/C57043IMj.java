package X;

import android.media.AudioManager;

/* renamed from: X.IMj  reason: case insensitive filesystem */
public final class C57043IMj implements JPF {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ C57464Ib8 A01;

    public C57043IMj(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, C57464Ib8 ib8) {
        this.A01 = ib8;
        this.A00 = onAudioFocusChangeListener;
    }

    public final void Cp0() {
        C57464Ib8 ib8 = this.A01;
        1GE.A00(ib8.A03).A00(false);
        C14044Tol tol = ib8.A00;
        if (tol != null) {
            tol.A03(0.0f, 0);
        }
        1vq r1 = ib8.A02;
        r1.A03(ib8);
        r1.A03(this.A00);
    }

    public final void Eg6(float f) {
        C14044Tol tol = this.A01.A00;
        if (tol != null) {
            tol.A03(f, 0);
        }
    }
}
