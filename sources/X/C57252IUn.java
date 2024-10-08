package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IUn  reason: case insensitive filesystem */
public final class C57252IUn implements AnonymousClass34A {
    public final C267324bN A00;
    public final AnonymousClass3W1 A01;
    public final S6e A02;
    public final C55571Hjr A03;
    public final WeakReference A04;
    public final boolean A05;

    public final void D0l(1Xj r8, boolean z) {
        1Xj r2 = r8;
        0qQ.A0B(r8, 0);
        C59577JOx jOx = (C59577JOx) this.A04.get();
        if (jOx != null) {
            jOx.D3e(this.A00, r2, this.A02, this.A03, z, this.A05);
        }
    }

    public final void Dty(1Xj r3, AnonymousClass3W9 r4) {
        0qQ.A0B(r4, 1);
        AnonymousClass3W1 r1 = this.A01;
        if (r1 != null) {
            r1.A3b.A00(r1, r4);
        }
    }

    public C57252IUn(C267324bN r1, AnonymousClass3W1 r2, S6e s6e, C55571Hjr hjr, WeakReference weakReference, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = weakReference;
        this.A05 = z;
        this.A03 = hjr;
        this.A02 = s6e;
    }
}
