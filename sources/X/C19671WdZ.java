package X;

/* renamed from: X.WdZ  reason: case insensitive filesystem */
public final class C19671WdZ implements C295005nO {
    public final int A00;
    public final Object A01;

    public C19671WdZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0035;
                case 2: goto L_0x0070;
                case 3: goto L_0x007b;
                case 4: goto L_0x000f;
                case 5: goto L_0x0092;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.X84 r0 = (X.X84) r0
            if (r0 == 0) goto L_0x000e
            r0.DBo()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r5.A01
            X.Uh3 r2 = (X.C15697Uh3) r2
            java.lang.Integer r0 = r2.A09
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x00a2
            r0 = 2
            if (r1 != r0) goto L_0x000e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A09 = r0
            X.Ua1 r0 = r2.A0J
            if (r0 == 0) goto L_0x000e
            r0.A02()
            return
        L_0x002b:
            java.lang.Object r0 = r5.A01
            X.Upk r0 = (X.C16159Upk) r0
            X.UjZ r1 = r0.A01
            r0 = 0
            r1.A00 = r0
            return
        L_0x0035:
            java.lang.Object r4 = r5.A01
            X.W2i r4 = (X.W2i) r4
            java.util.List r2 = r4.A0E
            monitor-enter(r2)
            int r0 = r4.A01     // Catch:{ all -> 0x006d }
            int r1 = r0 + 1
            r4.A01 = r1     // Catch:{ all -> 0x006d }
            int r0 = r2.size()     // Catch:{ all -> 0x006d }
            if (r1 != r0) goto L_0x005f
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x006d }
            android.view.View r1 = r4.A07     // Catch:{ all -> 0x006d }
            java.lang.Runnable r0 = r4.A0C     // Catch:{ all -> 0x006d }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x006d }
            r1.post(r0)     // Catch:{ all -> 0x006d }
            java.lang.Runnable r0 = r4.A0D     // Catch:{ all -> 0x006d }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x006d }
            r1.post(r0)     // Catch:{ all -> 0x006d }
            monitor-exit(r2)
            return
        L_0x005f:
            monitor-exit(r2)
            android.view.View r3 = r4.A07
            X.Wiq r2 = new X.Wiq
            r2.<init>(r4)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0070:
            java.lang.Object r0 = r5.A01
            X.W2i r0 = (X.W2i) r0
            android.widget.ImageView r1 = r0.A02
            if (r1 != 0) goto L_0x008d
            java.lang.String r0 = "instructionImageView"
            goto L_0x0085
        L_0x007b:
            java.lang.Object r0 = r5.A01
            X.W2i r0 = (X.W2i) r0
            android.widget.TextView r1 = r0.A03
            if (r1 != 0) goto L_0x008d
            java.lang.String r0 = "instructionTextView"
        L_0x0085:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008d:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x0092:
            java.lang.Object r0 = r5.A01
            X.Wps r0 = (X.C20353Wps) r0
            X.WJp r0 = r0.A06
            android.view.ViewGroup r1 = r0.A00
            r1.getClass()
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x00a2:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A09 = r0
            X.C15697Uh3.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19671WdZ.onFinish():void");
    }
}
