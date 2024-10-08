package X;

/* renamed from: X.9Kg  reason: invalid class name and case insensitive filesystem */
public final class C377029Kg extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377029Kg(int i, float f, float f2) {
        super(1);
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A02) {
            case 0:
                throw new NullPointerException("setName");
            case 1:
                C317146mn r3 = (C317146mn) obj;
                0qQ.A0B(r3, 0);
                r3.DP2(this.A00, this.A01);
                break;
            case 2:
                C317156mo r32 = (C317156mo) obj;
                0qQ.A0B(r32, 0);
                return Boolean.valueOf(r32.Dps(this.A00, this.A01));
            default:
                C317146mn r33 = (C317146mn) obj;
                0qQ.A0B(r33, 0);
                r33.Dqb(this.A00, this.A01);
                break;
        }
        return C60340gF.A00;
    }
}
