package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedList;

/* renamed from: X.Orj  reason: case insensitive filesystem */
public final class C71842Orj implements 29o {
    public final LinkedList A00 = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b A[SYNTHETIC, Splitter:B:13:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map B3P(com.instagram.common.session.UserSession r7, java.io.File r8) {
        /*
            r6 = this;
            r0 = 1
            X.0qQ.A0B(r8, r0)
            java.lang.String r0 = "direct_search.txt"
            java.io.File r4 = X.JTO.A0s(r8, r0)
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r4)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            boolean r0 = r2 instanceof java.io.BufferedWriter
            if (r0 != 0) goto L_0x0022
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r2, r1)
            r2 = r0
        L_0x0022:
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r2)
            r5 = r6
            monitor-enter(r5)     // Catch:{ all -> 0x007f }
        L_0x0029:
            java.util.LinkedList r1 = r6.A00     // Catch:{ all -> 0x007c }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006b
            java.lang.Object r2 = r1.remove()     // Catch:{ all -> 0x007c }
            X.0eP r2 = (X.0eP) r2     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Search query: %-30s"
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x007c }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r0)     // Catch:{ all -> 0x007c }
            r3.write(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "\n"
            r3.write(r0)     // Catch:{ all -> 0x007c }
            java.lang.Object r0 = r2.A01     // Catch:{ all -> 0x007c }
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)     // Catch:{ all -> 0x007c }
        L_0x004d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x007c }
            com.instagram.model.direct.DirectSearchResult r0 = (com.instagram.model.direct.DirectSearchResult) r0     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r0.AEB()     // Catch:{ all -> 0x007c }
            r0 = 10
            java.lang.String r0 = X.002.A0C(r1, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0)     // Catch:{ all -> 0x007c }
            r3.write(r0)     // Catch:{ all -> 0x007c }
            goto L_0x004d
        L_0x006b:
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            r3.close()
            java.lang.String r1 = r4.getName()
            android.net.Uri r0 = android.net.Uri.fromFile(r4)
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r1, r0)
            return r0
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71842Orj.B3P(com.instagram.common.session.UserSession, java.io.File):java.util.Map");
    }

    public final boolean CK5(UserSession userSession, String str) {
        return true;
    }

    public final void Epo(long j) {
    }

    public final String getTag() {
        return "DirectSearchFlytrapExtrasProvider";
    }
}
