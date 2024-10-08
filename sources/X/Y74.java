package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Y74 extends C22437Y3t implements Iterator, AnonymousClass0s4 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final C21084XDx A03;

    public Y74(C21084XDx xDx, C22430Y3m[] y3mArr) {
        super(xDx.A04, y3mArr);
        this.A03 = xDx;
        this.A00 = xDx.A00;
    }

    public static final void A00(Object obj, Y74 y74, AnonymousClass6G9 r7, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            C22430Y3m[] y3mArr = y74.A02;
            C22430Y3m y3m = y3mArr[i2];
            Object[] objArr = r7.A02;
            int length = objArr.length;
            int i4 = 0;
            y3m.A02 = objArr;
            y3m.A00 = length;
            while (true) {
                y3m.A01 = i4;
                if (0qQ.A0K(y3m.A02[i4], obj)) {
                    break;
                }
                y3m = y3mArr[i2];
                i4 = y3m.A01 + 2;
            }
        } else {
            int i5 = 1 << ((i >> i3) & 31);
            int i6 = r7.A00;
            if ((i5 & i6) != 0) {
                int bitCount = Integer.bitCount((i5 - 1) & i6) * 2;
                C22430Y3m y3m2 = y74.A02[i2];
                y3m2.A02 = r7.A02;
                y3m2.A00 = Integer.bitCount(i6) * 2;
                y3m2.A01 = bitCount;
            } else {
                int A08 = r7.A08(i5);
                AnonymousClass6G9 A0A = r7.A0A(A08);
                C22430Y3m y3m3 = y74.A02[i2];
                y3m3.A02 = r7.A02;
                y3m3.A00 = Integer.bitCount(r7.A00) * 2;
                y3m3.A01 = A08;
                A00(obj, y74, A0A, i, i2 + 1);
                return;
            }
        }
        y74.A00 = i2;
    }

    public final Object next() {
        if (this.A03.A00 == this.A00) {
            this.A01 = A02();
            this.A02 = true;
            return super.next();
        }
        throw new ConcurrentModificationException();
    }
}
