package X;

/* renamed from: X.Drv  reason: case insensitive filesystem */
public final class C47180Drv extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C47180Drv(String str, String str2, int i, boolean z, boolean z2) {
        AnonymousClass7TG.A1P(str, str2);
        this.A02 = str;
        this.A03 = z;
        this.A01 = str2;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47180Drv)) {
                return false;
            }
            C47180Drv drv = (C47180Drv) obj;
            if (drv.A00 != 1 || !0qQ.A0K(this.A01, drv.A01) || !0qQ.A0K(this.A02, drv.A02) || this.A04 != drv.A04) {
                return false;
            }
            z = this.A03;
            z2 = drv.A03;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C47180Drv)) {
                return false;
            }
            C47180Drv drv2 = (C47180Drv) obj;
            if (drv2.A00 != 0 || !0qQ.A0K(this.A02, drv2.A02) || this.A03 != drv2.A03 || !0qQ.A0K(this.A01, drv2.A01)) {
                return false;
            }
            z = this.A04;
            z2 = drv2.A04;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08;
        boolean z;
        if (this.A00 != 0) {
            A08 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)));
            z = this.A03;
        } else {
            A08 = AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0O(this.A02)));
            z = this.A04;
        }
        return DbS.A06(z, A08);
    }

    public static final C47180Drv A00(String str, String str2, boolean z, boolean z2) {
        AnonymousClass7TG.A1N(str, str2);
        return new C47180Drv(str, str2, z, z2);
    }

    public C47180Drv(String str, String str2, boolean z, boolean z2) {
        AnonymousClass7TF.A1B(str, 1, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A03 = z2;
    }
}
