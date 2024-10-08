package X;

import com.facebook.xanalytics.XAnalyticsAdapter;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ssg  reason: case insensitive filesystem */
public final class C12392Ssg implements XAnalyticsAdapter {
    public static final C11102SAd A01 = new Object();
    public final UserSession A00;

    public final void cleanup() {
    }

    public final void flush() {
    }

    public final String getStructureSamplingConfig(String str) {
        return "";
    }

    public final void logCounter(String str, double d, String str2) {
        0qQ.A0B(str, 0);
    }

    public final void logEventBypassSampling(String str, String str2) {
        AnonymousClass7TF.A1H(str, str2);
        logEvent(str, str2, "", false, -1.0d);
    }

    public final boolean shouldLog(String str) {
        return true;
    }

    public C12392Ssg(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logEvent(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, double r12) {
        /*
            r7 = this;
            boolean r5 = X.AnonymousClass7TG.A1Z(r8, r9)
            java.lang.Class<X.Ssg> r0 = X.C12392Ssg.class
            java.lang.String r0 = r0.getSimpleName()
            X.0xI r2 = X.0xI.A01(r8, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            java.lang.String r0 = "UTF8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ IOException -> 0x00a3 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x00a3 }
            byte[] r0 = X.Pxf.A1V(r9, r0)     // Catch:{ IOException -> 0x00a3 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x00a3 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00a3 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x009c }
            r0.<init>(r3)     // Catch:{ all -> 0x009c }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ all -> 0x009c }
            r4.<init>(r0)     // Catch:{ all -> 0x009c }
            android.util.JsonToken r1 = r4.peek()     // Catch:{ all -> 0x0095 }
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ all -> 0x0095 }
            if (r1 != r0) goto L_0x008e
            r4.beginObject()     // Catch:{ all -> 0x0095 }
        L_0x003b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x008e
            java.lang.String r6 = r4.nextName()     // Catch:{ all -> 0x0095 }
            android.util.JsonToken r1 = r4.peek()     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x008a
            int[] r0 = X.A2Z.A00     // Catch:{ all -> 0x0095 }
            int r1 = X.Pxe.A08(r1, r0)     // Catch:{ all -> 0x0095 }
            if (r1 == r5) goto L_0x007e
            r0 = 2
            if (r1 == r0) goto L_0x0076
            r0 = 3
            if (r1 == r0) goto L_0x006a
            r0 = 4
            if (r1 != r0) goto L_0x008a
            X.0xF r1 = new X.0xF     // Catch:{ all -> 0x0095 }
            r1.<init>()     // Catch:{ all -> 0x0095 }
            X.SAd r0 = A01     // Catch:{ all -> 0x0095 }
            X.C11102SAd.A00(r4, r1, r0)     // Catch:{ all -> 0x0095 }
            r2.A05(r1, r6)     // Catch:{ all -> 0x0095 }
            goto L_0x003b
        L_0x006a:
            boolean r0 = r4.nextBoolean()     // Catch:{ all -> 0x0095 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0095 }
            r2.A09(r6, r0)     // Catch:{ all -> 0x0095 }
            goto L_0x003b
        L_0x0076:
            java.lang.String r0 = r4.nextString()     // Catch:{ all -> 0x0095 }
            r2.A0C(r6, r0)     // Catch:{ all -> 0x0095 }
            goto L_0x003b
        L_0x007e:
            double r0 = r4.nextDouble()     // Catch:{ all -> 0x0095 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0095 }
            r2.A0A(r6, r0)     // Catch:{ all -> 0x0095 }
            goto L_0x003b
        L_0x008a:
            r4.skipValue()     // Catch:{ all -> 0x0095 }
            goto L_0x003b
        L_0x008e:
            r4.close()     // Catch:{ all -> 0x009c }
            r3.close()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00a3
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.1zE.A00(r4, r1)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ IOException -> 0x00a3 }
            throw r0     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            com.instagram.common.session.UserSession r0 = r7.A00
            X.DbU.A1R(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12392Ssg.logEvent(java.lang.String, java.lang.String, java.lang.String, boolean, double):void");
    }

    public final void logCounter(String str, double d) {
        0qQ.A0B(str, 0);
    }
}
