package X;

/* renamed from: X.Anj  reason: case insensitive filesystem */
public final /* synthetic */ class C41061Anj implements Runnable {
    public final /* synthetic */ B25 A00;
    public final /* synthetic */ C353798Jc A01;

    public /* synthetic */ C41061Anj(B25 b25, C353798Jc r2) {
        this.A01 = r2;
        this.A00 = b25;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.0v6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r4.A05() != false) goto L_0x01b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            X.8Jc r10 = r12.A01
            X.B25 r9 = r12.A00
            X.86x r3 = r10.A0X
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0029
            X.AA8 r4 = X.C3509386y.A00(r3)
            boolean r0 = r4 instanceof X.C387499mJ
            if (r0 == 0) goto L_0x0178
            X.9mJ r4 = (X.C387499mJ) r4
            android.util.SparseArray r2 = r4.A02
            int r1 = r4.A00
            r0 = 0
            java.lang.Object r4 = r2.get(r1, r0)
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            if (r4 == 0) goto L_0x0029
            boolean r0 = r4.A05()
            if (r0 != 0) goto L_0x01b3
        L_0x0029:
            r2 = 0
        L_0x002a:
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0175
            X.AA8 r4 = X.C3509386y.A00(r3)
            boolean r0 = r4 instanceof X.C387499mJ
            if (r0 == 0) goto L_0x0138
            X.9mJ r4 = (X.C387499mJ) r4
            android.util.SparseArray r5 = r4.A02
            int r1 = r4.A00
            r0 = 0
            java.lang.Object r5 = r5.get(r1, r0)
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5
            if (r5 == 0) goto L_0x0175
            boolean r0 = r5.CeS()
            if (r0 == 0) goto L_0x0175
            android.content.Context r1 = r4.A05
            com.instagram.common.session.UserSession r0 = r4.A07
        L_0x0051:
            X.7zv r5 = X.C39906AIv.A05(r1, r5, r0)
        L_0x0055:
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0135
            X.AA8 r1 = X.C3509386y.A00(r3)
            boolean r0 = r1 instanceof X.C387529mM
            if (r0 == 0) goto L_0x0117
            X.9mM r1 = (X.C387529mM) r1
            android.graphics.Bitmap r3 = r1.A01
        L_0x0067:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r10.A0W
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r7 = r0.getWidth()
            int r6 = r0.getHeight()
            X.C353798Jc.A03(r10)
            java.lang.String r4 = "TextModeComposerController"
            if (r7 == 0) goto L_0x01ee
            if (r6 == 0) goto L_0x01ee
            X.AIY r1 = r10.A0B
            r1.getClass()
            X.8Bm r0 = r1.A01
            if (r0 != 0) goto L_0x010e
            java.lang.String r1 = "TextModeComposerGradientBackgroundController"
            java.lang.String r0 = "mTextColorSchemeList is null while trying to create background gradient colors for save background async, we are defaulting to a black background"
            X.0kD.A01(r1, r0)
            java.util.List r4 = X.0v6.A03
            r1 = 0
            r0 = 0
            X.0v6 r8 = new X.0v6
            r8.<init>()
            r8.A02 = r4
            r8.A00 = r0
            r8.A01 = r1
        L_0x009d:
            r4 = 0
            if (r2 != 0) goto L_0x01cb
            if (r5 != 0) goto L_0x01cb
            r1 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r3 == 0) goto L_0x0108
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r6, r0)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r7)
            X.AIY r0 = r10.A0B
            r0.getClass()
            android.view.View r5 = r0.A07
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x00de
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 == 0) goto L_0x00de
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            android.graphics.drawable.Drawable r2 = r0.mutate()
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r5.getAlpha()
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.setAlpha(r0)
            r2.draw(r4)
            r0 = 255(0xff, float:3.57E-43)
            r2.setAlpha(r0)
        L_0x00de:
            int r1 = r7.getWidth()
            int r0 = r3.getWidth()
            int r1 = r1 - r0
            int r0 = r1 / 2
            float r2 = (float) r0
            int r1 = r7.getHeight()
            int r0 = r3.getHeight()
            int r1 = r1 - r0
            int r0 = r1 / 2
            float r1 = (float) r0
            r0 = 0
            r4.drawBitmap(r3, r2, r1, r0)
            r11 = 0
        L_0x00fb:
            X.0nO r0 = X.0nY.A00()
            X.9lP r6 = new X.9lP
            r6.<init>(r7, r8, r9, r10, r11)
            r0.ATE(r6)
            return
        L_0x0108:
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            r11 = 1
            goto L_0x00fb
        L_0x010e:
            com.instagram.ui.text.TextColorScheme r0 = r1.A03()
            X.0v6 r8 = X.A1P.A00(r0)
            goto L_0x009d
        L_0x0117:
            boolean r0 = r1 instanceof X.C387549mO
            if (r0 == 0) goto L_0x0121
            X.9mO r1 = (X.C387549mO) r1
            android.graphics.Bitmap r3 = r1.A01
            goto L_0x0067
        L_0x0121:
            boolean r0 = r1 instanceof X.C387539mN
            if (r0 == 0) goto L_0x012b
            X.9mN r1 = (X.C387539mN) r1
            android.graphics.Bitmap r3 = r1.A00
            goto L_0x0067
        L_0x012b:
            boolean r0 = r1 instanceof X.C387519mL
            if (r0 == 0) goto L_0x0135
            X.9mL r1 = (X.C387519mL) r1
            android.graphics.Bitmap r3 = r1.A04
            goto L_0x0067
        L_0x0135:
            r3 = 0
            goto L_0x0067
        L_0x0138:
            boolean r0 = r4 instanceof X.C387509mK
            if (r0 == 0) goto L_0x0175
            X.9mK r4 = (X.C387509mK) r4
            boolean r0 = X.C387509mK.A02(r4)
            if (r0 == 0) goto L_0x0175
            X.1Xj r0 = r4.A05
            r0.getClass()
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x0175
            X.87H r1 = r4.A0A
            X.8vW r0 = r4.A03
            r1.A08(r0)
            X.8vQ r0 = r4.A04
            r1.A08(r0)
            java.util.HashMap r1 = r4.A0C
            X.1Xj r0 = r4.A05
            r0.getClass()
            java.lang.String r0 = r0.getId()
            java.lang.Object r5 = r1.get(r0)
            r5.getClass()
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5
            android.content.Context r1 = r4.A07
            com.instagram.common.session.UserSession r0 = r4.A08
            goto L_0x0051
        L_0x0175:
            r5 = 0
            goto L_0x0055
        L_0x0178:
            boolean r0 = r4 instanceof X.C387509mK
            if (r0 == 0) goto L_0x0029
            X.9mK r4 = (X.C387509mK) r4
            boolean r0 = X.C387509mK.A02(r4)
            if (r0 == 0) goto L_0x0029
            X.1Xj r0 = r4.A05
            r0.getClass()
            boolean r0 = r0.CeS()
            if (r0 != 0) goto L_0x0029
            X.87H r1 = r4.A0A
            X.8vW r0 = r4.A03
            r1.A08(r0)
            X.8vQ r0 = r4.A04
            r1.A08(r0)
            java.util.HashMap r1 = r4.A0C
            X.1Xj r0 = r4.A05
            r0.getClass()
            java.lang.String r0 = r0.getId()
            java.lang.Object r4 = r1.get(r0)
            r4.getClass()
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
        L_0x01b3:
            java.lang.String r1 = r4.A0X
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            android.graphics.BitmapFactory.decodeFile(r1, r2)
            int r1 = r2.outWidth
            int r0 = r2.outHeight
            X.8Cl r2 = new X.8Cl
            r2.<init>(r4, r1, r0)
            goto L_0x002a
        L_0x01cb:
            X.AIY r1 = r10.A0B
            r1.getClass()
            r0 = 1
            r1.A04 = r0
            r10.A0M = r4
            if (r2 == 0) goto L_0x01e1
            r2.A0I = r8
            X.ADn r0 = r10.A0J(r4, r0)
            r9.Cxh(r0, r2)
            return
        L_0x01e1:
            r5.getClass()
            r5.A0U = r8
            X.ADn r0 = r10.A0J(r4, r0)
            r9.Cxj(r0, r5)
            return
        L_0x01ee:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "mContainer width=%d height=%d"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2, r1)
            X.0kD.A01(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061Anj.run():void");
    }
}
