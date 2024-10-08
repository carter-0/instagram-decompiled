package X;

import java.io.File;

/* renamed from: X.Apz  reason: case insensitive filesystem */
public final class C41201Apz implements Runnable {
    public final /* synthetic */ 1Fd A00;
    public final /* synthetic */ AVP A01;
    public final /* synthetic */ 1Fg A02;
    public final /* synthetic */ File A03;

    public C41201Apz(1Fd r1, AVP avp, 1Fg r3, File file) {
        this.A01 = avp;
        this.A03 = file;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            long r1 = java.lang.System.currentTimeMillis()
            java.io.File r6 = r7.A03
            r6.setLastModified(r1)
            X.AVP r5 = r7.A01
            X.1Fd r0 = r7.A00
            java.lang.String r4 = r0.A02
            X.1Fg r3 = r7.A02
            long r1 = X.AnonymousClass7TE.A0P(r1)
            X.9g4 r0 = new X.9g4
            r0.<init>(r3, r4, r1)
            java.lang.String r4 = r6.getCanonicalPath()     // Catch:{ IOException -> 0x001f }
            goto L_0x0023
        L_0x001f:
            java.lang.String r4 = r6.getAbsolutePath()     // Catch:{ JSONException -> 0x0033 }
        L_0x0023:
            org.json.JSONObject r3 = r0.Ezz()     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r2 = "usage_timestamp_s"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x0033 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x0033 }
            X.1Lb r0 = r5.A00     // Catch:{ JSONException -> 0x0033 }
            r0.A02(r4, r3)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41201Apz.run():void");
    }
}
