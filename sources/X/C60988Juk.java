package X;

/* renamed from: X.Juk  reason: case insensitive filesystem */
public final class C60988Juk extends AnonymousClass0T0 {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60988Juk) {
                C60988Juk juk = (C60988Juk) obj;
                if (!0qQ.A0K(this.A00, juk.A00) || !0qQ.A0K(this.A01, juk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C60988Juk(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(leftIconResId=");
        A1A.append(this.A00);
        A1A.append(", title=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
