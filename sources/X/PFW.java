package X;

public final class PFW implements C66515MUt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C74551Pwk A01;
    public final /* synthetic */ OZE A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0rk A05;

    public PFW(C74551Pwk pwk, OZE oze, String str, C62320sa r4, 0rk r5, int i) {
        this.A01 = pwk;
        this.A00 = i;
        this.A04 = r4;
        this.A02 = oze;
        this.A03 = str;
        this.A05 = r5;
    }

    public final void DED() {
        0rk r3 = this.A05;
        int i = this.A00;
        C62320sa r1 = this.A04;
        int i2 = r3.A00 + 1;
        r3.A00 = i2;
        if (i2 >= i) {
            r1.invoke();
        }
    }

    public final void DKR() {
        0rk r3 = this.A05;
        int i = this.A00;
        C62320sa r1 = this.A04;
        int i2 = r3.A00 + 1;
        r3.A00 = i2;
        if (i2 >= i) {
            r1.invoke();
        }
    }

    public final void Dol(boolean z) {
        if (z) {
            this.A01.DTM(C270214gN.A0N, (String) null);
        } else {
            0rk r3 = this.A05;
            int i = this.A00;
            C62320sa r1 = this.A04;
            int i2 = r3.A00 + 1;
            r3.A00 = i2;
            if (i2 >= i) {
                r1.invoke();
            }
        }
        OZE.A01(this.A02, this.A03);
    }
}
