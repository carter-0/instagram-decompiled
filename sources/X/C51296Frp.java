package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Frp  reason: case insensitive filesystem */
public final class C51296Frp implements Runnable {
    public final /* synthetic */ Dc1 A00;

    public C51296Frp(Dc1 dc1) {
        this.A00 = dc1;
    }

    public final void run() {
        Dc1 dc1 = this.A00;
        dc1.A02(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        dc1.A01 = null;
    }
}
