package X;

import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import com.instagram.common.session.UserSession;

public final class EBX extends 1P0 {
    public final UserSession A00;

    public EBX(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFailInBackground(C268654dm r3) {
        AnonymousClass0fD.A0A(-1148062029, AnonymousClass0fD.A03(358353831));
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1218210244);
        C47362Dvw dvw = (C47362Dvw) obj;
        int A0D = AnonymousClass7TG.A0D(dvw, 464573669);
        if (!dvw.A01.isEmpty()) {
            for (OneTapLinkedProfileInfoImpl oneTapLinkedProfileInfoImpl : dvw.A01) {
                String str = oneTapLinkedProfileInfoImpl.A02;
                if (str != null) {
                    UserSession userSession = this.A00;
                    C319606qt.A01(userSession).A0A(DbS.A0O("one_tap_login_nonce_callback"), userSession, AnonymousClass05K.A06, str);
                }
            }
        }
        AnonymousClass0fD.A0A(-1627200300, A0D);
        AnonymousClass0fD.A0A(367444399, A03);
    }
}
