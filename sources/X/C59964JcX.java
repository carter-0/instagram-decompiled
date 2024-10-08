package X;

import java.util.List;

/* renamed from: X.JcX  reason: case insensitive filesystem */
public final class C59964JcX extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C59964JcX(Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        this.A00 = 2;
        this.A02 = num;
        this.A01 = num2;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    public static boolean A01(C59964JcX jcX, Integer num, Object obj, 05G r7) {
        return r7.AIY(obj, A00((Integer) jcX.A02, num, jcX.A03, jcX.A04, jcX.A05));
    }

    public final boolean equals(Object obj) {
        C59964JcX jcX;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C59964JcX)) {
                    return false;
                }
                jcX = (C59964JcX) obj;
                if (!(jcX.A00 == 0 && 0qQ.A0K(this.A01, jcX.A01) && this.A03 == jcX.A03 && this.A04 == jcX.A04 && 0qQ.A0K(this.A02, jcX.A02))) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C59964JcX)) {
                    return false;
                }
                C59964JcX jcX2 = (C59964JcX) obj;
                if (jcX2.A00 == 1 && this.A04 == jcX2.A04 && this.A05 == jcX2.A05 && this.A03 == jcX2.A03 && 0qQ.A0K(this.A01, jcX2.A01) && 0qQ.A0K(this.A02, jcX2.A02)) {
                    return true;
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C59964JcX)) {
                    return false;
                }
                jcX = (C59964JcX) obj;
                if (!(jcX.A00 == 2 && this.A02 == jcX.A02 && this.A01 == jcX.A01 && this.A03 == jcX.A03 && this.A04 == jcX.A04)) {
                    return false;
                }
        }
        if (this.A05 != jcX.A05) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        int hashCode;
        int A07;
        int hashCode2;
        switch (this.A00) {
            case 0:
                A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0K(this.A01)));
                hashCode = this.A02.hashCode();
                break;
            case 1:
                A07 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, C51965G9l.A05(this.A04))));
                hashCode2 = this.A02.hashCode();
                break;
            default:
                A09 = AnonymousClass7TF.A09(this.A03, ((C63204KtB.A00((Integer) this.A02) * 31) + C63204KtB.A00((Integer) this.A01)) * 31);
                hashCode = 1237;
                if (this.A04) {
                    hashCode = 1231;
                    break;
                }
                break;
        }
        A07 = (A09 + hashCode) * 31;
        hashCode2 = 1237;
        if (this.A05) {
            hashCode2 = 1231;
        }
        return A07 + hashCode2;
    }

    public static final C59964JcX A00(Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1N(num, num2);
        return new C59964JcX(num, num2, z, z2, z3);
    }

    public C59964JcX(C53299Gll gll, List list) {
        this.A00 = 0;
        this.A00 = 0;
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A03 = false;
        this.A04 = false;
        this.A02 = gll;
        this.A05 = false;
    }

    public C59964JcX(C66386MPs mPs, AnonymousClass62P r3, boolean z, boolean z2, boolean z3) {
        this.A00 = 1;
        0qQ.A0B(r3, 5);
        this.A04 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A01 = mPs;
        this.A02 = r3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59964JcX() {
        /*
            r7 = this;
            r0 = 2
            r1 = r7
            r7.A00 = r0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r4 = 0
            r3 = r2
            r5 = r4
            r6 = r4
            r1.<init>((java.lang.Integer) r2, (java.lang.Integer) r3, (boolean) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59964JcX.<init>():void");
    }
}
