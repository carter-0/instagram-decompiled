package X;

import android.graphics.Rect;

public final class XHD extends C21289XSu {
    public final Rect A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XHD) {
                XHD xhd = (XHD) obj;
                if (!0qQ.A0K(this.A01, xhd.A01) || !0qQ.A0K(this.A00, xhd.A00)) {
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

    public XHD(Rect rect, String str) {
        this.A01 = str;
        this.A00 = rect;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputRect(type=");
        A1A.append(this.A01);
        A1A.append(AnonymousClass000.A00(2042));
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
