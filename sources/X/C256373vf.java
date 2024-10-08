package X;

import android.net.Uri;
import android.util.Log;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3vf  reason: invalid class name and case insensitive filesystem */
public abstract class C256373vf {
    public static C257003wh A00(C256733wG r14, List list, int i, int i2) {
        int i3;
        C256733wG r13 = r14;
        if (r14 == null || list == null) {
            return null;
        }
        C256683wB r7 = r14.A02;
        C256683wB[] r142 = new C256683wB[list.size()];
        Iterator it = list.iterator();
        C256683wB r10 = null;
        C256683wB r12 = null;
        C256683wB r8 = null;
        C256683wB r9 = null;
        C256683wB r11 = null;
        int i4 = 0;
        while (it.hasNext()) {
            C256683wB r3 = ((C256733wG) it.next()).A02;
            int i5 = i4 + 1;
            r142[i4] = r3;
            if (r10 == null || r10.A05 < r3.A05) {
                r10 = r3;
            }
            if (r12 == null || r12.A05 > r3.A05) {
                r12 = r3;
            }
            int i6 = r3.A05;
            int i7 = r7.A05;
            if (i6 > i7 && (r8 == null || r8.A05 > i6)) {
                r8 = r3;
            }
            if (i6 < i7 && (r9 == null || r9.A05 < i6)) {
                r9 = r3;
            }
            int i8 = i2;
            if (i2 > 0 && (i3 = r3.A0L) < i8 && (r11 == null || i3 > r11.A0L)) {
                r11 = r3;
            }
            i4 = i5;
        }
        if (r8 == null) {
            r8 = null;
        }
        if (r9 == null) {
            r9 = null;
        }
        if (r11 == null) {
            r11 = null;
        }
        list.size();
        return new C257003wh(r7, r8, r9, r10, r11, r12, r13, r142, i);
    }

