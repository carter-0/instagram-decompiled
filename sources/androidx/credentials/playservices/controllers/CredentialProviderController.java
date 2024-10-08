package androidx.credentials.playservices.controllers;

import X.002;
import X.0qQ;
import X.0rm;
import X.0sL;
import X.0sP;
import X.AnonymousClass7TF;
import X.C13683Tez;
import X.C51965G9l;
import X.C62320sa;
import X.C8987RKd;
import X.C8988RKe;
import X.DbZ;
import X.QB8;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CredentialProviderController extends CredentialProviderBaseController {
    public static final Companion Companion = new Object();
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    public final Context context;

    public final class Companion {
        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, C62320sa r3) {
            0qQ.A0B(r3, 1);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final boolean maybeReportErrorResultCodeCreate(int i, 0sL r7, 0sP r8, CancellationSignal cancellationSignal) {
            AnonymousClass7TF.A1B(r7, 1, r8);
            if (i == -1) {
                return false;
            }
            0rm A11 = C51965G9l.A11();
            A11.A00 = new C8987RKd("android.credentials.CreateCredentialException.TYPE_UNKNOWN", 002.A0c("activity with result code: ", " indicating not RESULT_OK", i));
            if (i == 0) {
                A11.A00 = new C8987RKd("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", "activity is cancelled by the user.");
            }
            r7.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(r8, A11));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int i, 0sL r7, 0sP r8, CancellationSignal cancellationSignal) {
            AnonymousClass7TF.A1B(r7, 1, r8);
            if (i == -1) {
                return false;
            }
            0rm A11 = C51965G9l.A11();
            A11.A00 = QB8.A00(002.A0c("activity with result code: ", " indicating not RESULT_OK", i));
            if (i == 0) {
                A11.A00 = new C8988RKe("android.credentials.GetCredentialException.TYPE_USER_CANCELED", "activity is cancelled by the user.");
            }
            r7.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(r8, A11));
            return true;
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            return 002.A0c("activity with result code: ", " indicating not RESULT_OK", i);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context2) {
        super(context2);
        0qQ.A0B(context2, 1);
        this.context = context2;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, C62320sa r2) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, r2);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, 0sL r2, 0sP r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, r2, r3, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, 0sL r2, 0sP r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, r2, r3, cancellationSignal);
    }

    public abstract Object convertRequestToPlayServices(Object obj);

    public abstract Object convertResponseToCredentialManager(Object obj);

    public abstract void invokePlayServices(Object obj, C13683Tez tez, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, 0sL r5, Executor executor, C13683Tez tez, CancellationSignal cancellationSignal) {
        0qQ.A0B(bundle, 0);
        DbZ.A0t(1, r5, executor, tez);
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, tez, r5.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
