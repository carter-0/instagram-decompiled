package X;

import java.util.List;

/* renamed from: X.Jyr  reason: case insensitive filesystem */
public final class C61198Jyr extends AnonymousClass0T0 implements MQV {
    public final List A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61198Jyr) {
                C61198Jyr jyr = (C61198Jyr) obj;
                if (this.A01 != jyr.A01 || !0qQ.A0K(this.A00, jyr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, this.A01 * 31);
    }

    public C61198Jyr(int i, List list) {
        this.A01 = i;
        this.A00 = list;
    }
}
