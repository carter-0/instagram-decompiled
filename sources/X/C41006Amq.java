package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Amq  reason: case insensitive filesystem */
public final /* synthetic */ class C41006Amq implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ AnonymousClass8D7 A01;

    public /* synthetic */ C41006Amq(AnonymousClass8BA r1, AnonymousClass8D7 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8BA r5 = this.A00;
        AnonymousClass8D7 r11 = this.A01;
        C317876nz r0 = C317876nz.A0a;
        C317876nz A06 = C317886o0.A06(C318046oG.MESSAGE_SHARE, C273654mx.A00(84));
        C39890ADo A002 = C39890ADo.A00();
        A002.A0Q = false;
        A002.A0F = false;
        A002.A06 = new AnonymousClass8BG(0.5f, 0.5f);
        UserSession userSession = r5.A0v;
        if (r11.A0A) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36328164829576230L)) {
                AnonymousClass7TF.A0M(r5).A1H(new C61681KHo(AnonymousClass7TE.A0T(r5), userSession, r11), A06, A002);
                return;
            }
        }
        new AnonymousClass9X0(r5.A0n, AnonymousClass7TE.A0T(r5), r5.A0u, userSession, new L6C(A06, r5, A002), r11);
    }
}
