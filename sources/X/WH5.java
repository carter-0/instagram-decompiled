package X;

import android.view.Choreographer;

public final class WH5 implements AnonymousClass0KJ {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final Choreographer A03;
    public final AnonymousClass0KI A04;
    public final Choreographer.FrameCallback A05;

    public final void APC() {
        this.A02 = false;
        this.A03.removeFrameCallback(this.A05);
    }

    public final void ARH() {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        this.A03.postFrameCallback(this.A05);
    }

    public WH5(Choreographer choreographer, AnonymousClass0KI r4) {
        this.A03 = choreographer;
        this.A04 = r4;
        this.A05 = new W81(this, 0);
    }
}
