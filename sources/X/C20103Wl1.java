package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wl1  reason: case insensitive filesystem */
public final /* synthetic */ class C20103Wl1 implements Runnable {
    public final /* synthetic */ AnonymousClass4M1 A00;

    public /* synthetic */ C20103Wl1(AnonymousClass4M1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3WR r1;
        AnonymousClass4M1 r4 = this.A00;
        C263814Nl r0 = r4.A0O;
        if (r0 != null && (r1 = r0.A0A) != null) {
            C256623w5 A002 = C256623w5.A00();
            if (A002 != null) {
                A002.A01();
            }
            UserSession userSession = r4.A0m;
            String str = r1.A0G.split("_")[0];
            C15622Ufo ufo = new C15622Ufo(r4, 16);
            AnonymousClass7TF.A1H(userSession, str);
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            DbU.A1P(A0b, "video/refresh_resources/%s/", new Object[]{str});
            1OC A0S = DbU.A0S(A0b, UXY.class, D2S.class);
            A0S.A00 = ufo;
            A0S.run();
        }
    }
}
