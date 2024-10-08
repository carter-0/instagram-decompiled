package X;

/* renamed from: X.QuH  reason: case insensitive filesystem */
public class C8426QuH extends C8427QuI {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        int A01;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof TAN) || (A01 = A01()) != ((TAN) obj).A01()) {
            return false;
        }
        if (A01 == 0) {
            return true;
        }
        if (!(obj instanceof C8426QuH)) {
            return obj.equals(this);
        }
        C8426QuH quH = (C8426QuH) obj;
        int i2 = this.A00;
        int i3 = quH.A00;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        if (A01 <= quH.A01()) {
            byte[] bArr = this.A00;
            byte[] bArr2 = quH.A00;
            int i4 = 0;
            while (i4 < A01) {
                if (bArr[i4] != bArr2[i]) {
                    return false;
                }
                i4++;
                i++;
            }
            return true;
        }
        throw Pxk.A0F(A01);
    }

    public C8426QuH(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
