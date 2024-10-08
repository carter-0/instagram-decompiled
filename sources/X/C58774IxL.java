package X;

/* renamed from: X.IxL  reason: case insensitive filesystem */
public final class C58774IxL extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C284945Oz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sL A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58774IxL(C284945Oz r2, String str, 0sL r4, int i, int i2, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = str;
        this.A05 = z;
        this.A04 = r4;
        this.A01 = i2;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        String A1E = C41847B3o.A1E(obj);
        C284945Oz r2 = this.A02;
        if (A1E.length() > this.A00) {
            obj2 = new C53510Gpg(this.A03);
        } else if (!C51966G9m.A1X(A1E) || !this.A05) {
            obj2 = IPY.A00;
        } else {
            obj2 = IPW.A00;
        }
        r2.Epw(obj2);
        this.A04.invoke(Integer.valueOf(this.A01), A1E);
        return C60340gF.A00;
    }
}
