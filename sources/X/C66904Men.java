package X;

/* renamed from: X.Men  reason: case insensitive filesystem */
public final class C66904Men extends AnonymousClass1GX {
    public boolean A00;
    public final int A01 = 1;
    public final Object A02;

    public C66904Men(C66633Ma2 ma2) {
        this.A02 = ma2;
        this.A00 = true;
    }

    public final void onScroll(C238133Ar r4, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        C320256s4 r0;
        C320256s4 r02;
        if (this.A01 != 0) {
            A03 = AnonymousClass0fD.A03(-673031960);
            boolean z = true;
            if (i > 1) {
                z = false;
            }
            if (!(z == this.A00 || (r02 = ((AnonymousClass36M) this.A02).A01) == null)) {
                r02.A03(z);
            }
            this.A00 = z;
            i6 = -1096673620;
        } else {
            A03 = AnonymousClass0fD.A03(-1046575891);
            boolean z2 = true;
            if (i > 1) {
                z2 = false;
            }
            if (!(z2 == this.A00 || (r0 = ((C66633Ma2) this.A02).A0q) == null)) {
                r0.A03(z2);
            }
            this.A00 = z2;
            i6 = 1345343224;
        }
        AnonymousClass0fD.A0A(i6, A03);
    }

    public C66904Men(AnonymousClass36M r2) {
        this.A02 = r2;
        this.A00 = true;
    }
}
