package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mc5  reason: case insensitive filesystem */
public final class C66760Mc5 extends C392289uY implements G76 {
    public C70444O6v A00;
    public AnonymousClass2Ep A01;
    public final UserSession A02;
    public final 2Dm A03;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        C70444O6v o6v = new C70444O6v(context, this);
        this.A00 = o6v;
        return o6v.A00;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r8, boolean z) {
        List BJk;
        List BIp;
        0qQ.A0B(puH, 1);
        this.A01 = r8;
        if (r8 != null) {
            UserSession userSession = this.A02;
            2Dm r3 = this.A03;
            DbY.A1S(userSession, r3);
            String C6C = r8.C6C();
            if (C6C == null) {
                C6C = "";
            }
            if (r8.C6a() == 29 && 0qQ.A0K(userSession.A06, r8.AsX()) && AnonymousClass7OI.A01(userSession, C66647MaG.A08(r8.BJy())) && !C66581MXm.A1Y(1Au.A00(userSession).A01, "broadcast_chat_add_collaborator_nux/", C6C) && (((BJk = r8.BJk()) == null || BJk.isEmpty()) && (((BIp = r8.BIp()) == null || BIp.isEmpty()) && !OUB.A00(userSession, r8, r3, r8.BJy(), (String) null) && !OPE.A01(userSession, r8, r3, (String) null) && !C371168xj.A00(userSession, r8, AnonymousClass4k9.A00(userSession))))) {
                1Av A002 = 1Au.A00(userSession);
                if (AnonymousClass7TG.A1a(A002, A002.A2R, 1Av.A8a, 452)) {
                    puH.DoM(this);
                    return;
                }
            }
        }
        puH.onFailure();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1qK, java.lang.Object] */
    public final void onActionClicked() {
        String str;
        UserSession userSession = this.A02;
        AnonymousClass1Nd.A00(userSession).A00(new Object());
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass2Ep r0 = this.A01;
        if (r0 == null || (str = r0.C6C()) == null) {
            str = "";
        }
        DbX.A1T(AnonymousClass7TE.A0p(A002), "broadcast_chat_add_collaborator_nux/", str, true);
    }

    public final void onBannerDismissed() {
        String str;
        1Av A002 = 1Au.A00(this.A02);
        AnonymousClass2Ep r0 = this.A01;
        if (r0 == null || (str = r0.C6C()) == null) {
            str = "";
        }
        DbX.A1T(AnonymousClass7TE.A0p(A002), "broadcast_chat_add_collaborator_nux/", str, true);
    }

    public C66760Mc5(UserSession userSession) {
        this.A02 = userSession;
        this.A03 = 2L2.A00(userSession);
    }
}
