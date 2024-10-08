package X;

import android.credentials.CreateCredentialException;
import android.os.OutcomeReceiver;

public final class SWN implements OutcomeReceiver {
    public final /* synthetic */ C10648Rvh A00;
    public final /* synthetic */ C13683Tez A01;
    public final /* synthetic */ C11617SdK A02;

    public SWN(C10648Rvh rvh, C13683Tez tez, C11617SdK sdK) {
        this.A01 = tez;
        this.A00 = rvh;
        this.A02 = sdK;
    }

    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        CreateCredentialException createCredentialException = (CreateCredentialException) th;
        0qQ.A0B(createCredentialException, 0);
        this.A01.DCo(C11617SdK.A01(createCredentialException));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onResult(java.lang.Object r6) {
        /*
            r5 = this;
            android.credentials.CreateCredentialResponse r6 = (android.credentials.CreateCredentialResponse) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.Tez r4 = r5.A01
            X.Rvh r0 = r5.A00
            java.lang.String r3 = r0.A03
            android.os.Bundle r2 = r6.getData()
            X.0qQ.A07(r2)
            java.lang.String r0 = "android.credentials.TYPE_PASSWORD_CREDENTIAL"
            boolean r0 = r3.equals(r0)     // Catch:{ RK4 -> 0x0044 }
            if (r0 == 0) goto L_0x0021
            X.QAi r1 = new X.QAi     // Catch:{ RK4 -> 0x0044 }
            r1.<init>(r2)     // Catch:{ RK4 -> 0x0044 }
            goto L_0x0057
        L_0x0021:
            java.lang.String r0 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            boolean r0 = r3.equals(r0)     // Catch:{ RK4 -> 0x0044 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0038 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x0038 }
            X.QAj r1 = new X.QAj     // Catch:{ Exception -> 0x0038 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0057
        L_0x0038:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x0044 }
            r0.<init>()     // Catch:{ RK4 -> 0x0044 }
            goto L_0x0043
        L_0x003e:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x0044 }
            r0.<init>()     // Catch:{ RK4 -> 0x0044 }
        L_0x0043:
            throw r0     // Catch:{ RK4 -> 0x0044 }
        L_0x0044:
            X.QAh r1 = new X.QAh
            r1.<init>(r2)
            int r0 = r3.length()
            if (r0 > 0) goto L_0x0057
            java.lang.String r0 = "type should not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0057:
            r4.onResult(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SWN.onResult(java.lang.Object):void");
    }
}
