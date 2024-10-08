package X;

/* renamed from: X.8fo  reason: invalid class name and case insensitive filesystem */
public final class C361188fo extends C361198fp {
    public C345087su A00;
    public C345087su A01;
    public final C344407ro A02;
    public final boolean A03;

    public C361188fo(C344407ro r2, boolean z) {
        super((C344407ro) null);
        this.A02 = r2;
        this.A03 = z;
    }

    public static C345137sz A00(C345897uG r6, C344567s4 r7, C345137sz r8, C345057sr r9, C361188fo r10, Integer num, Integer num2, int i) {
        int i2;
        int i3;
        C345067ss CFP = r8.CFP();
        if (CFP == null) {
            r10.A02.A00(C368978td.VIDEO_INPUT_PRODUCER_SKIP_VIEWPORT_NULL);
            return r8;
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = CFP.A01;
        }
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = CFP.A00;
        }
        C345087su r3 = r10.A00;
        if (r3 == null) {
            C344407ro r5 = r10.A02;
            C345047sq r4 = new C345047sq();
            if (r9 == null) {
                r9 = new C345077st();
            }
            C345087su r32 = new C345087su(r5, r4, r9, false);
            r10.A00 = r32;
            r32.A03(i2, i3, r8.Awt());
            r10.A00.ACn(r6);
        } else {
            r3.A03(i2, i3, r8.Awt());
        }
        if (!(num == null && num2 == null)) {
            r10.A00.A03 = true;
        }
        if (i != 0) {
            r10.A00.A0A.A00 = i;
        }
        r10.A01().A00(r7.A01(), r8, r10.A00);
        return r10.A00.A0A;
    }
}
