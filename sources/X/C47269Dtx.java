package X;

import java.util.HashMap;

/* renamed from: X.Dtx  reason: case insensitive filesystem */
public final class C47269Dtx extends AnonymousClass0T0 implements MR2 {
    public final G5E A00;
    public final HashMap A01;

    public C47269Dtx(G5E g5e, HashMap hashMap) {
        0qQ.A0B(g5e, 1);
        this.A00 = g5e;
        this.A01 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47269Dtx) {
                C47269Dtx dtx = (C47269Dtx) obj;
                if (!0qQ.A0K(this.A00, dtx.A00) || !0qQ.A0K(this.A01, dtx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }
}
