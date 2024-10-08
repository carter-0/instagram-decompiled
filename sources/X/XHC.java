package X;

import java.util.List;

public final class XHC extends C21289XSu {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XHC) {
                XHC xhc = (XHC) obj;
                if (!0qQ.A0K(this.A00, xhc.A00) || !0qQ.A0K(this.A01, xhc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public XHC(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputPoints(type=");
        A1A.append(this.A00);
        A1A.append(", points=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
