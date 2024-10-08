package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.92k  reason: invalid class name and case insensitive filesystem */
public final class C3727892k extends AnonymousClass3HP {
    public C375599Eg A00;
    public C375619Ej A01;
    public C298935uH A02;
    public User A03;
    public long A04 = -1;
    public long A05 = -1;

    public final long AjJ() {
        return this.A04;
    }

    public final long AjP() {
        return this.A05;
    }

    public final boolean CPt() {
        if (this.A05 != -1) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        C298935uH r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EQE(long j) {
        this.A04 = j;
    }

    public final void EQG(long j) {
        this.A05 = j;
    }
}
