package X;

import java.util.List;

/* renamed from: X.JtZ  reason: case insensitive filesystem */
public final class C60915JtZ extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60915JtZ) {
                C60915JtZ jtZ = (C60915JtZ) obj;
                if (!0qQ.A0K(this.A00, jtZ.A00) || !0qQ.A0K(this.A01, jtZ.A01) || this.A02 != jtZ.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, ((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    public C60915JtZ(String str, List list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }
}
