package X;

import java.nio.charset.Charset;

/* renamed from: X.Qx7  reason: case insensitive filesystem */
public class C8569Qx7 extends C8570Qx8 {
    public final byte[] A00;

    public int A05() {
        return this.A00.length;
    }

    public final boolean equals(Object obj) {
        int A05;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof TAQ) || (A05 = A05()) != ((TAQ) obj).A05()) {
            return false;
        }
        if (A05 == 0) {
            return true;
        }
        if (!(obj instanceof C8569Qx7)) {
            return obj.equals(this);
        }
        C8569Qx7 qx7 = (C8569Qx7) obj;
        int A04 = A04();
        int A042 = qx7.A04();
        if (A04 != 0 && A042 != 0 && A04 != A042) {
            return false;
        }
        if (A05 <= qx7.A05()) {
            byte[] bArr = this.A00;
            byte[] bArr2 = qx7.A00;
            int i2 = 0;
            while (i2 < A05) {
                if (bArr[i2] != bArr2[i]) {
                    return false;
                }
                i2++;
                i++;
            }
            return true;
        }
        throw Pxk.A0F(A05);
    }

    public byte A02(int i) {
        return this.A00[i];
    }

    public final byte A03(int i) {
        return this.A00[i];
    }

    public final int A06(int i, int i2, int i3) {
        return SS6.A01(this.A00, i, i3);
    }

    public final TAQ A07(int i, int i2) {
        int A002 = TAQ.A00(0, 47, A05());
        if (A002 == 0) {
            return TAQ.A01;
        }
        return new C8568Qx6(this.A00, A002);
    }

    public C8569Qx7(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }

    public final String A09(Charset charset) {
        return Pxe.A11(charset, this.A00, 0, A05());
    }

    public final void A0A(SA4 sa4) {
        ((C8567Qx5) sa4).A0Q(this.A00, A05());
    }

    public final boolean A0B() {
        return C11412SSk.A04(this.A00, 0, A05());
    }
}
