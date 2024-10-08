package X;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;

public final class Qo4 extends AnonymousClass4TN {
    public final C13463Taq A00;

    public static int A00(byte[] bArr, int i, int i2) {
        int length;
        int i3 = i;
        while (true) {
            length = bArr.length;
            if (i3 < length) {
                if (bArr[i3] == 0) {
                    break;
                }
                i3++;
            } else {
                i3 = length;
                break;
            }
        }
        if (i2 == 0 || i2 == 3) {
            return i3;
        }
        while (i3 < length - 1) {
            if ((i3 - i) % 2 != 0 || bArr[i3 + 1] != 0) {
                while (true) {
                    i3++;
                    if (i3 < length) {
                        if (bArr[i3] == 0) {
                            break;
                        }
                    } else {
                        i3 = length;
                        break;
                    }
                }
            } else {
                return i3;
            }
        }
        return length;
    }

    public static ImmutableList A02(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 < bArr.length) {
            ImmutableList.Builder builder = ImmutableList.builder();
            while (true) {
                int A002 = A00(bArr, i2, i);
                if (i2 >= A002) {
                    break;
                }
                builder.add(Pxe.A11(A04(i), bArr, i2, A002 - i2));
                if (i != 0) {
                    i3 = 2;
                    if (i != 3) {
                        i2 = i3 + A002;
                    }
                }
                i3 = 1;
                i2 = i3 + A002;
            }
            ImmutableList build = builder.build();
            if (!build.isEmpty()) {
                return build;
            }
        }
        return ImmutableList.of("");
    }

    public static String A03(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr;
        String str;
        Locale locale = Locale.US;
        if (i == 2) {
            objArr = Pxh.A1a(i2, i3, i4);
            str = "%c%c%c";
        } else {
            objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            str = "%c%c%c%c";
        }
        return String.format(locale, str, objArr);
    }

    public static Charset A04(int i) {
        if (i == 1) {
            return AnonymousClass2RN.A02;
        }
        if (i == 2) {
            return AnonymousClass2RN.A03;
        }
        if (i != 3) {
            return AnonymousClass2RN.A00;
        }
        return AnonymousClass2RN.A05;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4XV, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata A07(byte[] r14, int r15) {
        /*
            r13 = this;
            r9 = 0
            r12 = 0
            r8 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.4XV r3 = new X.4XV
            r3.<init>()
            r3.A02 = r14
            r3.A00 = r15
            int r0 = r3.A01
            int r15 = r15 - r0
            java.lang.String r4 = "Id3Decoder"
            r0 = 10
            if (r15 >= r0) goto L_0x003b
            java.lang.String r0 = "Data too short to be an ID3 tag"
        L_0x001b:
            X.2AG.A04(r4, r0)
            r0 = 0
        L_0x001f:
            r11 = 0
            if (r0 == 0) goto L_0x00e3
            int r10 = r3.A01
            r0 = 2
            r6 = 10
            if (r8 != r0) goto L_0x002a
            r6 = 6
        L_0x002a:
            if (r12 == 0) goto L_0x00ab
            byte[] r7 = r3.A02
            r5 = r10
        L_0x002f:
            int r1 = r5 + 1
            int r0 = r10 + r9
            if (r1 >= r0) goto L_0x00ab
            int r9 = X.Pxh.A0E(r7, r5, r1, r10, r9)
            r5 = r1
            goto L_0x002f
        L_0x003b:
            int r6 = r3.A03()
            r1 = 4801587(0x494433, float:6.728456E-39)
            r10 = 0
            r0 = 1
            if (r6 == r1) goto L_0x0057
            java.lang.String r5 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r6)
            java.lang.String r0 = "%06X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r0 = X.002.A0R(r5, r0)
            goto L_0x001b
        L_0x0057:
            int r5 = r3.A02()
            r3.A0H(r0)
            int r6 = r3.A02()
            int r7 = X.Pxk.A01(r3)
            r0 = 2
            r1 = 4
            if (r5 != r0) goto L_0x0071
            r0 = r6 & 64
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto L_0x001b
        L_0x0071:
            r0 = 3
            if (r5 != r0) goto L_0x008c
            r0 = r6 & 64
            if (r0 == 0) goto L_0x0082
            int r0 = r3.A01()
            r3.A0H(r0)
            int r0 = r0 + 4
            int r7 = r7 - r0
        L_0x0082:
            r0 = r6 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0087
            r10 = 1
        L_0x0087:
            r8 = r5
            r12 = r10
            r9 = r7
            r0 = 1
            goto L_0x001f
        L_0x008c:
            if (r5 != r1) goto L_0x00a3
            r0 = r6 & 64
            if (r0 == 0) goto L_0x009c
            int r1 = X.Pxk.A01(r3)
            int r0 = r1 + -4
            r3.A0H(r0)
            int r7 = r7 - r1
        L_0x009c:
            r0 = r6 & 16
            if (r0 == 0) goto L_0x0087
            int r7 = r7 + -10
            goto L_0x0087
        L_0x00a3:
            java.lang.String r0 = "Skipped ID3 tag with unsupported majorVersion="
            java.lang.String r0 = X.002.A0O(r0, r5)
            goto L_0x001b
        L_0x00ab:
            int r10 = r10 + r9
            r3.A0F(r10)
            r5 = 0
            boolean r0 = A05(r3, r8, r6, r5)
            r1 = 1
            if (r0 != 0) goto L_0x00c1
            r0 = 4
            if (r8 != r0) goto L_0x00da
            boolean r0 = A05(r3, r0, r6, r1)
            if (r0 == 0) goto L_0x00da
            r5 = 1
        L_0x00c1:
            int r1 = r3.A00
            int r0 = r3.A01
            int r1 = r1 - r0
            if (r1 < r6) goto L_0x00d4
            X.Taq r0 = r13.A00
            com.google.android.exoplayer2.metadata.id3.Id3Frame r0 = A01(r0, r3, r8, r6, r5)
            if (r0 == 0) goto L_0x00c1
            r2.add(r0)
            goto L_0x00c1
        L_0x00d4:
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>((java.util.List) r2)
            return r0
        L_0x00da:
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            java.lang.String r0 = X.002.A0O(r0, r8)
            X.2AG.A04(r4, r0)
        L_0x00e3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qo4.A07(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }

    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.lang.Object, X.5Ob] */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r15v10, types: [com.google.android.exoplayer2.metadata.id3.ChapterTocFrame] */
    /* JADX WARNING: type inference failed for: r18v3, types: [com.google.android.exoplayer2.metadata.id3.ChapterFrame] */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0236, code lost:
        if (r10 == 3) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x026e, code lost:
        if (r9 == 67) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02d1, code lost:
        if (r9 == 3) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x031f, code lost:
        if (r14 == 3) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x033d, code lost:
        if (r6 == null) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r5 != 2) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        if (r5 == 2) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011b, code lost:
        if (r14 == 3) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0174, code lost:
        if (r15 == 3) goto L_0x0176;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02ea A[Catch:{ all -> 0x04ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0447 A[ADDED_TO_REGION, Catch:{ all -> 0x04ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0149 A[Catch:{ all -> 0x04ac }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame A01(X.C13463Taq r23, X.AnonymousClass4XV r24, int r25, int r26, boolean r27) {
        /*
            r0 = r24
            int r12 = r0.A02()
            int r11 = r0.A02()
            int r10 = r0.A02()
            r4 = 3
            r5 = r25
            r17 = r27
            if (r5 < r4) goto L_0x04a5
            int r9 = r0.A02()
            r1 = 4
            int r2 = r0.A04()
            if (r5 != r1) goto L_0x0039
            if (r27 != 0) goto L_0x0039
            r3 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 7
            r3 = r3 | r1
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 14
            r3 = r3 | r1
            int r1 = r2 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r1 << 21
            r2 = r2 | r3
        L_0x0039:
            if (r5 < r4) goto L_0x04a2
            int r7 = r0.A05()
        L_0x003f:
            r6 = 0
            if (r12 != 0) goto L_0x0052
            if (r11 != 0) goto L_0x0052
            if (r10 != 0) goto L_0x0052
            if (r9 != 0) goto L_0x0052
            if (r2 != 0) goto L_0x0052
            if (r7 != 0) goto L_0x0052
        L_0x004c:
            int r1 = r0.A00
        L_0x004e:
            r0.A0G(r1)
            return r6
        L_0x0052:
            int r1 = r0.A01
            int r1 = r1 + r2
            int r3 = r0.A00
            java.lang.String r8 = "Id3Decoder"
            if (r1 <= r3) goto L_0x0061
            java.lang.String r1 = "Frame size exceeds remaining tag data"
            X.2AG.A04(r8, r1)
            goto L_0x004c
        L_0x0061:
            r18 = r23
            if (r23 == 0) goto L_0x0077
            r13 = 2
            r14 = 77
            r3 = 67
            if (r12 != r3) goto L_0x00d7
            r3 = 79
            if (r11 != r3) goto L_0x004e
            if (r10 != r14) goto L_0x004e
            if (r9 == r14) goto L_0x0077
            if (r5 == r13) goto L_0x00e5
            goto L_0x004e
        L_0x0077:
            r13 = 1
            if (r5 != r4) goto L_0x00b5
            r3 = r7 & 128(0x80, float:1.794E-43)
            boolean r3 = X.AnonymousClass7TF.A1P(r3)
            r4 = r7 & 64
            boolean r4 = X.AnonymousClass7TF.A1P(r4)
            r7 = r7 & 32
            boolean r15 = X.AnonymousClass7TF.A1P(r7)
            r14 = r3
            r16 = 0
        L_0x008f:
            if (r14 != 0) goto L_0x00f8
            if (r4 != 0) goto L_0x00f8
            if (r15 == 0) goto L_0x009a
            int r2 = r2 + -1
            r0.A0H(r13)
        L_0x009a:
            if (r3 == 0) goto L_0x00a2
            int r2 = r2 + -4
            r3 = 4
            r0.A0H(r3)
        L_0x00a2:
            if (r16 == 0) goto L_0x00e5
            byte[] r14 = r0.A02
            int r13 = r0.A01
            r7 = r13
        L_0x00a9:
            int r4 = r7 + 1
            int r3 = r13 + r2
            if (r4 >= r3) goto L_0x00e5
            int r2 = X.Pxh.A0E(r14, r7, r4, r13, r2)
            r7 = r4
            goto L_0x00a9
        L_0x00b5:
            r3 = 4
            if (r5 != r3) goto L_0x00e5
            r3 = r7 & 64
            boolean r15 = X.AnonymousClass7TF.A1P(r3)
            r3 = r7 & 8
            boolean r14 = X.AnonymousClass7TF.A1P(r3)
            r3 = r7 & 4
            boolean r4 = X.AnonymousClass7TF.A1P(r3)
            r3 = r7 & 2
            boolean r16 = X.AnonymousClass7TF.A1P(r3)
            r3 = r7 & 1
            boolean r3 = X.AnonymousClass7TF.A1P(r3)
            goto L_0x008f
        L_0x00d7:
            if (r12 != r14) goto L_0x004e
            r3 = 76
            if (r11 != r3) goto L_0x004e
            if (r10 != r3) goto L_0x004e
            r3 = 84
            if (r9 == r3) goto L_0x0077
            if (r5 != r13) goto L_0x004e
        L_0x00e5:
            r13 = 84
            r7 = 2
            r4 = 88
            if (r12 != r13) goto L_0x0149
            if (r11 != r4) goto L_0x012c
            if (r10 != r4) goto L_0x012c
            if (r5 == r7) goto L_0x00f4
            if (r9 != r4) goto L_0x012c
        L_0x00f4:
            r3 = 1
            if (r2 < r3) goto L_0x033c
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r2 = "Skipping unsupported compressed or encrypted frame"
            X.2AG.A04(r8, r2)
            goto L_0x004e
        L_0x00ff:
            int r14 = r0.A02()     // Catch:{ all -> 0x04ac }
            int r3 = r2 - r3
            byte[] r13 = new byte[r3]     // Catch:{ all -> 0x04ac }
            r4 = 0
            r0.A0J(r13, r4, r3)     // Catch:{ all -> 0x04ac }
            int r6 = A00(r13, r4, r14)     // Catch:{ all -> 0x04ac }
            java.nio.charset.Charset r3 = A04(r14)     // Catch:{ all -> 0x04ac }
            java.lang.String r7 = X.Pxe.A11(r3, r13, r4, r6)     // Catch:{ all -> 0x04ac }
            if (r14 == 0) goto L_0x011d
            r4 = 3
            r3 = 2
            if (r14 != r4) goto L_0x011e
        L_0x011d:
            r3 = 1
        L_0x011e:
            int r6 = r6 + r3
            com.google.common.collect.ImmutableList r4 = A02(r13, r14, r6)     // Catch:{ all -> 0x04ac }
            java.lang.String r3 = "TXXX"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r6 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x04ac }
            r6.<init>(r3, r7, r4)     // Catch:{ all -> 0x04ac }
            goto L_0x033d
        L_0x012c:
            java.lang.String r7 = A03(r5, r12, r11, r10, r9)     // Catch:{ all -> 0x04ac }
            r3 = 1
            if (r2 < r3) goto L_0x033f
            int r5 = r0.A02()     // Catch:{ all -> 0x04ac }
            int r2 = r2 - r3
            byte[] r4 = new byte[r2]     // Catch:{ all -> 0x04ac }
            r3 = 0
            r0.A0J(r4, r3, r2)     // Catch:{ all -> 0x04ac }
            com.google.common.collect.ImmutableList r2 = A02(r4, r5, r3)     // Catch:{ all -> 0x04ac }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x04ac }
            r9.<init>(r7, r6, r2)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x0149:
            r3 = 87
            if (r12 != r3) goto L_0x01b9
            if (r11 != r4) goto L_0x0199
            if (r10 != r4) goto L_0x0199
            if (r5 == r7) goto L_0x0155
            if (r9 != r4) goto L_0x0199
        L_0x0155:
            r3 = 1
            if (r2 < r3) goto L_0x033c
            int r15 = r0.A02()     // Catch:{ all -> 0x04ac }
            int r14 = r2 - r3
            byte[] r13 = new byte[r14]     // Catch:{ all -> 0x04ac }
            r4 = 0
            r0.A0J(r13, r4, r14)     // Catch:{ all -> 0x04ac }
            int r6 = A00(r13, r4, r15)     // Catch:{ all -> 0x04ac }
            java.nio.charset.Charset r3 = A04(r15)     // Catch:{ all -> 0x04ac }
            java.lang.String r7 = X.Pxe.A11(r3, r13, r4, r6)     // Catch:{ all -> 0x04ac }
            if (r15 == 0) goto L_0x0176
            r4 = 3
            r3 = 2
            if (r15 != r4) goto L_0x0177
        L_0x0176:
            r3 = 1
        L_0x0177:
            int r6 = r6 + r3
            r4 = r6
        L_0x0179:
            if (r4 >= r14) goto L_0x0182
            byte r3 = r13[r4]     // Catch:{ all -> 0x04ac }
            if (r3 == 0) goto L_0x0183
            int r4 = r4 + 1
            goto L_0x0179
        L_0x0182:
            r4 = r14
        L_0x0183:
            java.nio.charset.Charset r3 = X.AnonymousClass2RN.A00     // Catch:{ all -> 0x04ac }
            if (r4 <= r6) goto L_0x018e
            if (r4 > r14) goto L_0x018e
            java.lang.String r4 = X.Pxh.A0o(r3, r13, r4, r6)     // Catch:{ all -> 0x04ac }
            goto L_0x0190
        L_0x018e:
            java.lang.String r4 = ""
        L_0x0190:
            java.lang.String r3 = "WXXX"
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r6 = new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame     // Catch:{ all -> 0x04ac }
            r6.<init>(r3, r7, r4)     // Catch:{ all -> 0x04ac }
            goto L_0x033d
        L_0x0199:
            java.lang.String r8 = A03(r5, r12, r11, r10, r9)     // Catch:{ all -> 0x04ac }
            byte[] r7 = new byte[r2]     // Catch:{ all -> 0x04ac }
            r5 = 0
            r0.A0J(r7, r5, r2)     // Catch:{ all -> 0x04ac }
            r4 = 0
        L_0x01a4:
            if (r4 >= r2) goto L_0x01ad
            byte r3 = r7[r4]     // Catch:{ all -> 0x04ac }
            if (r3 == 0) goto L_0x01ae
            int r4 = r4 + 1
            goto L_0x01a4
        L_0x01ad:
            r4 = r2
        L_0x01ae:
            java.lang.String r2 = X.Pxh.A0p(r7, r5, r4)     // Catch:{ all -> 0x04ac }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r9 = new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame     // Catch:{ all -> 0x04ac }
            r9.<init>(r8, r6, r2)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x01b9:
            r3 = 73
            r15 = 80
            if (r12 != r15) goto L_0x01f0
            r4 = 82
            if (r11 != r4) goto L_0x01f0
            if (r10 != r3) goto L_0x01f0
            r4 = 86
            if (r9 != r4) goto L_0x01f0
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x04ac }
            r4 = 0
            r0.A0J(r6, r4, r2)     // Catch:{ all -> 0x04ac }
            r5 = 0
        L_0x01d0:
            if (r5 >= r2) goto L_0x01d9
            byte r3 = r6[r5]     // Catch:{ all -> 0x04ac }
            if (r3 == 0) goto L_0x01da
            int r5 = r5 + 1
            goto L_0x01d0
        L_0x01d9:
            r5 = r2
        L_0x01da:
            java.lang.String r4 = X.Pxh.A0p(r6, r4, r5)     // Catch:{ all -> 0x04ac }
            int r3 = r5 + 1
            if (r2 > r3) goto L_0x01eb
            byte[] r2 = com.google.android.exoplayer2.util.Util.A06     // Catch:{ all -> 0x04ac }
        L_0x01e4:
            com.google.android.exoplayer2.metadata.id3.PrivFrame r9 = new com.google.android.exoplayer2.metadata.id3.PrivFrame     // Catch:{ all -> 0x04ac }
            r9.<init>(r4, r2)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x01eb:
            byte[] r2 = java.util.Arrays.copyOfRange(r6, r3, r2)     // Catch:{ all -> 0x04ac }
            goto L_0x01e4
        L_0x01f0:
            r4 = 71
            r14 = 79
            if (r12 != r4) goto L_0x025b
            r4 = 69
            if (r11 != r4) goto L_0x025b
            if (r10 != r14) goto L_0x025b
            r4 = 66
            if (r9 == r4) goto L_0x0202
            if (r5 != r7) goto L_0x025b
        L_0x0202:
            int r10 = r0.A02()     // Catch:{ all -> 0x04ac }
            java.nio.charset.Charset r9 = A04(r10)     // Catch:{ all -> 0x04ac }
            int r8 = r2 + -1
            byte[] r7 = new byte[r8]     // Catch:{ all -> 0x04ac }
            r4 = 0
            r0.A0J(r7, r4, r8)     // Catch:{ all -> 0x04ac }
            r3 = 0
        L_0x0213:
            if (r3 >= r8) goto L_0x021c
            byte r2 = r7[r3]     // Catch:{ all -> 0x04ac }
            if (r2 == 0) goto L_0x021d
            int r3 = r3 + 1
            goto L_0x0213
        L_0x021c:
            r3 = r8
        L_0x021d:
            java.lang.String r6 = X.Pxh.A0p(r7, r4, r3)     // Catch:{ all -> 0x04ac }
            int r2 = r3 + 1
            int r3 = A00(r7, r2, r10)     // Catch:{ all -> 0x04ac }
            if (r3 <= r2) goto L_0x0230
            if (r3 > r8) goto L_0x0230
            java.lang.String r5 = X.Pxh.A0o(r9, r7, r3, r2)     // Catch:{ all -> 0x04ac }
            goto L_0x0232
        L_0x0230:
            java.lang.String r5 = ""
        L_0x0232:
            if (r10 == 0) goto L_0x0238
            r2 = 3
            r4 = 2
            if (r10 != r2) goto L_0x0239
        L_0x0238:
            r4 = 1
        L_0x0239:
            int r3 = r3 + r4
            int r2 = A00(r7, r3, r10)     // Catch:{ all -> 0x04ac }
            if (r2 <= r3) goto L_0x0247
            if (r2 > r8) goto L_0x0247
            java.lang.String r3 = X.Pxh.A0o(r9, r7, r2, r3)     // Catch:{ all -> 0x04ac }
            goto L_0x0249
        L_0x0247:
            java.lang.String r3 = ""
        L_0x0249:
            int r2 = r2 + r4
            if (r8 > r2) goto L_0x024d
            goto L_0x0252
        L_0x024d:
            byte[] r2 = java.util.Arrays.copyOfRange(r7, r2, r8)     // Catch:{ all -> 0x04ac }
            goto L_0x0254
        L_0x0252:
            byte[] r2 = com.google.android.exoplayer2.util.Util.A06     // Catch:{ all -> 0x04ac }
        L_0x0254:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r9 = new com.google.android.exoplayer2.metadata.id3.GeobFrame     // Catch:{ all -> 0x04ac }
            r9.<init>(r6, r2, r5, r3)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x025b:
            r6 = 65
            r4 = 67
            if (r5 != r7) goto L_0x0268
            if (r12 != r15) goto L_0x02e6
            if (r11 != r3) goto L_0x0490
            if (r10 != r4) goto L_0x0490
            goto L_0x0270
        L_0x0268:
            if (r12 != r6) goto L_0x02e6
            if (r11 != r15) goto L_0x0490
            if (r10 != r3) goto L_0x0490
            if (r9 != r4) goto L_0x0490
        L_0x0270:
            int r9 = r0.A02()     // Catch:{ all -> 0x04ac }
            java.nio.charset.Charset r4 = A04(r9)     // Catch:{ all -> 0x04ac }
            int r10 = r2 + -1
            byte[] r8 = new byte[r10]     // Catch:{ all -> 0x04ac }
            r3 = 0
            r0.A0J(r8, r3, r10)     // Catch:{ all -> 0x04ac }
            java.lang.String r6 = "image/"
            if (r5 != r7) goto L_0x029d
            r2 = 3
            java.lang.String r2 = X.Pxh.A0p(r8, r3, r2)     // Catch:{ all -> 0x04ac }
            java.lang.String r2 = X.C256643w7.A00(r2)     // Catch:{ all -> 0x04ac }
            java.lang.String r7 = X.002.A0R(r6, r2)     // Catch:{ all -> 0x04ac }
            java.lang.String r2 = "image/jpg"
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x04ac }
            if (r2 == 0) goto L_0x029b
            java.lang.String r7 = "image/jpeg"
        L_0x029b:
            r5 = 2
            goto L_0x02bd
        L_0x029d:
            r5 = 0
        L_0x029e:
            if (r5 >= r10) goto L_0x02a7
            byte r2 = r8[r5]     // Catch:{ all -> 0x04ac }
            if (r2 == 0) goto L_0x02a8
            int r5 = r5 + 1
            goto L_0x029e
        L_0x02a7:
            r5 = r10
        L_0x02a8:
            java.lang.String r2 = X.Pxh.A0p(r8, r3, r5)     // Catch:{ all -> 0x04ac }
            java.lang.String r7 = X.C256643w7.A00(r2)     // Catch:{ all -> 0x04ac }
            r2 = 47
            int r3 = r7.indexOf(r2)     // Catch:{ all -> 0x04ac }
            r2 = -1
            if (r3 != r2) goto L_0x02bd
            java.lang.String r7 = X.002.A0R(r6, r7)     // Catch:{ all -> 0x04ac }
        L_0x02bd:
            int r2 = r5 + 1
            byte r2 = r8[r2]     // Catch:{ all -> 0x04ac }
            r6 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r5 + 2
            int r5 = A00(r8, r2, r9)     // Catch:{ all -> 0x04ac }
            java.lang.String r4 = X.Pxh.A0o(r4, r8, r5, r2)     // Catch:{ all -> 0x04ac }
            if (r9 == 0) goto L_0x02d3
            r3 = 3
            r2 = 2
            if (r9 != r3) goto L_0x02d4
        L_0x02d3:
            r2 = 1
        L_0x02d4:
            int r5 = r5 + r2
            if (r10 > r5) goto L_0x02d8
            goto L_0x02dd
        L_0x02d8:
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r5, r10)     // Catch:{ all -> 0x04ac }
            goto L_0x02df
        L_0x02dd:
            byte[] r2 = com.google.android.exoplayer2.util.Util.A06     // Catch:{ all -> 0x04ac }
        L_0x02df:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r9 = new com.google.android.exoplayer2.metadata.id3.ApicFrame     // Catch:{ all -> 0x04ac }
            r9.<init>(r7, r4, r2, r6)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x02e6:
            r3 = 77
            if (r12 != r4) goto L_0x0447
            if (r11 != r14) goto L_0x0350
            if (r10 != r3) goto L_0x0490
            if (r9 == r3) goto L_0x02f2
            if (r5 != r7) goto L_0x0490
        L_0x02f2:
            r7 = 4
            if (r2 < r7) goto L_0x033c
            int r14 = r0.A02()     // Catch:{ all -> 0x04ac }
            java.nio.charset.Charset r17 = A04(r14)     // Catch:{ all -> 0x04ac }
            r13 = 3
            byte[] r6 = new byte[r13]     // Catch:{ all -> 0x04ac }
            r4 = 0
            r0.A0J(r6, r4, r13)     // Catch:{ all -> 0x04ac }
            java.lang.String r16 = new java.lang.String     // Catch:{ all -> 0x04ac }
            r3 = r16
            r3.<init>(r6, r4, r13)     // Catch:{ all -> 0x04ac }
            int r3 = r2 - r7
            byte[] r7 = new byte[r3]     // Catch:{ all -> 0x04ac }
            r0.A0J(r7, r4, r3)     // Catch:{ all -> 0x04ac }
            int r6 = A00(r7, r4, r14)     // Catch:{ all -> 0x04ac }
            r15 = r17
            java.lang.String r4 = X.Pxe.A11(r15, r7, r4, r6)     // Catch:{ all -> 0x04ac }
            if (r14 == 0) goto L_0x0321
            r15 = 2
            if (r14 != r13) goto L_0x0322
        L_0x0321:
            r15 = 1
        L_0x0322:
            int r6 = r6 + r15
            int r13 = A00(r7, r6, r14)     // Catch:{ all -> 0x04ac }
            if (r13 <= r6) goto L_0x0332
            if (r13 > r3) goto L_0x0332
            r3 = r17
            java.lang.String r7 = X.Pxh.A0o(r3, r7, r13, r6)     // Catch:{ all -> 0x04ac }
            goto L_0x0334
        L_0x0332:
            java.lang.String r7 = ""
        L_0x0334:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r6 = new com.google.android.exoplayer2.metadata.id3.CommentFrame     // Catch:{ all -> 0x04ac }
            r3 = r16
            r6.<init>(r3, r4, r7)     // Catch:{ all -> 0x04ac }
            goto L_0x033d
        L_0x033c:
            r6 = 0
        L_0x033d:
            if (r6 != 0) goto L_0x004e
        L_0x033f:
            java.lang.String r7 = "Failed to decode frame: id="
            java.lang.String r4 = A03(r5, r12, r11, r10, r9)     // Catch:{ all -> 0x04ac }
            java.lang.String r3 = ", frameSize="
            java.lang.String r2 = X.002.A07(r2, r7, r4, r3)     // Catch:{ all -> 0x04ac }
            X.2AG.A04(r8, r2)     // Catch:{ all -> 0x04ac }
            goto L_0x004e
        L_0x0350:
            r3 = 72
            r27 = r26
            if (r11 != r3) goto L_0x03c0
            if (r10 != r6) goto L_0x0490
            if (r9 != r15) goto L_0x0490
            int r7 = r0.A01     // Catch:{ all -> 0x04ac }
            byte[] r6 = r0.A02     // Catch:{ all -> 0x04ac }
            r4 = r7
        L_0x035f:
            int r3 = r6.length     // Catch:{ all -> 0x04ac }
            if (r4 >= r3) goto L_0x0369
            byte r3 = r6[r4]     // Catch:{ all -> 0x04ac }
            if (r3 == 0) goto L_0x036a
            int r4 = r4 + 1
            goto L_0x035f
        L_0x0369:
            r4 = r3
        L_0x036a:
            int r3 = r4 - r7
            java.lang.String r19 = X.Pxh.A0p(r6, r7, r3)     // Catch:{ all -> 0x04ac }
            int r3 = r4 + 1
            int r21 = X.Pxh.A09(r0, r3)     // Catch:{ all -> 0x04ac }
            int r22 = r0.A01()     // Catch:{ all -> 0x04ac }
            long r23 = r0.A07()     // Catch:{ all -> 0x04ac }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r3 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0389
            r23 = -1
        L_0x0389:
            long r25 = r0.A07()     // Catch:{ all -> 0x04ac }
            int r3 = (r25 > r8 ? 1 : (r25 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0393
            r25 = -1
        L_0x0393:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x04ac }
            int r7 = r7 + r2
        L_0x0398:
            int r2 = r0.A01     // Catch:{ all -> 0x04ac }
            if (r2 >= r7) goto L_0x03ac
            r4 = r18
            r3 = r27
            r2 = r17
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = A01(r4, r0, r5, r3, r2)     // Catch:{ all -> 0x04ac }
            if (r2 == 0) goto L_0x0398
            r6.add(r2)     // Catch:{ all -> 0x04ac }
            goto L_0x0398
        L_0x03ac:
            r2 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r2 = new com.google.android.exoplayer2.metadata.id3.Id3Frame[r2]     // Catch:{ all -> 0x04ac }
            java.lang.Object[] r2 = r6.toArray(r2)     // Catch:{ all -> 0x04ac }
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r2 = (com.google.android.exoplayer2.metadata.id3.Id3Frame[]) r2     // Catch:{ all -> 0x04ac }
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r9 = new com.google.android.exoplayer2.metadata.id3.ChapterFrame     // Catch:{ all -> 0x04ac }
            r18 = r9
            r20 = r2
            r18.<init>(r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x03c0:
            if (r11 != r13) goto L_0x0490
            if (r10 != r14) goto L_0x0490
            if (r9 != r4) goto L_0x0490
            int r12 = r0.A01     // Catch:{ all -> 0x04ac }
            byte[] r6 = r0.A02     // Catch:{ all -> 0x04ac }
            r4 = r12
        L_0x03cb:
            int r3 = r6.length     // Catch:{ all -> 0x04ac }
            if (r4 >= r3) goto L_0x03d5
            byte r3 = r6[r4]     // Catch:{ all -> 0x04ac }
            if (r3 == 0) goto L_0x03d6
            int r4 = r4 + 1
            goto L_0x03cb
        L_0x03d5:
            r4 = r3
        L_0x03d6:
            int r3 = r4 - r12
            java.nio.charset.Charset r11 = X.AnonymousClass2RN.A00     // Catch:{ all -> 0x04ac }
            java.lang.String r16 = X.Pxe.A11(r11, r6, r12, r3)     // Catch:{ all -> 0x04ac }
            int r3 = r4 + 1
            r0.A0G(r3)     // Catch:{ all -> 0x04ac }
            int r4 = r0.A02()     // Catch:{ all -> 0x04ac }
            r3 = r4 & 2
            r10 = 0
            boolean r19 = X.AnonymousClass7TF.A1P(r3)
            r3 = r4 & 1
            boolean r20 = X.AnonymousClass7TF.A1P(r3)
            int r9 = r0.A02()     // Catch:{ all -> 0x04ac }
            java.lang.String[] r13 = new java.lang.String[r9]     // Catch:{ all -> 0x04ac }
            r8 = 0
        L_0x03fb:
            if (r8 >= r9) goto L_0x041b
            int r7 = r0.A01     // Catch:{ all -> 0x04ac }
            byte[] r6 = r0.A02     // Catch:{ all -> 0x04ac }
            r4 = r7
        L_0x0402:
            int r3 = r6.length     // Catch:{ all -> 0x04ac }
            if (r4 >= r3) goto L_0x040c
            byte r3 = r6[r4]     // Catch:{ all -> 0x04ac }
            if (r3 == 0) goto L_0x040d
            int r4 = r4 + 1
            goto L_0x0402
        L_0x040c:
            r4 = r3
        L_0x040d:
            java.lang.String r3 = X.Pxh.A0o(r11, r6, r4, r7)     // Catch:{ all -> 0x04ac }
            r13[r8] = r3     // Catch:{ all -> 0x04ac }
            int r3 = r4 + 1
            r0.A0G(r3)     // Catch:{ all -> 0x04ac }
            int r8 = r8 + 1
            goto L_0x03fb
        L_0x041b:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x04ac }
            int r12 = r12 + r2
        L_0x0420:
            int r2 = r0.A01     // Catch:{ all -> 0x04ac }
            if (r2 >= r12) goto L_0x0434
            r4 = r18
            r3 = r27
            r2 = r17
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = A01(r4, r0, r5, r3, r2)     // Catch:{ all -> 0x04ac }
            if (r2 == 0) goto L_0x0420
            r6.add(r2)     // Catch:{ all -> 0x04ac }
            goto L_0x0420
        L_0x0434:
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r2 = new com.google.android.exoplayer2.metadata.id3.Id3Frame[r10]     // Catch:{ all -> 0x04ac }
            java.lang.Object[] r2 = r6.toArray(r2)     // Catch:{ all -> 0x04ac }
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r2 = (com.google.android.exoplayer2.metadata.id3.Id3Frame[]) r2     // Catch:{ all -> 0x04ac }
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r9 = new com.google.android.exoplayer2.metadata.id3.ChapterTocFrame     // Catch:{ all -> 0x04ac }
            r18 = r13
            r15 = r9
            r17 = r2
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x0447:
            if (r12 != r3) goto L_0x0490
            r3 = 76
            if (r11 != r3) goto L_0x0490
            if (r10 != r3) goto L_0x0490
            if (r9 != r13) goto L_0x0490
            int r12 = r0.A05()     // Catch:{ all -> 0x04ac }
            int r13 = r0.A03()     // Catch:{ all -> 0x04ac }
            int r14 = r0.A03()     // Catch:{ all -> 0x04ac }
            int r8 = r0.A02()     // Catch:{ all -> 0x04ac }
            int r7 = r0.A02()     // Catch:{ all -> 0x04ac }
            X.5Ob r6 = new X.5Ob     // Catch:{ all -> 0x04ac }
            r6.<init>()     // Catch:{ all -> 0x04ac }
            r6.A04(r0)     // Catch:{ all -> 0x04ac }
            int r2 = r2 + -10
            int r5 = r2 * 8
            int r2 = r8 + r7
            int r5 = r5 / r2
            int[] r10 = new int[r5]     // Catch:{ all -> 0x04ac }
            int[] r11 = new int[r5]     // Catch:{ all -> 0x04ac }
            r4 = 0
        L_0x0479:
            if (r4 >= r5) goto L_0x048a
            int r3 = r6.A01(r8)     // Catch:{ all -> 0x04ac }
            int r2 = r6.A01(r7)     // Catch:{ all -> 0x04ac }
            r10[r4] = r3     // Catch:{ all -> 0x04ac }
            r11[r4] = r2     // Catch:{ all -> 0x04ac }
            int r4 = r4 + 1
            goto L_0x0479
        L_0x048a:
            com.google.android.exoplayer2.metadata.id3.MlltFrame r9 = new com.google.android.exoplayer2.metadata.id3.MlltFrame     // Catch:{ all -> 0x04ac }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x04ac }
            goto L_0x049f
        L_0x0490:
            java.lang.String r5 = A03(r5, r12, r11, r10, r9)     // Catch:{ all -> 0x04ac }
            byte[] r4 = new byte[r2]     // Catch:{ all -> 0x04ac }
            r3 = 0
            r0.A0J(r4, r3, r2)     // Catch:{ all -> 0x04ac }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r9 = new com.google.android.exoplayer2.metadata.id3.BinaryFrame     // Catch:{ all -> 0x04ac }
            r9.<init>(r5, r4)     // Catch:{ all -> 0x04ac }
        L_0x049f:
            r6 = r9
            goto L_0x004e
        L_0x04a2:
            r7 = 0
            goto L_0x003f
        L_0x04a5:
            r9 = 0
            int r2 = r0.A03()
            goto L_0x0039
        L_0x04ac:
            r2 = move-exception
            r0.A0G(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qo4.A01(X.Taq, X.4XV, int, int, boolean):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r12.A0G(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[SYNTHETIC, Splitter:B:30:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072 A[EDGE_INSN: B:41:0x0072->B:34:0x0072 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.AnonymousClass4XV r12, int r13, int r14, boolean r15) {
        /*
            int r5 = r12.A01
            goto L_0x0007
        L_0x0003:
            int r0 = (int) r2     // Catch:{ all -> 0x0076 }
            r12.A0H(r0)     // Catch:{ all -> 0x0076 }
        L_0x0007:
            int r6 = r12.A00     // Catch:{ all -> 0x0076 }
            int r0 = r12.A01     // Catch:{ all -> 0x0076 }
            int r0 = r6 - r0
            r8 = 1
            if (r0 < r14) goto L_0x0035
            r7 = 3
            r11 = 0
            if (r13 < r7) goto L_0x0021
            int r1 = r12.A01()     // Catch:{ all -> 0x0076 }
            long r2 = r12.A07()     // Catch:{ all -> 0x0076 }
            int r4 = r12.A05()     // Catch:{ all -> 0x0076 }
            goto L_0x002b
        L_0x0021:
            int r1 = r12.A03()     // Catch:{ all -> 0x0076 }
            int r0 = r12.A03()     // Catch:{ all -> 0x0076 }
            long r2 = (long) r0     // Catch:{ all -> 0x0076 }
            r4 = 0
        L_0x002b:
            r9 = 0
            if (r1 != 0) goto L_0x0039
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            if (r4 != 0) goto L_0x0039
        L_0x0035:
            r12.A0G(r5)
            return r8
        L_0x0039:
            r0 = 4
            if (r13 != r0) goto L_0x005c
            if (r15 != 0) goto L_0x004a
            r7 = 8421504(0x808080, double:4.160776E-317)
            long r7 = r7 & r2
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0072
            long r2 = X.Pxk.A06(r2)
        L_0x004a:
            r0 = r4 & 64
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            r0 = r4 & 1
        L_0x0052:
            if (r0 == 0) goto L_0x0056
            int r1 = r1 + 4
        L_0x0056:
            long r0 = (long) r1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0072
            goto L_0x0069
        L_0x005c:
            if (r13 != r7) goto L_0x0067
            r0 = r4 & 32
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            r0 = r4 & 128(0x80, float:1.794E-43)
            goto L_0x0052
        L_0x0067:
            r1 = 0
            goto L_0x0056
        L_0x0069:
            int r0 = r12.A01     // Catch:{ all -> 0x0076 }
            int r6 = r6 - r0
            long r0 = (long) r6     // Catch:{ all -> 0x0076 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0072
            goto L_0x0003
        L_0x0072:
            r12.A0G(r5)
            return r11
        L_0x0076:
            r0 = move-exception
            r12.A0G(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qo4.A05(X.4XV, int, int, boolean):boolean");
    }

    public Qo4(C13463Taq taq) {
        this.A00 = taq;
    }

    public final Metadata A06(AnonymousClass4QS r3, ByteBuffer byteBuffer) {
        return A07(byteBuffer.array(), byteBuffer.limit());
    }

    public Qo4() {
        this((C13463Taq) null);
    }
}
