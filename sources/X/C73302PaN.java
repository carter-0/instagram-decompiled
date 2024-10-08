package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PaN  reason: case insensitive filesystem */
public final class C73302PaN implements Runnable {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C73302PaN(AnonymousClass0iw r1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void run() {
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass7TF.A1J(A002, A002.A5K, 1Av.A8a, 416, true);
        0xa r1 = A002.A01;
        AnonymousClass7TG.A0g(r1, C273654mx.A00(3411)).apply();
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = r1.AR4();
        AR4.E5c(C273654mx.A00(3412), currentTimeMillis);
        AR4.apply();
        String str = this.A02;
        if (str != null) {
            C327977Cy.A00((C69489NmX) null, C69462Nm6.IMPRESSION, C69487NmV.TOOLTIP, new C327977Cy(this.A00, userSession), str, userSession.A06);
        }
    }
}
