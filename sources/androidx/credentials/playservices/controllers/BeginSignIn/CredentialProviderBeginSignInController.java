package androidx.credentials.playservices.controllers.BeginSignIn;

import X.002;
import X.0qQ;
import X.0rm;
import X.AnonymousClass00P;
import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10143RnK;
import X.C10144RnL;
import X.C10339Rqc;
import X.C13683Tez;
import X.C51965G9l;
import X.C62320sa;
import X.C66580MXl;
import X.C7384QAl;
import X.C7385QAm;
import X.C7387QAp;
import X.C8988RKe;
import X.JTQ;
import X.Pxf;
import X.QB8;
import X.QpS;
import X.RKT;
import X.Sx0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CredentialProviderBeginSignInController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "BeginSignIn";
    public C13683Tez callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver = new CredentialProviderBeginSignInController$resultReceiver$1(this, AnonymousClass7TF.A0D());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController(Context context2) {
        super(context2);
        0qQ.A0B(context2, 1);
        this.context = context2;
    }

    private final C7387QAp createGoogleIdCredential(SignInCredential signInCredential) {
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = signInCredential.A02;
        0qQ.A07(str5);
        String str6 = signInCredential.A07;
        JTQ.A1K(str6);
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
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context2) {
        0qQ.A0B(context2, 0);
        return new CredentialProviderBeginSignInController(context2);
    }

    public BeginSignInRequest convertRequestToPlayServices(C10339Rqc rqc) {
        0qQ.A0B(rqc, 0);
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth_release(rqc, this.context);
    }

    public C10144RnL convertResponseToCredentialManager(SignInCredential signInCredential) {
        C10143RnK qAl;
        0qQ.A0B(signInCredential, 0);
        String str = signInCredential.A06;
        if (str != null) {
            String str2 = signInCredential.A02;
            0qQ.A07(str2);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            A0a.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            qAl = new C7385QAm(A0a, str2, str);
        } else if (signInCredential.A07 != null) {
            qAl = createGoogleIdCredential(signInCredential);
        } else if (signInCredential.A01 != null) {
            String assertPasskeyResponse = PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(signInCredential);
            Bundle A0a2 = AnonymousClass7TE.A0a();
            A0a2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", assertPasskeyResponse);
            qAl = new C7384QAl(assertPasskeyResponse, A0a2);
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            throw QB8.A00("When attempting to convert get response, null credential found");
        }
        return new C10144RnL(qAl);
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
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal)) {
            try {
                Context context2 = this.context;
                AnonymousClass3Qk.A02(context2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(new QpS(context2, (Sx0) new Object()).A00(intent))));
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
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, A11));
                }
                A11.A00 = rKe;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, A11));
            } catch (C8988RKe e2) {
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderBeginSignInController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            } catch (Throwable th) {
                QB8 A00 = QB8.A00(th.getMessage());
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderBeginSignInController$handleResponse$6(this, A00);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            }
        }
    }

    public void invokePlayServices(C10339Rqc rqc, C13683Tez tez, Executor executor2, CancellationSignal cancellationSignal2) {
        AnonymousClass7TG.A1T(rqc, tez, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = tez;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            BeginSignInRequest convertRequestToPlayServices = convertRequestToPlayServices(rqc);
            Intent A0A = C66580MXl.A0A(this.context, HiddenActivity.class);
            A0A.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, A0A, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
            try {
                this.context.startActivity(A0A);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderBeginSignInController$invokePlayServices$1(this));
            }
        }
    }

    public final class Companion {
        public final CredentialProviderBeginSignInController getInstance(Context context) {
            0qQ.A0B(context, 0);
            return new CredentialProviderBeginSignInController(context);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
