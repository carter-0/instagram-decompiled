package X;

import android.system.Os;
import android.system.OsConstants;
import java.util.Locale;

public abstract class OYL {
    public static long A00;
    public static boolean A01;

    public static double A00(String[] strArr, int i, long j) {
        if (i >= strArr.length) {
            return 0.0d;
        }
        if (j > 0) {
            String str = strArr[i];
            try {
                return ((double) Long.parseLong(str)) / ((double) j);
            } catch (NumberFormatException e) {
                0KC.A0H("CpuInfoUtils", String.format(Locale.US, "Error parsing %d /proc/[pid]/stat field as long: %s", new Object[]{Integer.valueOf(i), str}), e);
                return 0.0d;
            }
        } else {
            throw AnonymousClass7TE.A0w("clockTicksPerSecond should be positive.");
        }
    }

    public static OMM A01(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        if (!A01) {
            A00 = Os.sysconf(OsConstants._SC_CLK_TCK);
            A01 = true;
        }
        long j = A00;
        double A002 = A00(strArr, 13, j);
        double A003 = A00(strArr, 14, j);
        A00(strArr, 15, j);
        A00(strArr, 16, j);
        return new OMM(A002, A003);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[SYNTHETIC, Splitter:B:23:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[SYNTHETIC, Splitter:B:33:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] A02(java.lang.String r9) {
        /*
            java.lang.String r5 = "Error closing procfs file: %s"
            java.io.File r0 = X.AnonymousClass7TE.A0t(r9)
            boolean r0 = r0.exists()
            r8 = 0
            if (r0 != 0) goto L_0x0015
            java.lang.String r1 = "CpuInfoUtils"
            java.lang.String r0 = "stat file not found "
            X.C66580MXl.A1U(r0, r9, r1)
        L_0x0014:
            return r8
        L_0x0015:
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0046, all -> 0x0071 }
            r6.<init>(r9, r0)     // Catch:{ Exception -> 0x0046, all -> 0x0071 }
            java.lang.String r3 = r6.readLine()     // Catch:{ Exception -> 0x0044 }
            r6.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x0038
        L_0x0028:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            java.lang.String r0 = "CpuInfoUtils"
            X.0KC.A0H(r0, r1, r2)
        L_0x0038:
            android.os.StrictMode.setThreadPolicy(r7)
            if (r3 == 0) goto L_0x0014
            java.lang.String r0 = " "
            java.lang.String[] r8 = r3.split(r0)
            return r8
        L_0x0044:
            r4 = move-exception
            goto L_0x0048
        L_0x0046:
            r4 = move-exception
            r6 = r8
        L_0x0048:
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Error reading cpu time from procfs file: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x006f }
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "CpuInfoUtils"
            X.0KC.A0H(r2, r0, r4)     // Catch:{ all -> 0x006f }
            if (r6 == 0) goto L_0x0014
            r6.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x006b
        L_0x005f:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r0 = java.lang.String.format(r3, r5, r0)
            X.0KC.A0H(r2, r0, r1)
        L_0x006b:
            android.os.StrictMode.setThreadPolicy(r7)
            return r8
        L_0x006f:
            r3 = move-exception
            goto L_0x0073
        L_0x0071:
            r3 = move-exception
            r6 = r8
        L_0x0073:
            if (r6 == 0) goto L_0x008c
            r6.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x0089
        L_0x0079:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            java.lang.String r0 = "CpuInfoUtils"
            X.0KC.A0H(r0, r1, r2)
        L_0x0089:
            android.os.StrictMode.setThreadPolicy(r7)
        L_0x008c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OYL.A02(java.lang.String):java.lang.String[]");
    }
}
