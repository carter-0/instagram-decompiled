package X;

/* renamed from: X.PmR  reason: case insensitive filesystem */
public final class C73947PmR extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73947PmR(Object obj, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (3 - this.A00 != 0) {
            String A1E = C41847B3o.A1E(obj);
            ((C299635va) this.A02).CqF(2EG.A2q, A1E, this.A03, (String) null, this.A01);
            return C60340gF.A00;
        }
        MYb mYb = ((C66594MYg) this.A02).A01;
        String str = this.A03;
        return mYb.A0C.A0M(new C72028Ov2(this.A01, str, 0)).A0P(C318146oT.A01);
    }
}
