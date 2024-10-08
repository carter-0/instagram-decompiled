package X;

public final class S03 {
    public final C11389SRd A00 = Pxe.A0P(10);

    /* JADX WARNING: type inference failed for: r4v1, types: [X.SRd, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.Metadata A00(X.C13910TlA r18, X.TZa r19) {
        /*
            r17 = this;
            r9 = 0
            r2 = 0
            r8 = 0
        L_0x0003:
            r0 = r17
            r5 = r18
            X.SRd r4 = r0.A00     // Catch:{ EOFException -> 0x011c }
            byte[] r0 = r4.A02     // Catch:{ EOFException -> 0x011c }
            r1 = 10
            r5.E2F(r0, r9, r1)     // Catch:{ EOFException -> 0x011c }
            r4.A0O(r9)
            int r0 = r4.A06()
            r10 = 4801587(0x494433, float:6.728456E-39)
            if (r0 != r10) goto L_0x011c
            r14 = 3
            r4.A0P(r14)
            int r3 = r4.A04()
            int r7 = r3 + 10
            if (r2 != 0) goto L_0x0110
            byte[] r2 = new byte[r7]
            byte[] r0 = r4.A02
            java.lang.System.arraycopy(r0, r9, r2, r9, r1)
            r5.E2F(r2, r1, r3)
            X.QE2 r6 = new X.QE2
            r0 = r19
            r6.<init>(r0)
            r13 = 0
            r16 = 0
            r12 = 0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.SRd r4 = new X.SRd
            r4.<init>()
            r4.A02 = r2
            r4.A00 = r7
            int r0 = r4.A01
            int r0 = r7 - r0
            java.lang.String r3 = "Id3Decoder"
            if (r0 >= r1) goto L_0x0074
            java.lang.String r0 = "Data too short to be an ID3 tag"
        L_0x0054:
            X.STH.A03(r3, r0)
            r0 = 0
        L_0x0058:
            r2 = 0
            if (r0 == 0) goto L_0x0119
            int r15 = r4.A01
            r0 = 2
            r1 = 10
            if (r12 != r0) goto L_0x0063
            r1 = 6
        L_0x0063:
            if (r16 == 0) goto L_0x00de
            byte[] r14 = r4.A02
            r11 = r15
        L_0x0068:
            int r10 = r11 + 1
            int r0 = r15 + r13
            if (r10 >= r0) goto L_0x00de
            int r13 = X.Pxh.A0E(r14, r11, r10, r15, r13)
            r11 = r10
            goto L_0x0068
        L_0x0074:
            int r1 = r4.A06()
            r15 = 0
            r0 = 1
            if (r1 == r10) goto L_0x008d
            java.lang.String r2 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r1)
            java.lang.String r0 = "%06X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r0 = X.002.A0R(r2, r0)
            goto L_0x0054
        L_0x008d:
            int r2 = r4.A05()
            int r10 = X.Pxf.A07(r4, r0)
            int r11 = r4.A04()
            r1 = 2
            r0 = 4
            if (r2 != r1) goto L_0x00a4
            r0 = r10 & 64
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto L_0x0054
        L_0x00a4:
            if (r2 != r14) goto L_0x00bf
            r0 = r10 & 64
            if (r0 == 0) goto L_0x00b4
            int r0 = r4.A01()
            r4.A0P(r0)
            int r0 = r0 + 4
            int r11 = r11 - r0
        L_0x00b4:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00b9
            r15 = 1
        L_0x00b9:
            r12 = r2
            r16 = r15
            r13 = r11
            r0 = 1
            goto L_0x0058
        L_0x00bf:
            if (r2 != r0) goto L_0x00d6
            r0 = r10 & 64
            if (r0 == 0) goto L_0x00cf
            int r1 = r4.A04()
            int r0 = r1 + -4
            r4.A0P(r0)
            int r11 = r11 - r1
        L_0x00cf:
            r0 = r10 & 16
            if (r0 == 0) goto L_0x00b9
            int r11 = r11 + -10
            goto L_0x00b9
        L_0x00d6:
            java.lang.String r0 = "Skipped ID3 tag with unsupported majorVersion="
            java.lang.String r0 = X.002.A0O(r0, r2)
            goto L_0x0054
        L_0x00de:
            int r15 = r15 + r13
            r4.A0N(r15)
            r11 = 0
            boolean r0 = X.QE2.A05(r4, r12, r1, r9)
            r10 = 1
            if (r0 != 0) goto L_0x00f4
            r0 = 4
            if (r12 != r0) goto L_0x0106
            boolean r0 = X.QE2.A05(r4, r0, r1, r10)
            if (r0 == 0) goto L_0x0106
            r11 = 1
        L_0x00f4:
            int r0 = X.Pxe.A06(r4)
            if (r0 < r1) goto L_0x0114
            X.TZa r0 = r6.A00
            androidx.media3.extractor.metadata.id3.Id3Frame r0 = X.QE2.A01(r4, r0, r12, r1, r11)
            if (r0 == 0) goto L_0x00f4
            r5.add(r0)
            goto L_0x00f4
        L_0x0106:
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            java.lang.String r0 = X.002.A0O(r0, r12)
            X.STH.A03(r3, r0)
            goto L_0x0119
        L_0x0110:
            r5.AAu(r3)
            goto L_0x0119
        L_0x0114:
            androidx.media3.common.Metadata r2 = new androidx.media3.common.Metadata
            r2.<init>((java.util.List) r5)
        L_0x0119:
            int r8 = r8 + r7
            goto L_0x0003
        L_0x011c:
            r5.EI7()
            r5.AAu(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S03.A00(X.TlA, X.TZa):androidx.media3.common.Metadata");
    }
}
