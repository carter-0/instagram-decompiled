package X;

import java.util.List;

/* renamed from: X.Jve  reason: case insensitive filesystem */
public final class C61040Jve extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C61040Jve(boolean z) {
        this("", 0sn.A00, 0, false, false, false, z);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61040Jve)) {
                return false;
            }
            C61040Jve jve = (C61040Jve) obj;
            if (jve.A00 == 1 && 0qQ.A0K(this.A01, jve.A01) && 0qQ.A0K(this.A02, jve.A02) && this.A04 == jve.A04 && this.A05 == jve.A05 && this.A03 == jve.A03 && this.A06 == jve.A06) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61040Jve)) {
                return false;
            }
            C61040Jve jve2 = (C61040Jve) obj;
            if (jve2.A00 == 0 && this.A03 == jve2.A03 && this.A04 == jve2.A04 && this.A05 == jve2.A05 && 0qQ.A0K(this.A01, jve2.A01) && this.A06 == jve2.A06 && 0qQ.A0K(this.A02, jve2.A02)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A09;
        int hashCode;
        if (this.A00 != 0) {
            A09 = AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31)));
            hashCode = 1237;
            if (this.A06) {
                hashCode = 1231;
            }
        } else {
            A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A03)))));
            hashCode = this.A02.hashCode();
        }
        return A09 + hashCode;
    }

    public C61040Jve(String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A01 = list;
        this.A06 = z4;
        this.A02 = str;
    }

    public C61040Jve(String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = list;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A06 = z4;
    }

    public C61040Jve() {
        this((String) null, 0sn.A00, false, false, false, false);
    }
}
