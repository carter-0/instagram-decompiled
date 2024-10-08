package X;

public final class GSK {
    public int A00;
    public C285045Pl A01;
    public C285045Pl A02;
    public C267794cD A03;
    public boolean A04;
    public final /* synthetic */ AnonymousClass5RP A05;

    public GSK(C285045Pl r1, C285045Pl r2, C267794cD r3, AnonymousClass5RP r4, int i, boolean z) {
        this.A05 = r4;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r1;
        this.A01 = r2;
        this.A04 = z;
    }

    public final boolean A00(int i, int i2) {
        C285045Pl r0 = this.A02;
        int i3 = this.A00;
        Object obj = r0.A02[i3 + i];
        Object obj2 = this.A01.A02[i3 + i2];
        AnonymousClass5VV r02 = AnonymousClass5VU.A00;
        if (0qQ.A0K(obj, obj2) || obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }
}
