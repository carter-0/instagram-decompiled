package X;

public final class UK5 extends 2dt implements X2P {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r1.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r1.A01 = r0;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r6[r15] = r18[r17];
        r3 = r3 + 1;
        r15 = r15 + 1;
        r17 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r3 >= 2) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013e, code lost:
        r4 = r4 + 1;
        r5[r4] = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        r15 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01df, code lost:
        r15 = r3;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e1, code lost:
        r6[r15] = r18[r17];
        r3 = r3 + 1;
        r15 = r15 + 1;
        r17 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ee, code lost:
        if (r3 >= 2) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f1, code lost:
        r4 = r4 + 1;
        r5[r4] = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ANd(java.nio.ByteBuffer r20, int r21) {
        /*
            r19 = this;
            r12 = 0
            r1 = r20
            r0 = r21
            byte[] r11 = X.C18807W3e.A07(r1, r0, r12)
            if (r11 == 0) goto L_0x0200
            r10 = 1
            float[] r18 = X.C18807W3e.A08(r1, r0, r10)
            if (r18 == 0) goto L_0x01f8
            r2 = 0
            r3 = 0
        L_0x0014:
            int r9 = r11.length
            r8 = 4
            r7 = 2
            r1 = r19
            if (r2 >= r9) goto L_0x0047
            byte r0 = r11[r2]
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0023;
                case 2: goto L_0x0028;
                case 3: goto L_0x002d;
                case 4: goto L_0x0023;
                case 5: goto L_0x0023;
                case 6: goto L_0x0034;
                case 7: goto L_0x0028;
                case 8: goto L_0x0039;
                case 9: goto L_0x0039;
                case 10: goto L_0x002d;
                case 11: goto L_0x003e;
                case 12: goto L_0x003e;
                default: goto L_0x0020;
            }
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0023:
            int r0 = r1.A01
            int r0 = r0 + 2
            goto L_0x0031
        L_0x0028:
            int r0 = r1.A01
            int r0 = r0 + 4
            goto L_0x0031
        L_0x002d:
            int r0 = r1.A01
            int r0 = r0 + 6
        L_0x0031:
            r1.A01 = r0
            goto L_0x0020
        L_0x0034:
            int r0 = r1.A01
            int r0 = r0 + 2
            goto L_0x0042
        L_0x0039:
            int r0 = r1.A01
            int r0 = r0 + 4
            goto L_0x0042
        L_0x003e:
            int r0 = r1.A01
            int r0 = r0 + 6
        L_0x0042:
            r1.A01 = r0
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0047:
            int r0 = r1.A01
            float[] r6 = new float[r0]
            r1.A03 = r6
            int r9 = r9 + r3
            r1.A00 = r9
            byte[] r5 = new byte[r9]
            r1.A02 = r5
            r4 = 0
            r15 = 0
            r17 = 0
        L_0x0058:
            if (r4 >= r9) goto L_0x01f7
            byte r1 = r11[r4]
            r16 = 1073741824(0x40000000, float:2.0)
            r0 = 3
            switch(r1) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0068;
                case 2: goto L_0x007b;
                case 3: goto L_0x008e;
                case 4: goto L_0x00a2;
                case 5: goto L_0x00bb;
                case 6: goto L_0x0130;
                case 7: goto L_0x00d4;
                case 8: goto L_0x01d1;
                case 9: goto L_0x0104;
                case 10: goto L_0x0145;
                case 11: goto L_0x0186;
                case 12: goto L_0x01a5;
                default: goto L_0x0062;
            }
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x0065:
            r5[r4] = r12
            goto L_0x006a
        L_0x0068:
            r5[r4] = r10
        L_0x006a:
            r3 = 0
        L_0x006b:
            int r2 = r15 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r15] = r0
            int r3 = r3 + 1
            r15 = r2
            r17 = r1
            if (r3 >= r7) goto L_0x0062
            goto L_0x006b
        L_0x007b:
            r5[r4] = r7
            r3 = 0
        L_0x007e:
            int r2 = r15 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r15] = r0
            int r3 = r3 + 1
            r15 = r2
            r17 = r1
            if (r3 >= r8) goto L_0x0062
            goto L_0x007e
        L_0x008e:
            r5[r4] = r0
            r13 = 0
            r3 = 6
        L_0x0092:
            int r2 = r15 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r15] = r0
            int r13 = r13 + 1
            r15 = r2
            r17 = r1
            if (r13 >= r3) goto L_0x0062
            goto L_0x0092
        L_0x00a2:
            r5[r4] = r10
            int r2 = r15 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r15] = r0
            int r0 = A00(r5, r4)
            int r0 = r2 - r0
            int r15 = r2 + 1
            r0 = r6[r0]
            r6[r2] = r0
            r17 = r1
            goto L_0x0062
        L_0x00bb:
            r5[r4] = r10
            int r0 = A00(r5, r4)
            int r0 = r15 - r0
            int r2 = r15 + 1
            r0 = r6[r0]
            r6[r15] = r0
            int r15 = r2 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r2] = r0
            r17 = r1
            goto L_0x0062
        L_0x00d4:
            r5[r4] = r7
            int r0 = A00(r5, r4)
            int r13 = r15 - r0
            r3 = r15
            r2 = 0
        L_0x00de:
            int r14 = r3 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r3] = r0
            int r2 = r2 + 1
            r3 = r14
            r17 = r1
            if (r2 < r7) goto L_0x00de
            r2 = 0
        L_0x00ee:
            int r14 = r14 + 1
            int r0 = r13 + r2
            r1 = r6[r0]
            float r1 = r1 * r16
            int r0 = r15 + -2
            int r0 = r0 + r2
            r0 = r6[r0]
            float r1 = r1 - r0
            r6[r3] = r1
            int r2 = r2 + 1
            r3 = r14
            if (r2 >= r7) goto L_0x0142
            goto L_0x00ee
        L_0x0104:
            r5[r4] = r7
            int r0 = A00(r5, r4)
            int r13 = r15 - r0
            r3 = r15
            r1 = 0
        L_0x010e:
            int r14 = r3 + 1
            r0 = r6[r1]
            r6[r3] = r0
            int r1 = r1 + 1
            r3 = r14
            if (r1 < r7) goto L_0x010e
            r2 = 0
        L_0x011a:
            int r14 = r14 + 1
            int r0 = r13 + r2
            r1 = r6[r0]
            float r1 = r1 * r16
            int r0 = r15 + -2
            int r0 = r0 + r2
            r0 = r6[r0]
            float r1 = r1 - r0
            r6[r3] = r1
            int r2 = r2 + 1
            r3 = r14
            if (r2 >= r7) goto L_0x013e
            goto L_0x011a
        L_0x0130:
            r5[r4] = r10
            int r1 = r15 + 1
            r0 = r6[r12]
            r6[r15] = r0
            int r14 = r1 + 1
            r0 = r6[r10]
            r6[r1] = r0
        L_0x013e:
            int r4 = r4 + 1
            r5[r4] = r8
        L_0x0142:
            r15 = r14
            goto L_0x0062
        L_0x0145:
            r5[r4] = r0
            int r0 = A00(r5, r4)
            int r14 = r15 - r0
            r13 = r15
            r2 = 0
        L_0x014f:
            int r3 = r13 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r13] = r0
            int r2 = r2 + 1
            r13 = r3
            r17 = r1
            if (r2 < r7) goto L_0x014f
            r2 = 0
        L_0x015f:
            int r3 = r3 + 1
            int r0 = r14 + r2
            r1 = r6[r0]
            float r1 = r1 * r16
            int r0 = r15 + -2
            int r0 = r0 + r2
            r0 = r6[r0]
            float r1 = r1 - r0
            r6[r13] = r1
            int r2 = r2 + 1
            r13 = r3
            if (r2 < r7) goto L_0x015f
            r15 = r3
            r2 = 0
        L_0x0176:
            int r13 = r13 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r15] = r0
            int r2 = r2 + 1
            r15 = r13
            r17 = r1
            if (r2 >= r7) goto L_0x0062
            goto L_0x0176
        L_0x0186:
            r5[r4] = r0
            int r1 = r15 + 1
            r0 = r6[r12]
            r6[r15] = r0
            int r15 = r1 + 1
            r0 = r6[r10]
            r6[r1] = r0
            r3 = 0
        L_0x0195:
            int r2 = r15 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r15] = r0
            int r3 = r3 + 1
            r15 = r2
            r17 = r1
            if (r3 >= r8) goto L_0x01f1
            goto L_0x0195
        L_0x01a5:
            r5[r4] = r0
            int r0 = A00(r5, r4)
            int r14 = r15 - r0
            r13 = r15
            r1 = 0
        L_0x01af:
            int r3 = r13 + 1
            r0 = r6[r1]
            r6[r13] = r0
            int r1 = r1 + 1
            r13 = r3
            if (r1 < r7) goto L_0x01af
            r2 = 0
        L_0x01bb:
            int r3 = r3 + 1
            int r0 = r14 + r2
            r1 = r6[r0]
            float r1 = r1 * r16
            int r0 = r15 + -2
            int r0 = r0 + r2
            r0 = r6[r0]
            float r1 = r1 - r0
            r6[r13] = r1
            int r2 = r2 + 1
            r13 = r3
            if (r2 >= r7) goto L_0x01df
            goto L_0x01bb
        L_0x01d1:
            r5[r4] = r7
            int r1 = r15 + 1
            r0 = r6[r12]
            r6[r15] = r0
            int r3 = r1 + 1
            r0 = r6[r10]
            r6[r1] = r0
        L_0x01df:
            r15 = r3
            r3 = 0
        L_0x01e1:
            int r2 = r15 + 1
            int r1 = r17 + 1
            r0 = r18[r17]
            r6[r15] = r0
            int r3 = r3 + 1
            r15 = r2
            r17 = r1
            if (r3 >= r7) goto L_0x01f1
            goto L_0x01e1
        L_0x01f1:
            int r4 = r4 + 1
            r5[r4] = r8
            goto L_0x0062
        L_0x01f7:
            return
        L_0x01f8:
            java.lang.String r1 = "points cannot be null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0200:
            java.lang.String r1 = "commands cannot be null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UK5.ANd(java.nio.ByteBuffer, int):void");
    }

    public static int A00(byte[] bArr, int i) {
        byte b = bArr[i - 1];
        if (b == 4) {
            int i2 = i - 2;
            if (i2 >= 0) {
                b = bArr[i2];
            }
            return 2;
        }
        if (b == 2) {
            return 4;
        }
        if (b == 3) {
            return 6;
        }
        return 2;
    }
}
