package X;

import java.util.List;

/* renamed from: X.82a  reason: invalid class name and case insensitive filesystem */
public final class C3498382a {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final C272024jy A06;
    public final boolean A07;

    public C3498382a(1Xj r3) {
        List A3o = r3.A3o(AnonymousClass3WT.POLLING);
        if (A3o != null) {
            C255783ui r1 = (C255783ui) 00k.A0J(A3o);
            if (r1 != null) {
                C272024jy A0E = r1.A0E();
                if (A0E != null) {
                    this.A06 = A0E;
                    this.A04 = r1.A03;
                    this.A05 = r1.A04;
                    this.A03 = r1.A02;
                    this.A00 = r1.A00;
                    this.A01 = r1.A01;
                    this.A02 = r3.A0l();
                    this.A07 = r1.A1r;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("pollInteractive must not be null");
        }
        throw new IllegalStateException("List of polling ReelInteractives from media must not be null");
    }
}
