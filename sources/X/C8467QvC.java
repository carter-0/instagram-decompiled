package X;

/* renamed from: X.QvC  reason: case insensitive filesystem */
public class C8467QvC extends C8468QvD {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        int A02;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TAO) || (A02 = A02()) != ((TAO) obj).A02()) {
            return false;
        }
        if (A02 == 0) {
            return true;
        }
        if (!(obj instanceof C8467QvC)) {
            return obj.equals(this);
        }
        C8467QvC qvC = (C8467QvC) obj;
        int i3 = this.A00;
        int i4 = qvC.A00;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        if (A02 <= qvC.A02()) {
            byte[] bArr = this.A00;
            byte[] bArr2 = qvC.A00;
            if (this instanceof C8466QvB) {
                i = ((C8466QvB) this).A00;
            } else {
                i = 0;
            }
            int i5 = i + A02;
            if (qvC instanceof C8466QvB) {
                i2 = ((C8466QvB) qvC).A00;
            } else {
                i2 = 0;
            }
            while (i < i5) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
        throw Pxk.A0F(A02);
    }

    public C8467QvC(byte[] bArr) {
        this.A00 = bArr;
    }
}
