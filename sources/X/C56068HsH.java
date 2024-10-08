package X;

/* renamed from: X.HsH  reason: case insensitive filesystem */
public final class C56068HsH {
    public final float A00;
    public final AnonymousClass5b8 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56068HsH) {
                C56068HsH hsH = (C56068HsH) obj;
                if (Float.compare(this.A00, hsH.A00) != 0 || !0qQ.A0K(this.A01, hsH.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, G9w.A00(this.A00));
    }

    public C56068HsH(AnonymousClass5b8 r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Fade(alpha=");
        A1A.append(this.A00);
        A1A.append(", animationSpec=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
