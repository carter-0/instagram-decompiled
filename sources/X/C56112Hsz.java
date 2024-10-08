package X;

/* renamed from: X.Hsz  reason: case insensitive filesystem */
public final class C56112Hsz {
    public final C56111Hsy A00;
    public final C56111Hsy A01;
    public final 0sP A02;

    public C56112Hsz(C56111Hsy hsy, C56111Hsy hsy2, 0sP r4) {
        0qQ.A0B(r4, 3);
        this.A01 = hsy;
        this.A00 = hsy2;
        this.A02 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56112Hsz) {
                C56112Hsz hsz = (C56112Hsz) obj;
                if (!0qQ.A0K(this.A01, hsz.A01) || !0qQ.A0K(this.A00, hsz.A00) || !0qQ.A0K(this.A02, hsz.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAIRadioGroupOption(title=");
        A1A.append(this.A01);
        A1A.append(", subtitle=");
        A1A.append(this.A00);
        A1A.append(", onOptionClick=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
