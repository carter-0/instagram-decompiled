package X;

import java.util.List;

/* renamed from: X.GlC  reason: case insensitive filesystem */
public final class C53264GlC extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53264GlC) {
                C53264GlC glC = (C53264GlC) obj;
                if (!0qQ.A0K(this.A00, glC.A00) || this.A02 != glC.A02 || !0qQ.A0K(this.A01, glC.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C53264GlC(String str, List list, boolean z) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }
}
