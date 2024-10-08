package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Q1Z {
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r1 = new java.io.EOFException("Unexpected end of gif file");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if ("image/gif".equals(X.Q1U.A00(r6.getPath(), "video/mp4", false)) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(X.C13725Tfv r14, X.C266754aI r15) {
        /*
            r7 = 0
            java.io.File r6 = r15.A04
            if (r6 == 0) goto L_0x0019
            java.lang.String r1 = r6.getPath()
            java.lang.String r0 = "video/mp4"
            java.lang.String r1 = X.Q1U.A00(r1, r0, r7)
            java.lang.String r0 = "image/gif"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r8 = 0
            if (r0 == 0) goto L_0x025d
            long r1 = r15.A02
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0265
            if (r6 == 0) goto L_0x0265
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x025b }
            r5.<init>(r6)     // Catch:{ all -> 0x025b }
            r0 = 256(0x100, float:3.59E-43)
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0256 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0256 }
            r11.<init>()     // Catch:{ all -> 0x0256 }
            r12 = 0
            r0 = 6
            int r0 = r5.read(r4, r7, r0)     // Catch:{ all -> 0x0256 }
            r3 = -1
            if (r0 == r3) goto L_0x023c
            byte r0 = r4[r7]     // Catch:{ all -> 0x0256 }
            short r0 = (short) r0     // Catch:{ all -> 0x0256 }
            r8 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r8
            char r1 = (char) r0     // Catch:{ all -> 0x0256 }
            r10 = 4
            r2 = 2
            r6 = 1
            r0 = 71
            if (r0 != r1) goto L_0x0234
            r1 = 73
            byte r0 = r4[r6]     // Catch:{ all -> 0x0256 }
            short r0 = (short) r0     // Catch:{ all -> 0x0256 }
            r0 = r0 & r8
            char r0 = (char) r0     // Catch:{ all -> 0x0256 }
            if (r1 != r0) goto L_0x0234
            r1 = 70
            byte r0 = r4[r2]     // Catch:{ all -> 0x0256 }
            short r0 = (short) r0     // Catch:{ all -> 0x0256 }
            r0 = r0 & r8
            char r0 = (char) r0     // Catch:{ all -> 0x0256 }
            if (r1 != r0) goto L_0x0234
            r1 = 56
            r0 = 3
            byte r0 = r4[r0]     // Catch:{ all -> 0x0256 }
            short r0 = (short) r0     // Catch:{ all -> 0x0256 }
            r0 = r0 & r8
            char r0 = (char) r0     // Catch:{ all -> 0x0256 }
            if (r1 != r0) goto L_0x0234
            r9 = 55
            byte r0 = r4[r10]     // Catch:{ all -> 0x0256 }
            short r0 = (short) r0     // Catch:{ all -> 0x0256 }
            r0 = r0 & r8
            char r1 = (char) r0     // Catch:{ all -> 0x0256 }
            if (r9 == r1) goto L_0x0075
            r0 = 57
            if (r0 != r1) goto L_0x0234
        L_0x0075:
            r1 = 97
            r0 = 5
            byte r0 = r4[r0]     // Catch:{ all -> 0x0256 }
            short r0 = (short) r0     // Catch:{ all -> 0x0256 }
            r8 = r8 & r0
            char r0 = (char) r8     // Catch:{ all -> 0x0256 }
            if (r1 != r0) goto L_0x0234
            r0 = 4
            r5.skip(r0)     // Catch:{ all -> 0x0256 }
            int r1 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r1 == r3) goto L_0x022c
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x008f
            r12 = 1
        L_0x008f:
            r0 = r1 & 7
            int r0 = r2 << r0
            r9 = 2
            r5.skip(r9)     // Catch:{ all -> 0x0256 }
            if (r12 == 0) goto L_0x00a0
            int r0 = r0 * 3
            long r0 = (long) r0     // Catch:{ all -> 0x0256 }
            r5.skip(r0)     // Catch:{ all -> 0x0256 }
        L_0x00a0:
            int[] r8 = new int[r2]     // Catch:{ all -> 0x0256 }
            r8 = {0, 0} // fill-array     // Catch:{ all -> 0x0256 }
        L_0x00a5:
            int r1 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r1 == r3) goto L_0x0224
            r0 = 33
            if (r1 == r0) goto L_0x00f6
            r0 = 44
            if (r1 == r0) goto L_0x00b9
            r0 = 59
            if (r1 != r0) goto L_0x0244
            goto L_0x0193
        L_0x00b9:
            int[] r0 = java.util.Arrays.copyOf(r8, r2)     // Catch:{ all -> 0x0256 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0256 }
            r11.add(r0)     // Catch:{ all -> 0x0256 }
            r0 = 8
            r5.skip(r0)     // Catch:{ all -> 0x0256 }
            int r1 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r1 == r3) goto L_0x01cb
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00dc
            r0 = r1 & 7
            int r0 = r2 << r0
            int r0 = r0 * 3
            long r0 = (long) r0     // Catch:{ all -> 0x0256 }
            r5.skip(r0)     // Catch:{ all -> 0x0256 }
        L_0x00dc:
            r0 = 1
            r5.skip(r0)     // Catch:{ all -> 0x0256 }
        L_0x00e1:
            int r12 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r12 == r3) goto L_0x01c2
            r1 = 0
            if (r12 <= 0) goto L_0x00a5
        L_0x00ea:
            int r0 = r12 - r1
            int r0 = r5.read(r4, r1, r0)     // Catch:{ all -> 0x0256 }
            if (r0 == r3) goto L_0x01b9
            int r1 = r1 + r0
            if (r1 >= r12) goto L_0x00e1
            goto L_0x00ea
        L_0x00f6:
            int r1 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r1 == r3) goto L_0x021c
            if (r1 == r6) goto L_0x0174
            r0 = 249(0xf9, float:3.49E-43)
            if (r1 == r0) goto L_0x0146
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L_0x017e
            int r12 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r12 == r3) goto L_0x01ec
            r1 = 0
            if (r12 <= 0) goto L_0x011b
        L_0x010f:
            int r0 = r12 - r1
            int r0 = r5.read(r4, r1, r0)     // Catch:{ all -> 0x0256 }
            if (r0 == r3) goto L_0x01d4
            int r1 = r1 + r0
            if (r1 >= r12) goto L_0x011b
            goto L_0x010f
        L_0x011b:
            char[] r15 = X.C9957RkC.A00     // Catch:{ all -> 0x0256 }
            r14 = 11
            r13 = 0
        L_0x0120:
            char r12 = r15[r13]     // Catch:{ all -> 0x0256 }
            byte r0 = r4[r13]     // Catch:{ all -> 0x0256 }
            short r1 = (short) r0     // Catch:{ all -> 0x0256 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            char r0 = (char) r1     // Catch:{ all -> 0x0256 }
            if (r12 != r0) goto L_0x017e
            int r13 = r13 + 1
            if (r13 >= r14) goto L_0x0131
            goto L_0x0120
        L_0x0131:
            int r12 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r12 == r3) goto L_0x01e4
            r1 = 0
            if (r12 <= 0) goto L_0x00a5
        L_0x013a:
            int r0 = r12 - r1
            int r0 = r5.read(r4, r1, r0)     // Catch:{ all -> 0x0256 }
            if (r0 == r3) goto L_0x01dc
            int r1 = r1 + r0
            if (r1 >= r12) goto L_0x0131
            goto L_0x013a
        L_0x0146:
            r0 = 1
            r5.skip(r0)     // Catch:{ all -> 0x0256 }
            int r0 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r0 == r3) goto L_0x0204
            r0 = r0 & 28
            int r0 = r0 >> r2
            r8[r7] = r0     // Catch:{ all -> 0x0256 }
            int r1 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r1 == r3) goto L_0x01fc
            int r0 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r0 == r3) goto L_0x01f4
            int r0 = r0 << 8
            r1 = r1 | r0
            int r0 = r1 * 10
            r8[r6] = r0     // Catch:{ all -> 0x0256 }
            if (r0 != 0) goto L_0x016f
            r0 = 100
            r8[r6] = r0     // Catch:{ all -> 0x0256 }
        L_0x016f:
            r5.skip(r9)     // Catch:{ all -> 0x0256 }
            goto L_0x00a5
        L_0x0174:
            int[] r0 = java.util.Arrays.copyOf(r8, r2)     // Catch:{ all -> 0x0256 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0256 }
            r11.add(r0)     // Catch:{ all -> 0x0256 }
        L_0x017e:
            int r12 = r5.read()     // Catch:{ all -> 0x0256 }
            if (r12 == r3) goto L_0x0214
            r1 = 0
            if (r12 <= 0) goto L_0x00a5
        L_0x0187:
            int r0 = r12 - r1
            int r0 = r5.read(r4, r1, r0)     // Catch:{ all -> 0x0256 }
            if (r0 == r3) goto L_0x020c
            int r1 = r1 + r0
            if (r1 >= r12) goto L_0x017e
            goto L_0x0187
        L_0x0193:
            r5.close()     // Catch:{ IOException -> 0x0196 }
        L_0x0196:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r4 = r11.size()
            r3 = 0
            r2 = 0
        L_0x019e:
            if (r3 >= r4) goto L_0x01b3
            int r1 = r11.size()
            r0 = 1
            if (r3 >= r1) goto L_0x01af
            java.lang.Object r0 = r11.get(r3)
            int[] r0 = (int[]) r0
            r0 = r0[r6]
        L_0x01af:
            int r2 = r2 + r0
            int r3 = r3 + 1
            goto L_0x019e
        L_0x01b3:
            long r0 = (long) r2
            long r1 = r5.toMicros(r0)
            return r1
        L_0x01b9:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01c2:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01cb:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01d4:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01dc:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01e4:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01ec:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01f4:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x01fc:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x0204:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x020c:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x0214:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x021c:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x0224:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x022c:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x0234:
            java.lang.String r0 = "Illegal header for gif"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x023c:
            java.lang.String r0 = "Unexpected end of gif file"
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0255
        L_0x0244:
            java.lang.String r2 = "Unknown block header ["
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ all -> 0x0256 }
            r0 = 93
            java.lang.String r0 = X.002.A0S(r2, r1, r0)     // Catch:{ all -> 0x0256 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0256 }
            r1.<init>(r0)     // Catch:{ all -> 0x0256 }
        L_0x0255:
            throw r1     // Catch:{ all -> 0x0256 }
        L_0x0256:
            r0 = move-exception
            r5.close()     // Catch:{ IOException -> 0x025c }
            throw r0
        L_0x025b:
            r0 = move-exception
        L_0x025c:
            throw r0
        L_0x025d:
            boolean r0 = r15.A01(r7)
            if (r0 == 0) goto L_0x0266
            long r1 = r15.A02
        L_0x0265:
            return r1
        L_0x0266:
            java.net.URL r5 = r15.A05
            X.4aF r1 = r15.A03
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r3 = r1.A03(r0)
            long r1 = r1.A02(r0)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
            r3 = 0
        L_0x027a:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02f7
            if (r5 == 0) goto L_0x02aa
            r14.getClass()     // Catch:{ IllegalArgumentException -> 0x0293 }
            X.Q0d r0 = r14.AU8(r5)     // Catch:{ IllegalArgumentException -> 0x0293 }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0293 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IllegalArgumentException -> 0x0293 }
            long r0 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0293 }
            long r1 = r2.toMicros(r0)     // Catch:{ IllegalArgumentException -> 0x0293 }
            goto L_0x02f7
        L_0x0293:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. url: %s"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02aa:
            r6.getClass()     // Catch:{ IllegalArgumentException -> 0x02c1 }
            r14.getClass()     // Catch:{ IllegalArgumentException -> 0x02c1 }
            android.net.Uri r0 = android.net.Uri.fromFile(r6)     // Catch:{ IllegalArgumentException -> 0x02c1 }
            X.Q0d r0 = r14.AU7(r0)     // Catch:{ IllegalArgumentException -> 0x02c1 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IllegalArgumentException -> 0x02c1 }
            long r0 = r0.A07     // Catch:{ IllegalArgumentException -> 0x02c1 }
            long r1 = r2.toMicros(r0)     // Catch:{ IllegalArgumentException -> 0x02c1 }
            goto L_0x02f7
        L_0x02c1:
            if (r6 == 0) goto L_0x02ee
            java.util.Locale r4 = java.util.Locale.US
            boolean r0 = r6.exists()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r6.canRead()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r6.getPath()
            java.lang.String r0 = r6.getCanonicalPath()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}
            java.lang.String r0 = "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. exists: %b, canRead: %b, path: %s, canonicalPath: %s"
            java.lang.String r1 = java.lang.String.format(r4, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02ee:
            java.lang.String r1 = "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. exists: sourceFile is NULL"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02f7:
            long r1 = r1 - r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1Z.A02(X.Tfv, X.4aI):long");
    }

    public static boolean A03(C7232Q0d q0d, MediaComposition mediaComposition, int[] iArr) {
        if (q0d != null) {
            int i = iArr[0];
            if (mediaComposition != null) {
                HashMap hashMap = q0d.A0J;
                if (hashMap != null) {
                    C266714aE r1 = C266714aE.VIDEO;
                    if (hashMap.get(r1) != null) {
                        Iterator A0t = AnonymousClass7TF.A0t((AbstractMap) hashMap.get(r1));
                        loop0:
                        while (A0t.hasNext()) {
                            Iterator A1H = C51966G9m.A1H(A0t.next());
                            while (true) {
                                if (A1H.hasNext()) {
                                    if (((C7232Q0d) A1H.next()).A02 != i) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (q0d.A02 == i) {
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean A04(C266714aE r4, MediaComposition mediaComposition) {
        if (mediaComposition != null) {
            Iterator A0s = AnonymousClass7TF.A0s(mediaComposition.A06(r4));
            loop0:
            while (A0s.hasNext()) {
                Iterator A1H = C51966G9m.A1H(C51971G9r.A0p(A0s));
                while (true) {
                    if (A1H.hasNext()) {
                        if (((SIO) A1H.next()).A01.CRh()) {
                            break loop0;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r7.isEmpty() != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(X.C13725Tfv r18, X.C266794aM r19) {
        /*
            r2 = r19
            java.util.List r0 = r2.A07
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.List r0 = r2.A06
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x001d
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r1 = 1
        L_0x001e:
            java.lang.String r0 = "only timelinespeed or pts mutator may be populated."
            X.C266784aL.A06(r1, r0)
            java.util.List r1 = r2.A04
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r2 = r0.iterator()
            r16 = 0
            r14 = 0
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r2.next()
            X.4aI r0 = (X.C266754aI) r0
            r1 = r18
            long r0 = A02(r1, r0)
            long r14 = r14 + r0
            goto L_0x0033
        L_0x0047:
            java.util.Iterator r13 = r8.iterator()
            r11 = 0
            r9 = 0
        L_0x004f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r2 = r13.next()
            X.4aK r2 = (X.C266774aK) r2
            X.4aF r1 = r2.A01
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r5 = r1.A03(r0)
            long r3 = r1.A02(r0)
            float r2 = r2.A00
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
            r5 = 0
        L_0x006f:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            r3 = r14
        L_0x0074:
            long r3 = r3 - r5
            long r11 = r11 + r3
            float r1 = (float) r3
            float r0 = java.lang.Math.abs(r2)
            float r1 = r1 / r0
            long r0 = (long) r1
            long r9 = r9 + r0
            goto L_0x004f
        L_0x007f:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0088
            long r14 = r14 - r11
            long r14 = r14 + r9
        L_0x0087:
            return r14
        L_0x0088:
            java.util.Iterator r1 = r7.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0087
            r1.next()
            java.lang.String r1 = "getSourceTimeRange"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1Z.A01(X.Tfv, X.4aM):long");
    }

    public static boolean A05(MediaComposition mediaComposition) {
        C266714aE r2 = C266714aE.AUDIO;
        if (!mediaComposition.A06(r2).isEmpty() || (mediaComposition.A07(r2) != null && mediaComposition.A07(r2).size() > 1)) {
            return true;
        }
        return false;
    }

    public static long A00(C13725Tfv tfv, C266714aE r9, MediaComposition mediaComposition) {
        int size;
        HashMap A07 = mediaComposition.A07(r9);
        int i = 0;
        if (A07 == null) {
            size = 0;
        } else {
            size = A07.size();
        }
        long j = -1;
        while (i < size) {
            C266794aM A04 = mediaComposition.A04(r9, i);
            if (A04 != null) {
                C266794aM A042 = mediaComposition.A04(r9, i);
                A042.getClass();
                j = Math.max(j, A04.A00 + A01(tfv, A042));
                i++;
            } else {
                throw Pxg.A0Z("No track available for ", r9.name());
            }
        }
        return j;
    }
}
