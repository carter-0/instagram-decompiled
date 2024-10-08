package X;

import android.graphics.Bitmap;

public final class XH8 extends C21289XSu {
    public final Bitmap A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XH8) {
                XH8 xh8 = (XH8) obj;
                if (!0qQ.A0K(this.A01, xh8.A01) || !0qQ.A0K(this.A00, xh8.A00)) {
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

    public XH8(Bitmap bitmap, String str) {
        this.A01 = str;
        this.A00 = bitmap;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputBitmap(type=");
        A1A.append(this.A01);
        A1A.append(AnonymousClass000.A00(2002));
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
