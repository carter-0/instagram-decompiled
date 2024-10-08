package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.7De  reason: invalid class name and case insensitive filesystem */
public abstract class C328037De {
    public static final Drawable A00() {
        C328047Df r2 = new C328047Df((C242553Us) null, 127);
        new Object();
        return (Drawable) AnonymousClass762.A00(r2, true).A00;
    }

    public static final C328637Fo A01(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return C328637Fo.GROUP_WITH_BOTH;
            }
            return C328637Fo.GROUP_WITH_ABOVE;
        } else if (z2) {
            return C328637Fo.GROUP_WITH_BELOW;
        } else {
            return C328637Fo.NONE;
        }
    }
}
