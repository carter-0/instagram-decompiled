package X;

import java.util.List;

/* renamed from: X.JtS  reason: case insensitive filesystem */
public final class C60908JtS extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;

    public C60908JtS(String str, List list) {
        0qQ.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60908JtS) {
                C60908JtS jtS = (C60908JtS) obj;
                if (!0qQ.A0K(this.A00, jtS.A00) || !0qQ.A0K(this.A01, jtS.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }
}
