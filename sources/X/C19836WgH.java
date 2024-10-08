package X;

import android.view.Surface;

/* renamed from: X.WgH  reason: case insensitive filesystem */
public final class C19836WgH implements C21028XAh {
    public VU4 A00;
    public final YBE A01;

    public C19836WgH(YBE ybe) {
        0qQ.A0B(ybe, 1);
        this.A01 = ybe;
        ((WKS) ybe).A02 = new C17295VPw(this);
    }

    public final int C3K() {
        return ((WKS) this.A01).A00;
    }

    public final int C3N() {
        return ((WKS) this.A01).A01;
    }

    public final boolean CYx() {
        return ((WKS) this.A01).A06;
    }

    public final void EcM(VU4 vu4) {
        this.A00 = vu4;
    }

    public final void EiX(long j) {
        ((WKS) this.A01).A03.set(j);
    }

    public final Surface getSurface() {
        return ((WKS) this.A01).A05;
    }
}
