package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

public final class PHF implements C320986tO {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C67499Mot A01;
    public final /* synthetic */ DirectAnimatedMedia A02;
    public final /* synthetic */ C254783t2 A03;

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        0qQ.A0B(str2, 2);
        String A0s = DbV.A0s();
        C67499Mot mot = this.A01;
        AnonymousClass0eM r2 = mot.A02;
        ((AnonymousClass7UH) r2.getValue()).A03(A0s, false);
        ((AnonymousClass7UH) r2.getValue()).A05(A0s, true);
        UserSession userSession = this.A00;
        userSession.A01(C70937OSk.class, C73911Plm.A00(userSession, 6));
        C71810OrC.A00(C70937OSk.A00(userSession, this.A02, (AnonymousClass9HR) this.A03, AnonymousClass7TE.A0t(str2), A0s), new C73943PmN(A0s, mot, 40), 1Lf.A01, 5);
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public final void onError(String str) {
    }

    public PHF(UserSession userSession, C67499Mot mot, DirectAnimatedMedia directAnimatedMedia, C254783t2 r4) {
        this.A01 = mot;
        this.A00 = userSession;
        this.A02 = directAnimatedMedia;
        this.A03 = r4;
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }
}
