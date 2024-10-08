package X;

import java.util.List;

/* renamed from: X.DrN  reason: case insensitive filesystem */
public final class C47146DrN extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C47146DrN(String str, List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = str;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47146DrN) {
                C47146DrN drN = (C47146DrN) obj;
                if (!0qQ.A0K(this.A01, drN.A01) || !0qQ.A0K(this.A00, drN.A00) || this.A02 != drN.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A00)) * 31);
    }
}
