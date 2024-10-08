package X;

import java.util.List;

public final class XH5 extends C21288XSt {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XH5) && 0qQ.A0K(this.A00, ((XH5) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public XH5(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiInputListPointFs(listPointFs=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
