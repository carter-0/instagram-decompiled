package X;

import android.net.Uri;

/* renamed from: X.Hsv  reason: case insensitive filesystem */
public final class C56108Hsv {
    public final Uri A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56108Hsv) {
                C56108Hsv hsv = (C56108Hsv) obj;
                if (!0qQ.A0K(this.A01, hsv.A01) || !0qQ.A0K(this.A02, hsv.A02) || !0qQ.A0K(this.A00, hsv.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31);
    }

    public C56108Hsv(Uri uri, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = uri;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PickedImage(imageId=");
        A1A.append(this.A01);
        A1A.append(", thumbnailPath=");
        A1A.append(this.A02);
        A1A.append(", originalUri=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
