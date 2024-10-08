package X;

import java.util.function.Function;

/* renamed from: X.PdA  reason: case insensitive filesystem */
public final class C73468PdA implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;

    public C73468PdA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj) {
        Long l;
        Object mgO;
        switch (this.A00) {
            case 0:
                C49954FGj.A03(((NcT) this.A01).A00.A0M, (C307786Rm) null, (C276544tV) null, (C277014uI) null);
                return null;
            case 1:
                C310336ap A0W = DbV.A0W();
                DbS.A19(((NcT) this.A01).A00.A0M, A0W, 2131966404);
                DbY.A1N(A0W);
                return null;
            case 2:
                AnonymousClass67Z r3 = (AnonymousClass67Z) this.A01;
                C70547OAv oAv = (C70547OAv) obj;
                Number number = oAv.A01;
                if (number == null) {
                    mgO = new C72176Oxl(AnonymousClass7TE.A15("create_secure_thread: Group creation failed"));
                } else {
                    long longValue = number.longValue();
                    Number number2 = oAv.A00;
                    if (number2 != null) {
                        l = C51968G9o.A0v(number2);
                    } else {
                        l = null;
                    }
                    mgO = new C66990MgO(C66580MXl.A0j(l, longValue));
                }
                r3.A02(mgO);
                r3.A00();
                break;
            default:
                ((Function) this.A01).apply(obj);
                break;
        }
        return C60340gF.A00;
    }
}
