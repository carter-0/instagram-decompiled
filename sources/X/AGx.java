package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public final class AGx {
    public static final AGx A00 = new Object();

    public final boolean A01(String str) {
        File A0t = AnonymousClass7TE.A0t(str);
        if (!A0t.exists() || !A0t.isFile()) {
            0I1.A03("UltraHdrUtils", 002.A0R("Invalid image file: ", str));
        } else {
            try {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(A0t), AnonymousClass15Q.A05);
                if (!(inputStreamReader instanceof BufferedReader)) {
                    inputStreamReader = new BufferedReader(inputStreamReader, 8192);
                }
                return A00(inputStreamReader);
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[SYNTHETIC, Splitter:B:23:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.io.Reader r17) {
        /*
            java.lang.String r10 = "http://ns.adobe.com/hdr-gain-map/1.0/"
            r15 = 262144(0x40000, double:1.295163E-318)
            r0 = 65536(0x10000, float:9.18355E-41)
            r9 = 65536(0x10000, float:9.18355E-41)
            r8 = 0
            r3 = 1
            int r2 = r10.length()
            if (r0 > r2) goto L_0x0013
            int r9 = r0 + r2
        L_0x0013:
            char[] r7 = new char[r9]
            int r6 = r2 - r3
            int r9 = r9 - r6
            long r0 = (long) r6
            long r4 = -r0
            X.2HY r12 = X.C229632nm.A0C(r3, r2)
            r11 = r9
        L_0x001f:
            r1 = r17
            if (r11 != r9) goto L_0x005a
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x005a
            int r11 = r1.read(r7, r6, r9)     // Catch:{ IOException -> 0x005a }
            int r14 = java.lang.Math.min(r9, r11)
            r13 = 0
        L_0x0030:
            if (r13 >= r14) goto L_0x0052
            char r1 = r10.charAt(r8)
            char r0 = r7[r13]
            if (r1 != r0) goto L_0x004f
            int r3 = r12.A00
            int r2 = r12.A01
            if (r3 > r2) goto L_0x005e
        L_0x0040:
            char r1 = r10.charAt(r3)
            int r0 = r13 + r3
            char r0 = r7[r0]
            if (r1 != r0) goto L_0x004f
            if (r3 == r2) goto L_0x005e
            int r3 = r3 + 1
            goto L_0x0040
        L_0x004f:
            int r13 = r13 + 1
            goto L_0x0030
        L_0x0052:
            if (r11 != r9) goto L_0x001f
            java.lang.System.arraycopy(r7, r9, r7, r8, r6)
            long r0 = (long) r9
            long r4 = r4 + r0
            goto L_0x001f
        L_0x005a:
            r1.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x0067
        L_0x005e:
            long r0 = (long) r13     // Catch:{ IOException -> 0x0067 }
            long r4 = r4 + r0
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGx.A00(java.io.Reader):boolean");
    }
}
