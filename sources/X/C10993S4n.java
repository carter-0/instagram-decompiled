package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.S4n  reason: case insensitive filesystem */
public final class C10993S4n {
    public long A00;
    public long A01;
    public 1QP A02;
    public final UserSession A03;

    public C10993S4n(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = AnonymousClass1QO.A00(userSession);
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 4);
        long j = this.A01;
        if (j != 0) {
            1QP r2 = this.A02;
            r2.flowAnnotate(j, "app_id", str);
            r2.flowAnnotate(this.A01, "source_app", str2);
            r2.flowAnnotate(this.A01, "sticker", z);
            r2.flowAnnotate(this.A01, "attribution", z2);
            r2.flowAnnotate(this.A01, "action", str3);
            if (str4 != null) {
                r2.flowAnnotate(this.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
            }
            if (str5 != null) {
                r2.flowAnnotate(this.A01, "package", str5);
            }
        }
    }

    public final void A00(String str) {
        long j = this.A01;
        if (j != 0) {
            this.A02.flowEndFail(j, str, (String) null);
            this.A01 = 0;
        }
    }
}
