package X;

/* renamed from: X.PSa  reason: case insensitive filesystem */
public final class C72991PSa implements 1aV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C67058MhZ A02;
    public final /* synthetic */ C74395PuB A03;
    public final /* synthetic */ C254743sy A04;

    public C72991PSa(C67058MhZ mhZ, C74395PuB puB, C254743sy r3, int i, int i2) {
        this.A03 = puB;
        this.A04 = r3;
        this.A02 = mhZ;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C74395PuB puB = this.A03;
        C254743sy r3 = this.A04;
        puB.Cqi(this.A02, r3, Integer.valueOf(this.A00), "inbox", this.A01);
    }
}
