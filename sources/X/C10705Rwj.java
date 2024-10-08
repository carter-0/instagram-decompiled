package X;

/* renamed from: X.Rwj  reason: case insensitive filesystem */
public final class C10705Rwj {
    public final int A00;
    public final T5R A01;
    public final String A02;
    public final Object[] A03;

    public C10705Rwj(T5R t5r, String str, Object[] objArr) {
        char charAt;
        this.A01 = t5r;
        this.A02 = str;
        this.A03 = objArr;
        char A002 = Pxe.A00(str);
        if (A002 >= 55296) {
            int i = A002 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = str.charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                i = Pxe.A04(charAt, i2, i);
                i2 += 13;
                i3 = i4;
            }
            A002 = i | (charAt << i2);
        }
        this.A00 = A002;
    }
}
