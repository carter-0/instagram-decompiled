package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.2xE  reason: invalid class name and case insensitive filesystem */
public final class C234182xE implements C234192xF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C234212xH A02;

    public C234182xE(AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = (C234212xH) userSession.A01(C234212xH.class, C234202xG.A00);
    }

    public final boolean EvU() {
        return true;
    }

    public final void DsF() {
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        A002.A3L.Epx(A002, true, 1Av.A8a[73]);
        0wc A012 = AnonymousClass0kN.A01(this.A00, userSession);
        0Aj A003 = A012.A00(A012.A00, C66579MXk.A00(122));
        if (A003.isSampled()) {
            A003.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AnonymousClass000.A00(3830));
            A003.Cgf();
        }
    }

    public final boolean EtP() {
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        0s0 r1 = A002.A3L;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        if (!((Boolean) r1.CDM(A002, r3[73])).booleanValue()) {
            1Av A003 = 1Au.A00(userSession);
            if (((Boolean) A003.A3M.CDM(A003, r3[83])).booleanValue() || 1Au.A00(userSession).A01.getInt("feed_ufi_bar_impression_count", 0) < 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean EvT() {
        return true;
    }
}
