package X;

import java.util.concurrent.Callable;

/* renamed from: X.Ary  reason: case insensitive filesystem */
public final class C41318Ary implements Callable {
    public final int A00;
    public final Object A01;

    public C41318Ary(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011a, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x007b;
                case 1: goto L_0x0083;
                case 2: goto L_0x008c;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00ee;
                case 6: goto L_0x010c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            X.3su r2 = (X.C254703su) r2
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A1g
            if (r1 != r0) goto L_0x0078
            X.7AG r0 = r2.A0Q
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = r2.A1q
            if (r0 == 0) goto L_0x0078
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.NiT r4 = X.C69267NiT.E2EE
            r3 = 0
            java.util.Iterator r5 = r0.iterator()
        L_0x0026:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.String r2 = X.AnonymousClass7TE.A18(r5)
            X.0qQ.A0B(r2, r3)
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0026
            r0 = 25
            if (r1 <= r0) goto L_0x0042
            X.OKb r0 = X.C70397O4z.A00
            r0.A00(r4, r2)
        L_0x0042:
            java.lang.String r0 = " "
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.00l.A0R(r2, r0, r3)
            java.util.Iterator r2 = r0.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0072
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0050
        L_0x0072:
            X.OKb r0 = X.C70397O4z.A01
            r0.A00(r4, r1)
            goto L_0x0050
        L_0x0078:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x007b:
            java.lang.Object r0 = r6.A01
            X.AUw r0 = (X.C40182AUw) r0
            X.C40182AUw.A00(r0)
            goto L_0x008a
        L_0x0083:
            java.lang.Object r0 = r6.A01
            X.AUx r0 = (X.C40183AUx) r0
            X.C40183AUx.A01(r0)
        L_0x008a:
            r0 = 0
            return r0
        L_0x008c:
            java.lang.Object r0 = r6.A01
            X.86O r0 = (X.AnonymousClass86O) r0
            X.1Vg r3 = r0.A02
            X.1WV r2 = r3.acquire()
            X.3oI r1 = r0.A01     // Catch:{ all -> 0x00ab }
            r1.beginTransaction()     // Catch:{ all -> 0x00ab }
            X.0gF r0 = X.AnonymousClass7TF.A10(r1, r2)     // Catch:{ all -> 0x00a6 }
            r1.endTransaction()     // Catch:{ all -> 0x00ab }
            r3.release(r2)
            return r0
        L_0x00a6:
            r0 = move-exception
            r1.endTransaction()     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            r3.release(r2)
            throw r0
        L_0x00b0:
            java.lang.Object r0 = r6.A01
            X.8Hc r0 = (X.C353308Hc) r0
            X.8AL r1 = r0.A01
            r0 = 0
            r1.A08(r0)
            goto L_0x010a
        L_0x00bb:
            java.lang.Object r2 = r6.A01
            X.8O4 r2 = (X.AnonymousClass8O4) r2
            android.view.View r0 = r2.A03
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            r0.getClass()
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getWidth()
            android.view.View r0 = r2.A03
            r0.getClass()
            int r0 = r0.getWidth()
            int r1 = r1 - r0
            int r1 = r1 / 2
            r2.A00 = r1
            com.instagram.ui.text.fittingtextview.FittingTextView r0 = r2.A0L
            if (r0 == 0) goto L_0x00e6
            r0.setMaxWidth(r1)
        L_0x00e6:
            com.instagram.ui.text.fittingtextview.FittingTextView r0 = r2.A0K
            if (r0 == 0) goto L_0x0115
            r0.setMaxWidth(r1)
            goto L_0x0115
        L_0x00ee:
            java.lang.Object r3 = r6.A01
            X.AOZ r3 = (X.AOZ) r3
            android.view.ViewGroup r2 = r3.A00
            r2.getClass()
            android.view.View r0 = r3.A08
            int r1 = r0.getHeight()
            android.view.ViewGroup r0 = r3.A00
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            int r0 = r1 / 2
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x010a:
            r0 = 1
            goto L_0x0116
        L_0x010c:
            java.lang.Object r0 = r6.A01
            X.AOY r0 = (X.AOY) r0
            X.8Jc r0 = r0.A00
            X.C353798Jc.A0D(r0)
        L_0x0115:
            r0 = 0
        L_0x0116:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41318Ary.call():java.lang.Object");
    }
}
