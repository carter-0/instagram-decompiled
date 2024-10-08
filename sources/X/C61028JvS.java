package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JvS  reason: case insensitive filesystem */
public final class C61028JvS extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C61028JvS(String str, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61028JvS) {
                    C61028JvS jvS = (C61028JvS) obj;
                    if (jvS.A00 == 0 && this.A04 == jvS.A04 && this.A02 == jvS.A02 && 0qQ.A0K(this.A01, jvS.A01)) {
                        z = this.A03;
                        z2 = jvS.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61028JvS)) {
                    return false;
                }
                C61028JvS jvS2 = (C61028JvS) obj;
                if (jvS2.A00 == 1 && this.A04 == jvS2.A04 && this.A02 == jvS2.A02 && this.A03 == jvS2.A03 && 0qQ.A0K(this.A01, jvS2.A01)) {
                    return true;
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61028JvS) {
                    C61028JvS jvS3 = (C61028JvS) obj;
                    if (jvS3.A00 == 2 && 0qQ.A0K(this.A01, jvS3.A01) && this.A03 == jvS3.A03 && this.A02 == jvS3.A02) {
                        z = this.A04;
                        z2 = jvS3.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        boolean z;
        int A0E;
        switch (this.A00) {
            case 0:
                A09 = (AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A04)) + AnonymousClass7TG.A0E(this.A01)) * 31;
                z = this.A03;
                break;
            case 1:
                A09 = AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A04)));
                A0E = AnonymousClass7TG.A0E(this.A01);
                break;
            default:
                A09 = AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TG.A0E(this.A01) * 31));
                z = this.A04;
                break;
        }
        A0E = 1237;
        if (z) {
            A0E = 1231;
        }
        return A09 + A0E;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61028JvS(String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2, boolean z3) {
        this((String) null, 1, false, false, false);
        this.A00 = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61028JvS() {
        this((String) null, 2, true, false, false);
        this.A00 = 2;
    }
}
