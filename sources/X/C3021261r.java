package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.61r  reason: invalid class name and case insensitive filesystem */
public final class C3021261r {
    public int A00 = 0;
    public VXS A01;
    public final ImageView A02;

    public final void A00() {
        ImageView imageView = this.A02;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AnonymousClass3NX.A02(drawable);
            VXS vxs = this.A01;
            if (vxs != null) {
                2X8.A03(drawable, vxs, imageView.getDrawableState());
            }
        }
    }

    public final void A01(int i) {
        Drawable drawable;
        ImageView imageView = this.A02;
        if (i != 0) {
            drawable = 2X8.A02().A05(imageView.getContext(), i);
            if (drawable != null) {
                AnonymousClass3NX.A02(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[Catch:{ all -> 0x0057 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            android.widget.ImageView r7 = r11.A02
            android.content.Context r4 = r7.getContext()
            int[] r8 = X.AnonymousClass2Z3.A05
            r10 = 0
            r6 = r12
            r9 = r13
            X.2Yi r3 = X.2Yi.A00(r4, r12, r8, r13, r10)
            android.content.res.TypedArray r5 = r3.A02
            X.03v.A06(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.drawable.Drawable r0 = r7.getDrawable()     // Catch:{ all -> 0x0057 }
            r2 = -1
            if (r0 != 0) goto L_0x002f
            r0 = 1
            int r1 = r5.getResourceId(r0, r2)     // Catch:{ all -> 0x0057 }
            if (r1 == r2) goto L_0x0032
            X.2X8 r0 = X.2X8.A02()     // Catch:{ all -> 0x0057 }
            android.graphics.drawable.Drawable r0 = r0.A05(r4, r1)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0032
            r7.setImageDrawable(r0)     // Catch:{ all -> 0x0057 }
        L_0x002f:
            X.AnonymousClass3NX.A02(r0)     // Catch:{ all -> 0x0057 }
        L_0x0032:
            r1 = 2
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0040
            android.content.res.ColorStateList r0 = r3.A01(r1)     // Catch:{ all -> 0x0057 }
            r7.setImageTintList(r0)     // Catch:{ all -> 0x0057 }
        L_0x0040:
            r1 = 3
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0053
            int r1 = r5.getInt(r1, r2)     // Catch:{ all -> 0x0057 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass3NX.A00(r0, r1)     // Catch:{ all -> 0x0057 }
            r7.setImageTintMode(r0)     // Catch:{ all -> 0x0057 }
        L_0x0053:
            r5.recycle()
            return
        L_0x0057:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3021261r.A02(android.util.AttributeSet, int):void");
    }

    public C3021261r(ImageView imageView) {
        this.A02 = imageView;
    }
}
