package X;

import java.io.CharConversionException;
import java.io.InputStream;
import java.io.Reader;

public final class RD6 extends Reader {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InputStream A04;
    public byte[] A05;
    public char A06 = 0;
    public char[] A07;
    public final 16B A08;
    public final boolean A09;
    public final boolean A0A;

    private void A00(int i) {
        int i2 = this.A01;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
        A1A.append(i);
        A1A.append(", needed ");
        A1A.append(4);
        A1A.append(", at char #");
        A1A.append(i2);
        A1A.append(", byte #");
        A1A.append(this.A00 + i);
        throw new CharConversionException(AnonymousClass7TF.A0l(")", A1A));
    }

    public final void close() {
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            this.A04 = null;
            byte[] bArr = this.A05;
            if (bArr != null) {
                this.A05 = null;
                16B r0 = this.A08;
                if (r0 != null) {
                    r0.A02(bArr);
                }
            }
            inputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0157 A[EDGE_INSN: B:82:0x0157->B:69:0x0157 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(char[] r13, int r14, int r15) {
        /*
            r12 = this;
            byte[] r11 = r12.A05
            r5 = -1
            if (r11 == 0) goto L_0x0176
            r7 = 1
            if (r15 >= r7) goto L_0x0009
            return r15
        L_0x0009:
            if (r14 < 0) goto L_0x0161
            int r6 = r14 + r15
            int r0 = r13.length
            if (r6 > r0) goto L_0x0161
            char r0 = r12.A06
            r10 = 0
            r8 = 4
            if (r0 == 0) goto L_0x00dc
            int r5 = r14 + 1
            r13[r14] = r0
            r12.A06 = r10
        L_0x001c:
            int r3 = r12.A02
            int r3 = r3 - r8
        L_0x001f:
            if (r5 >= r6) goto L_0x00cb
            int r2 = r12.A03
            if (r2 > r3) goto L_0x00cb
            boolean r1 = r12.A0A
            byte[] r7 = r12.A05
            byte r0 = r7[r2]
            if (r1 == 0) goto L_0x009e
            int r0 = r0 << 8
            int r1 = r2 + 1
            byte r1 = r7[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r1 = r2 + 2
            byte r1 = r7[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r8 = r1 << 8
            int r1 = r2 + 3
            byte r1 = r7[r1]
            r4 = r1 & 255(0xff, float:3.57E-43)
            r4 = r4 | r8
        L_0x0045:
            int r1 = r2 + 4
            r12.A03 = r1
            if (r0 == 0) goto L_0x00d4
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r1 = r2 + -1
            r0 = 16
            int r1 = r1 << r0
            r4 = r4 | r1
            if (r2 <= r0) goto L_0x00b4
            int r5 = r5 - r14
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = " (above 0x%08x)"
            java.lang.String r6 = java.lang.String.format(r0, r1)
            int r1 = r12.A00
            int r0 = r12.A03
            int r1 = r1 + r0
            int r3 = r1 + -1
            int r2 = r12.A01
            int r2 = r2 + r5
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Invalid UTF-32 character 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r4)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " at char #"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", byte #"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ")"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            java.io.CharConversionException r0 = new java.io.CharConversionException
            r0.<init>(r1)
            throw r0
        L_0x009e:
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r2 + 1
            int r4 = X.Pxf.A0D(r7, r0, r1)
            int r0 = r2 + 2
            byte r0 = r7[r0]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r2 + 3
            byte r0 = r7[r0]
            int r0 = r0 << 8
            r0 = r0 | r1
            goto L_0x0045
        L_0x00b4:
            int r2 = r5 + 1
            r1 = 55296(0xd800, float:7.7486E-41)
            int r0 = r4 >> 10
            int r0 = r0 + r1
            char r0 = (char) r0
            r13[r5] = r0
            r1 = 56320(0xdc00, float:7.8921E-41)
            r0 = r4 & 1023(0x3ff, float:1.434E-42)
            r1 = r1 | r0
            if (r2 < r6) goto L_0x00d2
            char r0 = (char) r4
            r12.A06 = r0
            r5 = r2
        L_0x00cb:
            int r5 = r5 - r14
            int r0 = r12.A01
            int r0 = r0 + r5
            r12.A01 = r0
            return r5
        L_0x00d2:
            r4 = r1
            r5 = r2
        L_0x00d4:
            int r1 = r5 + 1
            char r0 = (char) r4
            r13[r5] = r0
            r5 = r1
            goto L_0x001f
        L_0x00dc:
            int r9 = r12.A02
            int r4 = r12.A03
            int r3 = r9 - r4
            if (r3 >= r8) goto L_0x0157
            r0 = r3
            java.io.InputStream r2 = r12.A04
            if (r2 == 0) goto L_0x0148
            int r1 = r12.A00
            int r9 = r9 - r3
            int r1 = r1 + r9
            r12.A00 = r1
            if (r3 <= 0) goto L_0x012a
            if (r4 <= 0) goto L_0x00f8
            java.lang.System.arraycopy(r11, r4, r11, r10, r3)
            r12.A03 = r10
        L_0x00f8:
            r12.A02 = r0
            if (r0 >= r8) goto L_0x0157
            java.io.InputStream r3 = r12.A04
            byte[] r2 = r12.A05
            int r1 = r2.length
            int r1 = r1 - r0
            int r1 = r3.read(r2, r0, r1)
            if (r1 >= r7) goto L_0x0126
            if (r1 >= 0) goto L_0x015a
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x011c
            byte[] r1 = r12.A05
            if (r1 == 0) goto L_0x011c
            r0 = 0
            r12.A05 = r0
            X.16B r0 = r12.A08
            if (r0 == 0) goto L_0x011c
            r0.A02(r1)
        L_0x011c:
            int r0 = r12.A02
            r12.A00(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0126:
            int r0 = r12.A02
            int r0 = r0 + r1
            goto L_0x00f8
        L_0x012a:
            r12.A03 = r10
            int r0 = r2.read(r11)
            if (r0 >= r7) goto L_0x00f8
            r12.A02 = r10
            if (r0 >= 0) goto L_0x015a
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x0148
            byte[] r1 = r12.A05
            if (r1 == 0) goto L_0x0148
            r0 = 0
            r12.A05 = r0
            X.16B r0 = r12.A08
            if (r0 == 0) goto L_0x0148
            r0.A02(r1)
        L_0x0148:
            if (r3 == 0) goto L_0x0176
            int r1 = r12.A02
            int r0 = r12.A03
            int r1 = r1 - r0
            r12.A00(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0157:
            r5 = r14
            goto L_0x001c
        L_0x015a:
            java.lang.String r0 = "Strange I/O stream, returned 0 bytes on read"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0161:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            int r0 = r13.length
            java.lang.Object[] r1 = X.Pxf.A1Y(r2, r1, r0)
            java.lang.String r0 = "read(buf,%d,%d), cbuf[%d]"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxf.A0V(r0, r1)
            throw r0
        L_0x0176:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RD6.read(char[], int, int):int");
    }

    public RD6(16B r2, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this.A08 = r2;
        this.A04 = inputStream;
        this.A05 = bArr;
        this.A03 = i;
        this.A02 = i2;
        this.A0A = z;
        this.A09 = inputStream != null ? true : z2;
    }

    public final int read() {
        char[] cArr = this.A07;
        if (cArr == null) {
            cArr = new char[1];
            this.A07 = cArr;
        }
        if (read(cArr, 0, 1) < 1) {
            return -1;
        }
        return this.A07[0];
    }
}
