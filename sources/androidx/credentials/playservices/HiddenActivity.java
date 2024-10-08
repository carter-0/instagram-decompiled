package androidx.credentials.playservices;

import X.0qQ;
import X.0sP;
import X.AnonymousClass3Qk;
import X.AnonymousClass63E;
import X.AnonymousClass63L;
import X.AnonymousClass63P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9GD;
import X.AnonymousClass9GH;
import X.C10137RnE;
import X.C8363QpL;
import X.Pxf;
import X.QpQ;
import X.QpS;
import X.RKT;
import X.SFC;
import X.SHO;
import X.Sx0;
import X.SxM;
import X.SxP;
import X.SxQ;
import X.SxR;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class HiddenActivity extends Activity {
    public static final Companion Companion = new Object();
    public static final int DEFAULT_VALUE = 1;
    public static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    public static final String TAG = "HiddenActivity";
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    public static final void handleBeginSignIn$lambda$10$lambda$8(0sP r1, Object obj) {
        0qQ.A0B(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$14$lambda$12(0sP r1, Object obj) {
        0qQ.A0B(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(0sP r1, Object obj) {
        0qQ.A0B(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$4(0sP r1, Object obj) {
        0qQ.A0B(r1, 0);
        r1.invoke(obj);
    }

    public void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Sx0] */
    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (beginSignInRequest != null) {
            QpS qpS = new QpS((Activity) this, (Sx0) new Object());
            new BeginSignInRequest.GoogleIdTokenRequestOptions((String) null, (String) null, (String) null, (List) null, false, true, false);
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.A01;
            AnonymousClass3Qk.A02(googleIdTokenRequestOptions);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.A04;
            AnonymousClass3Qk.A02(passwordRequestOptions);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.A03;
            AnonymousClass3Qk.A02(passkeysRequestOptions);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.A02;
            AnonymousClass3Qk.A02(passkeyJsonRequestOptions);
            boolean z = beginSignInRequest.A06;
            int i = beginSignInRequest.A00;
            BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, qpS.A00, i, z);
            SHO A00 = SFC.A00();
            A00.A03 = new Feature[]{C10137RnE.A00};
            A00.A01 = new SxQ(beginSignInRequest2, qpS);
            A00.A02 = false;
            AnonymousClass9GD A002 = SHO.A00(qpS, A00, 1553, 0);
            A002.A04(new HiddenActivity$$ExternalSyntheticLambda4(new HiddenActivity$handleBeginSignIn$1$1(this, intExtra)), AnonymousClass9GH.A00);
            A002.A09(new HiddenActivity$$ExternalSyntheticLambda5(this));
            return;
        }
        finish();
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AnonymousClass7TG.A1N(hiddenActivity, exc);
        if (!(exc instanceof RKT) || !Pxf.A1U(CredentialProviderBaseController.retryables, ((RKT) exc).A00.A00)) {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        } else {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        0qQ.A0A(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, AnonymousClass7TF.A0m("During begin sign in, failure response from one tap: ", exc));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Swz] */
    private final void handleCreatePassword() {
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (savePasswordRequest != null) {
            QpQ qpQ = new QpQ(this, new Object());
            SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.A01, qpQ.A00, savePasswordRequest.A00);
            SHO A00 = SFC.A00();
            A00.A03 = new Feature[]{C10137RnE.A04};
            A00.A01 = new SxP(savePasswordRequest2, qpQ);
            A00.A02 = false;
            AnonymousClass9GD A002 = SHO.A00(qpQ, A00, 1536, 0);
            A002.A04(new HiddenActivity$$ExternalSyntheticLambda6(new HiddenActivity$handleCreatePassword$1$1(this, intExtra)), AnonymousClass9GH.A00);
            A002.A09(new HiddenActivity$$ExternalSyntheticLambda7(this));
            return;
        }
        finish();
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AnonymousClass7TG.A1N(hiddenActivity, exc);
        if (!(exc instanceof RKT) || !Pxf.A1U(CredentialProviderBaseController.retryables, ((RKT) exc).A00.A00)) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        0qQ.A0A(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, AnonymousClass7TF.A0m("During save password, found password failure response from one tap ", exc));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.63P, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.QpL, X.63E] */
    private final void handleCreatePublicKeyCredential() {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (publicKeyCredentialCreationOptions != null) {
            ? r2 = new AnonymousClass63E((Activity) this, (AnonymousClass63L) AnonymousClass63L.A00, C8363QpL.A00, (AnonymousClass63P) new Object());
            SHO A00 = SFC.A00();
            A00.A01 = new SxM(r2, publicKeyCredentialCreationOptions);
            A00.A00 = 5407;
            AnonymousClass9GD A002 = AnonymousClass63E.A00(r2, A00.A01(), 0);
            A002.A04(new HiddenActivity$$ExternalSyntheticLambda0(new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra)), AnonymousClass9GH.A00);
            A002.A09(new HiddenActivity$$ExternalSyntheticLambda1(this));
            return;
        }
        Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
        finish();
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AnonymousClass7TG.A1N(hiddenActivity, exc);
        if (!(exc instanceof RKT) || !Pxf.A1U(CredentialProviderBaseController.retryables, ((RKT) exc).A00.A00)) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        0qQ.A0A(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, AnonymousClass7TF.A0m("During create public key credential, fido registration failure: ", exc));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Sx0] */
    private final void handleGetSignInIntent() {
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (getSignInIntentRequest != null) {
            QpS qpS = new QpS((Activity) this, (Sx0) new Object());
            String str = getSignInIntentRequest.A01;
            AnonymousClass3Qk.A02(str);
            String str2 = getSignInIntentRequest.A04;
            String str3 = getSignInIntentRequest.A02;
            boolean z = getSignInIntentRequest.A05;
            GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(str, str3, qpS.A00, str2, getSignInIntentRequest.A00, z);
            SHO A00 = SFC.A00();
            A00.A03 = new Feature[]{C10137RnE.A05};
            A00.A01 = new SxR(getSignInIntentRequest2, qpS);
            AnonymousClass9GD A002 = SHO.A00(qpS, A00, 1555, 0);
            A002.A04(new HiddenActivity$$ExternalSyntheticLambda2(new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra)), AnonymousClass9GH.A00);
            A002.A09(new HiddenActivity$$ExternalSyntheticLambda3(this));
            return;
        }
        finish();
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AnonymousClass7TG.A1N(hiddenActivity, exc);
        if (!(exc instanceof RKT) || !Pxf.A1U(CredentialProviderBaseController.retryables, ((RKT) exc).A00.A00)) {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        } else {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        0qQ.A0A(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, AnonymousClass7TF.A0m("During get sign-in intent, failure response from one tap: ", exc));
    }

    /* access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver2, String str, String str2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        A0a.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        A0a.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver2.send(Integer.MAX_VALUE, A0a);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        A0a.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
        A0a.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver2 = this.resultReceiver;
        if (resultReceiver2 != null) {
            resultReceiver2.send(i2, A0a);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = 836628341(0x31ddef75, float:6.4591696E-9)
            int r2 = X.Pxf.A02(r4, r0)
            super.onCreate(r5)
            r0 = 0
            r4.overridePendingTransition(r0, r0)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "TYPE"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "RESULT_RECEIVER"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r4.resultReceiver = r0
            if (r0 != 0) goto L_0x002b
            r4.finish()
        L_0x002b:
            r4.restoreState(r5)
            boolean r0 = r4.mWaitingForActivityResult
            if (r0 == 0) goto L_0x0039
            r0 = -2040202793(0xffffffff8664f9d7, float:-4.3065587E-35)
        L_0x0035:
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x0039:
            if (r3 == 0) goto L_0x0042
            int r0 = r3.hashCode()
            switch(r0) {
                case -441061071: goto L_0x0074;
                case 15545322: goto L_0x0068;
                case 1246634622: goto L_0x005c;
                case 1980564212: goto L_0x0050;
                default: goto L_0x0042;
            }
        L_0x0042:
            java.lang.String r1 = "HiddenActivity"
            java.lang.String r0 = "Activity handed an unsupported type"
            android.util.Log.w(r1, r0)
            r4.finish()
        L_0x004c:
            r0 = 1144566155(0x4438b18b, float:738.7741)
            goto L_0x0035
        L_0x0050:
            java.lang.String r0 = "SIGN_IN_INTENT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0042
            r4.handleGetSignInIntent()
            goto L_0x004c
        L_0x005c:
            java.lang.String r0 = "CREATE_PASSWORD"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0042
            r4.handleCreatePassword()
            goto L_0x004c
        L_0x0068:
            java.lang.String r0 = "CREATE_PUBLIC_KEY_CREDENTIAL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0042
            r4.handleCreatePublicKeyCredential()
            goto L_0x004c
        L_0x0074:
            java.lang.String r0 = "BEGIN_SIGN_IN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0042
            r4.handleBeginSignIn()
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.HiddenActivity.onCreate(android.os.Bundle):void");
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
