package X;

import java.util.List;

/* renamed from: X.7g6  reason: invalid class name and case insensitive filesystem */
public final class C337307g6 extends AnonymousClass0T0 implements C337317g7 {
    public final Integer A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C337307g6) {
                C337307g6 r5 = (C337307g6) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public C337307g6(Integer num, List list) {
        this.A00 = num;
        this.A01 = list;
    }

    public final C337317g7 E74(1E9 r1) {
        return this;
    }
}
