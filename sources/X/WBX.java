package X;

import android.view.View;

public final class WBX implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public WBX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.addOnLayoutChangeListener(new WBX(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        ((com.instagram.discovery.mediamap.fragment.MediaMapFragment) r0).A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016c, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0173, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0188, code lost:
        r10.removeOnLayoutChangeListener(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x017f;
                case 2: goto L_0x00db;
                case 3: goto L_0x0162;
                case 4: goto L_0x0037;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00c2;
                case 7: goto L_0x009d;
                case 8: goto L_0x0026;
                case 9: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r9.A01
            X.TpO r0 = (X.C14074TpO) r0
            com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView r3 = r0.A04
            if (r3 == 0) goto L_0x0005
            X.TsA r0 = r0.A0E
            X.V3S r2 = r0.A0C
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r2.A01 = r0
            int r1 = r3.getHeight()
            int r0 = r3.getPaddingTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            r2.A00 = r0
            return
        L_0x0026:
            java.lang.Object r1 = r9.A01
            X.WPk r1 = (X.C19204WPk) r1
            android.widget.ImageView r10 = r1.A0G
            int r0 = r10.getHeight()
            if (r0 <= 0) goto L_0x0005
            X.C19204WPk.A02(r1)
            goto L_0x0188
        L_0x0037:
            java.lang.Object r0 = r9.A01
            X.UZT r0 = (X.UZT) r0
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r1 = r0.A08
            if (r1 == 0) goto L_0x0005
            X.X8y r0 = r0.A07
            goto L_0x0176
        L_0x0043:
            java.lang.Object r8 = r9.A01
            androidx.appcompat.widget.SearchView r8 = (androidx.appcompat.widget.SearchView) r8
            android.view.View r7 = r8.A0X
            int r0 = r7.getWidth()
            r2 = 1
            if (r0 <= r2) goto L_0x0005
            android.content.res.Resources r1 = X.DbU.A05(r8)
            android.view.View r0 = r8.A0Y
            int r6 = r0.getPaddingLeft()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            int r0 = r8.getLayoutDirection()
            boolean r4 = X.C13988Tno.A1W(r0, r2)
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x009b
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r0 = X.AnonymousClass7TE.A0D(r1)
            int r3 = r3 + r0
        L_0x0077:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r8.A0d
            android.graphics.drawable.Drawable r0 = r2.getDropDownBackground()
            r0.getPadding(r5)
            int r1 = r5.left
            int r0 = -r1
            if (r4 != 0) goto L_0x0088
            int r1 = r1 + r3
            int r0 = r6 - r1
        L_0x0088:
            r2.setDropDownHorizontalOffset(r0)
            int r1 = r7.getWidth()
            int r0 = r5.left
            int r1 = r1 + r0
            int r0 = r5.right
            int r1 = r1 + r0
            int r1 = r1 + r3
            int r1 = r1 - r6
            r2.setDropDownWidth(r1)
            return
        L_0x009b:
            r3 = 0
            goto L_0x0077
        L_0x009d:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r10.removeOnLayoutChangeListener(r9)
            int r13 = r13 - r11
            if (r13 != 0) goto L_0x00ac
            int r0 = r14 - r12
            if (r0 != 0) goto L_0x00ac
            return
        L_0x00ac:
            java.lang.Object r2 = r9.A01
            X.UZz r2 = (X.C15293UZz) r2
            int r14 = r14 - r12
            float r1 = (float) r14
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            X.AnonymousClass1GB.A01(r1)
            androidx.fragment.app.Fragment r0 = r2.requireParentFragment()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.discovery.mediamap.common.LocationSheetPresenter"
            X.0qQ.A0C(r0, r1)
            goto L_0x00d5
        L_0x00c2:
            int r13 = r13 - r11
            if (r13 != 0) goto L_0x00c9
            int r14 = r14 - r12
            if (r14 != 0) goto L_0x00c9
            return
        L_0x00c9:
            java.lang.Object r2 = r9.A01
            X.UZz r2 = (X.C15293UZz) r2
            r10.removeOnLayoutChangeListener(r9)
            androidx.fragment.app.Fragment r0 = r2.mParentFragment
            r0.getClass()
        L_0x00d5:
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r0
            r0.A0H(r2)
            return
        L_0x00db:
            java.lang.Object r0 = r9.A01
            X.WJj r0 = (X.WJj) r0
            X.WJj.A00(r0)
            return
        L_0x00e3:
            int r13 = r13 - r11
            if (r13 != 0) goto L_0x00ea
            int r14 = r14 - r12
            if (r14 != 0) goto L_0x00ea
            return
        L_0x00ea:
            r10.removeOnLayoutChangeListener(r9)
            r0 = 2131432375(0x7f0b13b7, float:1.8486506E38)
            android.view.View r2 = r10.findViewById(r0)
            java.lang.Object r4 = r9.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r4 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r4
            if (r2 == 0) goto L_0x015f
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x015d
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x015d
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x015d
            r0 = 2131428946(0x7f0b0652, float:1.847955E38)
            android.view.View r5 = r1.findViewById(r0)
        L_0x0113:
            r5.getClass()
            r7 = 0
            int r0 = r2.getBottom()
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>(r7, r0)
            android.view.ViewParent r2 = r2.getParent()
            r2.getClass()
            android.view.View r2 = (android.view.View) r2
            r0 = 2
            int[] r1 = new int[r0]
            int[] r3 = new int[r0]
            r2.getLocationOnScreen(r1)
            r5.getLocationOnScreen(r3)
            r2 = r1[r7]
            r0 = r3[r7]
            int r2 = r2 - r0
            int r0 = r6.x
            int r2 = r2 + r0
            r0 = 1
            r1 = r1[r0]
            r0 = r3[r0]
            int r1 = r1 - r0
            int r0 = r6.y
            int r1 = r1 + r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            int r0 = r0.y
            float r0 = (float) r0
            float r0 = X.JTP.A00(r0, r5)
        L_0x0151:
            r4.A00 = r0
            androidx.fragment.app.Fragment r0 = r4.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r0
            r0.A0H(r4)
            goto L_0x0188
        L_0x015d:
            r5 = 0
            goto L_0x0113
        L_0x015f:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0151
        L_0x0162:
            java.lang.Object r0 = r9.A01
            X.UZf r0 = (X.C15277UZf) r0
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r1 = r0.A0B
            if (r1 != 0) goto L_0x0174
            java.lang.String r0 = "ageRangeSeekBar"
        L_0x016c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0174:
            X.X8y r0 = r0.A0A
        L_0x0176:
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "delegate"
            goto L_0x016c
        L_0x017b:
            r1.A03(r0)
            return
        L_0x017f:
            java.lang.Object r0 = r9.A01
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = (com.google.android.material.bottomappbar.BottomAppBar$Behavior) r0
            java.lang.ref.WeakReference r0 = r0.A00
            r0.get()
        L_0x0188:
            r10.removeOnLayoutChangeListener(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBX.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
