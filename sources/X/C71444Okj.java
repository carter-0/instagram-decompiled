package X;

import android.view.ViewTreeObserver;

/* renamed from: X.Okj  reason: case insensitive filesystem */
public final class C71444Okj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public C71444Okj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r6 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0147, code lost:
        r6.getViewTreeObserver().removeOnGlobalLayoutListener(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x0116;
                case 2: goto L_0x0078;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r14.A01
            X.Nh4 r8 = (X.C69204Nh4) r8
            com.google.android.material.tabs.TabLayout r5 = r8.A01
            X.C51967G9n.A0y(r5, r14)
            int r6 = r5.getWidth()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r5)
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.0nA.A00(r1, r0)
            int r7 = (int) r0
            java.util.List r4 = r8.A03
            r13 = 0
            r12 = 0
            java.util.Iterator r11 = r4.iterator()
            r10 = 0
        L_0x0026:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0095
            r11.next()
            int r9 = r10 + 1
            if (r10 >= 0) goto L_0x003b
            X.0sr.A1T()
        L_0x0036:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003b:
            android.view.ViewGroup r3 = X.C69204Nh4.A00(r8, r10)
            if (r3 == 0) goto L_0x0074
            int r1 = r3.getPaddingStart()
            int r1 = r1 + r7
            int r0 = r6 - r12
            r2 = 1
            if (r0 < 0) goto L_0x005a
            if (r0 > r1) goto L_0x005a
            if (r10 == 0) goto L_0x005a
            int r0 = r10 + -1
            android.view.ViewGroup r0 = X.C69204Nh4.A00(r8, r0)
            if (r0 == 0) goto L_0x005a
            r0.getPaddingEnd()
        L_0x005a:
            int r0 = r3.getWidth()
            int r12 = r12 + r0
            int r1 = r3.getWidth()
            if (r13 == 0) goto L_0x0076
            int r0 = r13.getWidth()
        L_0x0069:
            if (r1 > r0) goto L_0x006c
            r2 = 0
        L_0x006c:
            boolean r0 = X.C66581MXm.A1a(r2)
            if (r0 != 0) goto L_0x0073
            r3 = r13
        L_0x0073:
            r13 = r3
        L_0x0074:
            r10 = r9
            goto L_0x0026
        L_0x0076:
            r0 = 0
            goto L_0x0069
        L_0x0078:
            java.lang.Object r3 = r14.A01
            X.H0H r3 = (X.H0H) r3
            com.facebook.litho.LithoView r2 = r3.A00
            java.lang.String r1 = "lithoView"
            if (r2 == 0) goto L_0x0091
            X.3XA r0 = new X.3XA
            r0.<init>()
            r2.setComponent(r0)
            X.H0H.A00(r3)
            com.facebook.litho.LithoView r6 = r3.A00
            if (r6 != 0) goto L_0x0147
        L_0x0091:
            X.0qQ.A0F(r1)
            goto L_0x0036
        L_0x0095:
            if (r13 == 0) goto L_0x00d9
            int r1 = r13.getWidth()
        L_0x009b:
            int r0 = r4.size()
            int r1 = r1 * r0
            if (r6 <= r1) goto L_0x00db
            r7 = 1
            r5.setTabMode(r7)
            int r6 = r4.size()
            r4 = 0
        L_0x00ab:
            if (r4 >= r6) goto L_0x0111
            X.6zp r0 = r5.A07(r4)
            if (r0 == 0) goto L_0x00d6
            android.view.View r3 = r0.A03
            if (r3 == 0) goto L_0x00d6
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x00d6
            android.widget.TextView r3 = (android.widget.TextView) r3
            float r2 = r3.getTextSize()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            r1 = 1098383360(0x41780000, float:15.5)
            float r0 = X.0nA.A03(r0, r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00d3
            r0 = 2
            r3.setTextSize(r0, r1)
        L_0x00d3:
            r3.setSingleLine(r7)
        L_0x00d6:
            int r4 = r4 + 1
            goto L_0x00ab
        L_0x00d9:
            r1 = 0
            goto L_0x009b
        L_0x00db:
            r4 = 0
            r5.setTabMode(r4)
            android.view.View r3 = r5.getChildAt(r4)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0111
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r2 = r3.getChildCount()
            r1 = 0
        L_0x00ee:
            if (r1 >= r2) goto L_0x0111
            android.view.View r0 = r3.getChildAt(r1)
            r0.setMinimumWidth(r4)
            int r1 = r1 + 1
            goto L_0x00ee
        L_0x00fa:
            java.lang.Object r2 = r14.A01
            X.NJ8 r2 = (X.NJ8) r2
            X.NJ8.A0A(r2)
            X.7Pu r0 = r2.A08
            if (r0 == 0) goto L_0x0115
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r0.A03
            X.0eM r0 = r2.A0L
            int r0 = X.DbX.A07(r0)
            r1.A0S(r0)
            return
        L_0x0111:
            r0 = 0
            r5.setVisibility(r0)
        L_0x0115:
            return
        L_0x0116:
            java.lang.Object r5 = r14.A01
            X.OZT r5 = (X.OZT) r5
            android.widget.FrameLayout r6 = r5.A07
            r4 = 0
            X.5nL r0 = X.JTP.A0c(r6, r4)
            X.5nL r3 = r0.A0A()
            r3.A04 = r4
            int r0 = r6.getMeasuredWidth()
            float r0 = (float) r0
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.A0U(r2, r1, r0)
            int r0 = r6.getMeasuredHeight()
            float r0 = (float) r0
            r3.A0V(r2, r1, r0)
            r3.A0M(r2, r1)
            X.PQS r0 = new X.PQS
            r0.<init>(r5, r4)
            r3.A06 = r0
            r3.A0H()
        L_0x0147:
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71444Okj.onGlobalLayout():void");
    }
}
