package X;

import android.graphics.Bitmap;

public final class KK3 extends C62746Klk {
    public final Bitmap A00;
    public final Integer A01;
    public final Throwable A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KK3) {
                KK3 kk3 = (KK3) obj;
                if (!0qQ.A0K(this.A00, kk3.A00) || !0qQ.A0K(this.A01, kk3.A01) || !0qQ.A0K(this.A02, kk3.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public KK3(Bitmap bitmap, Integer num, Throwable th) {
        this.A00 = bitmap;
        this.A01 = num;
        this.A02 = th;
    }
}
