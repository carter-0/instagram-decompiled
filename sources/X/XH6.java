package X;

import java.util.List;

public final class XH6 extends C21288XSt {
    public final List A00;

    public XH6(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XH6) && 0qQ.A0K(this.A00, ((XH6) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiInputPointFs(listPointFs=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
