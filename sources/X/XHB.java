package X;

import java.util.List;

public final class XHB extends C21289XSu {
    public final List A00;
    public final String A01 = "SELECTED_SAM_INPUT_POINTS";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XHB) {
                XHB xhb = (XHB) obj;
                if (!0qQ.A0K(this.A01, xhb.A01) || !0qQ.A0K(this.A00, xhb.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public XHB(List list) {
        this.A00 = list;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputPointFs(type=");
        A1A.append(this.A01);
        A1A.append(", pointFs=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
