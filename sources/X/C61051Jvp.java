package X;

import android.text.Spannable;
import java.util.List;
import java.util.Set;

/* renamed from: X.Jvp  reason: case insensitive filesystem */
public final class C61051Jvp extends AnonymousClass0T0 {
    public final int A00;
    public final Spannable A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61051Jvp) {
                C61051Jvp jvp = (C61051Jvp) obj;
                if (!(this.A0A == jvp.A0A && this.A0B == jvp.A0B && this.A07 == jvp.A07 && 0qQ.A0K(this.A02, jvp.A02) && this.A06 == jvp.A06 && this.A00 == jvp.A00 && 0qQ.A0K(this.A01, jvp.A01) && this.A09 == jvp.A09 && this.A0D == jvp.A0D && 0qQ.A0K(this.A04, jvp.A04) && this.A08 == jvp.A08 && this.A0C == jvp.A0C && 0qQ.A0K(this.A03, jvp.A03) && 0qQ.A0K(this.A05, jvp.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C61051Jvp A01(Spannable spannable, C61051Jvp jvp, List list, List list2, Set set, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Set set2 = set;
        List list3 = list2;
        boolean z9 = z4;
        List list4 = list;
        boolean z10 = z3;
        Spannable spannable2 = spannable;
        int i3 = i;
        boolean z11 = z2;
        boolean z12 = z;
        String str = null;
        int i4 = i2;
        C61051Jvp jvp2 = jvp;
        if ((i2 & 1) != 0) {
            z12 = jvp2.A0A;
        }
        if ((i2 & 2) != 0) {
            z11 = jvp2.A0B;
        }
        if ((i2 & 4) != 0) {
            z5 = jvp2.A07;
        } else {
            z5 = false;
        }
        if ((i2 & 8) != 0) {
            str = jvp2.A02;
        }
        if ((i2 & 16) != 0) {
            z6 = jvp2.A06;
        } else {
            z6 = false;
        }
        if ((i2 & 32) != 0) {
            i3 = jvp2.A00;
        }
        if ((i2 & 64) != 0) {
            spannable2 = jvp2.A01;
        }
        if ((i4 & 128) != 0) {
            z7 = jvp2.A09;
        } else {
            z7 = false;
        }
        if ((i4 & 256) != 0) {
            z10 = jvp2.A0D;
        }
        if ((i4 & 512) != 0) {
            list4 = jvp2.A04;
        }
        if ((i4 & 1024) != 0) {
            z8 = jvp2.A08;
        } else {
            z8 = false;
        }
        if ((i4 & C249703kE.FLAG_MOVED) != 0) {
            z9 = jvp2.A0C;
        }
        if ((i4 & 4096) != 0) {
            list3 = jvp2.A03;
        }
        if ((i4 & 8192) != 0) {
            set2 = jvp2.A05;
        }
        0qQ.A0B(str, 3);
        AnonymousClass7TF.A1G(spannable2, 6, list4);
        C51969G9p.A1O(list3, 12, set2);
        int i5 = i3;
        return new C61051Jvp(spannable2, str, list4, list3, set2, i5, z12, z11, z5, z6, z7, z10, z8, z9);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A0B, C51965G9l.A05(this.A0A))));
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(this.A06, A082) + this.A00) * 31))))))));
    }

    public C61051Jvp(Spannable spannable, String str, List list, List list2, Set set, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0A = z;
        this.A0B = z2;
        this.A07 = z3;
        this.A02 = str;
        this.A06 = z4;
        this.A00 = i;
        this.A01 = spannable;
        this.A09 = z5;
        this.A0D = z6;
        this.A04 = list;
        this.A08 = z7;
        this.A0C = z8;
        this.A03 = list2;
        this.A05 = set;
    }

    public static void A03(C60319JjN jjN, 05G r2) {
        C60319JjN.A03(jjN, ((C61051Jvp) r2.getValue()).A01.length());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61051Jvp() {
        /*
            r15 = this;
            r6 = 0
            java.lang.String r2 = ""
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r2)
            X.0sn r3 = X.0sn.A00
            X.0sl r5 = X.0sl.A00
            r0 = r15
            r4 = r3
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61051Jvp.<init>():void");
    }
}
