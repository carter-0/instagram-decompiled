package X;

/* renamed from: X.Qhb  reason: case insensitive filesystem */
public final class C8142Qhb extends 16K {
    public String A00;
    public Object A01;
    public final C12837T9j A02;
    public final 16K A03;

    public final 16K A00() {
        return this.A03;
    }

    public final Object A01() {
        return this.A01;
    }

    public final String A03() {
        return this.A00;
    }

    public final void A04(Object obj) {
        this.A01 = obj;
    }

    public C8142Qhb(16K r9, 167 r10) {
        C12837T9j t9j;
        this.A01 = r9.A01;
        this.A00 = r9.A00;
        this.A03 = r9.A00();
        this.A00 = r9.A03();
        this.A01 = r9.A01();
        if (r9 instanceof 16J) {
            16J r92 = (16J) r9;
            t9j = new C12837T9j(r10, r92.A01, r92.A00, -1, -1);
        } else {
            t9j = C12837T9j.A06;
        }
        this.A02 = t9j;
    }

    public C8142Qhb(C12837T9j t9j, 16K r3) {
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A03 = r3.A00();
        this.A00 = r3.A03();
        this.A01 = r3.A01();
        this.A02 = t9j;
    }

    public C8142Qhb(C8142Qhb qhb, int i) {
        this.A01 = i;
        this.A00 = -1;
        this.A03 = qhb;
        this.A02 = qhb.A02;
    }

    public C8142Qhb() {
        this.A01 = 0;
        this.A00 = -1;
        this.A03 = null;
        this.A02 = C12837T9j.A06;
    }
}
