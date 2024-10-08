package com.facebook.analytics.dsp.point;

import X.0qQ;
import X.C2613449f;
import X.C296525qC;
import X.C296535qD;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class DspPointContextHelper {
    public static final DspPointContextHelper A00 = new Object();

    public static final boolean A00(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f < ((float) i) || f > ((float) (i + view.getWidth())) || f2 < ((float) i2) || f2 > ((float) (i2 + view.getHeight()))) {
            return false;
        }
        return true;
    }

    public static final boolean A01(View view, C296525qC r12, C2613449f r13, C296535qD r14, float f, float f2) {
        0qQ.A0B(view, 2);
        C296535qD r8 = r14;
        0qQ.A0B(r14, 3);
        C2613449f r7 = r13;
        0qQ.A0B(r13, 5);
        int visibility = view.getVisibility();
        if (visibility == 4 || visibility == 8) {
            return false;
        }
        float f3 = f;
        float f4 = f2;
        if (!A00(view, f, f4)) {
            return false;
        }
        C296525qC r6 = r12;
        r12.A00(view, r13);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                0qQ.A0A(childAt);
                if (A01(childAt, r6, r7, r8, f3, f4)) {
                    return true;
                }
            }
        }
        Object tag = view.getTag(R.id.dsp_skip_view_traversal);
        if (tag == null || !(tag instanceof Boolean) || !tag.equals(true)) {
            return view.isClickable();
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.Il0, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(android.view.View r16, X.C296525qC r17, X.C2613449f r18, X.C296535qD r19, X.AnonymousClass4D7 r20, float r21, float r22) {
        /*
            r15 = this;
            r4 = r20
            r2 = r16
            r11 = r19
            r9 = r17
            r10 = r18
            r13 = r21
            r14 = r22
            boolean r0 = r4 instanceof X.C58068Il0
            r7 = r15
            if (r0 == 0) goto L_0x00d6
            r12 = r4
            X.Il0 r12 = (X.C58068Il0) r12
            int r3 = r12.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00d6
            int r3 = r3 - r1
            r12.A03 = r3
        L_0x0021:
            java.lang.Object r8 = r12.A09
            X.1Hj r5 = X.1Hj.A02
            int r0 = r12.A03
            r4 = -1
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00b2
            if (r0 == r3) goto L_0x0072
            if (r0 != r1) goto L_0x00dd
            int r6 = r12.A02
            float r14 = r12.A01
            float r13 = r12.A00
            java.lang.Object r10 = r12.A08
            X.49f r10 = (X.C2613449f) r10
            java.lang.Object r9 = r12.A07
            X.5qC r9 = (X.C296525qC) r9
            java.lang.Object r11 = r12.A06
            X.5qD r11 = (X.C296535qD) r11
            java.lang.Object r2 = r12.A05
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r7 = r12.A04
            com.facebook.analytics.dsp.point.DspPointContextHelper r7 = (com.facebook.analytics.dsp.point.DspPointContextHelper) r7
            X.0eS.A00(r8)
        L_0x004d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto L_0x0101
            int r6 = r6 + -1
        L_0x0057:
            if (r4 >= r6) goto L_0x00e5
            r12.A04 = r7
            r12.A05 = r2
            r12.A06 = r11
            r12.A07 = r9
            r12.A08 = r10
            r12.A00 = r13
            r12.A01 = r14
            r12.A02 = r6
            r12.A03 = r3
            java.lang.Object r0 = X.AnonymousClass1Wu.A00(r12)
            if (r0 != r5) goto L_0x008f
            return r5
        L_0x0072:
            int r6 = r12.A02
            float r14 = r12.A01
            float r13 = r12.A00
            java.lang.Object r10 = r12.A08
            X.49f r10 = (X.C2613449f) r10
            java.lang.Object r9 = r12.A07
            X.5qC r9 = (X.C296525qC) r9
            java.lang.Object r11 = r12.A06
            X.5qD r11 = (X.C296535qD) r11
            java.lang.Object r2 = r12.A05
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r7 = r12.A04
            com.facebook.analytics.dsp.point.DspPointContextHelper r7 = (com.facebook.analytics.dsp.point.DspPointContextHelper) r7
            X.0eS.A00(r8)
        L_0x008f:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r8 = r0.getChildAt(r6)
            X.0qQ.A0A(r8)
            r12.A04 = r7
            r12.A05 = r2
            r12.A06 = r11
            r12.A07 = r9
            r12.A08 = r10
            r12.A00 = r13
            r12.A01 = r14
            r12.A02 = r6
            r12.A03 = r1
            java.lang.Object r8 = r7.A02(r8, r9, r10, r11, r12, r13, r14)
            if (r8 != r5) goto L_0x004d
            return r5
        L_0x00b2:
            X.0eS.A00(r8)
            int r6 = r2.getVisibility()
            r0 = 4
            if (r6 == r0) goto L_0x0100
            r0 = 8
            if (r6 == r0) goto L_0x0100
            boolean r0 = A00(r2, r13, r14)
            if (r0 == 0) goto L_0x0100
            r9.A00(r2, r10)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00e5
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r6 = r0.getChildCount()
            int r6 = r6 - r3
            goto L_0x0057
        L_0x00d6:
            X.Il0 r12 = new X.Il0
            r12.<init>(r15, r4)
            goto L_0x0021
        L_0x00dd:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 2131432100(0x7f0b12a4, float:1.8485948E38)
            java.lang.Object r1 = r2.getTag(r0)
            if (r1 == 0) goto L_0x0106
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0106
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0106
        L_0x0100:
            r3 = 0
        L_0x0101:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x0106:
            boolean r0 = r2.isClickable()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics.dsp.point.DspPointContextHelper.A02(android.view.View, X.5qC, X.49f, X.5qD, X.4D7, float, float):java.lang.Object");
    }
}
