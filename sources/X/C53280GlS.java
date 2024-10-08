package X;

import java.util.List;

/* renamed from: X.GlS  reason: case insensitive filesystem */
public final class C53280GlS extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C53280GlS(String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(list, 6);
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53280GlS) {
                C53280GlS glS = (C53280GlS) obj;
                if (!0qQ.A0K(this.A02, glS.A02) || !0qQ.A0K(this.A00, glS.A00) || !0qQ.A0K(this.A03, glS.A03) || !0qQ.A0K(this.A01, glS.A01) || !0qQ.A0K(this.A04, glS.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, (((((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31 * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) * 31 * 31 * 31;
    }
}
