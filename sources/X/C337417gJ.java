package X;

import android.view.View;

/* renamed from: X.7gJ  reason: invalid class name and case insensitive filesystem */
public final class C337417gJ extends C249403jg {
    public C252553pI A00;
    public 2Wh A01;
    public int A02 = -1;
    public View A03;
    public final 2We A04;

    public C337417gJ(2We r2) {
        this.A04 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r1.A04.getScrollState() == 0) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010c A[EDGE_INSN: B:77:0x010c->B:60:0x010c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 1020375922(0x3cd1b372, float:0.025598262)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.2We r5 = r9.A04
            int r7 = r5.AVG()
            r3 = -1
            if (r7 != r3) goto L_0x0017
            r0 = 502022950(0x1dec4326, float:6.253811E-21)
        L_0x0013:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0017:
            r2 = r7
        L_0x0018:
            if (r2 < 0) goto L_0x0023
            boolean r0 = r5.A0k(r2)
            if (r0 != 0) goto L_0x0024
            int r2 = r2 + -1
            goto L_0x0018
        L_0x0023:
            r2 = -1
        L_0x0024:
            com.facebook.litho.ComponentTree r1 = r5.A0V(r7)
            android.view.View r8 = r9.A03
            r6 = 0
            if (r8 == 0) goto L_0x003a
            if (r1 == 0) goto L_0x003a
            com.facebook.litho.LithoView r0 = r1.A08
            if (r8 == r0) goto L_0x003a
            r0 = 0
            r8.setTranslationY(r0)
            r0 = 0
            r9.A03 = r0
        L_0x003a:
            if (r2 == r3) goto L_0x014c
            if (r1 == 0) goto L_0x014c
            if (r7 != r2) goto L_0x009b
            com.facebook.litho.LithoView r6 = r1.A08
            if (r6 != 0) goto L_0x0117
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "First visible sticky header item is null, RV.hasPendingAdapterUpdates: "
            r7.append(r0)
            X.2Wh r0 = r9.A01
            androidx.recyclerview.widget.RecyclerView r0 = r0.A04
            boolean r0 = r0.A1D()
            r7.append(r0)
            java.lang.String r0 = ", first visible component: "
            r7.append(r0)
            monitor-enter(r1)
            X.3mp r0 = r1.A03     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            java.lang.String r0 = r0.A0J()     // Catch:{ all -> 0x0166 }
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            monitor-exit(r1)
            r7.append(r0)
            java.lang.String r0 = ", hasMounted: "
            r7.append(r0)
            X.3XI r0 = r1.A0G()
            if (r0 != 0) goto L_0x0096
            r0 = 0
        L_0x007c:
            r7.append(r0)
            java.lang.String r0 = ", isReleased: "
            r7.append(r0)
            boolean r0 = r1.Cab()
            r7.append(r0)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "StickyHeaderControllerImpl:FirstVisibleStickyHeaderNull"
            X.2W6.A00(r0, r5, r1)
            goto L_0x0132
        L_0x0096:
            X.3XK r0 = r0.A06
            boolean r0 = r0.A00
            goto L_0x007c
        L_0x009b:
            X.2Wh r0 = r9.A01
            com.facebook.litho.LithoView r0 = r0.A05
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00c3
            int r0 = r9.A02
            if (r2 != r0) goto L_0x00c3
            boolean r0 = X.2Sa.initStickyHeaderInLayoutWhenComponentTreeIsNull
            if (r0 == 0) goto L_0x00e2
            X.2Wh r1 = r9.A01
            com.facebook.litho.LithoView r0 = r1.A05
            com.facebook.litho.ComponentTree r0 = r0.A00
            if (r0 != 0) goto L_0x00e2
            if (r11 != 0) goto L_0x00e2
            if (r12 != 0) goto L_0x00e2
            androidx.recyclerview.widget.RecyclerView r0 = r1.A04
            int r0 = r0.getScrollState()
            if (r0 != 0) goto L_0x00e2
        L_0x00c3:
            com.facebook.litho.ComponentTree r1 = r5.A0V(r2)
            X.2Wh r0 = r9.A01
            if (r0 == 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00d8
            boolean r0 = r1.Cab()
            if (r0 != 0) goto L_0x00d8
            X.2Wh r0 = r9.A01
            r0.setStickyComponent(r1)
        L_0x00d8:
            X.2Wh r1 = r9.A01
            com.facebook.litho.LithoView r0 = r1.A05
            r0.setVisibility(r6)
            X.2Wh.A00(r1)
        L_0x00e2:
            int r1 = r5.AVK()
        L_0x00e6:
            if (r7 > r1) goto L_0x010c
            boolean r0 = r5.A0k(r7)
            if (r0 == 0) goto L_0x0114
            X.3pI r0 = r9.A00
            android.view.View r0 = r0.A1D(r7)
            int r1 = r0.getTop()
            X.2Wh r0 = r9.A01
            com.facebook.litho.LithoView r0 = r0.A05
            int r0 = r0.getBottom()
            int r1 = r1 - r0
            X.2Wh r0 = r9.A01
            int r0 = r0.getPaddingTop()
            int r1 = r1 + r0
            int r6 = java.lang.Math.min(r1, r6)
        L_0x010c:
            X.2Wh r0 = r9.A01
            r0.setStickyHeaderVerticalOffset(r6)
            r9.A02 = r2
            goto L_0x0147
        L_0x0114:
            int r7 = r7 + 1
            goto L_0x00e6
        L_0x0117:
            int r1 = r2 + 1
            if (r1 < 0) goto L_0x0129
            java.util.List r0 = r5.A0i
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0129
            boolean r0 = r5.A0k(r1)
            if (r0 != 0) goto L_0x0132
        L_0x0129:
            int r0 = r6.getTop()
            int r0 = -r0
            float r0 = (float) r0
            r6.setTranslationY(r0)
        L_0x0132:
            r9.A03 = r6
            X.2Wh r0 = r9.A01
            com.facebook.litho.LithoView r1 = r0.A05
            r1.A0W()
            r0 = 8
            r1.setVisibility(r0)
            X.2Wh r0 = r9.A01
            r0.A0B(r2)
            r9.A02 = r3
        L_0x0147:
            r0 = -1047745907(0xffffffffc18caa8d, float:-17.583277)
            goto L_0x0013
        L_0x014c:
            X.2Wh r0 = r9.A01
            com.facebook.litho.LithoView r1 = r0.A05
            r1.A0W()
            r0 = 8
            r1.setVisibility(r0)
            X.2Wh r1 = r9.A01
            int r0 = r9.A02
            r1.A0B(r0)
            r9.A02 = r3
            r0 = -1868970633(0xffffffff9099c577, float:-6.06521E-29)
            goto L_0x0013
        L_0x0166:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337417gJ.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
