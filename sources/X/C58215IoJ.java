package X;

/* renamed from: X.IoJ  reason: case insensitive filesystem */
public final class C58215IoJ extends 0Yg implements C62320sa {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58215IoJ(C284945Oz r2, String str, C62320sa r4, 0sP r5, boolean z, boolean z2) {
        super(0);
        this.A05 = z;
        this.A02 = r4;
        this.A04 = z2;
        this.A03 = r5;
        this.A01 = str;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A05) {
            C284945Oz r1 = this.A00;
            C51967G9n.A16(r1, !C51971G9r.A1W(r1));
            this.A02.invoke();
        } else if (this.A04) {
            this.A03.invoke(this.A01);
        }
        return C60340gF.A00;
    }
}
