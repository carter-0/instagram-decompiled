package X;

/* renamed from: X.HsL  reason: case insensitive filesystem */
public final class C56072HsL {
    public final C286025Tq A00;
    public final JS3 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56072HsL) {
                C56072HsL hsL = (C56072HsL) obj;
                if (!0qQ.A0K(this.A00, hsL.A00) || !0qQ.A0K(this.A01, hsL.A01)) {
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

    public C56072HsL(C286025Tq r1, JS3 js3) {
        this.A00 = r1;
        this.A01 = js3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TransformedText(text=");
        A1A.append(this.A00);
        A1A.append(", offsetMapping=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
