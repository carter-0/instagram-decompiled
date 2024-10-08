package X;

/* renamed from: X.IFn  reason: case insensitive filesystem */
public final class C56866IFn implements C270284gU {
    public 0sP A00;
    public 0sP A01;
    public final C56868IFp A02;
    public final /* synthetic */ C55959HqQ A03;

    public C56866IFn(C55959HqQ hqQ, C56868IFp iFp, 0sP r3, 0sP r4) {
        this.A03 = hqQ;
        this.A02 = iFp;
        this.A01 = r3;
        this.A00 = r4;
    }

    public final void A00(JQ8 jq8) {
        Object invoke = this.A00.invoke(jq8.C4Q());
        if (C51971G9r.A1W(this.A03.A03.A05)) {
            this.A02.A03((AnonymousClass5b8) this.A01.invoke(jq8), this.A00.invoke(jq8.BH7()), invoke);
            return;
        }
        this.A02.A02((AnonymousClass5b8) this.A01.invoke(jq8), invoke);
    }

    public final Object getValue() {
        A00(this.A03.A03.A03());
        return this.A02.A09.getValue();
    }
}
