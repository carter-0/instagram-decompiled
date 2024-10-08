package com.instagram.direct.messagethread;

import X.AnonymousClass7N0;
import X.AnonymousClass7N1;
import android.content.Context;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;

public final class DirectMessageListLinearLayoutManager extends MessageListLayoutManager {
    public final AnonymousClass7N1 A00;
    public final boolean A01 = true;
    public final AnonymousClass7N0 A02;
    public final String A03 = "DirectMessageListLinearLayoutManager";

    public DirectMessageListLinearLayoutManager(Context context, int i) {
        super(context, 1, true);
        this.A00 = true;
        this.A02 = new AnonymousClass7N0(context, this, i);
        this.A00 = new AnonymousClass7N1(context, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0120, code lost:
        if (r3 == null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        if (r1 != 68) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (r11.A01 != false) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1R(X.AnonymousClass3AN r12, X.AnonymousClass3AW r13) {
        /*
            r11 = this;
            r0 = 615335215(0x24ad452f, float:7.514399E-17)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r8 = 1
            X.0qQ.A0B(r13, r8)
            X.7N0 r10 = r11.A02
            X.0eP r0 = X.AnonymousClass7N0.A00(r10)
            r10.A00 = r0
            super.A1R(r12, r13)     // Catch:{ IndexOutOfBoundsException -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r3 = move-exception
            java.lang.String r1 = r11.A03
            java.lang.String r0 = "Index out of bounds exception"
            X.0wb.A06(r1, r0, r3)
        L_0x0023:
            X.0eP r1 = r10.A00
            if (r1 == 0) goto L_0x0071
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            X.0eP r1 = X.AnonymousClass7N0.A00(r10)
            if (r1 == 0) goto L_0x0071
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            androidx.recyclerview.widget.LinearLayoutManager r4 = r10.A03
            int r3 = r4.A00
            int r0 = r4.Ba8()
            int r3 = r3 - r0
            int r1 = r10.A02
            int r0 = r10.A01
            int r0 = r3 - r0
            int r0 = java.lang.Math.max(r1, r0)
            if (r5 != r7) goto L_0x0071
            if (r6 >= r9) goto L_0x0071
            if (r5 > r3) goto L_0x006c
            if (r6 >= r0) goto L_0x0101
            int r9 = java.lang.Math.min(r9, r0)
        L_0x006c:
            int r9 = r9 - r6
        L_0x006d:
            int r0 = -r9
            r4.A1L(r12, r13, r0)
        L_0x0071:
            X.7N1 r5 = r11.A00
            androidx.recyclerview.widget.LinearLayoutManager r4 = r5.A02
            int r1 = r4.A1a()
            r0 = -1
            if (r1 == r0) goto L_0x0104
            android.view.View r7 = r4.A1D(r1)
            r6 = 0
            if (r7 == 0) goto L_0x0104
            r0 = 2131431819(0x7f0b118b, float:1.8485378E38)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L_0x0104
            java.util.Set r1 = (java.util.Set) r1
            X.9ro r0 = X.C390769ro.CONDITIONALLY_SCROLL_BOTTOM_INTO_VIEWPORT
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0104
            int r3 = r7.getBottom()
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00aa
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x00aa
            int r6 = r1.bottomMargin
        L_0x00aa:
            int r3 = r3 + r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0104
            int r1 = r4.A00
            int r0 = r4.Ba8()
            int r1 = r1 - r0
            int r3 = r3 - r1
            int r0 = r5.A00
            if (r8 > r3) goto L_0x0104
            if (r3 >= r0) goto L_0x0104
            X.0eM r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r3 + r0
            r4.A1L(r12, r13, r3)
            java.util.HashSet r0 = r5.A03
            java.util.Iterator r4 = r0.iterator()
        L_0x00d5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r4.next()
            X.7UQ r0 = (X.AnonymousClass7UQ) r0
            X.7UP r3 = r0.A00
            X.7UO r1 = r3.A01
            X.7UC r0 = r1.A09
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00f6
            android.view.View r1 = r1.A01
            if (r1 == 0) goto L_0x00f6
            r0 = 8
            r1.setVisibility(r0)
        L_0x00f6:
            android.os.Handler r1 = r3.A00
            X.Akh r0 = new X.Akh
            r0.<init>(r3)
            r1.post(r0)
            goto L_0x00d5
        L_0x0101:
            r9 = 0
            goto L_0x006d
        L_0x0104:
            int r4 = r11.A1b()
            android.view.View r3 = r11.A1D(r4)
            if (r4 <= 0) goto L_0x0120
            if (r3 == 0) goto L_0x0122
            X.3kE r0 = androidx.recyclerview.widget.RecyclerView.A06(r3)
            int r1 = r0.mItemViewType
            r0 = 15
            if (r1 != r0) goto L_0x0129
            int r0 = r4 + -1
            android.view.View r3 = r11.A1D(r0)
        L_0x0120:
            if (r3 != 0) goto L_0x0129
        L_0x0122:
            r0 = -681063917(0xffffffffd767ca13, float:-2.54855088E14)
        L_0x0125:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0129:
            X.3kE r0 = androidx.recyclerview.widget.RecyclerView.A06(r3)
            int r1 = r0.mItemViewType
            r0 = 37
            if (r1 == r0) goto L_0x013c
            r0 = 55
            if (r1 == r0) goto L_0x0140
            r0 = 68
            if (r1 == r0) goto L_0x013c
            goto L_0x0122
        L_0x013c:
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x0122
        L_0x0140:
            int r1 = r3.getMinimumHeight()
            int r0 = r3.getBottom()
            if (r1 == r0) goto L_0x0154
            int r0 = r3.getBottom()
            r3.setMinimumHeight(r0)
            super.A1R(r12, r13)
        L_0x0154:
            r0 = 2090220149(0x7c963a75, float:6.2402414E36)
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager.A1R(X.3AN, X.3AW):void");
    }
}
