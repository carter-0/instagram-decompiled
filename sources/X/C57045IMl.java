package X;

import android.media.AudioManager;

/* renamed from: X.IMl  reason: case insensitive filesystem */
public final class C57045IMl implements JPF {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ C57467IbB A01;
    public final /* synthetic */ 0sP A02;

    public C57045IMl(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, C57467IbB ibB, 0sP r3) {
        this.A02 = r3;
        this.A01 = ibB;
        this.A00 = onAudioFocusChangeListener;
    }

    public final void Cp0() {
        C57467IbB ibB = this.A01;
        1GE.A00(ibB.A04).A00(false);
        C14044Tol tol = ibB.A01;
        if (tol != null) {
            tol.A03(0.0f, 0);
        }
        1vq r1 = ibB.A03;
        r1.A03(ibB);
        r1.A03(this.A00);
    }

    public final void Eg6(float f) {
        C51967G9n.A1Q(this.A02, f);
    }
}
