package X;

/* renamed from: X.3Ne  reason: invalid class name and case insensitive filesystem */
public abstract class C240923Ne {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C376699Iz r1, X.AnonymousClass0iw r2, com.instagram.common.ui.widget.imageview.CircularImageView r3) {
        /*
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r1.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            if (r0 == 0) goto L_0x0012
            r3.setUrl(r0, r2)
            return
        L_0x0012:
            java.lang.Object r0 = r1.A00
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r3.setImageDrawable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240923Ne.A01(X.9Iz, X.0iw, com.instagram.common.ui.widget.imageview.CircularImageView):void");
    }

    public static final 0eP A00(float f, boolean z, boolean z2) {
        int i;
        float f2 = f / 72.0f;
        if (!z && z2) {
            f2 *= 1.25f;
        }
        if (f2 < 0.6111111f) {
            i = 2;
        } else {
            i = 4;
            if (f2 < 0.7777778f) {
                i = 3;
            }
        }
        return new 0eP(Float.valueOf(f2), Integer.valueOf(i));
    }
}
