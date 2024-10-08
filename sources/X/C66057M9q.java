package X;

import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.M9q  reason: case insensitive filesystem */
public final class C66057M9q implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C64910LkA A02;
    public final /* synthetic */ FilterGroupModel A03;
    public final /* synthetic */ 0sP A04;

    public C66057M9q(C64910LkA lkA, FilterGroupModel filterGroupModel, 0sP r3, int i, int i2) {
        this.A02 = lkA;
        this.A03 = filterGroupModel;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r3;
    }

    public final void run() {
        C64910LkA lkA = this.A02;
        UserSession userSession = lkA.A06;
        C364808m2 r7 = lkA.A09;
        AUU auu = new AUU(userSession, (C364958mI) null, this.A03, r7, new C66312MMv(26, this.A04, lkA), this.A01, this.A00);
        JWJ jwj = lkA.A08;
        C344207rU r0 = jwj.A00;
        if (r0 != null) {
            r0.A06();
            lkA.E25();
            C364988mL A002 = jwj.A00(auu);
            if (A002 != null) {
                A002.A04();
                JWI jwi = lkA.A07;
                JTR.A1A(jwi.A00.A02, jwi.A01);
                return;
            }
        }
        auu.cancel();
    }
}
