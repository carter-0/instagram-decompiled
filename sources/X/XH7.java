package X;

import android.graphics.Rect;

public final class XH7 extends C21288XSt {
    public final Rect A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XH7) && 0qQ.A0K(this.A00, ((XH7) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public XH7(Rect rect) {
        this.A00 = rect;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiInputRect(rect=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
