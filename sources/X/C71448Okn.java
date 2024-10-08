package X;

import android.view.ViewTreeObserver;

/* renamed from: X.Okn  reason: case insensitive filesystem */
public final class C71448Okn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71448Okn(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e8, code lost:
        if (r0 == null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010e, code lost:
        r0 = (android.view.ViewTreeObserver) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r0 = r0.getViewTreeObserver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r0.removeOnGlobalLayoutListener(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0184, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0112;
                case 2: goto L_0x003a;
                case 3: goto L_0x00fb;
                case 4: goto L_0x0105;
                case 5: goto L_0x0125;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A02
            X.PMU r1 = (X.PMU) r1
            java.lang.Object r0 = r10.A01
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            int r0 = r0.screenWidthDp
            X.PMU.A06(r1, r0)
            android.view.View r0 = X.PMU.A01(r1)
        L_0x0016:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L_0x001a:
            r0.removeOnGlobalLayoutListener(r10)
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r0 = r10.A01
            android.view.ViewTreeObserver r0 = (android.view.ViewTreeObserver) r0
            r0.removeOnGlobalLayoutListener(r10)
            java.lang.Object r3 = r10.A02
            com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager r3 = (com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager) r3
            int r2 = r3.A01
            r1 = -1
            if (r2 == r1) goto L_0x001d
            int r0 = r3.A00
            r3.A1p(r2, r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.A01 = r1
            r3.A00 = r0
            return
        L_0x003a:
            java.lang.Object r4 = r10.A02
            X.NJf r4 = (X.C68467NJf) r4
            com.instagram.common.ui.base.IgTextView r0 = r4.A0F
            java.lang.String r9 = "noteReplyContextText"
            if (r0 == 0) goto L_0x0184
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L_0x001d
            com.instagram.common.ui.base.IgTextView r0 = r4.A0F
            if (r0 == 0) goto L_0x0184
            java.lang.CharSequence r1 = r0.getText()
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Spannable"
            X.0qQ.A0C(r1, r0)
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r3 = X.C263324Kh.A06(r1, r0)
            android.text.style.ClickableSpan[] r3 = (android.text.style.ClickableSpan[]) r3
            int r0 = r3.length
            r8 = 1
            if (r0 <= r8) goto L_0x00e6
            r7 = 0
            r1 = r3[r7]
            com.instagram.common.ui.base.IgTextView r0 = r4.A0F
            if (r0 == 0) goto L_0x0184
            X.59G r2 = X.VG3.A00(r1, r0, r8)
            r1 = r3[r8]
            com.instagram.common.ui.base.IgTextView r0 = r4.A0F
            if (r0 == 0) goto L_0x0184
            X.59G r1 = X.VG3.A00(r1, r0, r8)
            java.lang.Object r0 = r1.A01
            int r6 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r2.A01
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r6 = r6 - r0
            java.lang.Object r0 = r1.A00
            int r5 = X.AnonymousClass7TE.A0M(r0)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r1 = r1.getDimensionPixelSize(r0)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            int r0 = X.AnonymousClass7TG.A02(r0)
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r5 = r5 - r1
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            java.lang.Object r1 = r10.A01
            X.NWf r1 = (X.C68770NWf) r1
            X.N3C r0 = r1.A07
            if (r0 == 0) goto L_0x00ec
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            r1 = 2131968614(0x7f134266, float:1.9574128E38)
        L_0x00bb:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r1)
            X.5Gt r2 = X.AnonymousClass7TG.A0f(r3, r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A0F
            if (r1 == 0) goto L_0x0184
            X.9UE r0 = new X.9UE
            r0.<init>(r1, r5, r6, r7)
            r2.A05(r0)
            r2.A02()
            r2.A0A = r8
            X.5Gv r0 = r2.A00()
            com.instagram.common.ui.base.IgTextView r3 = r4.A0F
            if (r3 == 0) goto L_0x0184
            X.PYs r2 = new X.PYs
            r2.<init>(r4, r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
        L_0x00e6:
            com.instagram.common.ui.base.IgTextView r0 = r4.A0F
            if (r0 != 0) goto L_0x0016
            goto L_0x0184
        L_0x00ec:
            com.instagram.api.schemas.NotePogVideoDict r0 = r1.A03
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            r1 = 2131968615(0x7f134267, float:1.957413E38)
            if (r0 == 0) goto L_0x00bb
            r1 = 2131968619(0x7f13426b, float:1.9574138E38)
            goto L_0x00bb
        L_0x00fb:
            java.lang.Object r0 = r10.A01
            X.OsD r0 = (X.C71870OsD) r0
            r0.A04()
            java.lang.Object r0 = r10.A02
            goto L_0x010e
        L_0x0105:
            java.lang.Object r0 = r10.A02
            X.OcD r0 = (X.C71091OcD) r0
            X.C71091OcD.A01(r0)
            java.lang.Object r0 = r10.A01
        L_0x010e:
            android.view.ViewTreeObserver r0 = (android.view.ViewTreeObserver) r0
            goto L_0x001a
        L_0x0112:
            java.lang.Object r3 = r10.A01
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r10.A02
            X.NJl r0 = (X.C68473NJl) r0
            X.PaQ r2 = new X.PaQ
            r2.<init>(r3, r10, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            return
        L_0x0125:
            java.lang.Object r3 = r10.A02
            X.PMU r3 = (X.PMU) r3
            X.0eM r1 = r3.A0t
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            int r0 = r0.getVisibility()
            r6 = 0
            if (r0 != 0) goto L_0x0180
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            int r5 = r0.getMeasuredHeight()
        L_0x013e:
            X.0eM r2 = r3.A0a
            android.view.View r0 = X.AnonymousClass7TH.A06(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x017d
            android.view.View r0 = X.AnonymousClass7TH.A06(r2)
            int r0 = r0.getMeasuredHeight()
        L_0x0152:
            X.O9o r4 = r3.A04
            if (r4 == 0) goto L_0x0182
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getPaddingTop()
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0170
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L_0x0170
            int r6 = r2.bottomMargin
        L_0x0170:
            X.Nen r1 = r4.A00
            X.Ocu r2 = r1.A0L
            X.PNa r1 = new X.PNa
            r1.<init>(r5, r0, r3, r6)
            r2.A05(r1)
            return
        L_0x017d:
            int r0 = r3.A01
            goto L_0x0152
        L_0x0180:
            r5 = 0
            goto L_0x013e
        L_0x0182:
            java.lang.String r9 = "layoutChangeListener"
        L_0x0184:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71448Okn.onGlobalLayout():void");
    }
}
