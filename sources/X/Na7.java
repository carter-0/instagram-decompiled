package X;

public final class Na7 extends C69610Nos {
    public final AnonymousClass3OA A00;
    public final C67231sQ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Na7) {
                Na7 na7 = (Na7) obj;
                if (!0qQ.A0K(this.A00, na7.A00) || !0qQ.A0K(this.A01, na7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public Na7(C67231sQ r1, AnonymousClass3OA r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Clips(ad=");
        A1A.append(this.A00);
        A1A.append(", metadata=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
