package X;

import java.util.List;

/* renamed from: X.Gn8  reason: case insensitive filesystem */
public final class C53378Gn8 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    public C53378Gn8(C62520KhB khB, C62520KhB khB2, Integer num, Integer num2, String str, List list, List list2, boolean z) {
        this.A03 = list;
        this.A06 = num;
        this.A08 = z;
        this.A07 = str;
        this.A02 = khB;
        this.A04 = khB2;
        this.A01 = num2;
        this.A05 = list2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53378Gn8)) {
                return false;
            }
            C53378Gn8 gn8 = (C53378Gn8) obj;
            if (gn8.A00 == 1 && 0qQ.A0K(this.A03, gn8.A03) && 0qQ.A0K(this.A06, gn8.A06) && this.A08 == gn8.A08 && 0qQ.A0K(this.A07, gn8.A07) && this.A02 == gn8.A02 && this.A04 == gn8.A04 && this.A01 == gn8.A01 && 0qQ.A0K(this.A05, gn8.A05)) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53378Gn8)) {
                return false;
            }
            C53378Gn8 gn82 = (C53378Gn8) obj;
            if (gn82.A00 != 0 || !0qQ.A0K(this.A03, gn82.A03) || !0qQ.A0K(this.A02, gn82.A02) || !0qQ.A0K(this.A04, gn82.A04) || !0qQ.A0K(this.A01, gn82.A01) || this.A06 != gn82.A06 || !0qQ.A0K(this.A07, gn82.A07) || !0qQ.A0K(this.A05, gn82.A05) || this.A08 != gn82.A08) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int A0K = AnonymousClass7TE.A0K(this.A03);
        if (i != 0) {
            boolean z = this.A08;
            return ((AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A09(z, (A0K + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31)) + C55070Hbf.A00((Integer) this.A01)) * 31) + AnonymousClass7TE.A0L(this.A05);
        }
        Object obj = this.A01;
        return DbS.A06(this.A08, AnonymousClass7TF.A07(this.A05, (((AnonymousClass7TF.A07(obj, (((A0K + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + C41845B3m.A00(this.A07)) * 31));
    }

    public C53378Gn8(C61084JwM jwM, C61084JwM jwM2, HLB hlb, I12 i12, C59498JLw jLw, String str, AnonymousClass62P r8, boolean z) {
        0qQ.A0B(r8, 4);
        this.A03 = jLw;
        this.A02 = i12;
        this.A04 = jwM;
        this.A01 = r8;
        this.A06 = hlb;
        this.A07 = str;
        this.A05 = jwM2;
        this.A08 = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53378Gn8() {
        /*
            r10 = this;
            r0 = 1
            r1 = r10
            r10.A00 = r0
            X.0sn r7 = X.0sn.A00
            r4 = 0
            r9 = 0
            X.KhB r2 = X.C62520KhB.Uninitialized
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r3 = r2
            r6 = r4
            r8 = r4
            r1.<init>((X.C62520KhB) r2, (X.C62520KhB) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.String) r6, (java.util.List) r7, (java.util.List) r8, (boolean) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53378Gn8.<init>():void");
    }
}
