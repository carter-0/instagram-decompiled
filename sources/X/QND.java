package X;

import android.graphics.drawable.Drawable;

public final class QND extends C226692hh {
    public final /* synthetic */ C7581QKw A00;

    public QND(C7581QKw qKw) {
        this.A00 = qKw;
    }

    public final void DEj(Drawable drawable, AnonymousClass2i4 r5, C226732hl r6, Throwable th, long j) {
        C7581QKw qKw = this.A00;
        qKw.A02();
        C10997S4r s4r = qKw.A02;
        if (s4r == null) {
            0qQ.A0F("logger");
            throw AnonymousClass00P.createAndThrow();
        }
        s4r.A01(RIk.ERROR, qKw.A0D);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DFZ(android.graphics.drawable.Drawable r6, X.AnonymousClass2i4 r7, X.C226732hl r8, X.C240493Lc r9, int r10, long r11) {
        /*
            r5 = this;
            X.QKw r3 = r5.A00
            X.S4r r0 = r3.A02
            java.lang.String r4 = "logger"
            r2 = 0
            if (r0 == 0) goto L_0x004b
            r0.A00()
            java.util.Map r1 = r7.A09
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "LOAD_SOURCE"
            java.lang.Object r2 = r1.get(r0)
        L_0x0016:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0048
            java.lang.String r0 = "network"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0033
            X.RIk r2 = X.RIk.NETWORK
        L_0x0029:
            X.S4r r1 = r3.A02
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = r3.A0D
            r1.A01(r2, r0)
            return
        L_0x0033:
            java.lang.String r0 = "disk"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0045
            java.lang.String r1 = "memory"
            r0 = 1
            boolean r0 = X.C66580MXl.A1a(r1, r0, r2)
            if (r0 == 0) goto L_0x0048
        L_0x0045:
            X.RIk r2 = X.RIk.CACHE
            goto L_0x0029
        L_0x0048:
            X.RIk r2 = X.RIk.NONE
            goto L_0x0029
        L_0x004b:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QND.DFZ(android.graphics.drawable.Drawable, X.2i4, X.2hl, X.3Lc, int, long):void");
    }

    public final void DLS(C226732hl r2, C240493Lc r3, long j) {
        if (r3 != null) {
            C7581QKw.A01(this.A00, r3);
        }
        C10997S4r s4r = this.A00.A02;
        if (s4r == null) {
            0qQ.A0F("logger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            s4r.A00();
        }
    }
}
