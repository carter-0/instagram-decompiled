package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.002;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10142RnJ;
import X.C13683Tez;
import X.C62320sa;
import X.C66580MXl;
import X.C7379QAf;
import X.C7382QAj;
import X.C7399QBc;
import X.C8987RKd;
import X.QBD;
import X.QBZ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePublicKey";
    public C13683Tez callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(this, AnonymousClass7TF.A0D());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController(Context context2) {
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

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context2) {
        0qQ.A0B(context2, 0);
        return new CredentialProviderCreatePublicKeyCredentialController(context2);
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        0qQ.A0B(credentialProviderCreatePublicKeyCredentialController, 0);
        C13683Tez tez = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tez == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tez.DCo(new C7399QBc(new QBZ(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        }
    }

    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(C7379QAf qAf) {
        0qQ.A0B(qAf, 0);
        return PublicKeyCredentialControllerUtility.Companion.convert(qAf);
    }

    public C10142RnJ convertResponseToCredentialManager(PublicKeyCredential publicKeyCredential) {
        0qQ.A0B(publicKeyCredential, 0);
        try {
            String A00 = publicKeyCredential.A00();
            0qQ.A07(A00);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", A00);
            return new C7382QAj(A00, A0a);
        } catch (Throwable th) {
            throw new C8987RKd("android.credentials.CreateCredentialException.TYPE_UNKNOWN", AnonymousClass7TF.A0m("The PublicKeyCredential response json had an unexpected exception when parsing: ", th));
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        CancellationSignal cancellationSignal2;
        C62320sa r1;
        C62320sa r12;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, 002.A02(i3, i, "Returned request code ", " does not match what was given "));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) != null) {
            PublicKeyCredential publicKeyCredential = (PublicKeyCredential) SafeParcelableSerializer.A00(PublicKeyCredential.CREATOR, byteArrayExtra);
            0qQ.A07(publicKeyCredential);
            C8987RKd publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(publicKeyCredential);
            if (publicKeyCredentialResponseContainsError != null) {
                cancellationSignal2 = this.cancellationSignal;
                r12 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, publicKeyCredentialResponseContainsError);
            } else {
                try {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(publicKeyCredential)));
                    return;
                } catch (JSONException e) {
                    cancellationSignal2 = this.cancellationSignal;
                    r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e);
                } catch (Throwable th) {
                    cancellationSignal2 = this.cancellationSignal;
                    r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th);
                }
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
        } else if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
            Executor executor2 = this.executor;
            if (executor2 == null) {
                0qQ.A0F("executor");
                throw AnonymousClass00P.createAndThrow();
            } else {
                executor2.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0(this));
                return;
            }
        } else {
            return;
        }
        r12 = r1;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
    }

    /* access modifiers changed from: private */
    public final C7399QBc JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message == null || message.length() <= 0) {
            return new C7399QBc(new QBD(), "Unknown error");
        }
        return new C7399QBc(new QBD(), message);
    }

    public void invokePlayServices(C7379QAf qAf, C13683Tez tez, Executor executor2, CancellationSignal cancellationSignal2) {
        C62320sa r1;
        AnonymousClass7TG.A1T(qAf, tez, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = tez;
        this.executor = executor2;
        try {
            PublicKeyCredentialCreationOptions convert = PublicKeyCredentialControllerUtility.Companion.convert(qAf);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
                Intent A0A = C66580MXl.A0A(this.context, HiddenActivity.class);
                A0A.putExtra(CredentialProviderBaseController.REQUEST_TAG, convert);
                generateHiddenActivityIntent(this.resultReceiver, A0A, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
                try {
                    this.context.startActivity(A0A);
                } catch (Exception unused) {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(this));
                }
            }
        } catch (JSONException e) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(this, e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        } catch (Throwable th) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(this, th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        }
    }

    public final class Companion {
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            0qQ.A0B(context, 0);
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
