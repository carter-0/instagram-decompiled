package X;

import java.util.List;

/* renamed from: X.Jtb  reason: case insensitive filesystem */
public final class C60917Jtb extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C60917Jtb(String str, List list, boolean z) {
        0qQ.A0B(list, 3);
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60917Jtb) {
                C60917Jtb jtb = (C60917Jtb) obj;
                if (!0qQ.A0K(this.A00, jtb.A00) || this.A02 != jtb.A02 || !0qQ.A0K(this.A01, jtb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TG.A0E(this.A00) * 31));
    }
}
