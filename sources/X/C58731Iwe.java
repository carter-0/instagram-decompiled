package X;

/* renamed from: X.Iwe  reason: case insensitive filesystem */
public final class C58731Iwe extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58731Iwe(int i, String str, String str2) {
        super(1);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0f9 r3 = (0f9) obj;
        0qQ.A0B(r3, 0);
        r3.ABO("scans", this.A00);
        r3.ABQ("origin", this.A02);
        r3.ABQ("exception", this.A01);
        return r3;
    }
}
