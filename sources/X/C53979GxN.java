package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GxN  reason: case insensitive filesystem */
public final class C53979GxN extends C243963aQ {
    public static final 2V5 A07;
    public static final 2V5 A08;
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass3W1 A04;
    public final JTB A05;
    public final GFO A06;

    public final C244523bK A0X(C244463bE r10) {
        0qQ.A0B(r10, 0);
        UserSession userSession = this.A02;
        float A002 = C51965G9l.A00(DbS.A0J(userSession, 0), userSession, 37168531016253914L);
        2WO r5 = new 2WO(Integer.MAX_VALUE, Integer.MAX_VALUE);
        AnonymousClass2WG A0f = C51969G9p.A0f(r10, C51971G9r.A0e(C56972IJq.A00, false), C58600IuX.A00, new C58748Iwv(r10, this, A002, 13));
        AnonymousClass3XV r0 = 2WX.A02;
        return C51965G9l.A0W(GFM.A01(C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, Double.doubleToRawLongBits(44.0d)), this.A00, userSession, this.A03), r5, A0f);
    }

    static {
        Float A0g = C51967G9n.A0g();
        A07 = new 2V5(A0g);
        A08 = new 2V5(A0g);
    }

    public C53979GxN(C267324bN r1, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r4, AnonymousClass3W1 r5, JTB jtb, GFO gfo) {
        C51972G9s.A1C(r4, r5);
        C51972G9s.A1E(gDe, jtb);
        this.A02 = userSession;
        this.A03 = r4;
        this.A06 = gfo;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = gDe;
        this.A05 = jtb;
    }
}
