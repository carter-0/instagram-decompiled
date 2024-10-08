package X;

import android.os.Process;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class OWz {
    public static HashMap A00() {
        try {
            HashMap A01 = A01();
            if (A01 == null) {
                return null;
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            Iterator A0s = AnonymousClass7TF.A0s(A01);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                OMM A012 = OYL.A01(OYL.A02(StringFormatUtil.formatStrLocaleSafe("/proc/%d/task/%s/stat", Integer.valueOf(Process.myPid()), A1J.getKey())));
                if (A012 != null) {
                    A1E.put(DbT.A13(A1J), new Pair(A1J.getValue(), A012));
                }
            }
            return A1E;
        } catch (Exception e) {
            0KC.A05(OWz.class, "Error getting thread level CPU Usage data", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap A01() {
        /*
            android.os.StrictMode$ThreadPolicy r11 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r7 = "/proc/self/task"
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            r10 = 0
            java.io.File r8 = X.AnonymousClass7TE.A0t(r7)     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            java.io.File[] r6 = r8.listFiles()     // Catch:{ Exception -> 0x004f }
            if (r6 == 0) goto L_0x004b
            int r5 = r6.length     // Catch:{ Exception -> 0x004f }
            r4 = 0
        L_0x0017:
            if (r4 >= r5) goto L_0x004b
            r3 = r6[r4]     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = r3.getName()     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = "/proc/self/task/%s/comm"
            java.lang.String r2 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = "r"
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x003e }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x003e }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0034 }
            r0.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x003f
        L_0x0034:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x003e }
        L_0x003d:
            throw r1     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = r3.getName()     // Catch:{ Exception -> 0x004f }
            r9.put(r0, r1)     // Catch:{ Exception -> 0x004f }
        L_0x0048:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x004b:
            android.os.StrictMode.setThreadPolicy(r11)
            return r9
        L_0x004f:
            r2 = move-exception
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            goto L_0x0068
        L_0x0053:
            r2 = move-exception
            r8 = r10
        L_0x0055:
            java.lang.String r0 = "Error getting threads from task directory: %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r7)     // Catch:{ all -> 0x0066 }
            java.lang.Class<X.OWz> r0 = X.OWz.class
            X.0KC.A06(r0, r1, r2)     // Catch:{ all -> 0x0066 }
            if (r8 == 0) goto L_0x0065
            android.os.StrictMode.setThreadPolicy(r11)
        L_0x0065:
            return r10
        L_0x0066:
            r0 = move-exception
            r10 = r8
        L_0x0068:
            if (r10 == 0) goto L_0x006d
            android.os.StrictMode.setThreadPolicy(r11)
        L_0x006d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWz.A01():java.util.HashMap");
    }
}
