package X;

/* renamed from: X.A9j  reason: case insensitive filesystem */
public final class C39789A9j {
    public AnonymousClass5QA A00 = null;
    public C3018260f A01 = null;
    public C3018060d A02 = null;
    public AnonymousClass5Q5 A03 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39789A9j) {
                C39789A9j a9j = (C39789A9j) obj;
                if (!0qQ.A0K(this.A01, a9j.A01) || !0qQ.A0K(this.A00, a9j.A00) || !0qQ.A0K(this.A03, a9j.A03) || !0qQ.A0K(this.A02, a9j.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BorderCache(imageBitmap=");
        A1A.append(this.A01);
        A1A.append(", canvas=");
        A1A.append(this.A00);
        A1A.append(", canvasDrawScope=");
        A1A.append(this.A03);
        A1A.append(", borderPath=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
