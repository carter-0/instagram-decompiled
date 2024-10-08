package X;

import java.util.List;

/* renamed from: X.JtU  reason: case insensitive filesystem */
public final class C60910JtU extends AnonymousClass0T0 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60910JtU) {
                C60910JtU jtU = (C60910JtU) obj;
                if (!0qQ.A0K(this.A00, jtU.A00) || !0qQ.A0K(this.A01, jtU.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C60910JtU(List list, List list2) {
        AnonymousClass7TG.A1O(list, list2);
        this.A00 = list;
        this.A01 = list2;
    }
}
