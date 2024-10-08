package X;

import java.io.File;
import java.util.regex.Pattern;

public final class Qoa extends 2R9 {
    public static final Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern A02 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.Qoa A00(X.C11282SJa r15, java.io.File r16, long r17) {
        /*
            r3 = r16
            r11 = r17
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = ".v3.exo"
            boolean r0 = r1.endsWith(r0)
            r6 = 0
            r2 = r15
            if (r0 != 0) goto L_0x0064
            java.lang.String r5 = r3.getName()
            java.util.regex.Pattern r0 = A01
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.matches()
            r4 = 1
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = X.Pxf.A0o(r1, r4)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.A0D(r0)
            if (r0 != 0) goto L_0x003e
        L_0x002d:
            return r6
        L_0x002e:
            java.util.regex.Pattern r0 = A00
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = X.Pxf.A0o(r1, r4)
        L_0x003e:
            java.io.File r13 = r3.getParentFile()
            X.C256703wD.A01(r13)
            X.S7Y r0 = r15.A01(r0)
            int r14 = r0.A01
            r0 = 2
            long r15 = X.Pxi.A0A(r1, r0)
            r0 = 3
            long r17 = X.Pxi.A0A(r1, r0)
            java.io.File r7 = A01(r13, r14, r15, r17)
            boolean r0 = r3.renameTo(r7)
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = r7.getName()
            goto L_0x0065
        L_0x0064:
            r7 = r3
        L_0x0065:
            java.util.regex.Pattern r0 = A02
            java.util.regex.Matcher r3 = r0.matcher(r1)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L_0x002d
            r0 = 1
            int r1 = X.Pxi.A07(r3, r0)
            android.util.SparseArray r0 = r2.A01
            java.lang.Object r8 = r0.get(r1)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x002d
            r1 = -1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008a
            long r11 = r7.length()
        L_0x008a:
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            r0 = 2
            long r9 = X.Pxi.A0A(r3, r0)
            r0 = 3
            long r13 = X.Pxi.A0A(r3, r0)
            X.Qoa r6 = new X.Qoa
            r6.<init>(r7, r8, r9, r11, r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qoa.A00(X.SJa, java.io.File, long):X.Qoa");
    }

    public static File A01(File file, int i, long j, long j2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(i);
        A1A.append(".");
        A1A.append(j);
        A1A.append(".");
        A1A.append(j2);
        return JTO.A0s(file, AnonymousClass7TF.A0l(".v3.exo", A1A));
    }
}
