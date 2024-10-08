package X;

public final class S6B {
    public S6B A00;
    public final C264654Qt A01;
    public final /* synthetic */ TS7 A02;

    public final int A01(Object obj, int i) {
        while (i > 2) {
            int i2 = (((i - 1) / 2) - 1) / 2;
            TS7 ts7 = this.A02;
            Object A002 = TS7.A00(ts7, i2);
            if (this.A01.compare(A002, obj) <= 0) {
                break;
            }
            ts7.A02[i] = A002;
            i = i2;
        }
        this.A02.A02[i] = obj;
        return i;
    }

    public S6B(TS7 ts7, C264654Qt r2) {
        this.A02 = ts7;
        this.A01 = r2;
    }

    public final int A00(int i, int i2) {
        C264654Qt r2 = this.A01;
        TS7 ts7 = this.A02;
        return r2.compare(TS7.A00(ts7, i), TS7.A00(ts7, i2));
    }

    public final int A02(Object obj, int i) {
        int i2;
        Object[] objArr;
        int i3;
        if (i == 0) {
            objArr = this.A02.A02;
            i2 = 0;
        } else {
            i2 = (i - 1) / 2;
            TS7 ts7 = this.A02;
            Object A002 = TS7.A00(ts7, i2);
            if (!(i2 == 0 || (i3 = (((i2 - 1) / 2) * 2) + 2) == i2 || (i3 * 2) + 1 < ts7.A01)) {
                Object A003 = TS7.A00(ts7, i3);
                if (this.A01.compare(A003, A002) < 0) {
                    i2 = i3;
                    A002 = A003;
                }
            }
            int compare = this.A01.compare(A002, obj);
            objArr = ts7.A02;
            if (compare < 0) {
                objArr[i] = A002;
            } else {
                objArr[i] = obj;
                return i;
            }
        }
        objArr[i2] = obj;
        return i2;
    }
}
