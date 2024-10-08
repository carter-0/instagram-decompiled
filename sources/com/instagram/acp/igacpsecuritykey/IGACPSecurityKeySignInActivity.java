package com.instagram.acp.igacpsecuritykey;

import X.00Y;
import X.0KC;
import X.0qQ;
import X.11S;
import X.AnonymousClass0fD;
import X.AnonymousClass63E;
import X.AnonymousClass63L;
import X.AnonymousClass63P;
import X.AnonymousClass7TE;
import X.AnonymousClass9GD;
import X.AnonymousClass9GH;
import X.C11032S6k;
import X.C11536Sbx;
import X.C66308MMr;
import X.C66582MXn;
import X.C8363QpL;
import X.DbS;
import X.Pxf;
import X.Pxi;
import X.SFC;
import X.SHO;
import X.SxN;
import X.Sz5;
import X.SzH;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class IGACPSecurityKeySignInActivity extends IgFragmentActivity {
    public final 00Y A00 = registerForActivityResult(new Object(), new C11536Sbx(this, 6));
    public final String A01 = "IGACPSecurityKeySignInActivity";

    public static final JSONObject A00(AuthenticatorAssertionResponse authenticatorAssertionResponse) {
        String str;
        String A02 = C11032S6k.A01.A02(authenticatorAssertionResponse.A01.A03());
        String encodeToString = Base64.encodeToString(authenticatorAssertionResponse.A02.A03(), 2);
        String encodeToString2 = Base64.encodeToString(authenticatorAssertionResponse.A03.A03(), 2);
        byte[] A1b = Pxi.A1b(authenticatorAssertionResponse.A04);
        JSONObject A11 = DbS.A11();
        A11.put("authenticator_data", encodeToString);
        A11.put("client_data_json", A02);
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, encodeToString2);
        if (A1b == null || (str = A1b.toString()) == null) {
            str = "";
        }
        A11.put("user_handle", str);
        String A022 = C11032S6k.A02.A02(authenticatorAssertionResponse.A00.A03());
        0qQ.A0A(A022);
        String A0d = Pxf.A0d(new 11S("/").A00(A022, "_"), "=", "");
        JSONObject A112 = DbS.A11();
        A112.put("credential_id", A0d);
        A112.put("raw_id", A0d);
        A112.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "public-key");
        A112.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A11);
        return A112;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity, android.app.Activity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity r2, java.lang.Integer r3, java.lang.String r4) {
        /*
            android.content.Intent r1 = X.DbS.A09()
            r0 = 0
            r2.setResult(r0, r1)
            java.lang.String r0 = "extra_result_error_code"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "extra_result_error_message"
            r1.putExtra(r0, r4)
            r2.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity.A01(com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity, android.app.Activity] */
    public final void onBackPressed() {
        setResult(0, DbS.A09());
        finish();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.63P, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.QpL, X.63E] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-778430842);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("extra_challenge");
        String stringExtra2 = intent.getStringExtra("extra_rpid");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_allow_credentials");
        if (stringExtra == null || stringExtra2 == null || stringArrayListExtra == null) {
            0KC.A0C(this.A01, "Unable to create the PublicKeyCredentialRequestOptions missing parameters");
            A01(this, (Integer) null, "Unable to create the PublicKeyCredentialRequestOptions missing parameters");
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (A18.length() != 0) {
                    Parcelable.Creator creator = PublicKeyCredentialDescriptor.CREATOR;
                    A1C.add(new PublicKeyCredentialDescriptor(PublicKeyCredentialType.A01.toString(), (List) null, Base64.decode(A18, 10)));
                }
            }
            if (A1C.isEmpty() || stringExtra2.length() == 0 || stringExtra.length() == 0) {
                0KC.A0C(this.A01, "Unable to create the PublicKeyCredentialRequestOptions empty parameters");
                A01(this, (Integer) null, "Unable to create the PublicKeyCredentialRequestOptions empty parameters");
            } else {
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = new PublicKeyCredentialRequestOptions((ResultReceiver) null, (AuthenticationExtensions) null, (TokenBinding) null, (Double) null, (Integer) null, (Long) null, stringExtra2, (String) null, (String) null, A1C, C66582MXn.A1a(stringExtra));
                ? r2 = new AnonymousClass63E((Activity) this, (AnonymousClass63L) AnonymousClass63L.A00, C8363QpL.A00, (AnonymousClass63P) new Object());
                SHO A003 = SFC.A00();
                A003.A01 = new SxN(r2, publicKeyCredentialRequestOptions);
                A003.A00 = 5408;
                AnonymousClass9GD A004 = AnonymousClass63E.A00(r2, A003.A01(), 0);
                Sz5 sz5 = new Sz5(this, 1);
                Executor executor = AnonymousClass9GH.A00;
                A004.A0A(sz5, executor);
                A004.A04(new SzH(3, new C66308MMr(this, 14)), executor);
            }
        }
        AnonymousClass0fD.A07(205975473, A002);
    }
}
