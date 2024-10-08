package X;

/* renamed from: X.4n0  reason: invalid class name and case insensitive filesystem */
public final class C273674n0 extends AnonymousClass2rW {
    public Integer A00;
    public boolean A01;
    public final AnonymousClass32Q A02;
    public final C324266yu A03;

    public final int A02() {
        int i;
        double ceil;
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            int size = this.A01.size();
            if (this.A01) {
                i = this.A01.size() % 3;
            } else {
                i = 0;
            }
            return size - i;
        } else if (intValue != 1) {
            return this.A01.size();
        } else {
            boolean z = this.A01;
            double size2 = ((double) this.A01.size()) / 3.0d;
            if (z) {
                ceil = Math.floor(size2);
            } else {
                ceil = Math.ceil(size2);
            }
            return (int) ceil;
        }
    }

    public final /* bridge */ /* synthetic */ String A03(Object obj) {
        1Xj r2 = (1Xj) obj;
        0qQ.A0B(r2, 0);
        return r2.BpP();
    }

    public final C3251571g A0E(int i) {
        return new C3251571g(this.A01, i * 3, 3);
    }

    public C273674n0(C324266yu r1, AnonymousClass32Q r2, Integer num) {
        this.A00 = num;
        this.A03 = r1;
        this.A02 = r2;
    }
}
