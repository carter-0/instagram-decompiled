package X;

import android.view.View;

/* renamed from: X.LYi  reason: case insensitive filesystem */
public final class C64282LYi implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64282LYi(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (X.03t.A0P(r2, 0) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        return ((android.view.GestureDetector) r0).onTouchEvent(r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x012f;
                case 2: goto L_0x00ba;
                case 3: goto L_0x01b4;
                case 4: goto L_0x0064;
                case 5: goto L_0x0013;
                case 6: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
        L_0x0006:
            return r1
        L_0x0007:
            java.lang.Object r0 = r10.A02
            X.LGX r0 = (X.LGX) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r10.A01
            goto L_0x01c4
        L_0x0013:
            r6 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r6, r11, r12)
            java.lang.Object r3 = r10.A02
            X.LFb r3 = (X.C63955LFb) r3
            java.lang.Object r5 = r10.A01
            android.view.View r5 = (android.view.View) r5
            X.Lkh r0 = r3.A02
            if (r0 == 0) goto L_0x0027
            r0.CIj(r11, r12)
        L_0x0027:
            int r0 = r12.getActionMasked()
            r2 = 10
            if (r0 != 0) goto L_0x0041
            r3.A00 = r6
        L_0x0031:
            int r0 = r12.getActionMasked()
            if (r0 != r4) goto L_0x0005
            int r0 = r3.A00
            if (r0 >= r2) goto L_0x0005
            X.9Pn r0 = r3.A03
            r0.onClick(r11)
            goto L_0x0005
        L_0x0041:
            int r1 = r12.getActionMasked()
            r0 = 2
            if (r1 != r0) goto L_0x0059
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            if (r0 <= r2) goto L_0x0031
            r5.setVisibility(r6)
            X.9Pn r0 = r3.A03
            r0.CnC()
            goto L_0x0031
        L_0x0059:
            int r0 = r12.getActionMasked()
            if (r0 != r4) goto L_0x0031
            r0 = 4
            r5.setVisibility(r0)
            goto L_0x0031
        L_0x0064:
            java.lang.Object r0 = r10.A02
            com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment r0 = (com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.giphyClipsRecyclerView
            r7 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0005
            X.3pI r3 = r0.A0D
            boolean r0 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x00ab
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            if (r3 == 0) goto L_0x00ab
            int r0 = r3.A06
            int[] r2 = new int[r0]
            r1 = 0
        L_0x007d:
            int r0 = r3.A06
            if (r1 >= r0) goto L_0x00a5
            X.9ND[] r0 = r3.A0H
            r4 = r0[r1]
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r4.A05
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x009d
            java.util.ArrayList r0 = r4.A03
            int r5 = r0.size()
            int r5 = r5 - r7
            r6 = -1
        L_0x0093:
            r8 = r7
            int r0 = r4.A05(r5, r6, r7, r8, r9)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x007d
        L_0x009d:
            r5 = 0
            java.util.ArrayList r0 = r4.A03
            int r6 = r0.size()
            goto L_0x0093
        L_0x00a5:
            boolean r0 = X.03t.A0P(r2, r9)
            if (r0 != 0) goto L_0x0005
        L_0x00ab:
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x0005
            java.lang.Object r0 = r10.A01
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.requestDisallowInterceptTouchEvent(r7)
            goto L_0x0005
        L_0x00ba:
            java.lang.Object r2 = r10.A01
            X.Jal r2 = (X.C59867Jal) r2
            java.lang.Object r3 = r10.A02
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x0005
            float r1 = r12.getX()
            float r0 = r12.getY()
            int r1 = (int) r1
            int r0 = (int) r0
            boolean r1 = r3.contains(r1, r0)
            X.C59867Jal.A01(r2)
            X.Jat r0 = r2.A0e
            X.Jav r0 = r0.A06
            if (r1 == 0) goto L_0x00e7
            r0.A00()
        L_0x00e2:
            r2.A07()
            r1 = 1
            return r1
        L_0x00e7:
            X.Jaw r1 = r0.A01
            X.JYp r0 = r1.A01()
            if (r0 == 0) goto L_0x00e2
            X.JYp r1 = r1.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A04(r0)
            goto L_0x00e2
        L_0x00f9:
            int r1 = r12.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x0103
            r11.performClick()
        L_0x0103:
            java.lang.Object r0 = r10.A02
            X.KGn r0 = (X.C61663KGn) r0
            X.L3P r1 = r0.A01
            X.0qQ.A0A(r11)
            java.lang.Object r0 = r10.A01
            X.Li3 r0 = (X.C64787Li3) r0
            X.1Xj r5 = r0.A00
            r4 = 0
            X.0qQ.A0B(r11, r4)
            X.K6m r3 = r1.A01
            X.0eM r0 = r3.A0C
            X.WGU r2 = X.JTU.A0D(r0)
            X.UzE r1 = X.C16678UzE.MEDIA_PICKER
            java.lang.String r0 = "media_thumbnail_cell"
            r2.A0F(r1, r0)
            X.Uh1 r0 = r3.A06
            r1 = 0
            if (r0 == 0) goto L_0x0006
            boolean r1 = r0.Dsa(r12, r11, r5, r4)
            return r1
        L_0x012f:
            java.lang.Object r0 = r10.A02
            X.LE4 r0 = (X.LE4) r0
            X.LrN r5 = r0.A00
            if (r5 == 0) goto L_0x01af
            java.lang.Object r0 = r10.A01
            X.Li4 r0 = (X.C64788Li4) r0
            X.1Xj r4 = r0.A00
            X.0qQ.A0A(r11)
            X.0qQ.A0A(r12)
            r3 = 0
            X.AnonymousClass7TG.A1O(r11, r12)
            X.LdH r1 = r5.A01
            if (r1 != 0) goto L_0x0153
            X.JTO.A1K()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0153:
            java.lang.String r0 = r4.A30()
            if (r0 == 0) goto L_0x01aa
            com.instagram.common.session.UserSession r8 = r1.A05
            java.lang.String r7 = r1.A06
            X.0wc r1 = X.AnonymousClass0kN.A02(r8)
            r0 = 1724(0x6bc, float:2.416E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x01a3
            X.UGQ r6 = new X.UGQ
            r6.<init>()
            boolean r0 = X.JTU.A1R(r6, r8)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_business_user_access_token_enabled_and_cached"
            r6.A03(r0, r1)
            java.lang.String r1 = "media_thumbnail_cell"
            java.lang.String r0 = "component"
            r2.AAJ(r0, r1)
            X.DbS.A1N(r2, r7)
            java.lang.String r0 = "boost_posts"
            X.1Q9 r0 = X.1Q9.A01(r0)
            X.JTS.A18(r2, r0)
            java.lang.String r0 = "configurations"
            r2.AAK(r6, r0)
            java.lang.String r0 = "media_selection"
            X.DbS.A1H(r2, r0)
            r2.Cgf()
        L_0x01a3:
            X.2uG r0 = r5.A07
            boolean r1 = r0.Dsa(r12, r11, r4, r3)
            return r1
        L_0x01aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01b4:
            int r2 = r12.getAction()
            if (r2 == 0) goto L_0x01d1
            r0 = 1
            r1 = 8
            if (r2 == r0) goto L_0x01cb
            r0 = 3
            if (r2 == r0) goto L_0x01cb
        L_0x01c2:
            java.lang.Object r0 = r10.A02
        L_0x01c4:
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r1 = r0.onTouchEvent(r12)
            return r1
        L_0x01cb:
            java.lang.Object r0 = r10.A01
            X.JTO.A1a(r0, r1)
            goto L_0x01c2
        L_0x01d1:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64282LYi.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
