package X;

/* renamed from: X.Jje  reason: case insensitive filesystem */
public final class C60335Jje extends C62942Kou {
    public final LP3 A00;
    public final LP3 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60335Jje) {
                C60335Jje jje = (C60335Jje) obj;
                if (!0qQ.A0K(this.A01, jje.A01) || !0qQ.A0K(this.A00, jje.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        LP3 lp3 = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: ");
        A1A.append(this.A01);
        return 0rw.A0u(002.A0R(JTT.A0o(lp3, "\n                    ", A1A), "|)"), "|");
    }

    public C60335Jje(LP3 lp3, LP3 lp32) {
        this.A01 = lp3;
        this.A00 = lp32;
    }
}
