package X;

/* renamed from: X.Sxy  reason: case insensitive filesystem */
public final class C12573Sxy implements C13474Tb1 {
    public final int A00;
    public final C13475Tb2 A01;
    public final Object[] A02;

    public C12573Sxy(C13475Tb2 tb2, Object[] objArr) {
        char charAt;
        this.A01 = tb2;
        this.A02 = objArr;
        char A002 = Pxe.A00("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a");
        if (A002 >= 55296) {
            int i = A002 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = Pxe.A04(charAt, i3, i);
                i3 += 13;
                i2 = i4;
            }
            A002 = (charAt << i3) | i;
        }
        this.A00 = A002;
    }
}
