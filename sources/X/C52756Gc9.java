package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Gc9  reason: case insensitive filesystem */
public final class C52756Gc9 extends C249403jg {
    public int A00;
    public boolean A01;
    public final /* synthetic */ C55889HpA A02;

    public C52756Gc9(C55889HpA hpA) {
        this.A02 = hpA;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.52R, X.52T, X.52S] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r6 <= r2) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r19, int r20) {
        /*
            r18 = this;
            r0 = 1283445421(0x4c7fd2ad, float:6.7062452E7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            r1 = r19
            X.0qQ.A0B(r1, r3)
            r5 = r18
            X.HpA r13 = r5.A02
            X.GcB r9 = r13.A0B
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x001e
            r0 = 865515698(0x3396b8b2, float:7.018515E-8)
        L_0x001a:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x001e:
            r15 = 1
            r0 = r20
            if (r20 == 0) goto L_0x00bb
            if (r0 != r15) goto L_0x0043
            r13.A01 = r3
            int r0 = r9.A00
            r7 = 1
            int r0 = r0 + 1
            int r6 = r9.A02(r0)
            r0 = -1
            if (r6 == r0) goto L_0x00b9
            X.3pI r8 = r9.A02
            boolean r0 = r8 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0047
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
            int r2 = r8.A1d()
        L_0x003f:
            if (r6 > r2) goto L_0x00b9
        L_0x0041:
            r5.A01 = r7
        L_0x0043:
            r0 = -1873628959(0xffffffff9052b0e1, float:-4.155146E-29)
            goto L_0x001a
        L_0x0047:
            boolean r0 = r8 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 == 0) goto L_0x0080
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r8 = (com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager) r8
            int r0 = r8.A0U()
            if (r0 == 0) goto L_0x007e
            java.util.List r9 = r8.A07
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x007e
            int r3 = r9.size()
        L_0x005f:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x007e
            java.lang.Object r0 = r9.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            X.Tu0 r0 = r8.A06
            android.graphics.Rect r1 = r0.A00(r2)
            if (r1 == 0) goto L_0x005f
            android.graphics.Rect r0 = r8.A05
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005f
            goto L_0x003f
        L_0x007e:
            r2 = -1
            goto L_0x003f
        L_0x0080:
            boolean r0 = r8 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x020f
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r8
            int r0 = r8.A06
            int[] r2 = new int[r0]
            r1 = 0
        L_0x008b:
            int r0 = r8.A06
            if (r1 >= r0) goto L_0x00b6
            X.9ND[] r0 = r8.A0H
            r12 = r0[r1]
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r12.A05
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x00ad
            r13 = 0
            java.util.ArrayList r0 = r12.A03
            int r14 = r0.size()
        L_0x00a0:
            r16 = r15
            r17 = r3
            int r0 = r12.A05(r13, r14, r15, r16, r17)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x008b
        L_0x00ad:
            java.util.ArrayList r0 = r12.A03
            int r13 = r0.size()
            int r13 = r13 - r15
            r14 = -1
            goto L_0x00a0
        L_0x00b6:
            r2 = r2[r3]
            goto L_0x003f
        L_0x00b9:
            r7 = 0
            goto L_0x0041
        L_0x00bb:
            int r0 = r5.A00
            boolean r7 = X.AnonymousClass7TF.A1R(r0)
            boolean r0 = r13.A01
            if (r0 != 0) goto L_0x020b
            X.3Aq r6 = r13.A0C
            X.2dY r2 = X.2dZ.A0t
            android.content.Context r1 = r1.getContext()
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r0 = X.0mE.A00(r1, r0)
            android.app.Activity r0 = (android.app.Activity) r0
            X.2dZ r0 = r2.A03(r0)
            int r0 = r0.AYI()
            X.C253923rd.A03(r6, r0, r3)
            int r0 = r5.A00
            int r0 = java.lang.Math.abs(r0)
            float r1 = (float) r0
            float r0 = r13.A05
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0105
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0105
            if (r7 == 0) goto L_0x0105
            X.GcE r1 = r13.A0A
            X.HpA r0 = r1.A03
            if (r0 == 0) goto L_0x00fb
            r0.A01 = r15
        L_0x00fb:
            boolean r0 = X.C52761GcE.A02(r1, r15)
        L_0x00ff:
            r13.A01 = r0
        L_0x0101:
            r5.A00 = r3
            goto L_0x0043
        L_0x0105:
            float r0 = r13.A04
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0119
            X.GcE r0 = r13.A0A
            if (r7 == 0) goto L_0x0114
            boolean r0 = X.C52761GcE.A02(r0, r3)
            goto L_0x00ff
        L_0x0114:
            boolean r0 = r0.A08()
            goto L_0x00ff
        L_0x0119:
            X.3pI r2 = r13.A06
            if (r2 == 0) goto L_0x0101
            int r14 = r2.A00
            int r0 = r2.Ba8()
            int r14 = r14 - r0
            int r0 = r2.BaC()
            int r14 = r14 - r0
            int r7 = r9.A00
            int r11 = r9.A03(r7)
            int r8 = r7 + 1
            int r10 = r9.A03(r8)
            int r0 = r7 + -1
            int r6 = r9.A03(r0)
            r13.A01 = r15
            if (r10 <= r11) goto L_0x0145
            X.GcE r0 = r13.A0A
            X.C52761GcE.A02(r0, r3)
            goto L_0x0101
        L_0x0145:
            if (r6 < r11) goto L_0x014d
            X.GcE r0 = r13.A0A
            r0.A08()
            goto L_0x0101
        L_0x014d:
            float r1 = (float) r10
            float r12 = (float) r14
            r0 = 1045220556(0x3e4ccccc, float:0.19999999)
            float r0 = r0 * r12
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e8
            int r0 = r9.A00
            int r1 = r9.A02(r0)
            int r0 = X.C240113Jq.A01(r2)
            if (r1 >= r0) goto L_0x01e8
            int r8 = r9.A02(r8)
            r0 = -1
            if (r8 != r0) goto L_0x01c5
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Trying to setting to a non-existent next post. RecyclerView height: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ", Current index: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", Current post position: "
            r1.append(r0)
            int r0 = r9.A02(r7)
            r1.append(r0)
            java.lang.String r0 = ", Current post height: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", Next post height: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", Prev post height: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", First visible item position: "
            r1.append(r0)
            int r0 = X.C240113Jq.A01(r2)
            r1.append(r0)
            java.lang.String r0 = ", Last visible item position: "
            r1.append(r0)
            int r0 = X.C240113Jq.A02(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "DiscoveryFeedScrollPagerGestureDetector#settleAfterScroll()"
            X.0wb.A03(r0, r1)
            goto L_0x0101
        L_0x01c5:
            X.GcE r1 = r13.A0A
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r12 = r12 * r0
            int r7 = (int) r12
            X.3pI r6 = r1.A02
            if (r6 == 0) goto L_0x0101
            r2 = 1085276160(0x40b00000, float:5.5)
            android.content.Context r0 = r1.A06
            X.52R r1 = new X.52R
            r1.<init>(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A00 = r0
            r1.A00 = r8
            r1.A01 = r7
            r1.A00 = r2
            r6.A0t(r1)
            goto L_0x0101
        L_0x01e8:
            int r0 = r9.A00
            if (r0 <= 0) goto L_0x020b
            int r1 = r9.A02(r0)
            int r0 = X.C240113Jq.A01(r2)
            if (r1 <= r0) goto L_0x020b
            X.GcE r2 = r13.A0A
            int r1 = r9.A02(r7)
            X.3pI r0 = r2.A02
            if (r0 == 0) goto L_0x0101
            X.GcB r0 = r2.A04
            if (r0 == 0) goto L_0x0101
            r0 = 1085276160(0x40b00000, float:5.5)
            X.C52761GcE.A01(r2, r0, r1, r15)
            goto L_0x0101
        L_0x020b:
            r13.A01 = r3
            goto L_0x0101
        L_0x020f:
            java.lang.IllegalArgumentException r0 = X.C240113Jq.A04(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52756Gc9.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(1872700165);
        if (!this.A02.A01) {
            this.A00 += i2;
        }
        AnonymousClass0fD.A0A(1755586461, A03);
    }
}
