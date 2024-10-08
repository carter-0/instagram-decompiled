package X;

/* renamed from: X.Jvi  reason: case insensitive filesystem */
public final class C61044Jvi extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C61044Jvi(AnonymousClass3QO r2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A01 = r2;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public final C61044Jvi A00(VR1 vr1, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        VR1 vr12 = vr1;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A04;
        }
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = this.A03;
        }
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = this.A02;
        }
        if (vr1 == null) {
            vr12 = (VR1) this.A01;
        }
        if (bool4 != null) {
            z4 = bool4.booleanValue();
        } else {
            z4 = this.A05;
        }
        0qQ.A0B(vr12, 2);
        return new C61044Jvi(vr12, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61044Jvi)) {
                return false;
            }
            C61044Jvi jvi = (C61044Jvi) obj;
            if (jvi.A00 != 1 || this.A02 != jvi.A02 || this.A01 != jvi.A01 || this.A05 != jvi.A05 || this.A04 != jvi.A04) {
                return false;
            }
            z = this.A03;
            z2 = jvi.A03;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61044Jvi)) {
                return false;
            }
            C61044Jvi jvi2 = (C61044Jvi) obj;
            if (jvi2.A00 != 0 || this.A04 != jvi2.A04 || this.A03 != jvi2.A03 || !0qQ.A0K(this.A01, jvi2.A01) || this.A02 != jvi2.A02) {
                return false;
            }
            z = this.A05;
            z2 = jvi2.A05;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        boolean z;
        if (this.A00 != 0) {
            A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, (C51965G9l.A05(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31));
            z = this.A03;
        } else {
            A09 = AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A03, C51965G9l.A05(this.A04))));
            z = this.A05;
        }
        return DbS.A06(z, A09);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61044Jvi(int r9, boolean r10) {
        /*
            r8 = this;
            r7 = r10
            r3 = 0
            r4 = 0
            r2 = r8
            r8.A00 = r4
            r0 = r9 & 4
            if (r0 == 0) goto L_0x0011
            r0 = 100
            X.K0U r3 = new X.K0U
            r3.<init>(r0)
        L_0x0011:
            r0 = r9 & 16
            if (r0 == 0) goto L_0x0016
            r7 = 0
        L_0x0016:
            r5 = r4
            r6 = r4
            r2.<init>((X.VR1) r3, (boolean) r4, (boolean) r5, (boolean) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61044Jvi.<init>(int, boolean):void");
    }

    public C61044Jvi(VR1 vr1, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(vr1, 3);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = vr1;
        this.A02 = z3;
        this.A05 = z4;
    }

    public C61044Jvi() {
        this((AnonymousClass3QO) null, true, false, false, false);
    }
}
