package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.7Er  reason: invalid class name and case insensitive filesystem */
public final class C328407Er {
    public final AnonymousClass9IV A00;
    public final C45275Cte A01;
    public final C254703su A02;
    public final Boolean A03;
    public final Boolean A04;
    public final List A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C328407Er r5 = (C328407Er) obj;
            if (this.A06 != r5.A06 || !2PP.A00(this.A05, r5.A05) || !2PP.A00(this.A00, r5.A00) || !2PP.A00(this.A01, r5.A01) || !2PP.A00(this.A02, r5.A02) || !2PP.A00(this.A04, r5.A04) || !2PP.A00(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A00, Boolean.valueOf(this.A06), this.A01, this.A02, this.A04, this.A03});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (X.AnonymousClass4KJ.A00((java.util.Collection) r3.A01) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C328407Er(X.AnonymousClass9IV r3, X.C45275Cte r4, X.C254703su r5, java.lang.Boolean r6, java.lang.Boolean r7, java.util.List r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A05 = r8
            r2.A00 = r3
            if (r3 == 0) goto L_0x0014
            java.lang.Object r0 = r3.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = X.AnonymousClass4KJ.A00(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A06 = r0
            r2.A01 = r4
            r2.A02 = r5
            r2.A04 = r6
            r2.A03 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328407Er.<init>(X.9IV, X.Cte, X.3su, java.lang.Boolean, java.lang.Boolean, java.util.List):void");
    }
}
