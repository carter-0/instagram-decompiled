package X;

import android.graphics.Bitmap;

public final class XH4 extends C21288XSt {
    public final Bitmap A00;

    public XH4(Bitmap bitmap) {
        0qQ.A0B(bitmap, 1);
        this.A00 = bitmap;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XH4) && 0qQ.A0K(this.A00, ((XH4) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiInputBitmap(bitmap=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
