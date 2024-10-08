package X;

import java.util.HashMap;

/* renamed from: X.Dtt  reason: case insensitive filesystem */
public final class C47265Dtt extends AnonymousClass0T0 implements G5E {
    public final C21241XQm A00;
    public final String A01;
    public final HashMap A02;

    public C47265Dtt(C21241XQm xQm, String str, HashMap hashMap) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = xQm;
        this.A02 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47265Dtt) {
                C47265Dtt dtt = (C47265Dtt) obj;
                if (!0qQ.A0K(this.A01, dtt.A01) || this.A00 != dtt.A00 || !0qQ.A0K(this.A02, dtt.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
