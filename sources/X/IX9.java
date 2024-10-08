package X;

public final class IX9 implements JPV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IX9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DoH(AnonymousClass1XT r3) {
        if (this.A00 == 0) {
            ((1P0) this.A02).onSuccess(r3);
        } else if (this.A01 == C243373Ym.NOT_SAVED) {
            C59689JTv.A07(((GCW) this.A02).A00, 2131975990);
        }
    }

    public final void onFail(C268654dm r2) {
        if (this.A00 == 0) {
            ((1P0) this.A02).onFail(r2);
        }
    }
}
