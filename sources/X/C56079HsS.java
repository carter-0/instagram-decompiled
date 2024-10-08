package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.HsS  reason: case insensitive filesystem */
public final class C56079HsS {
    public Long A00;
    public final AnonymousClass0eM A01;

    public C56079HsS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = AnonymousClass0eN.A01(new GW6(userSession, 44));
    }

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        Long l = this.A00;
        if (l != null) {
            C51965G9l.A0a(this.A01).flowEndCancel(l.longValue(), "load_restarted_on_another_tab");
        }
        this.A00 = null;
        AnonymousClass0eM r4 = this.A01;
        long flowStartForMarker = C51965G9l.A0a(r4).flowStartForMarker(203562165, PublicKeyCredentialControllerUtility.JSON_KEY_USER, false);
        Long valueOf = Long.valueOf(flowStartForMarker);
        this.A00 = valueOf;
        if (valueOf != null) {
            C51965G9l.A0a(r4).flowAnnotate(flowStartForMarker, "tab", str);
        }
    }

    public final void A00() {
        Long l = this.A00;
        if (l != null) {
            C51965G9l.A0a(this.A01).flowEndSuccess(l.longValue());
        }
        this.A00 = null;
    }

    public final void A01(String str) {
        String A002 = AnonymousClass000.A00(1363);
        0qQ.A0B(str, 1);
        Long l = this.A00;
        if (l != null) {
            C51965G9l.A0a(this.A01).flowEndFail(l.longValue(), A002, str);
        }
        this.A00 = null;
    }
}
