package X;

/* renamed from: X.Ix0  reason: case insensitive filesystem */
public final class C58753Ix0 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58753Ix0(Object obj, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (3 - this.A00 != 0) {
            ((C299635va) this.A01).Cpu(this.A02, C41847B3o.A1E(obj), (String) null, this.A03);
        } else {
            switch (DbU.A02((HML) obj, 0)) {
                case 0:
                case 1:
                case 4:
                case 6:
                    break;
                case 2:
                case 3:
                case 5:
                    ((C299665vd) this.A01).Duf(this.A02, (String) null, this.A03);
                    break;
                case 7:
                    ((C299665vd) this.A01).Dfr(this.A02);
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
        }
        return C60340gF.A00;
    }
}
