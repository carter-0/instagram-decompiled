package X;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;

/* renamed from: X.SSw  reason: case insensitive filesystem */
public final class C11420SSw {
    public static final SKN A06 = new Object();
    public long A00;
    public final File A01;
    public final InputStream A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:8|9|10|11|12|(2:13|(4:15|(1:17)|18|(1:20)(0))(2:52|21))|22|23|(3:25|26|27)|28|29|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[Catch:{ FileNotFoundException -> 0x0072, all -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C10391RrS A01(java.lang.String r21, int r22) {
        /*
            r20 = this;
            r2 = r20
            java.util.Map r7 = r2.A05
            r8 = r21
            boolean r0 = r7.containsKey(r8)
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r7.get(r8)
            X.RrS r0 = (X.C10391RrS) r0
            return r0
        L_0x0013:
            r19 = 0
            java.io.File r0 = r2.A01     // Catch:{ FileNotFoundException -> 0x0081, all -> 0x007f }
            if (r0 == 0) goto L_0x007a
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0081, all -> 0x007f }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0081, all -> 0x007f }
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ FileNotFoundException -> 0x0072, all -> 0x006d }
            r0 = 0
            long r4 = r2.A00     // Catch:{ FileNotFoundException -> 0x0072, all -> 0x006d }
            r10 = 0
            r3 = 0
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r8)     // Catch:{ IOException -> 0x0055 }
            X.0qQ.A07(r9)     // Catch:{ IOException -> 0x0055 }
            r11 = r22
            byte[] r2 = new byte[r11]     // Catch:{ IOException -> 0x0055 }
            r6.skip(r0)     // Catch:{ IOException -> 0x0055 }
            r15 = 0
        L_0x0038:
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
            long r0 = (long) r11     // Catch:{ IOException -> 0x0055 }
            long r13 = r4 - r15
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0044
            r0 = r13
        L_0x0044:
            int r12 = (int) r0     // Catch:{ IOException -> 0x0055 }
            int r0 = r6.read(r2, r10, r12)     // Catch:{ IOException -> 0x0055 }
            if (r0 <= 0) goto L_0x0055
            r9.update(r2, r10, r0)     // Catch:{ IOException -> 0x0055 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0055 }
            long r15 = r15 + r0
            goto L_0x0038
        L_0x0051:
            byte[] r3 = r9.digest()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ FileNotFoundException -> 0x0072, all -> 0x006d }
            long r1 = r1 - r17
            if (r3 == 0) goto L_0x0067
            X.RrS r0 = new X.RrS     // Catch:{ FileNotFoundException -> 0x0072, all -> 0x006d }
            r0.<init>(r3, r1)     // Catch:{ FileNotFoundException -> 0x0072, all -> 0x006d }
            r7.put(r8, r0)     // Catch:{ FileNotFoundException -> 0x0074, all -> 0x006d }
            r19 = r0
        L_0x0067:
            r6.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006c
        L_0x006b:
            return r19
        L_0x006c:
            return r19
        L_0x006d:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0080 }
            throw r0
        L_0x0072:
            r0 = r19
        L_0x0074:
            r6.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x0079
        L_0x0078:
            return r0
        L_0x0079:
            return r0
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ FileNotFoundException -> 0x0081, all -> 0x007f }
            throw r0     // Catch:{ FileNotFoundException -> 0x0081, all -> 0x007f }
        L_0x007f:
            r0 = move-exception
        L_0x0080:
            throw r0
        L_0x0081:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11420SSw.A01(java.lang.String, int):X.RrS");
    }

    public C11420SSw(File file, String str, long j) {
        this.A05 = AnonymousClass7TE.A1E();
        this.A01 = file;
        this.A02 = null;
        String absolutePath = file.getAbsolutePath();
        String A002 = A00(file);
        this.A00 = j;
        this.A04 = str;
        this.A03 = SKN.A00(002.A0R(absolutePath, ""), str, A002, j);
    }

    private final String A00(File file) {
        long j;
        IllegalStateException illegalStateException;
        try {
            Path path = file.toPath();
            0qQ.A07(path);
            BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[0]);
            if (readAttributes != null) {
                FileTime creationTime = readAttributes.creationTime();
                if (creationTime != null) {
                    j = creationTime.toMillis();
                    String valueOf = String.valueOf(j);
                    File file2 = this.A01;
                    if (file2 != null) {
                        long lastModified = file2.lastModified();
                        StringBuilder A0n = AnonymousClass7TF.A0n(valueOf);
                        A0n.append('-');
                        return Pxe.A10(A0n, lastModified);
                    }
                    throw AnonymousClass7TE.A0y();
                }
                illegalStateException = AnonymousClass7TE.A0y();
            } else {
                illegalStateException = AnonymousClass7TE.A0y();
            }
            throw illegalStateException;
        } catch (Exception unused) {
            j = 0;
        }
    }

    public C11420SSw(File file, String str) {
        0qQ.A0B(file, 1);
        this.A05 = AnonymousClass7TE.A1E();
        this.A01 = file;
        this.A02 = null;
        String absolutePath = file.getAbsolutePath();
        this.A00 = file.length();
        this.A04 = str;
        this.A03 = SKN.A00(absolutePath, str, A00(file), this.A00);
    }

    public C11420SSw(File file, String str, String str2) {
        this.A05 = AnonymousClass7TE.A1E();
        this.A01 = file;
        this.A02 = null;
        file.getAbsolutePath();
        this.A00 = file.length();
        this.A04 = str;
        this.A03 = str2;
    }

    public C11420SSw(InputStream inputStream) {
        this.A05 = AnonymousClass7TE.A1E();
        this.A01 = null;
        this.A02 = inputStream;
        String A0O = 002.A0O("stream-", inputStream.hashCode());
        this.A00 = -1;
        this.A04 = "application/json";
        this.A03 = SKN.A00(002.A0R(A0O, ""), "application/json", "stream", -1);
    }
}
