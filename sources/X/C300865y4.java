package X;

import java.util.List;

/* renamed from: X.5y4  reason: invalid class name and case insensitive filesystem */
public final class C300865y4 extends AnonymousClass0T0 implements C300875y5 {
    public final C276104sZ A00;
    public final List A01;

    public C300865y4(C276104sZ r2, List list) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public final C300865y4 F6s(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C300865y4) {
                C300865y4 r5 = (C300865y4) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final C276114sa A00() {
        return this.A00;
    }
}
