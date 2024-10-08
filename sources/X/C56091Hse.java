package X;

/* renamed from: X.Hse  reason: case insensitive filesystem */
public final class C56091Hse {
    public final AnonymousClass2VW A00;
    public final String A01;

    public C56091Hse(AnonymousClass2VW r2, String str) {
        0qQ.A0B(str, 2);
        this.A00 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56091Hse) {
                C56091Hse hse = (C56091Hse) obj;
                if (!0qQ.A0K(this.A00, hse.A00) || !0qQ.A0K(this.A01, hse.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AnchorHandle(handle=");
        A1A.append(this.A00);
        A1A.append(", viewTag=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
