package X;

import android.view.ViewTreeObserver;

/* renamed from: X.LYs  reason: case insensitive filesystem */
public final class C64292LYs implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64292LYs(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if (r5 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        X.C51967G9n.A0y(r5, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0061;
                case 1: goto L_0x00ca;
                case 2: goto L_0x0100;
                case 3: goto L_0x0128;
                case 4: goto L_0x0039;
                case 5: goto L_0x00a6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r8.A01
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r5 = r8.A02
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            if (r6 == 0) goto L_0x00bf
            android.content.res.Resources r0 = X.DbU.A05(r5)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 < r0) goto L_0x0032
            r4 = r6
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r0 = r5.getHeight()
            double r2 = (double) r0
            r0 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            double r2 = r2 * r0
            int r0 = (int) r2
            r4.topMargin = r0
        L_0x0032:
            r7.setLayoutParams(r6)
        L_0x0035:
            X.C51967G9n.A0y(r5, r8)
        L_0x0038:
            return
        L_0x0039:
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            X.C51967G9n.A0y(r0, r8)
            java.lang.Object r0 = r8.A02
            X.K5o r0 = (X.C61394K5o) r0
            X.JiX r1 = r0.A02
            if (r1 != 0) goto L_0x004c
            java.lang.String r0 = "viewModel"
            goto L_0x0147
        L_0x004c:
            boolean r0 = r1 instanceof X.C61821KNk
            if (r0 == 0) goto L_0x0038
            X.KNk r1 = (X.C61821KNk) r1
            X.K0b r0 = r1.A00
            if (r0 == 0) goto L_0x005b
            X.34p r0 = r0.A00
            r0.A05()
        L_0x005b:
            X.05G r0 = r1.A05
            X.JTR.A1V(r0)
            return
        L_0x0061:
            java.lang.Object r6 = r8.A02
            X.QhS r6 = (X.C8134QhS) r6
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A05
            if (r0 == 0) goto L_0x0145
            int r0 = r0.getMeasuredWidth()
            if (r0 == 0) goto L_0x0038
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A05
            if (r0 == 0) goto L_0x0145
            int r0 = r0.getMeasuredHeight()
            if (r0 == 0) goto L_0x0038
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r6.A01
            r1 = 1
            if (r0 == 0) goto L_0x00a3
            boolean r0 = X.C11432SUd.A0N(r0)
            if (r0 != r1) goto L_0x00a3
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
        L_0x0086:
            java.lang.Object r0 = r8.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            X.QAL r0 = (X.QAL) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r0.A06()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A05
            if (r0 == 0) goto L_0x0145
            int r0 = r0.getMeasuredHeight()
            double r1 = (double) r0
            double r1 = r1 * r4
            int r0 = (int) r1
            r3.A0V(r0)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r6.A05
            if (r5 == 0) goto L_0x0145
            goto L_0x0035
        L_0x00a3:
            r4 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            goto L_0x0086
        L_0x00a6:
            java.lang.Object r5 = r8.A02
            android.view.View r5 = (android.view.View) r5
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0038
            java.lang.Object r0 = r8.A01
            X.K9r r0 = (X.C61486K9r) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A00
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x0035
        L_0x00bf:
            r0 = 49
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x00ca:
            java.lang.Object r1 = r8.A02
            X.JXi r1 = (X.C59767JXi) r1
            X.2Nn r0 = r1.A0f
            if (r0 != 0) goto L_0x00db
            java.lang.String r2 = "ClipsReviewController"
            java.lang.String r1 = "clipsDirectoryProvider is null"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            return
        L_0x00db:
            android.view.ViewGroup r0 = r1.A0N
            X.C51967G9n.A0y(r0, r8)
            X.8A5 r2 = r1.A0Y
            java.lang.Object r0 = r8.A01
            X.51M r0 = (X.AnonymousClass51M) r0
            java.lang.String r5 = r0.A0E()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r1.A0R
            int r6 = r0.getWidth()
            int r7 = r0.getHeight()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r0 = 1
            X.Lmm r4 = new X.Lmm
            r4.<init>(r1, r0)
            r2.A03(r3, r4, r5, r6, r7)
            return
        L_0x0100:
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            X.C51967G9n.A0y(r0, r8)
            java.lang.Object r1 = r8.A02
            com.instagram.creation.fragment.AlbumEditFragment r1 = (com.instagram.creation.fragment.AlbumEditFragment) r1
            X.0eM r0 = r1.A0f
            java.lang.Object r0 = r0.getValue()
            X.JjS r0 = (X.C60323JjS) r0
            X.KJf r0 = r0.A01
            if (r0 == 0) goto L_0x0126
            X.L7l r0 = r0.A00
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x011f:
            com.instagram.creation.fragment.AlbumEditFragment.A0D(r1, r0)
            r0 = 0
            r1.A0T = r0
            return
        L_0x0126:
            r0 = 0
            goto L_0x011f
        L_0x0128:
            java.lang.Object r1 = r8.A02
            X.Lkf r1 = (X.C64940Lkf) r1
            java.lang.Float r0 = X.C51967G9n.A0h()
            r1.A0I = r0
            X.2cs r0 = r1.A0D
            if (r0 == 0) goto L_0x0139
            r0.A02()
        L_0x0139:
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeGlobalOnLayoutListener(r8)
            return
        L_0x0145:
            java.lang.String r0 = "viewContainer"
        L_0x0147:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64292LYs.onGlobalLayout():void");
    }
}
