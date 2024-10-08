package X;

import java.util.List;

/* renamed from: X.BFd  reason: case insensitive filesystem */
public final class C42050BFd extends AnonymousClass0T0 implements C46244DRz {
    public final int A00;
    public final String A01;
    public final List A02;

    public final C42050BFd F6T(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42050BFd) {
                C42050BFd bFd = (C42050BFd) obj;
                if (!0qQ.A0K(this.A02, bFd.A02) || this.A00 != bFd.A00 || !0qQ.A0K(this.A01, bFd.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, (AnonymousClass7TE.A0K(this.A02) + this.A00) * 31);
    }

    public C42050BFd(List list, int i, String str) {
        AnonymousClass7TG.A1P(list, str);
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }

    public final C46244DRz E7h(1E9 r1) {
        return this;
    }
}
