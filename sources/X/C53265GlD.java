package X;

import java.util.List;

/* renamed from: X.GlD  reason: case insensitive filesystem */
public final class C53265GlD extends AnonymousClass0T0 {
    public final 1Xj A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53265GlD) {
                C53265GlD glD = (C53265GlD) obj;
                if (!0qQ.A0K(this.A01, glD.A01) || !0qQ.A0K(this.A02, glD.A02) || !0qQ.A0K(this.A00, glD.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C53265GlD(1Xj r1, String str, List list) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = r1;
    }
}
