package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0qQ;
import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10339Rqc;
import X.C10717Rwv;
import X.C7386QAn;
import X.C7388QAq;
import X.QAo;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BeginSignInControllerUtility {
    public static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    public static final Companion Companion = new Object();
    public static final String TAG = "BeginSignInUtility";

    public final class Companion {
        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(C10339Rqc rqc, Context context) {
            C10339Rqc rqc2 = rqc;
            Context context2 = context;
            boolean A1U = AnonymousClass7TF.A1U(0, rqc2, context2);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = new BeginSignInRequest.GoogleIdTokenRequestOptions((String) null, (String) null, (String) null, (List) null, false, A1U, false);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions((String) null, (byte[]) null, false);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(false, (String) null);
            boolean z = false;
            boolean z2 = false;
            for (C10717Rwv rwv : rqc2.A00) {
                if (rwv instanceof QAo) {
                    passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(A1U);
                    if (!z) {
                        z = false;
                        if (!rwv.A04) {
                        }
                    }
                    z = true;
                } else if ((rwv instanceof C7386QAn) && !z2) {
                    boolean needsBackwardsCompatibleRequest = needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context2));
                    PublicKeyCredentialControllerUtility.Companion companion = PublicKeyCredentialControllerUtility.Companion;
                    C7386QAn qAn = (C7386QAn) rwv;
                    if (needsBackwardsCompatibleRequest) {
                        passkeysRequestOptions = companion.convertToPlayAuthPasskeyRequest(qAn);
                        AnonymousClass3Qk.A02(passkeysRequestOptions);
                    } else {
                        passkeyJsonRequestOptions = companion.convertToPlayAuthPasskeyJsonRequest(qAn);
                        AnonymousClass3Qk.A02(passkeyJsonRequestOptions);
                    }
                    z2 = true;
                }
            }
            return new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, (String) null, 0, z);
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(C7388QAq qAq) {
            throw AnonymousClass7TE.A11("getFilterByAuthorizedAccounts");
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            PackageManager packageManager = context.getPackageManager();
            0qQ.A07(packageManager);
            return (long) packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
