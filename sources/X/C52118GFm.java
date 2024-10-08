package X;

/* renamed from: X.GFm  reason: case insensitive filesystem */
public final class C52118GFm implements AnonymousClass2xU {
    public final /* synthetic */ 2Wa A00;
    public final /* synthetic */ 2Wa A01;
    public final /* synthetic */ GFJ A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C52118GFm(2Wa r1, 2Wa r2, GFJ gfj, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A00 = r1;
        this.A05 = z2;
        this.A02 = gfj;
        this.A03 = z3;
        this.A01 = r2;
    }

    public final void DQp(AnonymousClass3W1 r6, int i) {
        0qQ.A0B(r6, 0);
        if (i == 29 && this.A04) {
            Integer num = r6.A10;
            Integer num2 = AnonymousClass05K.A00;
            2Wa r1 = this.A00;
            if (num == num2) {
                r1.A01(false);
                if (this.A05) {
                    this.A02.A0H.Etr(true);
                }
                if (this.A03) {
                    this.A02.A0H.ARk(true);
                    return;
                }
                return;
            }
            r1.A00();
            this.A01.A01(false);
            if (this.A05) {
                this.A02.A0H.Etr(false);
            }
        }
    }
}
