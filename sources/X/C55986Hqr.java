package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hqr  reason: case insensitive filesystem */
public final class C55986Hqr {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C55495Hid A02;
    public final C74569PxI A03;
    public final C55506Hio A04;

    public final C61057Jvv A00(1Xj r13, AnonymousClass3W1 r14) {
        AnonymousClass3W1 r9 = r14;
        AnonymousClass7TG.A1N(r13, r14);
        DUO BQi = r13.A0C.BQi();
        if (BQi != null) {
            String text = BQi.getText();
            DUO BQi2 = r13.A0C.BQi();
            if (BQi2 != null) {
                C61074JwC jwC = new C61074JwC(11, new JG2(24, BQi2, this), J6S.A00(BQi2, this, 21), new C74188PqU(26, (Object) BQi2, (Object) r13, (Object) this), new C74188PqU(25, (Object) BQi2, (Object) r13, (Object) this));
                return new C61057Jvv(jwC, C247243g1.A00(this.A00, this.A01, r13, this.A03.BRK(), r14), r9, (CharSequence) text, AnonymousClass7TF.A1S(r14.A0E, C231592rv.FEED_ADD_YOURS_CTA.ordinal()));
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public /* synthetic */ C55986Hqr(AnonymousClass0iw r3, UserSession userSession, C55495Hid hid, C74569PxI pxI) {
        C55506Hio hio = new C55506Hio(userSession);
        0qQ.A0B(pxI, 2);
        this.A01 = userSession;
        this.A03 = pxI;
        this.A00 = r3;
        this.A02 = hid;
        this.A04 = hio;
    }
}
