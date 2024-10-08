package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ne6  reason: case insensitive filesystem */
public final class C69067Ne6 extends C252733pa {
    public final AnonymousClass4DH A00;
    public final 02m A01;
    public final 1a8 A02;
    public final UserSession A03;
    public final AnonymousClass2EU A04;
    public final C74411PuR A05;
    public final C2611948q A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final C74564PxD A09;
    public final P3Y A0A;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C69067Ne6(AnonymousClass4DH r24, UserSession userSession) {
        this();
        int i;
        UserSession userSession2 = userSession;
        this.A03 = userSession2;
        AnonymousClass4DH r7 = r24;
        this.A00 = r7;
        02z A10 = DbS.A10(new C61084JwM(AnonymousClass05K.A00));
        this.A07 = A10;
        this.A08 = 10b.A03(A10);
        this.A01 = C51965G9l.A0l();
        AnonymousClass2EU r14 = AnonymousClass2EU.A00;
        this.A04 = r14;
        C2611948q r15 = C2611948q.ALL;
        this.A06 = r15;
        P3Y p3y = new P3Y();
        this.A0A = p3y;
        P3S p3s = new P3S(this);
        this.A09 = p3s;
        boolean A032 = 2HM.A00(userSession2).A03();
        C72624PDd A002 = C70136Nxq.A00(r7, userSession2, p3s, p3y);
        C74411PuR puR = A002;
        if (A032) {
            if (AnonymousClass6FC.A00(userSession2)) {
                i = r14.A00;
            } else {
                i = -1;
            }
            C66752Mbx mbx = new C66752Mbx(userSession2, new PCW(), 0, i, false);
            UserSession userSession3 = userSession2;
            P3S p3s2 = p3s;
            C66918MfC mfC = new C66918MfC(mbx.A05.A01.A0L(C66919MfD.A00), C251033mS.A00(userSession2).A01(), C66582MXn.A0O(userSession2, AnonymousClass436.A00), C318146oT.A00, userSession2, new C67250Mkk(r7.requireContext(), userSession3, p3s2, Mi4.A01(userSession2, AnonymousClass9NQ.A00(userSession2, false)), new C67107MiR((C2366634p) null), C251033mS.A00(userSession2)), r14, r15, false, false, false);
            C66741Mbm mbm = A002.A00;
            C67014Mgn mgn = A002.A01;
            puR = new C72623PDc(new C66751Mbw(mgn.Ezk(), userSession2, mbm, mbx), new C67053MhQ(userSession2, mgn, mfC));
        }
        C74411PuR puR2 = puR;
        this.A05 = puR2;
        1a8 r4 = new 1a8((C269794fh) null);
        this.A02 = r4;
        puR2.BNZ().start();
        C74566PxF C6W = puR2.C6W();
        C6W.start();
        PU7.A00(C72120Owf.A00(C6W.FN4().A0I(new C67578MqC(this, 2)), this, 66), r4, this, 2);
    }

    public static final void A00(C69067Ne6 ne6, Integer num) {
        05G r2 = ne6.A07;
        C61084JwM jwM = (C61084JwM) r2.getValue();
        r2.Epw(C61084JwM.A03((Integer) jwM.A01, num, (List) jwM.A02));
    }

    public C69067Ne6() {
        super("DIRECT_THREAD_DELETION", AnonymousClass43D.A00(1684807233));
    }
}
