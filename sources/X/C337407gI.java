package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7gI  reason: invalid class name and case insensitive filesystem */
public abstract class C337407gI {
    public static final void A01(AnonymousClass3AS r4, C70832Wc r5, 2Wh r6, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C337387gG A00 = A00(r6);
        A00.setContentDescription((CharSequence) null);
        A00.A0S = z;
        A00.setClipToPadding(z2);
        r6.setClipToPadding(z2);
        A00.setPaddingRelative(i, i2, i3, 0);
        boolean z11 = z3;
        A00.setClipChildren(z11);
        r6.setClipChildren(z11);
        boolean z12 = z4;
        A00.setNestedScrollingEnabled(z12);
        r6.setNestedScrollingEnabled(z12);
        A00.setScrollBarStyle(0);
        A00.setHorizontalFadingEdgeEnabled(z5);
        A00.setVerticalFadingEdgeEnabled(z6);
        A00.A03 = z7;
        A00.A04 = z8;
        A00.A05 = z9;
        A00.A02 = z10;
        A00.setFadingEdgeLength(2Wd.A00(r5.Bnf(), Double.doubleToRawLongBits((double) i4)));
        A00.setId(i5);
        A00.setOverScrollMode(i6);
        r6.setColorSchemeColors(new int[]{i7});
        r6.setItemAnimator(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r10 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C331097Pn r4, X.C228432lf r5, X.C334327b5 r6, X.C337727go r7, X.2Wh r8, java.util.List r9, X.C62320sa r10, boolean r11) {
        /*
            r0 = 0
            X.7gG r2 = A00(r8)
            r8.A01 = r0
            r8.setContentDescription(r0)
            if (r11 == 0) goto L_0x000f
            r0 = 1
            if (r10 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8.setEnabled(r0)
            if (r10 == 0) goto L_0x001c
            X.AQ1 r0 = new X.AQ1
            r0.<init>(r10)
            r8.A0E = r0
        L_0x001c:
            if (r9 == 0) goto L_0x0031
            int r3 = r9.size()
            r1 = 0
        L_0x0023:
            if (r1 >= r3) goto L_0x0031
            java.lang.Object r0 = r9.get(r1)
            X.3jg r0 = (X.C249403jg) r0
            r2.A15(r0)
            int r1 = r1 + 1
            goto L_0x0023
        L_0x0031:
            if (r6 == 0) goto L_0x0035
            r2.A00 = r6
        L_0x0035:
            if (r4 == 0) goto L_0x003a
            r2.A13(r4)
        L_0x003a:
            X.2lg r0 = r2.A0E
            if (r0 != 0) goto L_0x0043
            if (r5 == 0) goto L_0x0043
            r5.A07(r2)
        L_0x0043:
            if (r7 == 0) goto L_0x0054
            r7.A01 = r8
            X.Hhg r0 = r7.A02
            if (r0 == 0) goto L_0x0052
            androidx.recyclerview.widget.RecyclerView r1 = r8.A04
            X.0sP r0 = r0.A00
            r0.invoke(r1)
        L_0x0052:
            r7.A00 = r5
        L_0x0054:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x005e
            r2.requestLayout()
            r0 = 0
            r8.A02 = r0
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337407gI.A02(X.7Pn, X.2lf, X.7b5, X.7go, X.2Wh, java.util.List, X.0sa, boolean):void");
    }

    public static final C337387gG A00(2Wh r1) {
        C337387gG r12;
        RecyclerView recyclerView = r1.A04;
        if ((recyclerView instanceof C337387gG) && (r12 = (C337387gG) recyclerView) != null) {
            return r12;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
    }

    public static final void A03(C228432lf r2, 2Wh r3) {
        A00(r3).setId(-1);
        if (r2 != null) {
            r2.A07((RecyclerView) null);
        }
        r3.A04.setItemAnimator(r3.A00);
        r3.A00 = null;
    }
}