    public static C256633w6 A02(Uri uri, C256353vd r10, String str) {
        Throwable e;
        String str2;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(ReactWebViewManager.HTML_ENCODING));
            try {
                C256633w6 A0G = r10.E1j(uri, byteArrayInputStream);
                try {
                    byteArrayInputStream.close();
                    return A0G;
                } catch (IOException e2) {
                    Log.e("DashManifestHelper2", String.format("Failed to close manifest input stream", new Object[0]), e2);
                    return A0G;
                }
            } catch (C2609347p | RuntimeException e3) {
                e = e3;
                Log.e("DashManifestHelper2", String.format("Failed to parse manifest: %s", new Object[]{uri}), e);
                if (uri == null) {
                    str2 = "URL: Unknown";
                } else {
                    str2 = 002.A0R("URL: ", uri.toString());
                }
                if (!(e instanceof C2609347p)) {
                    e = new IOException(e);
                }
                e = new Exception(str2, e);
            } catch (IOException e4) {
                e = e4;
                Log.e("DashManifestHelper2", String.format("I/O Error when parsing manifest: %s", new Object[]{uri}), e);
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e5) {
                    Log.e("DashManifestHelper2", String.format("Failed to close manifest input stream", new Object[0]), e5);
                }
                throw th;
            }
        } catch (AnonymousClass2A6 e6) {
            throw e6;
        } catch (IOException unused) {
            return null;
        }
        throw e;
    }

    public static long[] A03(C256633w6 r16) {
        long[] jArr = {-1, -1, -1};
        C256633w6 r3 = r16;
        if (r16 != null) {
            try {
                int size = r3.A0Q.size();
                if (size != 0) {
                    C256793wM A02 = r3.A02(0);
                    int i = size - 1;
                    C256793wM A022 = r3.A02(i);
                    int A00 = A02.A00(2);
                    int A002 = A022.A00(2);
                    if (A00 >= 0 && A002 >= 0) {
                        List list = A02.A03;
                        if (!((C256773wK) list.get(A00)).A07.isEmpty()) {
                            List list2 = A022.A03;
                            if (!((C256773wK) list2.get(A002)).A07.isEmpty()) {
                                C256733wG r1 = (C256733wG) ((C256773wK) list.get(A00)).A07.get(0);
                                C256733wG r5 = (C256733wG) ((C256773wK) list2.get(A002)).A07.get(0);
                                if ((r1 instanceof AnonymousClass4XD) && (r5 instanceof AnonymousClass4XD)) {
                                    C256763wJ r4 = ((AnonymousClass4XD) r1).A00;
                                    long j = r4.A05;
                                    long A003 = r3.A00(i);
                                    C256763wJ r11 = ((AnonymousClass4XD) r5).A00;
                                    long A01 = (r11.A01(A003) + j) - 1;
                                    return new long[]{r4.A02(j) / 1000, (r11.A02(A01) + r11.A04(A01, -9223372036854775807L)) / 1000, (A01 - j) + 1};
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("DashManifestHelper2", "Could not get segment range from manifest", e);
                return jArr;
            }
        }
        return jArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0332, code lost:
        if (r3 != null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017c, code lost:
        if (r19 != false) goto L_0x017e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C256883wV A01(android.content.Context r30, X.C256873wU r31, X.C256853wS r32, X.C256823wP r33, X.C256633w6 r34, boolean r35, boolean r36, boolean r37) {
        /*
            r28 = 0
            r11 = r34
            if (r34 != 0) goto L_0x0007
            return r28
        L_0x0007:
            java.util.List r0 = r11.A0Q
            int r0 = r0.size()
            r10 = 1
            if (r0 >= r10) goto L_0x0011
            return r28
        L_0x0011:
            r9 = 0
            X.3wM r0 = r11.A02(r9)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r27 = new java.util.ArrayList
            r27.<init>()
            java.util.List r0 = r0.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r2 = r3.next()
            X.3wK r2 = (X.C256773wK) r2
            int r1 = r2.A01
            if (r1 == r10) goto L_0x004d
            r0 = 2
            if (r1 != r0) goto L_0x0026
            java.util.List r0 = r2.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            r8.add(r0)
            goto L_0x003f
        L_0x004d:
            java.util.List r0 = r2.A07
            java.util.Iterator r2 = r0.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r2.next()
            r0 = r27
            r0.add(r1)
            goto L_0x0053
        L_0x0063:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0346
            r14 = r30
            if (r30 == 0) goto L_0x0346
            r30 = r32
            java.lang.String r0 = "window"
            java.lang.Object r0 = r14.getSystemService(r0)     // Catch:{ 275 -> 0x02fd }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ 275 -> 0x02fd }
            if (r0 != 0) goto L_0x009e
            r0 = -1
            android.graphics.Point r5 = new android.graphics.Point     // Catch:{ 275 -> 0x02fd }
            r5.<init>(r0, r0)     // Catch:{ 275 -> 0x02fd }
        L_0x007f:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ 275 -> 0x02fd }
            r7.<init>()     // Catch:{ 275 -> 0x02fd }
            int r26 = r8.size()     // Catch:{ 275 -> 0x02fd }
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ 275 -> 0x02fd }
            r25.<init>()     // Catch:{ 275 -> 0x02fd }
            X.2BQ r0 = X.2BQ.A15     // Catch:{ 275 -> 0x02fd }
            boolean r24 = X.2BY.A02(r0)     // Catch:{ 275 -> 0x02fd }
            X.2BQ r0 = X.2BQ.A0y     // Catch:{ 275 -> 0x02fd }
            boolean r23 = X.2BY.A02(r0)     // Catch:{ 275 -> 0x02fd }
            r6 = 0
            r22 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00c1
        L_0x009e:
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ 275 -> 0x02fd }
            if (r0 != 0) goto L_0x00ab
            r0 = -1
            android.graphics.Point r5 = new android.graphics.Point     // Catch:{ 275 -> 0x02fd }
            r5.<init>(r0, r0)     // Catch:{ 275 -> 0x02fd }
            goto L_0x007f
        L_0x00ab:
            android.graphics.Point r5 = new android.graphics.Point     // Catch:{ 275 -> 0x02fd }
            r5.<init>()     // Catch:{ 275 -> 0x02fd }
            android.view.Display$Mode r1 = r0.getMode()     // Catch:{ 275 -> 0x02fd }
            int r0 = r1.getPhysicalWidth()     // Catch:{ 275 -> 0x02fd }
            r5.x = r0     // Catch:{ 275 -> 0x02fd }
            int r0 = r1.getPhysicalHeight()     // Catch:{ 275 -> 0x02fd }
            r5.y = r0     // Catch:{ 275 -> 0x02fd }
            goto L_0x007f
        L_0x00c1:
            r0 = r26
            if (r6 >= r0) goto L_0x0294
            java.lang.Object r0 = r8.get(r6)     // Catch:{ 275 -> 0x02fd }
            X.3wG r0 = (X.C256733wG) r0     // Catch:{ 275 -> 0x02fd }
            X.3wB r4 = r0.A02     // Catch:{ 275 -> 0x02fd }
            java.lang.String r1 = "video/av01"
            java.lang.String r0 = r4.A0W     // Catch:{ 275 -> 0x02fd }
            boolean r0 = r1.equals(r0)     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x00db
            if (r37 == 0) goto L_0x00db
            goto L_0x022e
        L_0x00db:
            r12 = r33
            r20 = r35
            if (r24 == 0) goto L_0x00f0
            r15 = r14
            r16 = r31
            r17 = r4
            r18 = r12
            r19 = r9
            int r3 = X.AnonymousClass5O2.A00(r15, r16, r17, r18, r19, r20)     // Catch:{ 275 -> 0x02fd }
            goto L_0x01fd
        L_0x00f0:
            if (r23 == 0) goto L_0x01f6
            X.2BQ r0 = X.2BQ.A0e     // Catch:{ 275 -> 0x02fd }
            boolean r21 = X.2BY.A02(r0)     // Catch:{ 275 -> 0x02fd }
            java.lang.String r0 = r4.A0W     // Catch:{ 275 -> 0x02fd }
            r29 = r0
            boolean r0 = X.2Kn.A06(r29)     // Catch:{ 275 -> 0x02fd }
            r3 = 0
            if (r0 != 0) goto L_0x0106
            if (r21 == 0) goto L_0x0149
            goto L_0x013d
        L_0x0106:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r4.A0O     // Catch:{ 275 -> 0x02fd }
            r2 = 0
            if (r0 == 0) goto L_0x010c
            r2 = 1
        L_0x010c:
            java.util.List r1 = X.C8319Qnz.A00(r14, r4, r12, r2, r9)     // Catch:{ 275 -> 0x02fd }
            r1.isEmpty()     // Catch:{ 275 -> 0x02fd }
            if (r2 == 0) goto L_0x011f
            boolean r0 = r1.isEmpty()     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x011f
            java.util.List r1 = X.C8319Qnz.A00(r14, r4, r12, r9, r9)     // Catch:{ 275 -> 0x02fd }
        L_0x011f:
            boolean r0 = r1.isEmpty()     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x0130
            if (r21 == 0) goto L_0x01fb
            r2 = 129(0x81, float:1.81E-43)
            r0 = r31
            X.C8319Qnz.A01(r0, r4, r12, r1, r2)     // Catch:{ 275 -> 0x02fd }
            goto L_0x01fb
        L_0x0130:
            int r0 = r4.A07     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x014d
            r13 = 2
            if (r0 == r13) goto L_0x014d
            r3 = 2
            if (r21 == 0) goto L_0x0149
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0144
        L_0x013d:
            r2 = 128(0x80, float:1.794E-43)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ 275 -> 0x02fd }
            r1.<init>()     // Catch:{ 275 -> 0x02fd }
        L_0x0144:
            r0 = r31
            X.C8319Qnz.A01(r0, r4, r12, r1, r2)     // Catch:{ 275 -> 0x02fd }
        L_0x0149:
            r20 = 128(0x80, float:1.794E-43)
            goto L_0x01f3
        L_0x014d:
            java.lang.Object r0 = r1.get(r9)     // Catch:{ 275 -> 0x02fd }
            X.2Km r0 = (X.2Km) r0     // Catch:{ 275 -> 0x02fd }
            boolean r19 = r0.A09(r4)     // Catch:{ 275 -> 0x02fd }
            if (r19 != 0) goto L_0x0178
            if (r35 != 0) goto L_0x0178
            r13 = 1
        L_0x015c:
            int r15 = r1.size()     // Catch:{ 275 -> 0x02fd }
            if (r13 >= r15) goto L_0x0178
            java.lang.Object r15 = r1.get(r13)     // Catch:{ 275 -> 0x02fd }
            X.2Km r15 = (X.2Km) r15     // Catch:{ 275 -> 0x02fd }
            boolean r16 = r15.A09(r4)     // Catch:{ 275 -> 0x02fd }
            if (r16 == 0) goto L_0x016f
            goto L_0x0172
        L_0x016f:
            int r13 = r13 + 1
            goto L_0x015c
        L_0x0172:
            r0 = r15
            r19 = 1
            r18 = 0
            goto L_0x017e
        L_0x0178:
            r18 = 1
            r17 = 3
            if (r19 == 0) goto L_0x0180
        L_0x017e:
            r17 = 4
        L_0x0180:
            boolean r13 = r0.A0A(r4)     // Catch:{ 275 -> 0x02fd }
            r16 = 8
            if (r13 == 0) goto L_0x018a
            r16 = 16
        L_0x018a:
            boolean r0 = r0.A05     // Catch:{ 275 -> 0x02fd }
            r15 = 0
            if (r0 == 0) goto L_0x0191
            r15 = 64
        L_0x0191:
            X.2BQ r0 = X.2BQ.A12     // Catch:{ 275 -> 0x02fd }
            boolean r0 = X.2BY.A02(r0)     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x019a
            r15 = 0
        L_0x019a:
            r20 = 0
            if (r18 == 0) goto L_0x01a0
            r20 = 128(0x80, float:1.794E-43)
        L_0x01a0:
            java.lang.String r13 = "video/dolby-vision"
            r0 = r29
            boolean r0 = r13.equals(r0)     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x01b2
            boolean r0 = X.C9694RfC.A00(r14)     // Catch:{ 275 -> 0x02fd }
            if (r0 != 0) goto L_0x01b2
            r20 = 256(0x100, float:3.59E-43)
        L_0x01b2:
            X.2BQ r0 = X.2BQ.A14     // Catch:{ 275 -> 0x02fd }
            boolean r0 = X.2BY.A02(r0)     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x01bc
            r20 = 0
        L_0x01bc:
            if (r19 == 0) goto L_0x01e0
            java.util.List r2 = X.C8319Qnz.A00(r14, r4, r12, r2, r10)     // Catch:{ 275 -> 0x02fd }
            boolean r0 = r2.isEmpty()     // Catch:{ 275 -> 0x02fd }
            if (r0 != 0) goto L_0x01e0
            java.util.ArrayList r0 = X.2BR.A04(r4, r2)     // Catch:{ 275 -> 0x02fd }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ 275 -> 0x02fd }
            X.2Km r2 = (X.2Km) r2     // Catch:{ 275 -> 0x02fd }
            boolean r0 = r2.A09(r4)     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x01e0
            boolean r0 = r2.A0A(r4)     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x01e0
            r3 = 32
        L_0x01e0:
            if (r21 == 0) goto L_0x01ed
            r2 = r17 | r16
            r2 = r2 | r3
            r2 = r2 | r15
            r2 = r2 | r20
            r0 = r31
            X.C8319Qnz.A01(r0, r4, r12, r1, r2)     // Catch:{ 275 -> 0x02fd }
        L_0x01ed:
            r17 = r17 | r16
            r17 = r17 | r3
            r3 = r17 | r15
        L_0x01f3:
            r3 = r3 | r20
            goto L_0x01fd
        L_0x01f6:
            int r3 = X.AnonymousClass4PI.A01(r4, r12, r9)     // Catch:{ 275 -> 0x02fd }
            goto L_0x01fd
        L_0x01fb:
            r3 = 129(0x81, float:1.81E-43)
        L_0x01fd:
            r1 = r3 & 7
            r0 = 4
            if (r1 == r0) goto L_0x022e
            java.lang.String r1 = "rendererSupportsFormatResult=%s, Format=%s"
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x0217
            if (r3 == r10) goto L_0x0214
            r0 = 2
            if (r3 == r0) goto L_0x0211
            r0 = 3
            if (r3 != r0) goto L_0x021c
            goto L_0x021a
        L_0x0211:
            java.lang.String r2 = "FORMAT_UNSUPPORTED_DRM"
            goto L_0x021c
        L_0x0214:
            java.lang.String r2 = "FORMAT_UNSUPPORTED_SUBTYPE"
            goto L_0x021c
        L_0x0217:
            java.lang.String r2 = "FORMAT_UNSUPPORTED_TYPE"
            goto L_0x021c
        L_0x021a:
            java.lang.String r2 = "FORMAT_EXCEEDS_CAPABILITIES"
        L_0x021c:
            java.lang.String r0 = r4.toString()     // Catch:{ 275 -> 0x02fd }
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch:{ 275 -> 0x02fd }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ 275 -> 0x02fd }
            r0 = r25
            r0.add(r1)     // Catch:{ 275 -> 0x02fd }
            goto L_0x0290
        L_0x022e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 275 -> 0x02fd }
            r7.add(r0)     // Catch:{ 275 -> 0x02fd }
            int r0 = r4.A0L     // Catch:{ 275 -> 0x02fd }
            if (r0 <= 0) goto L_0x0290
            int r0 = r4.A0A     // Catch:{ 275 -> 0x02fd }
            if (r0 <= 0) goto L_0x0290
            int r12 = r5.x     // Catch:{ 275 -> 0x02fd }
            if (r12 <= 0) goto L_0x0290
            int r13 = r5.y     // Catch:{ 275 -> 0x02fd }
            if (r13 <= 0) goto L_0x0290
            int r3 = r4.A0L     // Catch:{ 275 -> 0x02fd }
            int r2 = r4.A0A     // Catch:{ 275 -> 0x02fd }
            r15 = r13
            r1 = 1
            r0 = 0
            if (r3 <= r2) goto L_0x024f
            r0 = 1
        L_0x024f:
            if (r12 > r13) goto L_0x0252
            r1 = 0
        L_0x0252:
            if (r0 != r1) goto L_0x0256
            r15 = r12
            r12 = r13
        L_0x0256:
            int r1 = r3 * r12
            int r0 = r2 * r15
            if (r1 < r0) goto L_0x025d
            goto L_0x0267
        L_0x025d:
            int r1 = r1 + r2
            int r1 = r1 + -1
            int r1 = r1 / r2
            android.graphics.Point r0 = new android.graphics.Point     // Catch:{ 275 -> 0x02fd }
            r0.<init>(r1, r12)     // Catch:{ 275 -> 0x02fd }
            goto L_0x0270
        L_0x0267:
            int r0 = r0 + r3
            int r1 = r0 + -1
            int r1 = r1 / r3
            android.graphics.Point r0 = new android.graphics.Point     // Catch:{ 275 -> 0x02fd }
            r0.<init>(r15, r1)     // Catch:{ 275 -> 0x02fd }
        L_0x0270:
            int r1 = r4.A0L     // Catch:{ 275 -> 0x02fd }
            int r2 = r4.A0A     // Catch:{ 275 -> 0x02fd }
            int r1 = r1 * r2
            int r12 = r4.A0L     // Catch:{ 275 -> 0x02fd }
            int r2 = r0.x     // Catch:{ 275 -> 0x02fd }
            float r2 = (float) r2     // Catch:{ 275 -> 0x02fd }
            r3 = 1065017672(0x3f7ae148, float:0.98)
            float r2 = r2 * r3
            int r2 = (int) r2     // Catch:{ 275 -> 0x02fd }
            if (r12 < r2) goto L_0x0290
            int r2 = r4.A0A     // Catch:{ 275 -> 0x02fd }
            int r0 = r0.y     // Catch:{ 275 -> 0x02fd }
            float r0 = (float) r0     // Catch:{ 275 -> 0x02fd }
            float r0 = r0 * r3
            int r0 = (int) r0     // Catch:{ 275 -> 0x02fd }
            if (r2 < r0) goto L_0x0290
            r0 = r22
            if (r1 >= r0) goto L_0x0290
            r22 = r1
        L_0x0290:
            int r6 = r6 + 1
            goto L_0x00c1
        L_0x0294:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r22
            if (r0 == r1) goto L_0x02ca
            int r3 = r7.size()     // Catch:{ 275 -> 0x02fd }
            int r3 = r3 - r10
        L_0x02a0:
            if (r3 < 0) goto L_0x02ca
            java.lang.Object r0 = r7.get(r3)     // Catch:{ 275 -> 0x02fd }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 275 -> 0x02fd }
            int r0 = r0.intValue()     // Catch:{ 275 -> 0x02fd }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ 275 -> 0x02fd }
            X.3wG r0 = (X.C256733wG) r0     // Catch:{ 275 -> 0x02fd }
            X.3wB r0 = r0.A02     // Catch:{ 275 -> 0x02fd }
            int r2 = r0.A0L     // Catch:{ 275 -> 0x02fd }
            r1 = -1
            if (r2 == r1) goto L_0x02c4
            int r0 = r0.A0A     // Catch:{ 275 -> 0x02fd }
            if (r0 == r1) goto L_0x02c4
            int r2 = r2 * r0
            if (r2 == r1) goto L_0x02c4
            r0 = r22
            if (r2 <= r0) goto L_0x02c7
        L_0x02c4:
            r7.remove(r3)     // Catch:{ 275 -> 0x02fd }
        L_0x02c7:
            int r3 = r3 + -1
            goto L_0x02a0
        L_0x02ca:
            boolean r0 = r7.isEmpty()     // Catch:{ 275 -> 0x02fd }
            if (r0 == 0) goto L_0x02e5
            java.lang.String r2 = "manifestId=%s, errors=%s"
            java.lang.String r1 = r11.A0K     // Catch:{ 275 -> 0x02fd }
            java.lang.String r0 = r25.toString()     // Catch:{ 275 -> 0x02fd }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ 275 -> 0x02fd }
            java.lang.String r1 = java.lang.String.format(r2, r0)     // Catch:{ 275 -> 0x02fd }
            r0 = r30
            r0.ClG(r1)     // Catch:{ 275 -> 0x02fd }
        L_0x02e5:
            int r2 = r7.size()     // Catch:{ 275 -> 0x02fd }
            int[] r3 = new int[r2]     // Catch:{ 275 -> 0x02fd }
            r1 = 0
        L_0x02ec:
            if (r1 >= r2) goto L_0x0314
            java.lang.Object r0 = r7.get(r1)     // Catch:{ 275 -> 0x02fd }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 275 -> 0x02fd }
            int r0 = r0.intValue()     // Catch:{ 275 -> 0x02fd }
            r3[r1] = r0     // Catch:{ 275 -> 0x02fd }
            int r1 = r1 + 1
            goto L_0x02ec
        L_0x02fd:
            r0 = move-exception
            java.lang.String r1 = r11.A0K
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "manifestId=%s, exception=%s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            r0 = r30
            r0.ClG(r1)
            r3 = 0
        L_0x0314:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r36 == 0) goto L_0x0332
            if (r3 == 0) goto L_0x0320
            int r0 = r3.length
            if (r0 != 0) goto L_0x0334
        L_0x0320:
            int r0 = r8.size()
            int[] r3 = new int[r0]
            r1 = 0
        L_0x0327:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x0334
            r3[r1] = r1
            int r1 = r1 + 1
            goto L_0x0327
        L_0x0332:
            if (r3 == 0) goto L_0x0345
        L_0x0334:
            int r1 = r3.length
            if (r1 <= 0) goto L_0x0345
        L_0x0337:
            r0 = r3[r9]
            java.lang.Object r0 = r8.get(r0)
            r2.add(r0)
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x0345
            goto L_0x0337
        L_0x0345:
            r8 = r2
        L_0x0346:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x034e
            r8 = r28
        L_0x034e:
            boolean r0 = r27.isEmpty()
            if (r0 == 0) goto L_0x0356
            r27 = r28
        L_0x0356:
            if (r8 != 0) goto L_0x035b
            if (r27 != 0) goto L_0x035b
            return r28
        L_0x035b:
            X.3wV r1 = new X.3wV
            r0 = r27
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256373vf.A01(android.content.Context, X.3wU, X.3wS, X.3wP, X.3w6, boolean, boolean, boolean):X.3wV");
    }
}
