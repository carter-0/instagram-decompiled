package X;

import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* renamed from: X.3xI  reason: invalid class name and case insensitive filesystem */
public final class C257373xI extends 1Jp implements AnonymousClass3P4, C257383xJ {
    public final Rect A00;
    public final WeakReference A01;

    public C257373xI(Rect rect, 1Jm r8, String str, String str2, WeakReference weakReference, long j) {
        super(r8, str, str2, j);
        this.A00 = rect;
        this.A01 = weakReference;
    }

    public final String A00() {
        return "video on screen";
    }

    public final Rect B9X() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("video view ");
        sb.append(this.A01);
        sb.append(" on ");
        sb.append(this.A01);
        sb.append(" at ");
        sb.append(this.A00);
        sb.append(", global Rect: ");
        sb.append(this.A00);
        return sb.toString();
    }
}
