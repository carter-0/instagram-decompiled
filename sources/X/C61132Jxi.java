package X;

import java.util.List;

/* renamed from: X.Jxi  reason: case insensitive filesystem */
public final class C61132Jxi extends AnonymousClass0T0 implements C66381MPn {
    public final C61081JwJ A00;
    public final Integer A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public C61132Jxi(C61081JwJ jwJ, Integer num, List list, boolean z, boolean z2) {
        DbW.A1N(list, 1, num);
        this.A02 = list;
        this.A04 = z;
        this.A00 = jwJ;
        this.A03 = z2;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61132Jxi) {
                C61132Jxi jxi = (C61132Jxi) obj;
                if (!(0qQ.A0K(this.A02, jxi.A02) && this.A04 == jxi.A04 && 0qQ.A0K(this.A00, jxi.A00) && this.A03 == jxi.A03 && this.A01 == jxi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A02);
        return AnonymousClass7TF.A09(this.A03, (AnonymousClass7TF.A09(this.A04, A0K) + AnonymousClass7TG.A0C(this.A00)) * 31) + C63043KqY.A00(this.A01);
    }
}
