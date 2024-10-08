package X;

import java.util.Arrays;

/* renamed from: X.S4c  reason: case insensitive filesystem */
public final class C10990S4c {
    public int A00 = 0;
    public S23 A01;
    public Object[] A02 = new Object[8];

    public final C13140TMy A00() {
        S23 s23 = this.A01;
        if (s23 == null) {
            C13140TMy A002 = C13140TMy.A00(this, this.A02, this.A00);
            s23 = this.A01;
            if (s23 == null) {
                return A002;
            }
        }
        throw s23.A00();
    }

    public final void A01(Object obj, Object obj2) {
        int i = this.A00 + 1;
        Object[] objArr = this.A02;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.A02 = Arrays.copyOf(objArr, Pxk.A00(length, i2));
        }
        C9720Rfd.A00(obj, obj2);
        Object[] objArr2 = this.A02;
        int i3 = this.A00;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.A00 = i3 + 1;
    }
}
