package X;

import java.util.List;

public final class XHA extends C21289XSu {
    public final List A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XHA) {
                XHA xha = (XHA) obj;
                if (!0qQ.A0K(this.A01, xha.A01) || !0qQ.A0K(this.A00, xha.A00)) {
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

    public XHA(String str, List list) {
        this.A01 = str;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputListPointFs(type=");
        A1A.append(this.A01);
        A1A.append(", listPointFs=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
