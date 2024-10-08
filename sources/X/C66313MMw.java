package X;

/* renamed from: X.MMw  reason: case insensitive filesystem */
public final class C66313MMw extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66313MMw(int i, int i2, String str, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0f9 r3 = (0f9) obj;
        0qQ.A0B(r3, 0);
        r3.ABO("endScan", this.A00);
        r3.ABO("scansCount", this.A01);
        r3.ABR("isRequestedByImageView", this.A03);
        r3.ABQ("origin", this.A02);
        return r3;
    }
}
