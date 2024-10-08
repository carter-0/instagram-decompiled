package X;

import android.webkit.JavascriptInterface;
import net.trustly.android.sdk.views.TrustlyView;

public final class S43 {
    public final TrustlyView A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r7 = r9.split("\\|");
     */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void postMessage(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00a6
            boolean r0 = X.Pxi.A1Z(r9)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "\\|"
            java.lang.String[] r7 = r9.split(r0)
            int r6 = r7.length
            if (r6 == 0) goto L_0x00a6
            r0 = 0
            r1 = r7[r0]
            if (r1 == 0) goto L_0x00a6
            boolean r0 = X.Pxi.A1Z(r1)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "PayWithMyBank.event"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00a6
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.Integer r1 = X.C66580MXl.A0q()
            java.lang.String r0 = "page"
            r2.put(r1, r0)
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4127(0x101f, float:5.783E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.put(r1, r0)
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "merchantReference"
            r2.put(r1, r0)
            java.lang.Integer r1 = X.Pxe.A0l()
            java.lang.String r0 = "type"
            r2.put(r1, r0)
            r0 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "data"
            r2.put(r1, r0)
            java.lang.Integer r1 = X.Pxe.A0m()
            java.lang.String r0 = "transfer"
            r2.put(r1, r0)
            java.util.Iterator r4 = X.AnonymousClass7TF.A0s(r2)
        L_0x0071:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r0 = r1.getKey()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L_0x0071
            if (r0 >= r6) goto L_0x0071
            r2 = r7[r0]
            if (r2 == 0) goto L_0x0071
            java.lang.String r1 = r2.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "null"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0071
            r5.put(r3, r2)
            goto L_0x0071
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S43.postMessage(java.lang.String):void");
    }

    public S43(TrustlyView trustlyView) {
        this.A00 = trustlyView;
    }

    @JavascriptInterface
    public void resize(float f, float f2) {
        AnonymousClass7TF.A0D().post(new TJM(this, f, f2));
    }
}
