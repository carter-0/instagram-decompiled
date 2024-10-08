package X;

/* renamed from: X.Ixc  reason: case insensitive filesystem */
public final class C58791Ixc extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58791Ixc(C284945Oz r2, String str, 0sP r4, int i, int i2, boolean z) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        this.A04 = str;
        this.A05 = z;
        this.A02 = r4;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A00;
        String A1E = C41847B3o.A1E(obj);
        C284945Oz r2 = (C284945Oz) this.A03;
        int length = A1E.length();
        int i2 = this.A01;
        if (i != 0) {
            if (length > i2) {
                obj3 = new C53510Gpg(this.A04);
            } else if (!C51966G9m.A1X(A1E) || !this.A05) {
                obj3 = IPY.A00;
            } else {
                obj3 = IPW.A00;
            }
            r2.Epw(obj3);
            C51965G9l.A1W(this.A02, A1E);
            return C60340gF.A00;
        }
        if (length > i2) {
            obj2 = new C53510Gpg(this.A04);
        } else if (!C51966G9m.A1X(A1E) || !this.A05) {
            obj2 = IPY.A00;
        } else {
            obj2 = IPW.A00;
        }
        r2.Epw(obj2);
        C51965G9l.A1W(this.A02, A1E);
        return C60340gF.A00;
    }
}
