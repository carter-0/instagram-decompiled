package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: X.3Et  reason: invalid class name and case insensitive filesystem */
public abstract class C239083Et {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.3pT, X.4D9, X.3pU] */
    public static final C252663pT A01(Integer num, Integer num2, C262094Cc r6, 0sL r7, C262224Cq r8, int i) {
        1HR r1;
        int i2;
        if (i == -2) {
            if (num == AnonymousClass05K.A00) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = 1HR.A03;
                AnonymousClass3FN r0 = C249513ju.A00;
                i2 = AnonymousClass3FN.A00;
                r1 = new 1HR(i2);
            }
            r1 = new AnonymousClass3Eu(1, num);
        } else if (i != -1) {
            if (i != 0) {
                i2 = Integer.MAX_VALUE;
                if (i != Integer.MAX_VALUE) {
                    if (num == AnonymousClass05K.A00) {
                        r1 = new 1HR(i);
                    } else {
                        r1 = new AnonymousClass3Eu(i, num);
                    }
                }
                r1 = new 1HR(i2);
            } else {
                if (num == AnonymousClass05K.A00) {
                    r1 = new 1HR(0);
                }
                r1 = new AnonymousClass3Eu(1, num);
            }
        } else if (num == AnonymousClass05K.A00) {
            r1 = new AnonymousClass3Eu(1, AnonymousClass05K.A01);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        ? r02 = new C252673pU(1Ep.A02(r6, r8), r1, true);
        r02.A0T(num2, r02, r7);
        return r02;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.9JW] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass4D7 r6, X.C62320sa r7, X.C252683pV r8) {
        /*
            r0 = 10
            boolean r0 = X.AnonymousClass9JW.A00(r0, r6)
            if (r0 == 0) goto L_0x0026
            r5 = r6
            X.9JW r5 = (X.AnonymousClass9JW) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r3) goto L_0x0030
            java.lang.Object r7 = r5.A02
            X.0sa r7 = (X.C62320sa) r7
            goto L_0x002c
        L_0x0026:
            X.9JW r5 = new X.9JW
            r5.<init>(r6)
            goto L_0x0016
        L_0x002c:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0076 }
            goto L_0x0070
        L_0x0030:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0038:
            X.0eS.A00(r1)
            X.4Cc r1 = r5.getContext()
            X.19F r0 = X.C262204Co.A00
            X.4Cb r1 = r1.get(r0)
            r0 = 0
            if (r1 != r8) goto L_0x0049
            r0 = 1
        L_0x0049:
            if (r0 == 0) goto L_0x007b
            r5.A01 = r8     // Catch:{ all -> 0x0076 }
            r5.A02 = r7     // Catch:{ all -> 0x0076 }
            r5.A00 = r3     // Catch:{ all -> 0x0076 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.1IW.A04     // Catch:{ all -> 0x0076 }
            X.4D7 r0 = X.1Ey.A02(r5)     // Catch:{ all -> 0x0076 }
            X.1IW r2 = new X.1IW     // Catch:{ all -> 0x0076 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0076 }
            r2.A0I()     // Catch:{ all -> 0x0076 }
            r1 = 32
            X.9LR r0 = new X.9LR     // Catch:{ all -> 0x0076 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0076 }
            r8.CO2(r0)     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = r2.A0E()     // Catch:{ all -> 0x0076 }
            if (r0 != r4) goto L_0x0070
            return r4
        L_0x0070:
            r7.invoke()
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0076:
            r0 = move-exception
            r7.invoke()
            throw r0
        L_0x007b:
            java.lang.String r1 = "awaitClose() can only be invoked from the producer context"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239083Et.A00(X.4D7, X.0sa, X.3pV):java.lang.Object");
    }

    public static final C252663pT A03(C262094Cc r2, 0sL r3, C262224Cq r4, int i) {
        Integer num = AnonymousClass05K.A00;
        return A01(num, num, r2, r3, r4, i);
    }
}
