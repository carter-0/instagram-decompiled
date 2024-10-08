package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Fqx  reason: case insensitive filesystem */
public final class C51242Fqx implements Runnable {
    public final /* synthetic */ FGH A00;

    public C51242Fqx(FGH fgh) {
        this.A00 = fgh;
    }

    public final void run() {
        FGH fgh = this.A00;
        fgh.A0F.set(true);
        fgh.A0C.A00();
        if (AnonymousClass7TF.A1Z(fgh.A0G)) {
            FGH.A02(fgh, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            return;
        }
        02m r2 = fgh.A04;
        if (r2 == null) {
            0qQ.A0F("qpl");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.markerAnnotate(896612552, TraceFieldType.FailureReason, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        FGH.A01(fgh);
    }
}
