package X;

/* renamed from: X.32u  reason: invalid class name and case insensitive filesystem */
public final class C2361932u extends C252233om {
    public final /* synthetic */ 1wn A00;
    public final /* synthetic */ 1wn A01;
    public final /* synthetic */ 1wn A02;
    public final /* synthetic */ 1wn A03;
    public final /* synthetic */ C2357230y A04;

    public C2361932u(1wn r1, 1wn r2, 1wn r3, 1wn r4, C2357230y r5) {
        this.A04 = r5;
        this.A03 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    public final void onDestroy() {
        this.A04.A02.unregisterLifecycleListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (X.AnonymousClass3KZ.A01(r2) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r5 = this;
            X.30y r4 = r5.A04
            X.1Ng r3 = r4.A08
            java.lang.Class<X.3KT> r1 = X.AnonymousClass3KT.class
            X.1wn r0 = r5.A01
            r3.A02(r0, r1)
            java.lang.Class<X.3KU> r1 = X.AnonymousClass3KU.class
            X.1wn r0 = r5.A00
            r3.A02(r0, r1)
            java.lang.Class<X.3KV> r1 = X.AnonymousClass3KV.class
            X.1wn r0 = r5.A02
            r3.A02(r0, r1)
            com.instagram.common.session.UserSession r2 = r4.A0A
            X.2v9 r1 = X.C233162v9.SEE_TRANSLATION
            java.util.List r0 = X.AnonymousClass3KW.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0035
            X.3KZ r0 = X.AnonymousClass3KY.A00
            boolean r0 = X.AnonymousClass3KZ.A01(r2)
            if (r0 == 0) goto L_0x0035
        L_0x002d:
            java.lang.Class<X.3Jx> r1 = X.C240183Jx.class
            X.1wn r0 = r4.A09
            r3.A02(r0, r1)
        L_0x0034:
            return
        L_0x0035:
            java.util.List r0 = X.AnonymousClass3KW.A03
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0034
            X.3KZ r0 = X.AnonymousClass3KY.A00
            boolean r0 = X.AnonymousClass3KZ.A00(r2)
            if (r0 == 0) goto L_0x0034
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2361932u.onPause():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (X.AnonymousClass3KZ.A01(r2) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r5 = this;
            X.30y r4 = r5.A04
            X.1Ng r3 = r4.A08
            java.lang.Class<X.3KT> r1 = X.AnonymousClass3KT.class
            X.1wn r0 = r5.A01
            r3.A01(r0, r1)
            java.lang.Class<X.3KU> r1 = X.AnonymousClass3KU.class
            X.1wn r0 = r5.A00
            r3.A01(r0, r1)
            java.lang.Class<X.3KV> r1 = X.AnonymousClass3KV.class
            X.1wn r0 = r5.A02
            r3.A01(r0, r1)
            com.instagram.common.session.UserSession r2 = r4.A0A
            X.2v9 r1 = X.C233162v9.SEE_TRANSLATION
            java.util.List r0 = X.AnonymousClass3KW.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0035
            X.3KZ r0 = X.AnonymousClass3KY.A00
            boolean r0 = X.AnonymousClass3KZ.A01(r2)
            if (r0 == 0) goto L_0x0035
        L_0x002d:
            java.lang.Class<X.3Jx> r1 = X.C240183Jx.class
            X.1wn r0 = r4.A09
            r3.A01(r0, r1)
        L_0x0034:
            return
        L_0x0035:
            java.util.List r0 = X.AnonymousClass3KW.A03
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0034
            X.3KZ r0 = X.AnonymousClass3KY.A00
            boolean r0 = X.AnonymousClass3KZ.A00(r2)
            if (r0 == 0) goto L_0x0034
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2361932u.onResume():void");
    }

    public final void onStart() {
        AnonymousClass1Nd.A00(this.A04.A0A).A01(this.A03, AnonymousClass3EJ.class);
    }

    public final void onStop() {
        AnonymousClass1Nd.A00(this.A04.A0A).A02(this.A03, AnonymousClass3EJ.class);
    }
}
