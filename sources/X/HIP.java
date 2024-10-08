package X;

import android.graphics.Bitmap;

public final class HIP extends HQ4 {
    public final Bitmap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HIP) && 0qQ.A0K(this.A00, ((HIP) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public HIP(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PhotoBitmapReady(bitmap=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
