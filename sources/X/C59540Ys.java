package X;

/* renamed from: X.0Ys  reason: invalid class name and case insensitive filesystem */
public final class C59540Ys extends 0sy {
    public int A00;
    public int A01;
    public final /* synthetic */ 096 A02;

    public C59540Ys(096 r2) {
        this.A02 = r2;
        this.A00 = r2.size();
        this.A01 = r2.A01;
    }

    public final void A00() {
        int i = this.A00;
        if (i == 0) {
            this.A00 = 2;
            return;
        }
        096 r2 = this.A02;
        Object[] objArr = r2.A03;
        int i2 = this.A01;
        this.A01 = objArr[i2];
        this.A00 = 1;
        this.A01 = (i2 + 1) % r2.A02;
        this.A00 = i - 1;
    }
}
