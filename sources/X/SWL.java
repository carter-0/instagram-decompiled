package X;

import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;

public final class SWL implements OutcomeReceiver {
    public final /* synthetic */ C13683Tez A00;
    public final /* synthetic */ C11617SdK A01;

    public SWL(C13683Tez tez, C11617SdK sdK) {
        this.A00 = tez;
        this.A01 = sdK;
    }

    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        0qQ.A0B(getCredentialException, 0);
        this.A00.DCo(C11617SdK.A02(getCredentialException));
    }

    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        0qQ.A0B(getCredentialResponse, 0);
        this.A00.onResult(C11617SdK.A00(getCredentialResponse));
    }
}
