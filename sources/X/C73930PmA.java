package X;

/* renamed from: X.PmA  reason: case insensitive filesystem */
public final class C73930PmA extends 0Yg implements 0sP {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73930PmA(int i) {
        super(1);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        if (7 - this.A00 != 0) {
            return C60340gF.A00;
        }
        C70547OAv oAv = (C70547OAv) obj;
        Long l = null;
        if (oAv == null || (number = oAv.A01) == null) {
            throw AnonymousClass7TE.A15("create_secure_thread: Group creation failed");
        }
        long longValue = number.longValue();
        Number number2 = oAv.A00;
        if (number2 != null) {
            l = C51968G9o.A0v(number2);
        }
        return C66580MXl.A0j(l, longValue);
    }
}
