package X;

import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.user.model.User;

public final class JBF extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBF(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A08 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A04 = obj6;
        this.A07 = obj7;
        this.A09 = z;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C299635va r3 = (C299635va) this.A05;
                C2364233r.A00(A0R, (C299665vd) this.A03, r3, (AnonymousClass5vY) this.A02, (C2364233r) this.A06, (TifuViewModel) this.A08, (User) this.A07, (0sP) this.A04, C51966G9m.A01(this.A01), this.A09);
                break;
            case 1:
                boolean z = this.A09;
                C53314Gm0 gm0 = (C53314Gm0) this.A02;
                INA ina = (INA) this.A04;
                I6W.A02(A0R, (C54672HOd) this.A05, ina, gm0, (C62320sa) this.A07, (C62320sa) this.A08, (C62320sa) this.A03, (C62320sa) this.A06, C51966G9m.A01(this.A01), z);
                break;
            default:
                I7T.A0E(A0R, (C62320sa) this.A02, (0sP) this.A07, (0sP) this.A05, (0sP) this.A03, (0sP) this.A04, (0sL) this.A06, (AnonymousClass62P) this.A08, C51966G9m.A01(this.A01), this.A09);
                break;
        }
        return C60340gF.A00;
    }
}
