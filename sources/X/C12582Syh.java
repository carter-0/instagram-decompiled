package X;

/* renamed from: X.Syh  reason: case insensitive filesystem */
public final class C12582Syh implements C13786Th1 {
    public final int A00;
    public final C13957TmK A01;
    public final String A02;
    public final Object[] A03;

    public final String A00() {
        return this.A02;
    }

    public final Object[] A01() {
        return this.A03;
    }

    public final C13957TmK FOy() {
        return this.A01;
    }

    public final int FPN() {
        int i = this.A00;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final boolean FPL() {
        return AnonymousClass7TF.A1S(this.A00 & 2, 2);
    }

    public C12582Syh(C13957TmK tmK, String str, Object[] objArr) {
        char charAt;
        this.A01 = tmK;
        this.A02 = str;
        this.A03 = objArr;
        char A002 = Pxe.A00(str);
        if (A002 >= 55296) {
            int i = A002 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = Pxe.A04(charAt, i3, i);
                i3 += 13;
                i2 = i4;
            }
            A002 = i | (charAt << i3);
        }
        this.A00 = A002;
    }
}
