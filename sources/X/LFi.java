package X;

public final class LFi {
    public final int A00;
    public final C64124LOv A01;

    public LFi(C64124LOv lOv, int i) {
        0qQ.A0B(lOv, 2);
        this.A00 = i;
        this.A01 = lOv;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LFi) {
                LFi lFi = (LFi) obj;
                if (this.A00 != lFi.A00 || !0qQ.A0K(this.A01, lFi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GenerationalViewportHint(generationId=");
        A1A.append(this.A00);
        A1A.append(", hint=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
