package X;

import android.view.ViewTreeObserver;

/* renamed from: X.3Lt  reason: invalid class name and case insensitive filesystem */
public final class C240663Lt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass3E5 A00;

    public C240663Lt(AnonymousClass3E5 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if ((r0.getAttributes().flags & 1024) != 0) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r7 = this;
            X.3E5 r1 = r7.A00
            android.view.View r6 = r1.A05
            if (r6 == 0) goto L_0x00e8
            r3 = 2
            int[] r2 = new int[r3]
            r6.getLocationOnScreen(r2)
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x00f0
            int r4 = r6.getHeight()
            int r0 = r1.A00
            int r4 = r4 - r0
        L_0x0017:
            android.view.View r5 = r1.A06
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0025
            X.C61290mR.A04(r5)
            r0 = 0
            r1.A0A = r0
        L_0x0025:
            android.content.Context r5 = r6.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r5, r0)
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x005c
            boolean r0 = X.C61290mR.A07()
            if (r0 == 0) goto L_0x005c
            android.view.Window r0 = r5.getWindow()
            X.0qQ.A07(r0)
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.layoutInDisplayCutoutMode
            if (r0 == r3) goto L_0x00e9
            android.view.Window r0 = r5.getWindow()
            X.0qQ.A07(r0)
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00e9
        L_0x005c:
            r0 = 1
            r2 = r2[r0]
            int r2 = r2 + r4
            int r6 = r1.A03
            r5 = 0
            r0 = -1
            if (r6 != r0) goto L_0x0106
            r1.A03 = r2
            r1.A01 = r2
            r1.A02 = r4
            android.view.View r4 = r1.A06
            if (r4 == 0) goto L_0x00e8
            java.util.Set r0 = r1.A0G
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e8
            android.content.Context r0 = r4.getContext()
            X.0qQ.A07(r0)
            int r4 = X.0nA.A08(r0)
            boolean r0 = X.0lz.A02(r0)
            if (r0 == 0) goto L_0x008e
            int r0 = X.AnonymousClass2uJ.A01
            int r4 = r4 - r0
        L_0x008e:
            int r4 = r4 - r2
            r0 = r4
            if (r4 >= r5) goto L_0x0093
            r0 = 0
        L_0x0093:
            X.AnonymousClass3E5.A03(r1, r0)
            if (r4 >= 0) goto L_0x00e8
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r0 = "generic"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r0 = "sdk_phone"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "sdk_gphone"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "sdk_google_phone"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Genymotion"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00e8
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            X.1Rm r0 = X.1Rm.A00()
            java.lang.String r0 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "Attempt to pass in negative keyboard height of %d px to onKeyboardHeightChange() for navigation surface %s."
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            X.0qQ.A07(r1)
            java.lang.String r0 = "KeyboardHeightChangeDetectorImpl"
            X.0wb.A03(r0, r1)
        L_0x00e8:
            return
        L_0x00e9:
            int r0 = X.C61290mR.A01()
            int r4 = r4 - r0
            goto L_0x005c
        L_0x00f0:
            android.content.Context r0 = r6.getContext()
            X.0qQ.A07(r0)
            boolean r0 = X.0lz.A02(r0)
            int r4 = r6.getHeight()
            if (r0 == 0) goto L_0x0017
            int r0 = X.AnonymousClass2uJ.A01
            int r4 = r4 + r0
            goto L_0x0017
        L_0x0106:
            int r0 = r1.A01
            if (r0 == r2) goto L_0x0124
            int r0 = r1.A02
            if (r0 == r4) goto L_0x0124
            if (r6 >= r2) goto L_0x0113
            r1.A03 = r2
            r6 = r2
        L_0x0113:
            int r6 = r6 - r2
            if (r6 >= r5) goto L_0x0117
            r6 = 0
        L_0x0117:
            java.util.Set r0 = r1.A0G
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0124
            X.AnonymousClass3E5.A03(r1, r6)
        L_0x0124:
            r1.A01 = r2
            r1.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240663Lt.onGlobalLayout():void");
    }
}
