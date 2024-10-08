package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Ffj  reason: case insensitive filesystem */
public final class C50628Ffj implements C51912G7g {
    public final C307786Rm A00;
    public final C307896Rx A01;
    public final C277014uI A02;

    public C50628Ffj(C307786Rm r2, C307896Rx r3, C277014uI r4) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void DgQ(String str) {
        0qQ.A0B(str, 0);
        C277014uI r2 = this.A02;
        C299275ur.A00(this.A01, new AnonymousClass6Tm(0sr.A1P(new Object[]{str, RealtimeConstants.SEND_SUCCESS, this.A00})), r2);
    }

    public final void DgR(String str, boolean z) {
        0qQ.A0B(str, 0);
        C277014uI r3 = this.A02;
        C299275ur.A00(this.A01, new AnonymousClass6Tm(0sr.A1P(new Object[]{str, RealtimeConstants.SEND_SUCCESS, this.A00, Boolean.valueOf(z)})), r3);
    }

    public final void DgS(String str) {
        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        if (!str2.equals(str)) {
            str2 = "failure";
        }
        C277014uI r2 = this.A02;
        C299275ur.A00(this.A01, new AnonymousClass6Tm(0sr.A1P(new Object[]{null, str2, this.A00})), r2);
    }
}
