package X;

import android.content.Intent;

/* renamed from: X.Jxw  reason: case insensitive filesystem */
public final class C61146Jxw extends AnonymousClass0T0 implements C66389MPv {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C61146Jxw(Intent intent, 2EG r2, String str, String str2, int i, long j) {
        this.A00 = i;
        C51972G9s.A1D(r2, str2);
        this.A02 = intent;
        this.A05 = str;
        this.A03 = r2;
        this.A04 = str2;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C61146Jxw)) {
            return false;
        }
        C61146Jxw jxw = (C61146Jxw) obj;
        if (jxw.A00 != i || !0qQ.A0K(this.A02, jxw.A02) || !0qQ.A0K(this.A05, jxw.A05) || this.A03 != jxw.A03 || !0qQ.A0K(this.A04, jxw.A04) || this.A01 != jxw.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0K(this.A02)))) + C51968G9o.A03(this.A01);
    }
}
