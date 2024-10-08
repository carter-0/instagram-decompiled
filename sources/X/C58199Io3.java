package X;

/* renamed from: X.Io3  reason: case insensitive filesystem */
public final class C58199Io3 extends 0Yg implements C62320sa {
    public final /* synthetic */ 1Av A00;
    public final /* synthetic */ 0sP A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58199Io3(1Av r2, 0sP r3, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0xa r1;
        String str;
        if (this.A04) {
            if (!this.A03 || !this.A02) {
                r1 = this.A00.A01;
                str = "comment_cover_nux_count";
            } else {
                r1 = this.A00.A01;
                str = "comment_cover_updated_nux_count";
            }
            AnonymousClass7TG.A0g(r1, str).apply();
        }
        C51968G9o.A1O(this.A01, false);
        return C60340gF.A00;
    }
}
