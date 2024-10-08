package X;

public final class XQL extends Y1C {
    public int A00;
    public boolean A01;
    public final 1aL A02;
    public final Object[] A03;
    public volatile boolean A04;

    public final int EHR(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.A01 = true;
        return 1;
    }

    public final void dispose() {
        this.A04 = true;
    }

    public final void clear() {
        this.A00 = this.A03.length;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1S(this.A00, this.A03.length);
    }

    public final Object poll() {
        int i = this.A00;
        Object[] objArr = this.A03;
        if (i == objArr.length) {
            return null;
        }
        this.A00 = i + 1;
        Object obj = objArr[i];
        1aP.A01(obj, "The array element is null");
        return obj;
    }

    public XQL(1aL r1, Object[] objArr) {
        this.A02 = r1;
        this.A03 = objArr;
    }
}
