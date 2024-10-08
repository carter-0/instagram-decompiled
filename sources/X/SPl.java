package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public abstract class SPl {
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.jar.JarFile, java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0343  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.OHC A00(java.io.File r18, java.util.Set r19) {
        /*
            r3 = 0
            X.Rz0 r2 = new X.Rz0
            r2.<init>()
            r5 = r18
            r2.A01 = r5
            java.util.jar.JarFile r4 = new java.util.jar.JarFile     // Catch:{ RCF -> 0x0324, IOException -> 0x0321, all -> 0x0347 }
            r4.<init>(r5)     // Catch:{ RCF -> 0x0324, IOException -> 0x0321, all -> 0x0347 }
            java.lang.String r0 = "AndroidManifest.xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x02f1
            java.io.InputStream r3 = r4.getInputStream(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0.<init>(r3)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            X.SPH r8 = new X.SPH     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r8.<init>((java.io.DataInputStream) r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.A01 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r7 = 0
            r8.A00 = r7     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            short r9 = r8.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            short r6 = r8.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r1 = r8.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0 = 3
            if (r9 != r0) goto L_0x02ed
            int r0 = r1 + -8
            r8.A01 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r8.A00 = r7     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6 + -8
            if (r0 <= 0) goto L_0x0048
            r8.A04(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x0048:
            X.SPH r6 = new X.SPH     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.<init>((X.SPH) r8)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x004d:
            int r1 = r8.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r8.A01     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r1 >= r0) goto L_0x02c4
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.A01 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A00 = r7     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            short r1 = r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            short r11 = r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r0 + -8
            r6.A01 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A00 = r7     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r9 = 1
            if (r1 == r9) goto L_0x0186
            r0 = 258(0x102, float:3.62E-43)
            if (r1 == r0) goto L_0x0098
            r0 = 259(0x103, float:3.63E-43)
            if (r1 != r0) goto L_0x026f
            int r0 = r2.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r0 - r9
            r2.A00 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r0 + 8
            int r11 = r11 - r0
            if (r11 <= 0) goto L_0x008b
            r6.A04(r11)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x008b:
            int r1 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r1 >= 0) goto L_0x0250
            r1 = 0
            goto L_0x0254
        L_0x0098:
            r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r0 + 8
            int r11 = r11 - r0
            if (r11 <= 0) goto L_0x00a8
            r6.A04(r11)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x00a8:
            int r12 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r10 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            short r1 = r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            short r11 = r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r0 - r12
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x00ce
            r6.A04(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x00ce:
            java.lang.String r10 = A01(r2, r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "manifest"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x0108
            int r0 = r2.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 != 0) goto L_0x0108
            r2.A0B = r9     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.util.HashMap r1 = A02(r6, r2, r11)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "package"
            java.lang.String r0 = X.DbS.A0r(r0, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r2.A02 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = "versionName"
            java.lang.String r0 = X.DbS.A0r(r0, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r2.A04 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x02fc
            java.lang.String r0 = "versionCode"
            java.lang.String r0 = X.DbS.A0r(r0, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r2.A03 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 != 0) goto L_0x011a
            goto L_0x028a
        L_0x0108:
            java.lang.String r0 = "application"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x012a
            boolean r0 = r2.A0B     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x012a
            int r0 = r2.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 != r9) goto L_0x012a
            r2.A0A = r9     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x011a:
            int r1 = r6.A01     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r1 = r1 - r0
            r6.A04(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r2.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x026f
        L_0x012a:
            r0 = r19
            boolean r0 = r0.contains(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x011a
            boolean r0 = r2.A0A     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x011a
            int r1 = r2.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0 = 2
            if (r1 != r0) goto L_0x011a
            java.util.HashMap r1 = A02(r6, r2, r11)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "name"
            java.lang.Object r1 = r1.get(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r1 == 0) goto L_0x0292
            java.lang.String r0 = "activity"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 != 0) goto L_0x0183
            r0 = 2576(0xa10, float:3.61E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 != 0) goto L_0x0183
            java.lang.String r0 = "receiver"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x016b
            java.util.List r0 = r2.A07     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x0167:
            r0.add(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x011a
        L_0x016b:
            java.lang.String r0 = "service"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x0177
            java.util.List r0 = r2.A08     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x0167
        L_0x0177:
            java.lang.String r0 = "provider"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x011a
            java.util.List r0 = r2.A06     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x0167
        L_0x0183:
            java.util.List r0 = r2.A05     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x0167
        L_0x0186:
            int r13 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r9 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r10 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r18 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r0 + 8
            int r11 = r11 - r0
            if (r11 < 0) goto L_0x02a6
            if (r11 <= 0) goto L_0x01a5
            r6.A04(r11)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x01a5:
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r1 = 0
        L_0x01aa:
            if (r1 >= r13) goto L_0x01ba
            int r0 = r6.A02()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            X.C66581MXm.A1S(r0, r12, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r1 = r1 + 1
            goto L_0x01aa
        L_0x01ba:
            int r0 = r9 * 4
            r6.A04(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r9 = r18 + -8
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r9 = r9 - r0
            if (r9 < 0) goto L_0x02b3
            if (r9 <= 0) goto L_0x01cb
            r6.A04(r9)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x01cb:
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d4
            r17 = 1
            java.lang.String r0 = "UTF-8"
            goto L_0x01d8
        L_0x01d4:
            r17 = 0
            java.lang.String r0 = "UTF-16LE"
        L_0x01d8:
            java.nio.charset.Charset r16 = java.nio.charset.Charset.forName(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r11 = 0
        L_0x01dd:
            if (r11 >= r13) goto L_0x0247
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r9 = r0 + 8
            int r9 = r9 - r18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            boolean r0 = r12.containsKey(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x029b
            java.lang.Object r10 = r12.get(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r9 = "each string is expected to end with \\0 terminator."
            r14 = 2
            if (r17 == 0) goto L_0x0218
            r1 = 0
        L_0x01f9:
            byte r0 = r6.A01()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r15 = r0 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x020a
            byte r15 = r6.A01()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 8
            r0 = r0 | r15
        L_0x020a:
            int r1 = r1 + 1
            if (r1 < r14) goto L_0x01f9
            byte[] r14 = new byte[r0]     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A05(r14)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            byte r0 = r6.A01()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x0236
        L_0x0218:
            short r0 = r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x022b
            short r1 = r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0 = r0 & 32767(0x7fff, float:4.5916E-41)
            int r0 = r0 << 16
            r0 = r0 | r1
        L_0x022b:
            int r0 = r0 * 2
            byte[] r14 = new byte[r0]     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r6.A05(r14)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            short r0 = r6.A03()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x0236:
            if (r0 != 0) goto L_0x02ff
            java.lang.String r1 = new java.lang.String     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0 = r16
            r1.<init>(r14, r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.util.Map r0 = r2.A09     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r0.put(r10, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r11 = r11 + 1
            goto L_0x01dd
        L_0x0247:
            int r1 = r6.A01     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r1 = r1 - r0
            r6.A04(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x026f
        L_0x0250:
            java.lang.String r1 = A01(r2, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x0254:
            java.lang.String r10 = A01(r2, r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            boolean r1 = r0.equals(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r1 == 0) goto L_0x0279
            java.lang.String r0 = "manifest"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x0279
            int r0 = r2.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 != 0) goto L_0x0279
            r2.A0B = r7     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x026f:
            int r1 = r6.A01     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r0 = r6.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            int r1 = r1 - r0
            r6.A04(r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x004d
        L_0x0279:
            if (r1 == 0) goto L_0x026f
            java.lang.String r0 = "application"
            boolean r0 = r0.equals(r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 == 0) goto L_0x026f
            int r0 = r2.A00     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r0 != r9) goto L_0x026f
            r2.A0A = r7     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x026f
        L_0x028a:
            java.lang.String r9 = "manifest does not have version code specified."
            goto L_0x02ff
        L_0x028e:
            java.lang.String r9 = "manifest does not have package name specified."
            goto L_0x02ff
        L_0x0292:
            java.lang.String r1 = "component tag "
            java.lang.String r0 = " did not include name attribute."
            java.lang.String r9 = X.002.A0g(r1, r10, r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x02ff
        L_0x029b:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "offset doesn't match string index: offset="
            r1.append(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x02bc
        L_0x02a6:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "consumed too much data from string header: "
            r1.append(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r1.append(r11)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x02bf
        L_0x02b3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "consumed too much data from string index table: "
            r1.append(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x02bc:
            r1.append(r9)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x02bf:
            java.lang.String r9 = r1.toString()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x02ff
        L_0x02c4:
            java.util.List r10 = r2.A05     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            A03(r2, r10)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.util.List r11 = r2.A07     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            A03(r2, r11)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.util.List r12 = r2.A06     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            A03(r2, r12)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.util.List r0 = r2.A08     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            A03(r2, r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r7 = r2.A02     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r8 = r2.A03     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r9 = r2.A04     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            X.OHC r6 = new X.OHC     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r13 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            if (r3 == 0) goto L_0x02e9
            r3.close()
        L_0x02e9:
            r4.close()
            return r6
        L_0x02ed:
            java.lang.String r9 = "stream is not an xml resource."
            goto L_0x02ff
        L_0x02f1:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "No manifest found in "
            java.io.FileNotFoundException r1 = X.Pxj.A0b(r5, r0, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            goto L_0x0318
        L_0x02fc:
            java.lang.String r9 = "manifest does not have version name specified."
        L_0x02ff:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = "Failed to parse AndroidManifest.xml in "
            r1.append(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.io.File r0 = r2.A01     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r1.append(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            java.lang.String r0 = ": "
            java.lang.String r0 = X.Pxg.A0s(r0, r9, r1)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            X.RCF r1 = new X.RCF     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
            r1.<init>(r0)     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x0318:
            throw r1     // Catch:{ RCF -> 0x031d, IOException -> 0x0319, all -> 0x033b }
        L_0x0319:
            r2 = move-exception
            r6 = r3
            r3 = r4
            goto L_0x0327
        L_0x031d:
            r1 = move-exception
            r6 = r3
            r3 = r4
            goto L_0x0336
        L_0x0321:
            r2 = move-exception
            r6 = r3
            goto L_0x0327
        L_0x0324:
            r1 = move-exception
            r6 = r3
            goto L_0x0336
        L_0x0327:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0337 }
            java.lang.String r0 = "Failed to parse manifest from "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)     // Catch:{ all -> 0x0337 }
            X.RCF r1 = new X.RCF     // Catch:{ all -> 0x0337 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0337 }
        L_0x0336:
            throw r1     // Catch:{ all -> 0x0337 }
        L_0x0337:
            r0 = move-exception
            r4 = r3
            r3 = r6
            goto L_0x033c
        L_0x033b:
            r0 = move-exception
        L_0x033c:
            if (r3 == 0) goto L_0x0341
            r3.close()
        L_0x0341:
            if (r4 == 0) goto L_0x0348
            r4.close()
            throw r0
        L_0x0347:
            r0 = move-exception
        L_0x0348:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPl.A00(java.io.File, java.util.Set):X.OHC");
    }

    public static void A03(C10840Rz0 rz0, List list) {
        String str;
        StringBuilder A0n;
        int i = 0;
        while (i < list.size()) {
            String A19 = AnonymousClass7TE.A19(list, i);
            if (A19 == null || A19.length() == 0) {
                str = "Empty component name.";
            } else {
                String str2 = rz0.A02;
                if (str2 == null || str2.length() == 0) {
                    str = "Package name is empty.";
                } else {
                    int indexOf = A19.indexOf(46);
                    if (indexOf == 0) {
                        A0n = AnonymousClass7TE.A1A();
                    } else if (indexOf < 0) {
                        A0n = AnonymousClass7TF.A0n(str2);
                        str2 = ".";
                    } else {
                        list.set(i, A19);
                        i++;
                    }
                    A19 = Pxg.A0s(str2, A19, A0n);
                    list.set(i, A19);
                    i++;
                }
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Failed to parse AndroidManifest.xml in ");
            A1A.append(rz0.A01);
            throw new IOException(Pxg.A0s(": ", str, A1A));
        }
    }

    public static String A01(C10840Rz0 rz0, int i) {
        String str = (String) C51968G9o.A10(rz0.A09, i);
        if (str != null) {
            return str;
        }
        throw DbW.A0b("String not found: ", i);
    }

    public static HashMap A02(SPH sph, C10840Rz0 rz0, int i) {
        String A01;
        HashMap A1E = AnonymousClass7TE.A1E();
        for (int i2 = 0; i2 < i; i2++) {
            int A02 = sph.A02();
            int A022 = sph.A02();
            int A023 = sph.A02();
            int i3 = sph.A00;
            short A03 = sph.A03();
            sph.A01();
            sph.A01();
            int A024 = sph.A02();
            int i4 = A03 - (sph.A00 - i3);
            if (i4 > 0) {
                sph.A04(i4);
            }
            if (A02 >= 0) {
                A01(rz0, A02);
            }
            String A012 = A01(rz0, A022);
            if (A023 < 0) {
                A01 = Integer.toString(A024);
                if (A01 == null) {
                }
            } else {
                A01 = A01(rz0, A023);
            }
            A1E.put(A012, A01);
        }
        return A1E;
    }
}
