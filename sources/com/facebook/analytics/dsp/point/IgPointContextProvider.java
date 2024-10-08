package com.facebook.analytics.dsp.point;

import X.0qQ;
import X.AnonymousClass0eK;
import X.C238833Dp;
import X.C2613449f;
import X.C296515qB;
import X.C296525qC;
import X.C296535qD;
import X.C296565qH;
import android.app.Activity;
import android.view.View;

public final class IgPointContextProvider {
    public C238833Dp A00;
    public final AnonymousClass0eK A01;
    public final C2613449f A02 = C2613449f.A01;

    public IgPointContextProvider(AnonymousClass0eK r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r12, float r13, float r14) {
        /*
            r11 = this;
            r3 = 6
            boolean r0 = X.AnonymousClass9JX.A00(r3, r12)
            if (r0 == 0) goto L_0x005a
            r8 = r12
            X.9JX r8 = (X.AnonymousClass9JX) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r8.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x0060
            java.lang.Object r5 = r8.A01
            X.5qC r5 = (X.C296525qC) r5
            X.0eS.A00(r3)
        L_0x0027:
            X.5qH r1 = new X.5qH
            r1.<init>(r5)
            return r1
        L_0x002d:
            X.0eS.A00(r3)
            X.0eK r0 = r11.A01
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0068
            android.view.View r4 = X.C296515qB.A00(r0)
            if (r4 == 0) goto L_0x0068
            X.3Dp r0 = r11.A00
            X.5qC r5 = new X.5qC
            r5.<init>(r0)
            com.facebook.analytics.dsp.point.DspPointContextHelper r3 = com.facebook.analytics.dsp.point.DspPointContextHelper.A00
            X.5qD r7 = X.C296535qD.A00
            X.49f r6 = r11.A02
            r8.A01 = r5
            r8.A00 = r2
            r9 = r13
            r10 = r14
            java.lang.Object r0 = r3.A02(r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r1) goto L_0x0027
            return r1
        L_0x005a:
            X.9JX r8 = new X.9JX
            r8.<init>(r11, r12, r3)
            goto L_0x0015
        L_0x0060:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0068:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics.dsp.point.IgPointContextProvider.A01(X.4D7, float, float):java.lang.Object");
    }

    public final C296565qH A00(float f, float f2) {
        View A002;
        Activity activity = (Activity) this.A01.get();
        if (activity == null || (A002 = C296515qB.A00(activity)) == null) {
            return null;
        }
        C296525qC r2 = new C296525qC(this.A00);
        DspPointContextHelper.A01(A002, r2, this.A02, C296535qD.A00, f, f2);
        return new C296565qH(r2);
    }
}
