package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class XGE extends C294335mH implements Iterator, AnonymousClass0s4 {
    public int A00;
    public boolean A01;
    public Object A02;
    public final C286845Ya A03;

    public XGE(C286845Ya r2, C294305mE[] r3) {
        super(r2.A01, r3);
        this.A03 = r2;
        this.A00 = r2.A00;
    }

    public static final void A00(XGE xge, C285005Ph r6, Object obj, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            C294305mE[] r4 = xge.A02;
            C294305mE r3 = r4[i2];
            Object[] objArr = r6.A02;
            int length = objArr.length;
            int i4 = 0;
            r3.A02 = objArr;
            r3.A00 = length;
            while (true) {
                r3.A01 = i4;
                if (0qQ.A0K(r3.A02[i4], obj)) {
                    break;
                }
                r3 = r4[i2];
                i4 = r3.A01 + 2;
            }
        } else {
            int i5 = 1 << ((i >> i3) & 31);
            int i6 = r6.A00;
            if ((i5 & i6) != 0) {
                int A0A = r6.A0A(i5);
                C294305mE r2 = xge.A02[i2];
                r2.A02 = r6.A02;
                r2.A00 = Integer.bitCount(i6) * 2;
                r2.A01 = A0A;
            } else {
                int A0B = r6.A0B(i5);
                C285005Ph A0D = r6.A0D(A0B);
                C294305mE r22 = xge.A02[i2];
                r22.A02 = r6.A02;
                r22.A00 = Integer.bitCount(r6.A00) * 2;
                r22.A01 = A0B;
                A00(xge, A0D, obj, i, i2 + 1);
                return;
            }
        }
        xge.A00 = i2;
    }

    public final Object next() {
        if (this.A03.A00 == this.A00) {
            this.A02 = A02();
            this.A01 = true;
            return super.next();
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        C286845Ya r2;
        if (this.A01) {
            if (hasNext()) {
                Object A022 = A02();
                r2 = this.A03;
                C66580MXl.A1S(r2, this.A02);
                A00(this, r2.A01, A022, C51971G9r.A0E(A022), 0);
            } else {
                r2 = this.A03;
                C66580MXl.A1S(r2, this.A02);
            }
            this.A02 = null;
            this.A01 = false;
            this.A00 = r2.A00;
            return;
        }
        throw Pxe.A0i();
    }
}
