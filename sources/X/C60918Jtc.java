package X;

import java.util.List;

/* renamed from: X.Jtc  reason: case insensitive filesystem */
public final class C60918Jtc extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60918Jtc) {
                C60918Jtc jtc = (C60918Jtc) obj;
                if (this.A02 != jtc.A02 || !0qQ.A0K(this.A00, jtc.A00) || !0qQ.A0K(this.A01, jtc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C51965G9l.A05(this.A02) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C60918Jtc(String str, List list, boolean z) {
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }
}
