package X;

/* renamed from: X.9Kf  reason: invalid class name and case insensitive filesystem */
public final class C377019Kf extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377019Kf(float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A01 != 0) {
            C317146mn r3 = (C317146mn) obj;
            0qQ.A0B(r3, 0);
            r3.DA9(this.A00);
            return C60340gF.A00;
        }
        throw new NullPointerException("setName");
    }
}
