package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.HsP  reason: case insensitive filesystem */
public final class C56076HsP {
    public long A00;
    public final AnonymousClass0eM A01;

    public C56076HsP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = C58710IwJ.A01(userSession, 33);
    }

    public final void A02(String str) {
        if (this.A00 == 0) {
            this.A00 = C51967G9n.A08(C51965G9l.A0a(this.A01).flowStartIfNotOngoingForMarker(658058235, str.hashCode(), PublicKeyCredentialControllerUtility.JSON_KEY_USER, false, 30000), 0);
        }
    }

    public final void A00() {
        if (this.A00 != 0) {
            C51965G9l.A0a(this.A01).flowEndSuccess(this.A00);
            this.A00 = 0;
        }
    }

    public final void A01(String str) {
        if (this.A00 != 0) {
            C51965G9l.A0a(this.A01).flowMarkPoint(this.A00, str);
        }
    }
}
