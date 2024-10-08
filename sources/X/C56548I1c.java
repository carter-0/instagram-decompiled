package X;

import java.util.List;

/* renamed from: X.I1c  reason: case insensitive filesystem */
public final class C56548I1c {
    public final int A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56548I1c) {
                C56548I1c i1c = (C56548I1c) obj;
                if (!0qQ.A0K(this.A01, i1c.A01) || this.A00 != i1c.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C56548I1c(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EditHistoryState(history=");
        A1A.append(this.A01);
        A1A.append(", currentIndex=");
        return C51975G9x.A0j(A1A, this.A00);
    }

    public C56548I1c() {
        this(AnonymousClass7TE.A1C(), -1);
    }
}
