package X;

import android.view.ViewTreeObserver;

public final class WC9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public WC9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ec, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f3, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0212, code lost:
        r0 = r2.getViewTreeObserver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0216, code lost:
        r0.removeOnGlobalLayoutListener(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0219, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x009c;
                case 2: goto L_0x00ba;
                case 3: goto L_0x0111;
                case 4: goto L_0x017b;
                case 5: goto L_0x0130;
                case 6: goto L_0x00d9;
                case 7: goto L_0x01d1;
                case 8: goto L_0x00f3;
                case 9: goto L_0x0133;
                case 10: goto L_0x01f4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r10 = r11.A01
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r10 = (com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment) r10
            X.VYP r0 = r10.A08
            android.view.ViewGroup r0 = r0.A00
            int r1 = r0.getHeight()
            if (r1 <= 0) goto L_0x005d
            android.view.View r0 = r10.requireView()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            X.0nA.A0w(r11, r0)
            r10.A00 = r1
            X.W1F r5 = r10.A07
            r4 = 2131165196(0x7f07000c, float:1.7944602E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "footer_gap_view_model_key"
            r1 = 0
            X.UO2 r0 = new X.UO2
            r0.<init>(r1, r3, r2, r4)
            r5.A00 = r0
            X.W1F.A02(r5)
            X.W1F r9 = r10.A07
            X.Uw5 r8 = r10.A0A
            X.VvF r7 = r10.A0E
            X.VWj r6 = r10.A0D
            com.instagram.model.shopping.productfeed.MultiProductComponent r5 = r10.A06
            java.lang.String r4 = r10.A0W
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r3 = r10.A05
            java.util.Set r2 = r10.A0a
            X.2tB r1 = r10.A0h
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r9.A05 = r7
            r9.A04 = r6
            r9.A03 = r5
            r9.A06 = r4
            r9.A02 = r3
            r9.A01 = r1
            r9.A07 = r2
            X.W1F.A02(r9)
        L_0x005d:
            return
        L_0x005e:
            java.lang.Object r2 = r11.A01
            X.U5w r2 = (X.C14734U5w) r2
            boolean r0 = r2.Cc6()
            if (r0 == 0) goto L_0x005d
            java.util.List r1 = r2.A0M
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x005d
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r1)
            X.VUG r0 = (X.VUG) r0
            X.U6W r0 = r0.A02
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x005d
            android.view.View r0 = r2.A06
            if (r0 == 0) goto L_0x0167
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0167
            java.util.Iterator r1 = r1.iterator()
        L_0x008a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r1.next()
            X.VUG r0 = (X.VUG) r0
            X.U6W r0 = r0.A02
            r0.show()
            goto L_0x008a
        L_0x009c:
            java.lang.Object r2 = r11.A01
            X.U5x r2 = (X.C14735U5x) r2
            boolean r0 = r2.Cc6()
            if (r0 == 0) goto L_0x005d
            X.U6W r1 = r2.A0G
            boolean r0 = r1.A0D
            if (r0 != 0) goto L_0x005d
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x016b
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x016b
            r1.show()
            return
        L_0x00ba:
            java.lang.Object r3 = r11.A01
            X.U5e r3 = (X.U5e) r3
            X.X9Y r2 = r3.A02
            boolean r0 = r2.Cc6()
            if (r0 != 0) goto L_0x00d1
            int r1 = r3.getTextDirection()
            int r0 = r3.getTextAlignment()
            r2.Etl(r1, r0)
        L_0x00d1:
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            if (r0 == 0) goto L_0x005d
            goto L_0x0216
        L_0x00d9:
            java.lang.Object r5 = r11.A01
            X.H1y r5 = (X.C54178H1y) r5
            androidx.recyclerview.widget.RecyclerView r0 = r5.getRecyclerView()
            X.C51967G9n.A0y(r0, r11)
            X.3K2 r4 = X.C13989Tnp.A0a(r5)
            if (r4 == 0) goto L_0x005d
            X.Feh r0 = r5.A01
            r3 = 0
            if (r0 != 0) goto L_0x016f
            java.lang.String r0 = "delegate"
            goto L_0x01ec
        L_0x00f3:
            java.lang.Object r3 = r11.A01
            X.UZu r3 = (X.C15289UZu) r3
            android.widget.EditText r0 = r3.A00
            X.C51967G9n.A0y(r0, r11)
            android.app.Activity r1 = r3.getRootActivity()
            java.lang.String r0 = "input_method"
            java.lang.Object r2 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            if (r2 == 0) goto L_0x005d
            android.widget.EditText r1 = r3.A00
            r0 = 0
            r2.showSoftInput(r1, r0)
            return
        L_0x0111:
            java.lang.Object r2 = r11.A01
            X.U6V r2 = (X.U6V) r2
            X.U5e r1 = r2.A04
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x012c
            android.graphics.Rect r0 = r2.A03
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 == 0) goto L_0x012c
            r2.A01()
            r2.show()
            return
        L_0x012c:
            r2.dismiss()
            return
        L_0x0130:
            android.os.Handler r0 = X.W1m.A0D
            return
        L_0x0133:
            java.lang.Object r5 = r11.A01
            X.VzN r5 = (X.C18742VzN) r5
            android.widget.LinearLayout r0 = r5.A04
            r0.getClass()
            X.C51967G9n.A0y(r0, r11)
            android.content.Context r4 = r5.A0I
            int r0 = X.C13989Tnp.A0A(r4)
            float r3 = (float) r0
            r1 = 2131100261(0x7f060265, float:1.7812898E38)
            r2 = 80
            X.8jL r0 = new X.8jL
            r0.<init>(r4, r3, r1, r2)
            r5.A07 = r0
            r1 = 2131100714(0x7f06042a, float:1.7813817E38)
            X.8jL r0 = new X.8jL
            r0.<init>(r4, r3, r1, r2)
            r5.A08 = r0
            android.widget.LinearLayout r1 = r5.A04
            r1.getClass()
            X.8jL r0 = r5.A07
            r1.setBackgroundDrawable(r0)
            return
        L_0x0167:
            r2.dismiss()
            return
        L_0x016b:
            r2.dismiss()
            return
        L_0x016f:
            android.graphics.RectF r2 = r0.A00
            r1 = 1
            X.WaW r0 = new X.WaW
            r0.<init>(r1)
            r4.A0W(r3, r2, r5, r0)
            return
        L_0x017b:
            java.lang.Object r2 = r11.A01
            X.U4e r2 = (X.C14720U4e) r2
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x01b6
            int r1 = r2.A02
            android.animation.Animator$AnimatorListener r4 = r2.A0G
            r2.clearAnimation()
            r0 = 1069547520(0x3fc00000, float:1.5)
            r2.setScaleX(r0)
            r2.setScaleY(r0)
            android.view.ViewPropertyAnimator r3 = r2.animate()
            long r0 = (long) r1
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r0)
            android.view.animation.Interpolator r0 = r2.A04
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            r0.setListener(r4)
        L_0x01b2:
            X.C14720U4e.A00(r2)
            goto L_0x0212
        L_0x01b6:
            java.lang.Integer r1 = r2.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r1 = r1.equals(r0)
            int r0 = r2.getHeight()
            if (r1 == 0) goto L_0x01c5
            int r0 = -r0
        L_0x01c5:
            float r0 = (float) r0
            r2.setTranslationY(r0)
            int r1 = r2.A02
            android.animation.Animator$AnimatorListener r0 = r2.A0G
            r2.A04(r0, r1)
            goto L_0x01b2
        L_0x01d1:
            java.lang.Object r4 = r11.A01
            X.Uh3 r4 = (X.C15697Uh3) r4
            r0 = 1
            r4.A0B = r0
            X.C15697Uh3.A00(r4)
            X.02m r3 = X.02m.A0p
            int r2 = r4.A0D
            r1 = 373302739(0x164025d3, float:1.5521572E-25)
            r0 = 2
            r3.markerEnd(r1, r2, r0)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A01
            if (r2 != 0) goto L_0x0212
            java.lang.String r0 = "recyclerView"
        L_0x01ec:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f4:
            java.lang.Object r3 = r11.A01
            X.VzN r3 = (X.C18742VzN) r3
            X.UZ1 r0 = r3.A0M
            android.widget.ScrollView r2 = r0.A02
            r2.getClass()
            android.widget.ScrollView r0 = r0.A02
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getBottom()
            r2.smoothScrollTo(r1, r0)
            android.widget.TextView r2 = r3.A06
            r2.getClass()
        L_0x0212:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
        L_0x0216:
            r0.removeOnGlobalLayoutListener(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WC9.onGlobalLayout():void");
    }
}
