package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.002;
import X.0qQ;
import X.0rm;
import X.AnonymousClass00P;
import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10144RnL;
import X.C10339Rqc;
import X.C13683Tez;
import X.C51965G9l;
import X.C62320sa;
import X.C7387QAp;
import X.C8988RKe;
import X.Pxf;
import X.QB4;
import X.QB8;
import X.QpS;
import X.RKT;
import X.Sx0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CredentialProviderGetSignInIntentController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "GetSignInIntent";
    public C13683Tez callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver = new CredentialProviderGetSignInIntentController$resultReceiver$1(this, AnonymousClass7TF.A0D());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController(Context context2) {
        super(context2);
        0qQ.A0B(context2, 1);
        this.context = context2;
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context2) {
        0qQ.A0B(context2, 0);
        return new CredentialProviderGetSignInIntentController(context2);
    }

    public GetSignInIntentRequest convertRequestToPlayServices(C10339Rqc rqc) {
        0qQ.A0B(rqc, 0);
        List list = rqc.A00;
        if (list.size() == 1) {
            0qQ.A0C(list.get(0), "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
            throw AnonymousClass7TE.A11("getServerClientId");
        }
        throw new C8988RKe("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION", "GetSignInWithGoogleOption cannot be combined with other options.");
    }

    public C10144RnL convertResponseToCredentialManager(SignInCredential signInCredential) {
        0qQ.A0B(signInCredential, 0);
        if (signInCredential.A07 != null) {
            return new C10144RnL(createGoogleIdCredential(signInCredential));
        }
        Log.w(TAG, "Credential returned but no google Id found");
        throw QB8.A00("When attempting to convert get response, null credential found");
    }

    public final C7387QAp createGoogleIdCredential(SignInCredential signInCredential) {
        0qQ.A0B(signInCredential, 0);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = signInCredential.A02;
        0qQ.A07(str5);
        try {
            String str6 = signInCredential.A07;
            0qQ.A0A(str6);
            0qQ.A0B(str6, 0);
            String str7 = signInCredential.A03;
            if (str7 != null) {
                str = str7;
            }
            String str8 = signInCredential.A04;
            if (str8 != null) {
                str3 = str8;
            }
            String str9 = signInCredential.A05;
            if (str9 != null) {
                str2 = str9;
            }
            String str10 = signInCredential.A08;
            if (str10 != null) {
                str4 = str10;
            }
            Uri uri2 = signInCredential.A00;
            if (uri2 != null) {
                uri = uri2;
            }
            return new C7387QAp(uri, str5, str6, str, str2, str3, str4);
        } catch (Exception unused) {
            throw QB8.A00("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final void setCallback(C13683Tez tez) {
        0qQ.A0B(tez, 0);
        this.callback = tez;
    }

    public final void setExecutor(Executor executor2) {
        0qQ.A0B(executor2, 0);
        this.executor = executor2;
    }

    public final C13683Tez getCallback() {
        C13683Tez tez = this.callback;
        if (tez != null) {
            return tez;
        }
        0qQ.A0F("callback");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Executor getExecutor() {
        Executor executor2 = this.executor;
        if (executor2 != null) {
            return executor2;
        }
        0qQ.A0F("executor");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.Sx0] */
    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        C8988RKe rKe;
        CancellationSignal cancellationSignal2;
        C62320sa r1;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, 002.A02(i3, i, "Returned request code ", " which  does not match what was given "));
            return;
        }
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            try {
                Context context2 = this.context;
                AnonymousClass3Qk.A02(context2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(new QpS(context2, (Sx0) new Object()).A00(intent))));
            } catch (RKT e) {
                0rm A11 = C51965G9l.A11();
                A11.A00 = QB8.A00(e.getMessage());
                int i4 = e.A00.A00;
                if (i4 == 16) {
                    rKe = new C8988RKe("android.credentials.GetCredentialException.TYPE_USER_CANCELED", e.getMessage());
                } else {
                    if (Pxf.A1U(CredentialProviderBaseController.retryables, i4)) {
                        rKe = new C8988RKe("android.credentials.GetCredentialException.TYPE_INTERRUPTED", e.getMessage());
                    }
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, A11));
                }
                A11.A00 = rKe;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, A11));
            } catch (C8988RKe e2) {
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderGetSignInIntentController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            } catch (Throwable th) {
                QB8 A00 = QB8.A00(th.getMessage());
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderGetSignInIntentController$handleResponse$6(this, A00);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            }
        }
    }

    public void invokePlayServices(C10339Rqc rqc, C13683Tez tez, Executor executor2, CancellationSignal cancellationSignal2) {
        C62320sa credentialProviderGetSignInIntentController$invokePlayServices$2;
        AnonymousClass7TG.A1T(rqc, tez, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = tez;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            try {
                convertRequestToPlayServices(rqc);
                throw AnonymousClass00P.createAndThrow();
            } catch (Exception e) {
                if (e instanceof QB4) {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$1(this, e);
                } else {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$2(this);
                }
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, credentialProviderGetSignInIntentController$invokePlayServices$2);
            }
        }
    }

    public final class Companion {
        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            0qQ.A0B(context, 0);
            return new CredentialProviderGetSignInIntentController(context);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((C10339Rqc) obj);
        throw AnonymousClass00P.createAndThrow();
    }
}
