package X;

import java.lang.ref.WeakReference;

/* renamed from: X.QKy  reason: case insensitive filesystem */
public final class C7583QKy extends C11364SPc implements B3J, C13923TlR, C13922TlQ, C13921TlP {
    public C10535Rto A00;
    public SRY A01 = SRY.A00();
    public WeakReference A02;
    public final AnonymousClass0Gt A03;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C7583QKy r17) {
        /*
            r4 = r17
            X.Rto r2 = r4.A00
            if (r2 == 0) goto L_0x005d
            java.lang.String r8 = r2.A01
            X.7ka r5 = r4.A03
            r3 = 0
            if (r5 != 0) goto L_0x0017
            java.lang.ref.WeakReference r0 = r4.A02
            if (r0 == 0) goto L_0x0060
            java.lang.Object r5 = r0.get()
            X.7ka r5 = (X.C340027ka) r5
        L_0x0017:
            if (r5 == 0) goto L_0x0061
            r0 = r5
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.A9z r1 = r0.A0d
            if (r1 == 0) goto L_0x0061
            long r14 = r2.A02
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = r2.A00
            X.0JP r0 = r1.A0m
            long r10 = r0.now()
            java.lang.String r7 = r1.A0Z
            com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent r6 = new com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r12, r14, r16)
        L_0x0036:
            if (r8 == 0) goto L_0x005e
            android.net.Uri r0 = X.Pxg.A0L(r8)
            if (r0 == 0) goto L_0x005e
            boolean r1 = X.C11429STt.A05(r0)
        L_0x0042:
            if (r6 == 0) goto L_0x005b
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x005b
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            if (r1 != 0) goto L_0x005b
            X.SRY r2 = r4.A01
            com.facebook.browser.lite.BrowserLiteFragment r5 = (com.facebook.browser.lite.BrowserLiteFragment) r5
            android.os.Bundle r1 = r5.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r5.A0e
            r2.A06(r1, r6, r0)
        L_0x005b:
            r4.A00 = r3
        L_0x005d:
            return
        L_0x005e:
            r1 = 0
            goto L_0x0042
        L_0x0060:
            r5 = r3
        L_0x0061:
            r6 = r3
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7583QKy.A00(X.QKy):void");
    }

    public final void destroy() {
        this.A02 = C51965G9l.A0v(this.A03);
        super.destroy();
    }

    public C7583QKy() {
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A03 = r0;
    }
}
