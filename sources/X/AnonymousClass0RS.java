package X;

/* renamed from: X.0RS  reason: invalid class name */
public final class AnonymousClass0RS implements AnonymousClass0La {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass0RS(0Lb r1, AnonymousClass0N9 r2, AnonymousClass0NA r3, 0NJ r4, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r1;
    }

    public final void DUi(0M7 r5, AnonymousClass0OO r6) {
        0Lb r1;
        0M7 r0;
        int i = this.A00;
        0LW r2 = (0LW) ((AnonymousClass0NA) this.A03).ALF((0NJ) this.A04);
        if (i != 0) {
            if (r2 != null) {
                r1 = (0Lb) this.A02;
                r0 = 0M7.A03;
            } else {
                return;
            }
        } else if (r2 != null) {
            r1 = (0Lb) this.A02;
            r0 = 0M7.A02;
        } else {
            return;
        }
        r1.A07(r2, r0, r6);
    }
}
