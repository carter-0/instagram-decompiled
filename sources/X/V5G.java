package X;

public abstract class V5G {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r0 == 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ad, code lost:
        if ((r1 + r0) >= r8) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0134 A[EDGE_INSN: B:115:0x0134->B:83:0x0134 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A00(X.C307896Rx r14, X.AnonymousClass6Tm r15) {
        /*
            r0 = 1
            java.lang.Object r3 = r15.A01()
            X.4tV r3 = (X.C276544tV) r3
            java.util.List r2 = r15.A00
            java.lang.String r1 = X.DbU.A0t(r2, r0)
            r0 = 2
            java.lang.String r9 = X.DbU.A0t(r2, r0)
            if (r9 != 0) goto L_0x0016
            java.lang.String r9 = "start"
        L_0x0016:
            X.6Rm r0 = r14.A03
            if (r0 == 0) goto L_0x01d2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.Object r7 = X.C307476Qg.A06(r0, r3)
            X.Ty7 r7 = (X.Ty7) r7
            if (r7 == 0) goto L_0x01d1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.Ty5 r0 = r7.A02
            androidx.recyclerview.widget.RecyclerView r3 = r0.A07
            if (r3 == 0) goto L_0x01d1
            X.3pI r6 = r3.A0D
            if (r6 == 0) goto L_0x01d1
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r14 = 0
            if (r0 == 0) goto L_0x0129
            r0 = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A01
        L_0x0040:
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r14 = 1
        L_0x0043:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A07
            int r0 = r0.getLayoutDirection()
            boolean r13 = X.AnonymousClass7TF.A1Q(r0)
            if (r1 != 0) goto L_0x00e6
            r8 = 0
        L_0x0050:
            boolean r1 = r6 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r1 != 0) goto L_0x00e3
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00e3
            r0 = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r4 = r0.A1a()
        L_0x005f:
            if (r1 != 0) goto L_0x00e1
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00e1
            r0 = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r5 = r0.A1b()
        L_0x006c:
            r3 = r5
            r0 = -1
            if (r4 == r0) goto L_0x01d1
            if (r5 == r0) goto L_0x01d1
            java.lang.String r0 = "end"
            boolean r12 = r9.equals(r0)
            if (r12 != 0) goto L_0x007b
            r5 = r4
        L_0x007b:
            android.view.View r11 = r6.A1D(r5)
            android.view.ViewGroup$MarginLayoutParams r9 = X.Ty7.A09
            r15 = r9
        L_0x0082:
            if (r11 == 0) goto L_0x0134
            if (r5 < r4) goto L_0x0134
            if (r5 > r3) goto L_0x0134
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00df
            android.view.ViewGroup$MarginLayoutParams r9 = X.DbS.A0D(r11)
        L_0x0094:
            r10 = 1
            if (r14 == 0) goto L_0x00cd
            if (r13 == 0) goto L_0x00bd
            int r1 = r11.getLeft()
            int r0 = r9.getMarginStart()
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x00dd
            int r1 = r11.getRight()
        L_0x00a8:
            int r0 = r9.getMarginEnd()
        L_0x00ac:
            int r1 = r1 + r0
            if (r1 < r8) goto L_0x00dd
        L_0x00af:
            if (r10 != 0) goto L_0x0134
            if (r12 == 0) goto L_0x00ba
            int r5 = r5 + -1
        L_0x00b5:
            android.view.View r11 = r6.A1D(r5)
            goto L_0x0082
        L_0x00ba:
            int r5 = r5 + 1
            goto L_0x00b5
        L_0x00bd:
            int r1 = r11.getRight()
            int r0 = r9.getMarginStart()
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x00dd
            int r1 = r11.getLeft()
            goto L_0x00a8
        L_0x00cd:
            int r1 = r11.getTop()
            int r0 = r9.topMargin
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x00dd
            int r1 = r11.getBottom()
            int r0 = r9.bottomMargin
            goto L_0x00ac
        L_0x00dd:
            r10 = 0
            goto L_0x00af
        L_0x00df:
            r9 = r15
            goto L_0x0094
        L_0x00e1:
            r5 = -1
            goto L_0x006c
        L_0x00e3:
            r4 = -1
            goto L_0x005f
        L_0x00e6:
            if (r14 == 0) goto L_0x00ed
            int r3 = r3.getWidth()     // Catch:{ 3yO -> 0x011f }
            goto L_0x00f1
        L_0x00ed:
            int r3 = r3.getHeight()     // Catch:{ 3yO -> 0x011f }
        L_0x00f1:
            java.lang.String r0 = "%"
            boolean r0 = r1.endsWith(r0)     // Catch:{ 3yO -> 0x011f }
            if (r0 == 0) goto L_0x0115
            float r0 = X.AnonymousClass6Su.A00(r1)     // Catch:{ 3yO -> 0x011f }
            float r1 = (float) r3     // Catch:{ 3yO -> 0x011f }
            float r1 = r1 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
        L_0x0102:
            r0 = 0
            float r0 = java.lang.Math.max(r0, r1)     // Catch:{ 3yO -> 0x011f }
            float r3 = (float) r3     // Catch:{ 3yO -> 0x011f }
            float r1 = java.lang.Math.min(r3, r0)     // Catch:{ 3yO -> 0x011f }
            java.lang.String r0 = "end"
            boolean r0 = r9.equals(r0)     // Catch:{ 3yO -> 0x011f }
            if (r0 == 0) goto L_0x011c
            goto L_0x011a
        L_0x0115:
            float r1 = X.AnonymousClass6Su.A01(r1)     // Catch:{ 3yO -> 0x011f }
            goto L_0x0102
        L_0x011a:
            float r1 = r3 - r1
        L_0x011c:
            int r8 = (int) r1     // Catch:{ 3yO -> 0x011f }
            goto L_0x0050
        L_0x011f:
            java.lang.String r1 = "CollectionBinderUtils"
            java.lang.String r0 = "Error parsing offset"
            X.1Kn.A02(r1, r0)
            r8 = 0
            goto L_0x0050
        L_0x0129:
            boolean r0 = r6 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x0042
            r0 = r6
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            int r0 = r0.A02
            goto L_0x0040
        L_0x0134:
            if (r11 == 0) goto L_0x01d1
            int r4 = r11.getWidth()
            int r0 = r9.getMarginStart()
            int r4 = r4 + r0
            int r0 = r9.getMarginEnd()
            int r4 = r4 + r0
            int r0 = r11.getHeight()
            int r3 = X.C13988Tno.A0B(r9, r0)
            if (r14 == 0) goto L_0x01be
            if (r13 == 0) goto L_0x01b5
            int r6 = r11.getLeft()
            int r1 = r11.getRight()
        L_0x0158:
            if (r12 == 0) goto L_0x01ad
            int r0 = r9.leftMargin
        L_0x015c:
            int r6 = r6 + r0
            int r8 = r8 - r6
        L_0x015e:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r8
            float r0 = (float) r3
            if (r14 == 0) goto L_0x0165
            float r0 = (float) r4
        L_0x0165:
            float r1 = r1 / r0
            float r6 = r6 - r1
            X.Tq9 r0 = r7.A01
            java.util.List r1 = r0.A03
            if (r5 < 0) goto L_0x01ab
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x01ab
            java.lang.Object r0 = r1.get(r5)
            X.Txy r0 = (X.C14538Txy) r0
            X.4tV r0 = r0.A01
            java.lang.String r1 = r0.A0C()
        L_0x017f:
            if (r1 == 0) goto L_0x0186
            java.lang.String r0 = "visibleItemId"
            r2.put(r0, r1)
        L_0x0186:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "visibleItemIndex"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "visibleItemWidth"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "visibleItemHeight"
            r2.put(r0, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            java.lang.String r0 = "visibleItemFractionFromOffset"
            r2.put(r0, r1)
            return r2
        L_0x01ab:
            r1 = 0
            goto L_0x017f
        L_0x01ad:
            int r0 = r9.getMarginEnd()
            int r1 = r1 + r0
            int r8 = r1 - r8
            goto L_0x015e
        L_0x01b5:
            int r6 = r11.getRight()
            int r1 = r11.getLeft()
            goto L_0x0158
        L_0x01be:
            if (r12 == 0) goto L_0x01c7
            int r6 = r11.getTop()
            int r0 = r9.topMargin
            goto L_0x015c
        L_0x01c7:
            int r1 = r11.getBottom()
            int r0 = r9.bottomMargin
            int r1 = r1 + r0
            int r1 = r1 - r8
            r8 = r1
            goto L_0x015e
        L_0x01d1:
            return r2
        L_0x01d2:
            java.lang.String r1 = "Called GetVisibleCollectionItemAt when not attached to a tree"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5G.A00(X.6Rx, X.6Tm):java.util.Map");
    }
}
