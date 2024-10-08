package X;

import android.view.View;

public final class UWC extends V4O {
    public final 04k A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r1 <= 0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UWC(android.view.View r7, X.04k r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.A00 = r8
            int r0 = r7.getSystemUiVisibility()
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            r6.A02 = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.A01(r7)
            X.5sV r0 = r0.A0K
            if (r0 == 0) goto L_0x0047
            X.5sd r0 = r0.A00
            android.content.res.ColorStateList r0 = r0.A0B
        L_0x001d:
            if (r0 == 0) goto L_0x0034
            int r0 = r0.getDefaultColor()
        L_0x0023:
            if (r0 == 0) goto L_0x0030
            double r4 = X.2eL.A00(r0)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r6.A01 = r0
            return
        L_0x0034:
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L_0x0023
        L_0x0047:
            android.content.res.ColorStateList r0 = r7.getBackgroundTintList()
            goto L_0x001d
        L_0x004c:
            r6.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWC.<init>(android.view.View, X.04k):void");
    }

    public static void A00(View view, UWC uwc) {
        int paddingLeft;
        int i;
        int top = view.getTop();
        04h r4 = uwc.A00.A00;
        if (top < r4.A03().A03) {
            boolean z = uwc.A01;
            int systemUiVisibility = view.getSystemUiVisibility();
            int i2 = systemUiVisibility & -8193;
            if (z) {
                i2 = systemUiVisibility | 8192;
            }
            view.setSystemUiVisibility(i2);
            paddingLeft = view.getPaddingLeft();
            i = r4.A03().A03 - view.getTop();
        } else if (view.getTop() != 0) {
            boolean z2 = uwc.A02;
            int systemUiVisibility2 = view.getSystemUiVisibility();
            int i3 = systemUiVisibility2 & -8193;
            if (z2) {
                i3 = systemUiVisibility2 | 8192;
            }
            view.setSystemUiVisibility(i3);
            paddingLeft = view.getPaddingLeft();
            i = 0;
        } else {
            return;
        }
        view.setPadding(paddingLeft, i, view.getPaddingRight(), view.getPaddingBottom());
    }
}
