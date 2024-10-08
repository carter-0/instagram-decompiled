package X;

import java.util.List;

/* renamed from: X.60J  reason: invalid class name */
public final class AnonymousClass60J extends AnonymousClass0T0 implements AnonymousClass60K {
    public final List A00;
    public final List A01;

    public AnonymousClass60J(List list, List list2) {
        0qQ.A0B(list, 1);
        0qQ.A0B(list2, 2);
        this.A00 = list;
        this.A01 = list2;
    }

    public final AnonymousClass60J F1s(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60J) {
                AnonymousClass60J r5 = (AnonymousClass60J) obj;
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
}
