package androidx.credentials.playservices.controllers.CreatePassword;

import X.002;
import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10142RnJ;
import X.C13683Tez;
import X.C60340gF;
import X.C66580MXl;
import X.C7380QAg;
import X.QAi;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CredentialProviderCreatePasswordController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePassword";
    public C13683Tez callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePasswordController$resultReceiver$1(this, AnonymousClass7TF.A0D());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController(Context context2) {
        super(context2);
        0qQ.A0B(context2, 1);
        this.context = context2;
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context2) {
        0qQ.A0B(context2, 0);
        return new CredentialProviderCreatePasswordController(context2);
    }

    public SavePasswordRequest convertRequestToPlayServices(C7380QAg qAg) {
        0qQ.A0B(qAg, 0);
        return new SavePasswordRequest(new SignInPassword(qAg.A00, qAg.A01), (String) null, 0);
    }

    public C10142RnJ convertResponseToCredentialManager(C60340gF r2) {
        return new QAi();
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, 002.A02(i3, i, "Returned request code ", " which does not match what was given "));
            return;
        }
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, new QAi()));
        }
    }

    public void invokePlayServices(C7380QAg qAg, C13683Tez tez, Executor executor2, CancellationSignal cancellationSignal2) {
        AnonymousClass7TG.A1T(qAg, tez, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = tez;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            SavePasswordRequest convertRequestToPlayServices = convertRequestToPlayServices(qAg);
            Intent A0A = C66580MXl.A0A(this.context, HiddenActivity.class);
            A0A.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, A0A, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
            try {
                this.context.startActivity(A0A);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderCreatePasswordController$invokePlayServices$1(this));
            }
        }
    }

    public final class Companion {
        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            0qQ.A0B(context, 0);
            return new CredentialProviderCreatePasswordController(context);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* bridge */ /* synthetic */ Object convertResponseToCredentialManager(Object obj) {
        return new QAi();
    }
}
