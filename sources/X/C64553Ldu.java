package X;

import android.media.AudioManager;

/* renamed from: X.Ldu  reason: case insensitive filesystem */
public final class C64553Ldu implements JPF {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ LVA A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0sP A03;

    public C64553Ldu(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, LVA lva, C62320sa r3, 0sP r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = lva;
        this.A00 = onAudioFocusChangeListener;
    }

    public final void Cp0() {
        this.A02.invoke();
        this.A01.A00.A03(this.A00);
    }

    public final void Eg6(float f) {
        this.A03.invoke(Float.valueOf(f));
    }
}
