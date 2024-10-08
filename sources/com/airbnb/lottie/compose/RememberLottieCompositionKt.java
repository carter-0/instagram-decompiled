package com.airbnb.lottie.compose;

import X.002;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C13159TNr;
import X.S5B;
import X.SSQ;
import android.content.Context;

public abstract class RememberLottieCompositionKt {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        if (r13 == r1) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(android.content.Context r13, X.S5B r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r9 = r13
            r10 = r16
            r11 = r17
            r0 = 6
            r4 = r19
            boolean r0 = X.MED.A04(r0, r4)
            if (r0 == 0) goto L_0x00da
            r2 = r4
            X.MED r2 = (X.MED) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00da
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001c:
            java.lang.Object r13 = r2.A05
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 3
            r8 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 == r4) goto L_0x0062
            if (r0 == r8) goto L_0x00a2
            if (r0 != r3) goto L_0x00e1
            java.lang.Object r8 = r2.A01
            X.0eS.A00(r13)
        L_0x0032:
            return r8
        L_0x0033:
            X.0eS.A00(r13)
            r0 = r18
            X.SSQ r7 = A00(r9, r14, r0)
            r2.A01 = r9
            r2.A02 = r15
            r2.A03 = r10
            r2.A04 = r11
            r2.A00 = r4
            X.1IW r6 = X.JTS.A0s(r2)
            r5 = 0
            X.SgS r0 = new X.SgS
            r0.<init>(r6, r5)
            r7.A03(r0)
            X.SgS r0 = new X.SgS
            r0.<init>(r6, r4)
            r7.A02(r0)
            java.lang.Object r13 = r6.A0E()
            if (r13 != r1) goto L_0x0073
        L_0x0061:
            return r1
        L_0x0062:
            java.lang.Object r11 = r2.A04
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r2.A03
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r15 = r2.A02
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r9 = r2.A01
            X.0eS.A00(r13)
        L_0x0073:
            X.S7N r13 = (X.S7N) r13
            r2.A01 = r9
            r2.A02 = r10
            r2.A03 = r11
            r2.A04 = r13
            r2.A00 = r8
            java.util.Map r0 = r13.A0B
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009f
            X.4CZ r0 = X.AnonymousClass12W.A01
            r16 = 0
            X.JaI r12 = new X.JaI
            r14 = r9
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Object r0 = X.1Eo.A00(r2, r0, r12)
            if (r0 != r1) goto L_0x009f
        L_0x009b:
            if (r0 == r1) goto L_0x0061
            r8 = r13
            goto L_0x00b3
        L_0x009f:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x009b
        L_0x00a2:
            java.lang.Object r8 = r2.A04
            X.S7N r8 = (X.S7N) r8
            java.lang.Object r11 = r2.A03
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r2.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r2.A01
            X.0eS.A00(r13)
        L_0x00b3:
            r2.A01 = r8
            r12 = 0
            r2.A02 = r12
            r2.A03 = r12
            r2.A04 = r12
            r2.A00 = r3
            java.util.Map r0 = r8.A0A
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d7
            X.4CZ r0 = X.AnonymousClass12W.A01
            r13 = 0
            X.Pfh r7 = new X.Pfh
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = X.1Eo.A00(r2, r0, r7)
            if (r0 != r1) goto L_0x00d7
        L_0x00d4:
            if (r0 != r1) goto L_0x0032
            return r1
        L_0x00d7:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x00d4
        L_0x00da:
            X.MED r2 = new X.MED
            r2.<init>(r4)
            goto L_0x001c
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt.A01(android.content.Context, X.S5B, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final SSQ A00(Context context, S5B s5b, String str) {
        if (s5b != null) {
            boolean A0K = 0qQ.A0K(str, "__LottieInternalDefaultCacheKey__");
            String str2 = s5b.A00;
            if (A0K) {
                return C13159TNr.A00(context, str2, 002.A0R("url_", str2));
            }
            return C13159TNr.A00(context, str2, str);
        }
        throw AnonymousClass7TE.A1K();
    }
}
