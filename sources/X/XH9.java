package X;

public final class XH9 extends C21289XSu {
    public final Float A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XH9) {
                XH9 xh9 = (XH9) obj;
                if (!0qQ.A0K(this.A01, xh9.A01) || !0qQ.A0K(this.A00, xh9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AnonymousClass7TG.A0C(this.A00);
    }

    public XH9(String str, Float f) {
        this.A01 = str;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputFloatValue(type=");
        A1A.append(this.A01);
        A1A.append(", floatValue=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
