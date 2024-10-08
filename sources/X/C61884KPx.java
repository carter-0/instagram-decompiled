package X;

import java.util.List;

/* renamed from: X.KPx  reason: case insensitive filesystem */
public final class C61884KPx extends C62791KmT {
    public final String A00;
    public final List A01;

    public C61884KPx(String str, List list) {
        0qQ.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61884KPx) {
                C61884KPx kPx = (C61884KPx) obj;
                if (!0qQ.A0K(this.A00, kPx.A00) || !0qQ.A0K(this.A01, kPx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }
}
