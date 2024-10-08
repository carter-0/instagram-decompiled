package X;

import android.os.SystemClock;

/* renamed from: X.GLa  reason: case insensitive filesystem */
public final class C52259GLa extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52259GLa) {
                C52259GLa gLa = (C52259GLa) obj;
                if (!(this.A04 == gLa.A04 && this.A06 == gLa.A06 && 0qQ.A0K(this.A02, gLa.A02) && 0qQ.A0K(this.A03, gLa.A03) && this.A01 == gLa.A01 && this.A00 == gLa.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A04);
        return C51972G9s.A07(this.A01, (((AnonymousClass7TF.A09(this.A06, A052) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03)) * 31) + this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52259GLa(java.lang.String r2, java.lang.String r3, int r4, long r5, boolean r7, boolean r8) {
        /*
            r1 = this;
            r1.<init>()
            r1.A04 = r7
            r1.A06 = r8
            r1.A02 = r2
            r1.A03 = r3
            r1.A01 = r5
            r1.A00 = r4
            if (r7 == 0) goto L_0x0014
            r0 = 1
            if (r3 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r1.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52259GLa.<init>(java.lang.String, java.lang.String, int, long, boolean, boolean):void");
    }

    public C52259GLa() {
        this((String) null, (String) null, 0, SystemClock.uptimeMillis(), false, false);
    }
}
