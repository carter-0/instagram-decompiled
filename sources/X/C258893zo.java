package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.3zo  reason: invalid class name and case insensitive filesystem */
public abstract class C258893zo {
    public static long A00(File file) {
        int length;
        long j = 0;
        if (!file.exists()) {
            return 0;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] A04 = A04(file);
        if (A04 == null || (length = A04.length) == 0) {
            return 0;
        }
        int i = 0;
        do {
            j += A00(A04[i]);
            i++;
        } while (i < length);
        return j;
    }

    public static S1t A01(File file) {
        int length;
        if (!file.exists() || A03(file)) {
            return new S1t(0, 0, 0);
        }
        if (!file.isDirectory()) {
            return A02(file, false);
        }
        S1t A02 = A02(file, true);
        File[] A04 = A04(file);
        if (A04 == null || (length = A04.length) == 0) {
            return A02;
        }
        long j = A02.A00;
        long j2 = A02.A02;
        int i = 0;
        long j3 = 1;
        do {
            S1t A01 = A01(A04[i]);
            j += A01.A00;
            j2 += A01.A02;
            j3 += A01.A01;
            i++;
        } while (i < length);
        return new S1t(j, j2, j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        X.0I1.A06("BigFoot", "The lstat method failed to return a valid response", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[ExcHandler: ErrnoException | NoSuchMethodError (r1v3 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.S1t A02(java.io.File r13, boolean r14) {
        /*
            long r9 = r13.length()
            java.lang.String r4 = "BigFoot"
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0022
            java.lang.String r1 = "The size for the file (-1) possibly caused by casting issue on the OS. File = "
            java.lang.String r0 = r13.getAbsolutePath()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0I1.A04(r4, r0)
            r9 = 1
            X.S1t r4 = new X.S1t
            r7 = r5
            r4.<init>(r5, r7, r9)
            return r4
        L_0x0022:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            java.lang.String r1 = "The size for the file (> 2GB) possibly caused by casting issue on the OS. File = "
            java.lang.String r0 = r13.getAbsolutePath()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0I1.A04(r4, r0)
            r11 = 1
            X.S1t r4 = new X.S1t
            r6 = r4
            r9 = r7
            r6.<init>(r7, r9, r11)
            return r4
        L_0x0040:
            r2 = -1
            java.lang.String r0 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0061, ErrnoException | NoSuchMethodError -> 0x0061 }
        L_0x004b:
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0061, ErrnoException | NoSuchMethodError -> 0x0061 }
            long r11 = r0.st_blocks     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0061, ErrnoException | NoSuchMethodError -> 0x0061 }
            r0 = 512(0x200, double:2.53E-321)
            long r11 = r11 * r0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            goto L_0x0067
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = "The lstat method failed to return a valid response"
            X.0I1.A06(r4, r0, r1)
        L_0x0067:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r9
            float r1 = r1 * r0
            r0 = 1166016512(0x45800000, float:4096.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            long r11 = (long) r0
            r0 = 4096(0x1000, double:2.0237E-320)
            long r11 = r11 * r0
        L_0x0077:
            if (r14 == 0) goto L_0x007b
            r9 = 0
        L_0x007b:
            r13 = 1
            X.S1t r4 = new X.S1t
            r8 = r4
            r8.<init>(r9, r11, r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258893zo.A02(java.io.File, boolean):X.S1t");
    }

    public static boolean A03(File file) {
        try {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (IOException unused) {
            return false;
        }
    }

    public static File[] A04(File file) {
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.listFiles();
        } catch (Exception e) {
            0I1.A07("BigFoot", 002.A0R("The path is invalid: ", file.getAbsolutePath()), e);
            return null;
        }
    }
}
