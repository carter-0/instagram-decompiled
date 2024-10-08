package X;

import android.graphics.Bitmap;

/* renamed from: X.HHs  reason: case insensitive filesystem */
public final class C54531HHs extends HQ1 {
    public final Bitmap A00;
    public final String A01;

    public C54531HHs(Bitmap bitmap, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54531HHs) {
                C54531HHs hHs = (C54531HHs) obj;
                if (!0qQ.A0K(this.A01, hHs.A01) || !0qQ.A0K(this.A00, hHs.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AddBitmapToCache(imageId=");
        A1A.append(this.A01);
        A1A.append(", bitmap=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
