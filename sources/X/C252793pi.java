package X;

import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.3pi  reason: invalid class name and case insensitive filesystem */
public final class C252793pi extends 1Jp implements AnonymousClass3P4, C240623Lp {
    public final Rect A00;
    public final ImageUrl A01;
    public final WeakReference A02;

    public final String A00() {
        return "image on screen";
    }

    public final Rect B9X() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image View ");
        sb.append(this.A01.hashCode());
        sb.append(" on ");
        sb.append(this.A01);
        sb.append(" at ");
        sb.append(this.A00);
        sb.append(", global rect: ");
        sb.append(this.A00);
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C252793pi(android.graphics.Rect r7, com.instagram.common.typedurl.ImageUrl r8, X.1Jm r9, java.lang.String r10, java.lang.ref.WeakReference r11, long r12) {
        /*
            r6 = this;
            java.lang.String r2 = r8.getUrl()
            X.0qQ.A07(r2)
            r0 = r6
            r1 = r9
            r3 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4)
            r6.A01 = r8
            r6.A00 = r7
            r6.A02 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252793pi.<init>(android.graphics.Rect, com.instagram.common.typedurl.ImageUrl, X.1Jm, java.lang.String, java.lang.ref.WeakReference, long):void");
    }
}
