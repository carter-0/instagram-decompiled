package X;

import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jvf  reason: case insensitive filesystem */
public final class C61041Jvf extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61041Jvf(String str, String str2, Date date, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2, boolean z3) {
        this((Object) null, (String) null, (String) null, 0, false, false, false);
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61041Jvf) {
                    C61041Jvf jvf = (C61041Jvf) obj;
                    if (jvf.A00 == 0 && 0qQ.A0K(this.A01, jvf.A01) && this.A05 == jvf.A05 && this.A04 == jvf.A04 && 0qQ.A0K(this.A03, jvf.A03) && 0qQ.A0K(this.A02, jvf.A02)) {
                        z = this.A06;
                        z2 = jvf.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61041Jvf)) {
                    return false;
                }
                C61041Jvf jvf2 = (C61041Jvf) obj;
                if (jvf2.A00 == 1 && this.A04 == jvf2.A04 && 0qQ.A0K(this.A02, jvf2.A02) && 0qQ.A0K(this.A03, jvf2.A03) && this.A06 == jvf2.A06 && this.A05 == jvf2.A05 && 0qQ.A0K(this.A01, jvf2.A01)) {
                    return true;
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61041Jvf) {
                    C61041Jvf jvf3 = (C61041Jvf) obj;
                    if (jvf3.A00 == 2 && this.A06 == jvf3.A06 && 0qQ.A0K(this.A03, jvf3.A03) && this.A04 == jvf3.A04 && 0qQ.A0K(this.A01, jvf3.A01) && 0qQ.A0K(this.A02, jvf3.A02)) {
                        z = this.A05;
                        z2 = jvf3.A05;
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
        int A0C;
        switch (this.A00) {
            case 0:
                A09 = (((AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TG.A0C(this.A01) * 31)) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02)) * 31;
                z = this.A06;
                break;
            case 1:
                A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, C51965G9l.A05(this.A04)))));
                A0C = AnonymousClass7TG.A0C(this.A01);
                break;
            default:
                A09 = (((AnonymousClass7TF.A09(this.A04, (C51965G9l.A05(this.A06) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31;
                z = this.A05;
                break;
        }
        A0C = 1237;
        if (z) {
            A0C = 1231;
        }
        return A09 + A0C;
    }

    public C61041Jvf(Object obj, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str;
        this.A02 = str2;
        this.A06 = z3;
    }

    public C61041Jvf(N62 n62, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A00 = 1;
        this.A04 = z;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z2;
        this.A05 = z3;
        this.A01 = n62;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61041Jvf() {
        this((N62) null, "", "", false, false, false);
        this.A00 = 1;
    }
}
