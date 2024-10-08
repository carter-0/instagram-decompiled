package X;

import java.util.List;

/* renamed from: X.Jvn  reason: case insensitive filesystem */
public final class C61049Jvn extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C61049Jvn(String str, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = list4;
        this.A05 = z;
        this.A09 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61049Jvn) {
                C61049Jvn jvn = (C61049Jvn) obj;
                if (!0qQ.A0K(this.A00, jvn.A00) || !0qQ.A0K(this.A03, jvn.A03) || !0qQ.A0K(this.A04, jvn.A04) || !0qQ.A0K(this.A02, jvn.A02) || !0qQ.A0K(this.A01, jvn.A01) || this.A05 != jvn.A05 || this.A09 != jvn.A09 || this.A06 != jvn.A06 || this.A07 != jvn.A07 || this.A08 != jvn.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C61049Jvn A00(C61049Jvn jvn, String str, List list, List list2, List list3, List list4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2 = i;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        List list8 = list;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = jvn.A00;
        }
        if ((i & 2) != 0) {
            list8 = jvn.A03;
        }
        if ((i & 4) != 0) {
            list7 = jvn.A04;
        }
        if ((i & 8) != 0) {
            list6 = jvn.A02;
        }
        if ((i & 16) != 0) {
            list5 = jvn.A01;
        }
        if ((i & 32) != 0) {
            z10 = jvn.A05;
        }
        if ((i & 64) != 0) {
            z9 = jvn.A09;
        }
        if ((i2 & 128) != 0) {
            z8 = jvn.A06;
        }
        if ((i2 & 256) != 0) {
            z7 = jvn.A07;
        }
        if ((i2 & 512) != 0) {
            z6 = jvn.A08;
        }
        0qQ.A0B(str2, 0);
        C51974G9v.A1P(list8, list7, list6, list5);
        return new C61049Jvn(str2, list8, list7, list6, list5, z10, z9, z8, z7, z6);
    }

    public final int hashCode() {
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A00))))))))));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61049Jvn() {
        /*
            r11 = this;
            java.lang.String r1 = ""
            X.0sn r2 = X.0sn.A00
            r6 = 0
            r0 = r11
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61049Jvn.<init>():void");
    }
}
