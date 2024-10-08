package androidx.credentials.playservices;

import X.0qQ;
import X.0sP;
import X.AnonymousClass3Qk;
import X.AnonymousClass63S;
import X.AnonymousClass63T;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass9GD;
import X.AnonymousClass9GH;
import X.C10137RnE;
import X.C10339Rqc;
import X.C10648Rvh;
import X.C13683Tez;
import X.C13762Tga;
import X.C51974G9v;
import X.C62320sa;
import X.C7379QAf;
import X.C7380QAg;
import X.Pxg;
import X.QpS;
import X.RLF;
import X.RLG;
import X.SFC;
import X.SHO;
import X.Sx0;
import X.SxK;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CredentialProviderPlayServicesImpl implements C13762Tga {
    public static final Companion Companion = new Object();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final String TAG = "PlayServicesImpl";
    public final Context context;
    public GoogleApiAvailability googleApiAvailability;

    public final class Companion {
        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, C62320sa r3) {
            0qQ.A0B(r3, 1);
            if (!cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C10339Rqc rqc) {
            0qQ.A0B(rqc, 0);
            Iterator it = rqc.A00.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return false;
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
                return false;
            }
            return true;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(Context context2) {
        0qQ.A0B(context2, 1);
        this.context = context2;
        GoogleApiAvailability googleApiAvailability2 = GoogleApiAvailability.A00;
        0qQ.A07(googleApiAvailability2);
        this.googleApiAvailability = googleApiAvailability2;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public static final void onClearCredential$lambda$0(0sP r1, Object obj) {
        0qQ.A0B(r1, 0);
        r1.invoke(obj);
    }

    public /* synthetic */ void onGetCredential(Context context2, RLG rlg, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
    }

    public /* synthetic */ void onPrepareCredential(C10339Rqc rqc, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability2) {
        0qQ.A0B(googleApiAvailability2, 0);
        this.googleApiAvailability = googleApiAvailability2;
    }

    private final int isGooglePlayServicesAvailable(Context context2) {
        return this.googleApiAvailability.A03(context2, MIN_GMS_APK_VERSION);
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        Log.w(TAG, AnonymousClass7TG.A0m(new ConnectionResult(isGooglePlayServicesAvailable), "Connection with Google Play Services was not successful. Connection result is: ", AnonymousClass7TE.A1A()));
        return false;
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez, Exception exc) {
        C51974G9v.A1M(executor, tez, exc);
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, tez));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Sx0] */
    public void onClearCredential(RLF rlf, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
        AnonymousClass7TG.A1Q(executor, tez);
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            Context context2 = this.context;
            AnonymousClass3Qk.A02(context2);
            QpS qpS = new QpS(context2, (Sx0) new Object());
            Pxg.A1C(qpS.A01.getSharedPreferences("com.google.android.gms.signin", 0));
            Set<AnonymousClass63S> set = AnonymousClass63S.A00;
            synchronized (set) {
            }
            for (AnonymousClass63S A0A : set) {
                A0A.A0A();
            }
            AnonymousClass63T.A03();
            SHO A00 = SFC.A00();
            A00.A03 = new Feature[]{C10137RnE.A01};
            A00.A01 = new SxK(qpS);
            A00.A02 = false;
            AnonymousClass9GD A002 = SHO.A00(qpS, A00, 1554, 1);
            A002.A04(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(new CredentialProviderPlayServicesImpl$onClearCredential$1(cancellationSignal, executor, tez)), AnonymousClass9GH.A00);
            A002.A09(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1(this, cancellationSignal, executor, tez));
        }
    }

    public void onCreateCredential(Context context2, C10648Rvh rvh, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
        C51974G9v.A1K(context2, rvh, executor);
        0qQ.A0B(tez, 4);
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (rvh instanceof C7380QAg) {
            new CredentialProviderCreatePasswordController(context2).invokePlayServices((C7380QAg) rvh, tez, executor, cancellationSignal);
        } else if (rvh instanceof C7379QAf) {
            new CredentialProviderCreatePublicKeyCredentialController(context2).invokePlayServices((C7379QAf) rvh, tez, executor, cancellationSignal);
        } else {
            throw AnonymousClass7TE.A1B("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    public void onGetCredential(Context context2, C10339Rqc rqc, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
        C51974G9v.A1K(context2, rqc, executor);
        0qQ.A0B(tez, 4);
        Companion companion = Companion;
        if (!companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            companion.isGetSignInIntentRequest$credentials_play_services_auth_release(rqc);
            new CredentialProviderBeginSignInController(context2).invokePlayServices(rqc, tez, executor, cancellationSignal);
        }
    }
}
