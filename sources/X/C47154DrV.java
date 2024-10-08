package X;

import java.util.HashMap;

/* renamed from: X.DrV  reason: case insensitive filesystem */
public final class C47154DrV extends AnonymousClass0T0 {
    public final HashMap A00;
    public final boolean A01;
    public final 1Xj A02;
    public final Boolean A03;
    public final Boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47154DrV) {
                C47154DrV drV = (C47154DrV) obj;
                if (!0qQ.A0K(this.A00, drV.A00) || this.A01 != drV.A01 || !0qQ.A0K(this.A03, drV.A03) || !0qQ.A0K(this.A04, drV.A04) || !0qQ.A0K(this.A02, drV.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A01, AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C47154DrV(1Xj r1, Boolean bool, Boolean bool2, HashMap hashMap, boolean z) {
        this.A00 = hashMap;
        this.A01 = z;
        this.A03 = bool;
        this.A04 = bool2;
        this.A02 = r1;
    }
}
