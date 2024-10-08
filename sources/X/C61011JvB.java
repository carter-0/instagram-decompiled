package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.JvB  reason: case insensitive filesystem */
public final class C61011JvB extends AnonymousClass0T0 {
    public final int A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final String A0E;

    public C61011JvB(ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(list, 5);
        C51969G9p.A1P(list2, 10, str6);
        0qQ.A0B(str7, 15);
        this.A01 = imageUrl;
        this.A05 = str;
        this.A04 = str2;
        this.A07 = str3;
        this.A09 = list;
        this.A06 = str4;
        this.A0D = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A0A = list2;
        this.A0E = str5;
        this.A02 = num;
        this.A00 = i;
        this.A08 = str6;
        this.A03 = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61011JvB) {
                C61011JvB jvB = (C61011JvB) obj;
                if (!0qQ.A0K(this.A01, jvB.A01) || !0qQ.A0K(this.A05, jvB.A05) || !0qQ.A0K(this.A04, jvB.A04) || !0qQ.A0K(this.A07, jvB.A07) || !0qQ.A0K(this.A09, jvB.A09) || !0qQ.A0K(this.A06, jvB.A06) || this.A0D != jvB.A0D || this.A0C != jvB.A0C || this.A0B != jvB.A0B || !0qQ.A0K(this.A0A, jvB.A0A) || !0qQ.A0K(this.A0E, jvB.A0E) || !0qQ.A0K(this.A02, jvB.A02) || this.A00 != jvB.A00 || !0qQ.A0K(this.A08, jvB.A08) || !0qQ.A0K(this.A03, jvB.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        int A072 = AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A09, (((AnonymousClass7TF.A08(this.A05, A0K) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31))))));
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A08, (((AnonymousClass7TF.A08(this.A0E, A072) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A00) * 31));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61011JvB() {
        /*
            r16 = this;
            r2 = 0
            java.lang.String r3 = ""
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r3)
            X.0sn r10 = X.0sn.A00
            r12 = 0
            r0 = r16
            r4 = r2
            r5 = r2
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r11 = r10
            r13 = r12
            r14 = r12
            r15 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61011JvB.<init>():void");
    }
}
