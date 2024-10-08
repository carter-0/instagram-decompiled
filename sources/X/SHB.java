package X;

import java.util.ArrayList;
import java.util.Arrays;

public final class SHB {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public static SHB A00(byte[] bArr, int i) {
        short s;
        int i2;
        int length = bArr.length;
        if (length >= 1) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int i3 = i;
            while (true) {
                byte b = bArr[i3];
                s = 0;
                if (b == 0) {
                    i2 = i3 + 1;
                    break;
                }
                byte b2 = b & 192;
                byte b3 = b & 63;
                if (b2 != 0) {
                    s = (short) (((((byte) b3) << 8) & 65280) | (bArr[i3 + 1] & 255));
                    i2 = i3 + 2;
                    break;
                }
                byte b4 = (byte) b3;
                int i4 = i3 + 1;
                i3 = i4 + b4;
                if (length >= i3 + 1) {
                    A1A.setLength(0);
                    while (s < b4) {
                        A1A.append((char) bArr[i4 + s]);
                        s = (byte) (s + 1);
                    }
                    DbU.A1X(A1A, A1C);
                } else {
                    throw AnonymousClass7TE.A0w("bytes is incomplete");
                }
            }
            return new SHB(Pxf.A1a(A1C, A1C.size()), i2 - i, s);
        }
        throw AnonymousClass7TE.A0w("insufficient data");
    }

    public SHB(String[] strArr, int i, short s) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DnsQname{qname=");
        A1A.append(Arrays.toString(this.A02));
        A1A.append(", pointer=");
        A1A.append(this.A01);
        A1A.append(", numberOfBytes=");
        A1A.append(this.A00);
        return Pxg.A0x(A1A);
    }
}
