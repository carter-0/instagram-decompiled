package X;

import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;

/* renamed from: X.FFk  reason: case insensitive filesystem */
public final class C49931FFk {
    public static final C49931FFk A00 = new Object();

    public static final HandlerExecutorAndBuilder A00(C49662F0t f0t) {
        C50615FfW ffW;
        G4U g4u = new G4U(f0t, 17);
        HandlerExecutorAndBuilder handlerExecutorAndBuilder = new HandlerExecutorAndBuilder();
        g4u.invoke(handlerExecutorAndBuilder);
        C268654dm r1 = (C268654dm) C49775F6i.A00(f0t.A05, C51822G3g.A00);
        if (r1 instanceof C268664dn) {
            ffW = C49853F9s.A07;
        } else if (!(r1 instanceof C268674do)) {
            throw AnonymousClass7TE.A1K();
        } else if (C46413Dea.A03(r1).A03) {
            ffW = C49853F9s.A01;
        } else {
            Integer num = f0t.A03.A01;
            if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0N) {
                ffW = C49853F9s.A06;
            } else {
                ffW = C49853F9s.A08;
            }
        }
        0qQ.A0B(ffW, 0);
        handlerExecutorAndBuilder.A03(ffW);
        return handlerExecutorAndBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder A01(X.C49662F0t r4) {
        /*
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = A00(r4)
            X.3Ii r2 = r4.A05
            X.G3g r1 = X.C51822G3g.A00
            java.lang.Object r0 = X.C49775F6i.A00(r2, r1)
            boolean r0 = r0 instanceof X.C268674do
            java.lang.Object r1 = X.C49775F6i.A00(r2, r1)
            X.4dm r1 = (X.C268654dm) r1
            if (r0 == 0) goto L_0x0034
            X.F2t r1 = X.C46413Dea.A03(r1)
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x002a
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x002a
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x002a
            boolean r0 = r1.A06
        L_0x0028:
            if (r0 == 0) goto L_0x0033
        L_0x002a:
            X.FfW r1 = X.C49853F9s.A09
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r3.A03(r1)
        L_0x0033:
            return r3
        L_0x0034:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x0033
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r0 = r1.A00
            boolean r0 = r0 instanceof X.C51634FxS
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49931FFk.A01(X.F0t):com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder");
    }
}
