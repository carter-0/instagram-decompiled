package com.meta.analytics.gnv.vista.core;

import X.0qQ;
import X.C51965G9l;
import X.C55748Hmj;
import android.view.View;
import com.facebook.analytics.dsp.point.DspPointContextHelper;
import java.lang.ref.WeakReference;

public final class VistaViewPoint {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final DspPointContextHelper A03;
    public final C55748Hmj A04;
    public final WeakReference A05;

    public VistaViewPoint(View view, DspPointContextHelper dspPointContextHelper, C55748Hmj hmj, int i) {
        0qQ.A0B(dspPointContextHelper, 4);
        this.A02 = i;
        this.A04 = hmj;
        this.A03 = dspPointContextHelper;
        this.A05 = C51965G9l.A0v(view);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r1 > ((float) r10.intValue())) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.meta.analytics.gnv.vista.core.VistaViewPoint r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 17
            boolean r0 = X.C66131MDj.A01(r3, r15)
            if (r0 == 0) goto L_0x00e7
            r5 = r15
            X.MDj r5 = (X.C66131MDj) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e7
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r4) goto L_0x00ee
            java.lang.Object r3 = r5.A02
            X.0eS.A00(r1)
        L_0x0026:
            X.5qH r1 = (X.C296565qH) r1
        L_0x0028:
            int r3 = r3.hashCode()
            r2 = 0
            if (r1 == 0) goto L_0x003b
            java.util.List r1 = r1.A01
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0040
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0040
        L_0x003b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L_0x0040:
            java.util.Iterator r1 = r1.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r1.next()
            int r0 = r0.hashCode()
            if (r0 != r3) goto L_0x0044
            r2 = 1
            goto L_0x003b
        L_0x0056:
            X.0eS.A00(r1)
            java.lang.ref.WeakReference r0 = r14.A05
            java.lang.Object r3 = r0.get()
            android.view.View r3 = (android.view.View) r3
            r13 = 0
            if (r3 == 0) goto L_0x00ca
            X.Hmj r7 = r14.A04
            X.49g r8 = r7.A01
            int r0 = r3.getWidth()
            int r9 = r3.getHeight()
            int r12 = r8.A01
            r11 = 2
            int r1 = r12 * 2
            if (r0 <= r1) goto L_0x00ca
            if (r9 <= r1) goto L_0x00ca
            int r0 = r0 - r1
            float r2 = (float) r0
            int r0 = r8.A00
            int r0 = r0 - r4
            float r0 = (float) r0
            float r2 = r2 / r0
            int r9 = r9 - r1
            float r1 = (float) r9
            float r1 = r1 / r0
            int r0 = r14.A02
            float r10 = (float) r0
            float r9 = r10 * r2
            float r0 = (float) r12
            float r9 = r9 + r0
            float r10 = r10 * r1
            float r10 = r10 + r0
            int[] r1 = new int[r11]
            r3.getLocationOnScreen(r1)
            r0 = r1[r13]
            float r2 = (float) r0
            float r2 = r2 + r9
            r0 = r1[r4]
            float r1 = (float) r0
            float r1 = r1 + r10
            X.0eP r9 = r7.A02
            java.lang.Object r11 = r9.A00
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            if (r0 <= 0) goto L_0x00cf
            java.lang.Object r10 = r9.A01
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            if (r0 <= 0) goto L_0x00cf
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00ca
            int r0 = r11.intValue()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ca
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00ca
            int r0 = r10.intValue()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cf
        L_0x00ca:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r13)
            return r6
        L_0x00cf:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x00df
            com.facebook.analytics.dsp.point.IgPointContextProvider r0 = r7.A00
            X.C51966G9m.A1P(r14, r3, r5, r4)
            java.lang.Object r1 = r0.A01(r5, r2, r1)
            if (r1 != r6) goto L_0x0026
            return r6
        L_0x00df:
            com.facebook.analytics.dsp.point.IgPointContextProvider r0 = r7.A00
            X.5qH r1 = r0.A00(r2, r1)
            goto L_0x0028
        L_0x00e7:
            X.MDj r5 = new X.MDj
            r5.<init>(r14, r15, r3)
            goto L_0x0016
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.gnv.vista.core.VistaViewPoint.A00(com.meta.analytics.gnv.vista.core.VistaViewPoint, X.4D7):java.lang.Object");
    }
}
