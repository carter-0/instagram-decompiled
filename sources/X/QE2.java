package X;

import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.Locale;

public final class QE2 extends RLI {
    public static final TZa A01 = new C11719SfG();
    public final TZa A00;

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

    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v94 */
    /* JADX WARNING: type inference failed for: r0v126 */
    /* JADX WARNING: type inference failed for: r20v2, types: [androidx.media3.extractor.metadata.id3.MlltFrame] */
    /* JADX WARNING: type inference failed for: r21v4, types: [androidx.media3.extractor.metadata.id3.ChapterTocFrame] */
    /* JADX WARNING: type inference failed for: r21v5, types: [androidx.media3.extractor.metadata.id3.ChapterFrame] */
    /* JADX WARNING: type inference failed for: r0v127 */
    /* JADX WARNING: type inference failed for: r0v128 */
    /* JADX WARNING: type inference failed for: r0v129 */
    /* JADX WARNING: type inference failed for: r0v130 */
    /* JADX WARNING: type inference failed for: r0v131 */
    /* JADX WARNING: type inference failed for: r0v132 */
    /* JADX WARNING: type inference failed for: r0v133 */
    /* JADX WARNING: type inference failed for: r0v134 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x021c, code lost:
        if (r15 == 3) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0257, code lost:
        if (r4 == 67) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02bd, code lost:
        if (r15 == 3) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x030a, code lost:
        if (r15 == 3) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0493, code lost:
        if (r0 == 0) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f5, code lost:
        if (r13 == 3) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0153, code lost:
        if (r14 == 3) goto L_0x0155;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02d8 A[Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0426 A[ADDED_TO_REGION, Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128 A[Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.metadata.id3.Id3Frame A01(X.C11389SRd r25, X.TZa r26, int r27, int r28, boolean r29) {
        /*
            r2 = r25
            int r9 = r2.A05()
            int r6 = r2.A05()
            int r5 = r2.A05()
            r7 = 3
            r3 = r27
            r20 = r29
            if (r3 < r7) goto L_0x04aa
            int r4 = r2.A05()
            r0 = 4
            int r1 = r2.A07()
            if (r3 != r0) goto L_0x0039
            if (r29 != 0) goto L_0x0039
            r8 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 7
            r8 = r8 | r0
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 14
            r8 = r8 | r0
            int r0 = r1 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 21
            r1 = r1 | r8
        L_0x0039:
            if (r3 < r7) goto L_0x04a7
            int r12 = r2.A08()
        L_0x003f:
            r19 = 0
            if (r9 != 0) goto L_0x0053
            if (r6 != 0) goto L_0x0053
            if (r5 != 0) goto L_0x0053
            if (r4 != 0) goto L_0x0053
            if (r1 != 0) goto L_0x0053
            if (r12 != 0) goto L_0x0053
        L_0x004d:
            int r0 = r2.A00
            r2.A0O(r0)
        L_0x0052:
            return r19
        L_0x0053:
            int r11 = r2.A01
            int r11 = r11 + r1
            int r0 = r2.A00
            java.lang.String r18 = "Id3Decoder"
            if (r11 <= r0) goto L_0x0064
            java.lang.String r1 = "Frame size exceeds remaining tag data"
            r0 = r18
            X.STH.A03(r0, r1)
            goto L_0x004d
        L_0x0064:
            r21 = r26
            if (r26 != 0) goto L_0x04bd
            r10 = 1
            if (r3 != r7) goto L_0x00a5
            r0 = r12 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r7 = r12 & 64
            boolean r7 = X.AnonymousClass7TF.A1P(r7)
            r8 = r12 & 32
            boolean r13 = X.AnonymousClass7TF.A1P(r8)
            r8 = r0
            r14 = 0
        L_0x007f:
            if (r8 != 0) goto L_0x04b6
            if (r7 != 0) goto L_0x04b6
            if (r13 == 0) goto L_0x008a
            int r1 = r1 + -1
            r2.A0P(r10)
        L_0x008a:
            if (r0 == 0) goto L_0x0092
            int r1 = r1 + -4
            r0 = 4
            r2.A0P(r0)
        L_0x0092:
            if (r14 == 0) goto L_0x00c7
            byte[] r12 = r2.A02
            int r10 = r2.A01
            r8 = r10
        L_0x0099:
            int r7 = r8 + 1
            int r0 = r10 + r1
            if (r7 >= r0) goto L_0x00c7
            int r1 = X.Pxh.A0E(r12, r8, r7, r10, r1)
            r8 = r7
            goto L_0x0099
        L_0x00a5:
            r0 = 4
            if (r3 != r0) goto L_0x00c7
            r0 = r12 & 64
            boolean r13 = X.AnonymousClass7TF.A1P(r0)
            r0 = r12 & 8
            boolean r8 = X.AnonymousClass7TF.A1P(r0)
            r0 = r12 & 4
            boolean r7 = X.AnonymousClass7TF.A1P(r0)
            r0 = r12 & 2
            boolean r14 = X.AnonymousClass7TF.A1P(r0)
            r0 = r12 & 1
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            goto L_0x007f
        L_0x00c7:
            r13 = 84
            r8 = 88
            r7 = 2
            if (r9 != r13) goto L_0x0128
            if (r6 != r8) goto L_0x0106
            if (r5 != r8) goto L_0x0106
            if (r3 == r7) goto L_0x00d6
            if (r4 != r8) goto L_0x0106
        L_0x00d6:
            r0 = 1
            if (r1 < r0) goto L_0x0326
            int r13 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r1 - r0
            byte[] r12 = new byte[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = 0
            r2.A0R(r12, r7, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r8 = A00(r12, r7, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.nio.charset.Charset r0 = A04(r13)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r10 = X.Pxe.A11(r0, r12, r7, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r13 == 0) goto L_0x00f7
            r7 = 3
            r0 = 2
            if (r13 != r7) goto L_0x00f8
        L_0x00f7:
            r0 = 1
        L_0x00f8:
            int r8 = r8 + r0
            com.google.common.collect.ImmutableList r8 = A02(r12, r13, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r7 = "TXXX"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r0 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0.<init>(r7, r10, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0106:
            java.lang.String r12 = A03(r3, r9, r6, r5, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = 1
            if (r1 >= r0) goto L_0x010f
            goto L_0x048a
        L_0x010f:
            int r10 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r8 = r1 - r0
            byte[] r7 = new byte[r8]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = 0
            r2.A0R(r7, r0, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            com.google.common.collect.ImmutableList r8 = A02(r7, r10, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            androidx.media3.extractor.metadata.id3.TextInformationFrame r0 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = r19
            r0.<init>(r12, r7, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0128:
            r0 = 87
            if (r9 != r0) goto L_0x019a
            if (r6 != r8) goto L_0x0178
            if (r5 != r8) goto L_0x0178
            if (r3 == r7) goto L_0x0134
            if (r4 != r8) goto L_0x0178
        L_0x0134:
            r0 = 1
            if (r1 < r0) goto L_0x0326
            int r14 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r13 = r1 - r0
            byte[] r12 = new byte[r13]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = 0
            r2.A0R(r12, r7, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r8 = A00(r12, r7, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.nio.charset.Charset r0 = A04(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r10 = X.Pxe.A11(r0, r12, r7, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r14 == 0) goto L_0x0155
            r7 = 3
            r0 = 2
            if (r14 != r7) goto L_0x0156
        L_0x0155:
            r0 = 1
        L_0x0156:
            int r8 = r8 + r0
            r7 = r8
        L_0x0158:
            if (r7 >= r13) goto L_0x0161
            byte r0 = r12[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x0162
            int r7 = r7 + 1
            goto L_0x0158
        L_0x0161:
            r7 = r13
        L_0x0162:
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A00     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r7 <= r8) goto L_0x016d
            if (r7 > r13) goto L_0x016d
            java.lang.String r8 = X.Pxh.A0o(r0, r12, r7, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x016f
        L_0x016d:
            java.lang.String r8 = ""
        L_0x016f:
            java.lang.String r7 = "WXXX"
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r0 = new androidx.media3.extractor.metadata.id3.UrlLinkFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0.<init>(r7, r10, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0178:
            java.lang.String r12 = A03(r3, r9, r6, r5, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            byte[] r10 = new byte[r1]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r8 = 0
            r2.A0R(r10, r8, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = 0
        L_0x0183:
            if (r7 >= r1) goto L_0x018c
            byte r0 = r10[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x018d
            int r7 = r7 + 1
            goto L_0x0183
        L_0x018c:
            r7 = r1
        L_0x018d:
            java.lang.String r8 = X.Pxh.A0p(r10, r8, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r0 = new androidx.media3.extractor.metadata.id3.UrlLinkFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = r19
            r0.<init>(r12, r7, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x019a:
            r15 = 73
            r14 = 80
            if (r9 != r14) goto L_0x01d1
            r0 = 82
            if (r6 != r0) goto L_0x01d1
            if (r5 != r15) goto L_0x01d1
            r0 = 86
            if (r4 != r0) goto L_0x01d1
            byte[] r10 = new byte[r1]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r8 = 0
            r2.A0R(r10, r8, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = 0
        L_0x01b1:
            if (r7 >= r1) goto L_0x01ba
            byte r0 = r10[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x01bb
            int r7 = r7 + 1
            goto L_0x01b1
        L_0x01ba:
            r7 = r1
        L_0x01bb:
            java.lang.String r8 = X.Pxh.A0p(r10, r8, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r7 + 1
            if (r1 > r0) goto L_0x01cc
            byte[] r7 = androidx.media3.common.util.Util.A07     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
        L_0x01c5:
            androidx.media3.extractor.metadata.id3.PrivFrame r0 = new androidx.media3.extractor.metadata.id3.PrivFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0.<init>(r8, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x01cc:
            byte[] r7 = java.util.Arrays.copyOfRange(r10, r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x01c5
        L_0x01d1:
            r0 = 71
            r12 = 79
            if (r9 != r0) goto L_0x0244
            r0 = 69
            if (r6 != r0) goto L_0x0244
            if (r5 != r12) goto L_0x0244
            r0 = 66
            if (r4 == r0) goto L_0x01e3
            if (r3 != r7) goto L_0x0244
        L_0x01e3:
            int r15 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.nio.charset.Charset r8 = A04(r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r14 = r1 + -1
            byte[] r13 = new byte[r14]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r10 = 0
            r2.A0R(r13, r10, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = 0
        L_0x01f4:
            if (r7 >= r14) goto L_0x01fd
            byte r0 = r13[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x01fe
            int r7 = r7 + 1
            goto L_0x01f4
        L_0x01fd:
            r7 = r14
        L_0x01fe:
            java.lang.String r0 = X.Pxh.A0p(r13, r10, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r12 = X.SQX.A02(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r7 + 1
            int r7 = A00(r13, r0, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r7 <= r0) goto L_0x0215
            if (r7 > r14) goto L_0x0215
            java.lang.String r10 = X.Pxh.A0o(r8, r13, r7, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x0217
        L_0x0215:
            java.lang.String r10 = ""
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            r0 = 3
            r16 = 2
            if (r15 != r0) goto L_0x0220
        L_0x021e:
            r16 = 1
        L_0x0220:
            int r7 = r7 + r16
            int r0 = A00(r13, r7, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 <= r7) goto L_0x022f
            if (r0 > r14) goto L_0x022f
            java.lang.String r8 = X.Pxh.A0o(r8, r13, r0, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x0231
        L_0x022f:
            java.lang.String r8 = ""
        L_0x0231:
            int r0 = r0 + r16
            if (r14 > r0) goto L_0x0236
            goto L_0x023b
        L_0x0236:
            byte[] r7 = java.util.Arrays.copyOfRange(r13, r0, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x023d
        L_0x023b:
            byte[] r7 = androidx.media3.common.util.Util.A07     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
        L_0x023d:
            androidx.media3.extractor.metadata.id3.GeobFrame r0 = new androidx.media3.extractor.metadata.id3.GeobFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0.<init>(r12, r7, r10, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0244:
            r10 = 65
            r8 = 67
            if (r3 != r7) goto L_0x0251
            if (r9 != r14) goto L_0x02d4
            if (r6 != r15) goto L_0x0475
            if (r5 != r8) goto L_0x0475
            goto L_0x0259
        L_0x0251:
            if (r9 != r10) goto L_0x02d4
            if (r6 != r14) goto L_0x0475
            if (r5 != r15) goto L_0x0475
            if (r4 != r8) goto L_0x0475
        L_0x0259:
            int r15 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.nio.charset.Charset r16 = A04(r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r14 = r1 + -1
            byte[] r13 = new byte[r14]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r8 = 0
            r2.A0R(r13, r8, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r10 = "image/"
            if (r3 != r7) goto L_0x0297
            r0 = 3
            java.lang.String r0 = X.Pxh.A0p(r13, r8, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r0 = X.C256643w7.A00(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r12 = X.002.A0R(r10, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r0 = "image/jpg"
            boolean r0 = r0.equals(r12)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x0284
            java.lang.String r12 = "image/jpeg"
        L_0x0284:
            int r0 = r7 + 1
            byte r0 = r13[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r10 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r7 + 2
            int r7 = A00(r13, r8, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = r16
            java.lang.String r8 = X.Pxh.A0o(r0, r13, r7, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x02b8
        L_0x0297:
            r7 = 0
        L_0x0298:
            if (r7 >= r14) goto L_0x02a1
            byte r0 = r13[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x02a2
            int r7 = r7 + 1
            goto L_0x0298
        L_0x02a1:
            r7 = r14
        L_0x02a2:
            java.lang.String r0 = X.Pxh.A0p(r13, r8, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r12 = X.C256643w7.A00(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = 47
            int r8 = r12.indexOf(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = -1
            if (r8 != r0) goto L_0x0284
            java.lang.String r12 = X.002.A0R(r10, r12)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x0284
        L_0x02b8:
            if (r15 == 0) goto L_0x02bf
            r0 = 3
            r16 = 2
            if (r15 != r0) goto L_0x02c1
        L_0x02bf:
            r16 = 1
        L_0x02c1:
            int r7 = r7 + r16
            if (r14 > r7) goto L_0x02c6
            goto L_0x02cb
        L_0x02c6:
            byte[] r7 = java.util.Arrays.copyOfRange(r13, r7, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x02cd
        L_0x02cb:
            byte[] r7 = androidx.media3.common.util.Util.A07     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
        L_0x02cd:
            androidx.media3.extractor.metadata.id3.ApicFrame r0 = new androidx.media3.extractor.metadata.id3.ApicFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0.<init>(r12, r8, r7, r10)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x02d4:
            r0 = 77
            if (r9 != r8) goto L_0x0426
            if (r6 != r12) goto L_0x0329
            if (r5 != r0) goto L_0x0475
            if (r4 == r0) goto L_0x02e0
            if (r3 != r7) goto L_0x0475
        L_0x02e0:
            r10 = 4
            if (r1 < r10) goto L_0x0326
            int r15 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.nio.charset.Charset r14 = A04(r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = 3
            byte[] r7 = new byte[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r8 = 0
            r2.A0R(r7, r8, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r13 = new java.lang.String     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r13.<init>(r7, r8, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r12 = r1 - r10
            byte[] r10 = new byte[r12]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r2.A0R(r10, r8, r12)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r7 = A00(r10, r8, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r8 = X.Pxe.A11(r14, r10, r8, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r15 == 0) goto L_0x030c
            r16 = 2
            if (r15 != r0) goto L_0x030e
        L_0x030c:
            r16 = 1
        L_0x030e:
            int r7 = r7 + r16
            int r0 = A00(r10, r7, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 <= r7) goto L_0x031d
            if (r0 > r12) goto L_0x031d
            java.lang.String r7 = X.Pxh.A0o(r14, r10, r0, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x031f
        L_0x031d:
            java.lang.String r7 = ""
        L_0x031f:
            androidx.media3.extractor.metadata.id3.CommentFrame r0 = new androidx.media3.extractor.metadata.id3.CommentFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0.<init>(r13, r8, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0326:
            r0 = 0
            goto L_0x048c
        L_0x0329:
            r0 = 72
            r23 = r28
            if (r6 != r0) goto L_0x0399
            if (r5 != r10) goto L_0x0475
            if (r4 != r14) goto L_0x0475
            int r10 = r2.A01     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            byte[] r8 = r2.A02     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = r10
        L_0x0338:
            int r0 = r8.length     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r7 >= r0) goto L_0x0342
            byte r0 = r8[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x0343
            int r7 = r7 + 1
            goto L_0x0338
        L_0x0342:
            r7 = r0
        L_0x0343:
            int r0 = r7 - r10
            java.lang.String r22 = X.Pxh.A0p(r8, r10, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r7 + 1
            int r24 = X.Pxf.A06(r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r25 = r2.A01()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            long r26 = r2.A0C()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r26 > r7 ? 1 : (r26 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0362
            r26 = -1
        L_0x0362:
            long r28 = r2.A0C()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x036c
            r28 = -1
        L_0x036c:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r10 = r10 + r1
        L_0x0371:
            int r0 = r2.A01     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 >= r10) goto L_0x0385
            r8 = r21
            r7 = r23
            r0 = r20
            androidx.media3.extractor.metadata.id3.Id3Frame r0 = A01(r2, r8, r3, r7, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x0371
            r12.add(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x0371
        L_0x0385:
            r0 = 0
            androidx.media3.extractor.metadata.id3.Id3Frame[] r0 = new androidx.media3.extractor.metadata.id3.Id3Frame[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.Object[] r7 = r12.toArray(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            androidx.media3.extractor.metadata.id3.Id3Frame[] r7 = (androidx.media3.extractor.metadata.id3.Id3Frame[]) r7     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            androidx.media3.extractor.metadata.id3.ChapterFrame r0 = new androidx.media3.extractor.metadata.id3.ChapterFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r21 = r0
            r23 = r7
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0399:
            if (r6 != r13) goto L_0x0475
            if (r5 != r12) goto L_0x0475
            if (r4 != r8) goto L_0x0475
            int r12 = r2.A01     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            byte[] r8 = r2.A02     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r7 = r12
        L_0x03a4:
            int r0 = r8.length     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r7 >= r0) goto L_0x03ae
            byte r0 = r8[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x03af
            int r7 = r7 + 1
            goto L_0x03a4
        L_0x03ae:
            r7 = r0
        L_0x03af:
            int r0 = r7 - r12
            java.nio.charset.Charset r13 = X.AnonymousClass2RN.A00     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String r22 = X.Pxe.A11(r13, r8, r12, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r7 + 1
            r2.A0O(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r7 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = r7 & 2
            r17 = 0
            boolean r25 = X.AnonymousClass7TF.A1P(r0)
            r0 = r7 & 1
            boolean r26 = X.AnonymousClass7TF.A1P(r0)
            int r10 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r16 = r0
            r8 = 0
        L_0x03d7:
            if (r8 >= r10) goto L_0x03f7
            int r15 = r2.A01     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            byte[] r7 = r2.A02     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = r15
        L_0x03de:
            int r14 = r7.length     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 >= r14) goto L_0x03e8
            byte r14 = r7[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r14 == 0) goto L_0x03e9
            int r0 = r0 + 1
            goto L_0x03de
        L_0x03e8:
            r0 = r14
        L_0x03e9:
            java.lang.String r7 = X.Pxh.A0o(r13, r7, r0, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r16[r8] = r7     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r0 + 1
            r2.A0O(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r8 = r8 + 1
            goto L_0x03d7
        L_0x03f7:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r12 = r12 + r1
        L_0x03fc:
            int r0 = r2.A01     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 >= r12) goto L_0x0410
            r10 = r21
            r7 = r23
            r0 = r20
            androidx.media3.extractor.metadata.id3.Id3Frame r0 = A01(r2, r10, r3, r7, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            if (r0 == 0) goto L_0x03fc
            r8.add(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x03fc
        L_0x0410:
            r0 = r17
            androidx.media3.extractor.metadata.id3.Id3Frame[] r0 = new androidx.media3.extractor.metadata.id3.Id3Frame[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            java.lang.Object[] r7 = r8.toArray(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            androidx.media3.extractor.metadata.id3.Id3Frame[] r7 = (androidx.media3.extractor.metadata.id3.Id3Frame[]) r7     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            androidx.media3.extractor.metadata.id3.ChapterTocFrame r0 = new androidx.media3.extractor.metadata.id3.ChapterTocFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r21 = r0
            r23 = r7
            r24 = r16
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0426:
            if (r9 != r0) goto L_0x0475
            r0 = 76
            if (r6 != r0) goto L_0x0475
            if (r5 != r0) goto L_0x0475
            if (r4 != r13) goto L_0x0475
            int r23 = r2.A08()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r24 = r2.A06()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r25 = r2.A06()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r12 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r10 = r2.A05()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            X.ST7 r8 = new X.ST7     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r8.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r8.A0C(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r1 + -10
            int r7 = r0 * 8
            int r0 = r12 + r10
            int r7 = r7 / r0
            int[] r14 = new int[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int[] r13 = new int[r7]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = 0
        L_0x0458:
            if (r0 >= r7) goto L_0x0469
            int r16 = r8.A06(r12)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r15 = r8.A06(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r14[r0] = r16     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r13[r0] = r15     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            int r0 = r0 + 1
            goto L_0x0458
        L_0x0469:
            androidx.media3.extractor.metadata.id3.MlltFrame r0 = new androidx.media3.extractor.metadata.id3.MlltFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r20 = r0
            r21 = r14
            r22 = r13
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0475:
            java.lang.String r8 = A03(r3, r9, r6, r5, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            byte[] r7 = new byte[r1]     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0 = 0
            r2.A0R(r7, r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            androidx.media3.extractor.metadata.id3.BinaryFrame r0 = new androidx.media3.extractor.metadata.id3.BinaryFrame     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            r0.<init>(r8, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0485, all -> 0x04b1 }
            goto L_0x048c
        L_0x0485:
            r8 = move-exception
            r2.A0O(r11)
            goto L_0x0495
        L_0x048a:
            r0 = r19
        L_0x048c:
            r2.A0O(r11)
            r8 = r19
            r19 = r0
            if (r0 != 0) goto L_0x0052
        L_0x0495:
            java.lang.String r7 = "Failed to decode frame: id="
            java.lang.String r2 = A03(r3, r9, r6, r5, r4)
            java.lang.String r0 = ", frameSize="
            java.lang.String r1 = X.002.A07(r1, r7, r2, r0)
            r0 = r18
            X.STH.A05(r0, r1, r8)
            return r19
        L_0x04a7:
            r12 = 0
            goto L_0x003f
        L_0x04aa:
            r4 = 0
            int r1 = r2.A06()
            goto L_0x0039
        L_0x04b1:
            r0 = move-exception
            r2.A0O(r11)
            throw r0
        L_0x04b6:
            java.lang.String r1 = "Skipping unsupported compressed or encrypted frame"
            r0 = r18
            X.STH.A03(r0, r1)
        L_0x04bd:
            r2.A0O(r11)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QE2.A01(X.SRd, X.TZa, int, int, boolean):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r12.A0O(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[SYNTHETIC, Splitter:B:30:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072 A[EDGE_INSN: B:41:0x0072->B:34:0x0072 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C11389SRd r12, int r13, int r14, boolean r15) {
        /*
            int r5 = r12.A01
            goto L_0x0007
        L_0x0003:
            int r0 = (int) r2     // Catch:{ all -> 0x0076 }
            r12.A0P(r0)     // Catch:{ all -> 0x0076 }
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
            long r2 = r12.A0C()     // Catch:{ all -> 0x0076 }
            int r4 = r12.A08()     // Catch:{ all -> 0x0076 }
            goto L_0x002b
        L_0x0021:
            int r1 = r12.A06()     // Catch:{ all -> 0x0076 }
            int r0 = r12.A06()     // Catch:{ all -> 0x0076 }
            long r2 = (long) r0     // Catch:{ all -> 0x0076 }
            r4 = 0
        L_0x002b:
            r9 = 0
            if (r1 != 0) goto L_0x0039
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            if (r4 != 0) goto L_0x0039
        L_0x0035:
            r12.A0O(r5)
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
            r12.A0O(r5)
            return r11
        L_0x0076:
            r0 = move-exception
            r12.A0O(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QE2.A05(X.SRd, int, int, boolean):boolean");
    }

    public QE2(TZa tZa) {
        this.A00 = tZa;
    }

    public QE2() {
        this((TZa) null);
    }
}
