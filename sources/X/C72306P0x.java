package X;

/* renamed from: X.P0x  reason: case insensitive filesystem */
public final class C72306P0x implements C74445Pv0 {
    public final /* synthetic */ C72203OyT A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ 0sP A02;

    public C72306P0x(C72203OyT oyT, Integer num, 0sP r3) {
        this.A00 = oyT;
        this.A01 = num;
        this.A02 = r3;
    }

    public final void DUT() {
        this.A02.invoke(C68716NUc.A00);
    }

    public final void onFailure() {
        this.A02.invoke(new C68715NUb("Creating Blockstore failed"));
    }

    public final void onSuccess() {
        this.A00.A05(this.A01);
        this.A02.invoke(C68717NUd.A00);
    }
}
