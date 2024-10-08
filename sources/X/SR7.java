package X;

public final class SR7 {
    public static final Object A04 = Pxe.A0p();
    public static final Object A05 = Pxe.A0p();
    public static final Object A06 = Pxe.A0p();
    public static final Object A07 = Pxe.A0p();
    public static final Object A08 = Pxe.A0p();
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;

    public final void A01(2d3 r5, int i) {
        Integer num;
        Integer[] numArr;
        char c;
        Integer num2;
        int i2 = 2;
        boolean z = this.A03;
        if (i == 0) {
            if (z) {
                r5.A14[0] = AnonymousClass05K.A0C;
                Object obj = this.A02;
                if (obj == A08) {
                    i2 = 1;
                } else if (obj != A06) {
                    i2 = 0;
                }
                r5.A0E(1.0f, i2, this.A00, Integer.MAX_VALUE);
                return;
            }
            int i3 = this.A00;
            if (i3 > 0) {
                r5.A0N = i3;
            }
            Object obj2 = this.A02;
            if (obj2 == A08) {
                num = AnonymousClass05K.A01;
            } else if (obj2 == A05) {
                num = AnonymousClass05K.A0N;
            } else if (obj2 == null) {
                r5.A14[0] = AnonymousClass05K.A00;
                r5.A0I(this.A01);
                return;
            } else {
                return;
            }
            numArr = r5.A14;
            c = 0;
        } else if (z) {
            r5.A14[1] = AnonymousClass05K.A0C;
            Object obj3 = this.A02;
            if (obj3 == A08) {
                i2 = 1;
            } else if (obj3 != A06) {
                i2 = 0;
            }
            r5.A0F(1.0f, i2, this.A00, Integer.MAX_VALUE);
            return;
        } else {
            int i4 = this.A00;
            if (i4 > 0) {
                r5.A0M = i4;
            }
            Object obj4 = this.A02;
            if (obj4 == A08) {
                num2 = AnonymousClass05K.A01;
            } else if (obj4 == A05) {
                num2 = AnonymousClass05K.A0N;
            } else if (obj4 == null) {
                r5.A14[1] = AnonymousClass05K.A00;
                r5.A0H(this.A01);
                return;
            } else {
                return;
            }
            numArr = r5.A14;
            c = 1;
        }
        numArr[c] = num;
    }

    public static SR7 A00(Object obj) {
        SR7 sr7 = new SR7(A04);
        sr7.A02 = obj;
        if (obj instanceof Integer) {
            sr7.A01 = AnonymousClass7TE.A0M(obj);
            sr7.A02 = null;
        }
        return sr7;
    }

    public SR7(Object obj) {
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A02 = obj;
    }

    public SR7() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = A08;
        this.A03 = false;
    }
}
