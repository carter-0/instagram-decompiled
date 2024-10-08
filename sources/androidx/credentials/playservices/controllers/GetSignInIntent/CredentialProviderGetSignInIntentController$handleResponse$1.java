package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0Yg;
import X.0qQ;
import X.0sL;
import X.C60340gF;
import X.C62320sa;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderGetSignInIntentController$handleResponse$1 extends 0Yg implements 0sL {
    public static final CredentialProviderGetSignInIntentController$handleResponse$1 INSTANCE = new CredentialProviderGetSignInIntentController$handleResponse$1();

    public CredentialProviderGetSignInIntentController$handleResponse$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (C62320sa) obj2);
        return C60340gF.A00;
    }

    public final void invoke(CancellationSignal cancellationSignal, C62320sa r3) {
        0qQ.A0B(r3, 1);
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, r3);
    }
}
