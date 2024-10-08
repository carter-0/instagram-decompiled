package X;

import android.graphics.Bitmap;

public final class KK2 extends C62746Klk {
    public final Bitmap A00;
    public final String A01;

    public KK2(Bitmap bitmap, String str) {
        0qQ.A0B(bitmap, 1);
        this.A00 = bitmap;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KK2) {
                KK2 kk2 = (KK2) obj;
                if (!0qQ.A0K(this.A00, kk2.A00) || !0qQ.A0K(this.A01, kk2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
