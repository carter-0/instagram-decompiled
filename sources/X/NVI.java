package X;

import java.util.List;

public final class NVI extends P8X implements C232262tL {
    public final int A00;
    public final C42918Bmm A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final String A07;
    public final String A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NVI(X.C42918Bmm r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, int r18) {
        /*
            r9 = this;
            r0 = 2
            X.0qQ.A0B(r11, r0)
            r5 = 0
            if (r10 == 0) goto L_0x003f
            java.lang.String r0 = "igid"
            java.lang.String r4 = r10.A08(r0)
        L_0x000d:
            r2 = r17
            X.3lr r1 = X.C66583MXo.A0K(r2)
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "igid"
            java.lang.String r5 = r1.A08(r0)
        L_0x001b:
            java.lang.Object r0 = X.00k.A0I(r2)
            X.GnV r0 = (X.C53398GnV) r0
            java.lang.String r6 = r0.A04
            r3 = r9
            r7 = r15
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            r9.A01 = r10
            r9.A02 = r11
            r9.A03 = r12
            r9.A04 = r13
            r9.A08 = r14
            r9.A06 = r2
            r0 = r18
            r9.A00 = r0
            r9.A07 = r15
            r9.A05 = r8
            return
        L_0x003f:
            r4 = r5
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NVI.<init>(X.Bmm, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NVI) {
                NVI nvi = (NVI) obj;
                if (!0qQ.A0K(this.A01, nvi.A01) || this.A02 != nvi.A02 || !0qQ.A0K(this.A03, nvi.A03) || !0qQ.A0K(this.A04, nvi.A04) || !0qQ.A0K(this.A08, nvi.A08) || !0qQ.A0K(this.A06, nvi.A06) || this.A00 != nvi.A00 || !0qQ.A0K(this.A07, nvi.A07) || !0qQ.A0K(this.A05, nvi.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        List list = this.A06;
        String str2 = ((C53398GnV) 00k.A0I(list)).A03;
        C250663lr A0K = C66583MXo.A0K(list);
        if (A0K != null) {
            str = A0K.A07("strong_id__");
        } else {
            str = null;
        }
        return 002.A0R(str2, str);
    }

    public final int hashCode() {
        List list = this.A06;
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A08(this.A07, (AnonymousClass7TF.A07(list, ((((((((AnonymousClass7TG.A0C(this.A01) * 31) + C69908NuA.A00(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A08)) * 31) + this.A00) * 31));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        List list;
        NVI nvi = (NVI) obj;
        List list2 = this.A06;
        if (nvi != null) {
            list = nvi.A06;
        } else {
            list = null;
        }
        return 0qQ.A0K(list2, list);
    }
}
