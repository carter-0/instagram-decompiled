package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.login.LoginClient$Request;
import com.instagram.android.R;
import java.math.BigInteger;
import java.util.Random;

/* renamed from: X.QBx  reason: case insensitive filesystem */
public final class C7413QBx extends AnonymousClass4DI {
    public LoginClient$Request A00;
    public String A01;
    public SP4 A02;
    public String A03;
    public String A04;

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("Request", this.A02.A01);
        bundle.putInt("HandlerIndex", this.A02.A00);
        bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, this.A04);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C13710TfX tfX;
        C7413QBx.super.onActivityResult(i, i2, intent);
        SP4 sp4 = this.A02;
        int i3 = sp4.A00;
        C13710TfX[] tfXArr = sp4.A04;
        if (i3 < tfXArr.length && (tfX = tfXArr[i3]) != null) {
            tfX.Ctj(intent, i, i2);
        }
    }

    public final void onCreate(Bundle bundle) {
        String bigInteger;
        int A022 = AnonymousClass0fD.A02(1782361083);
        C7413QBx.super.onCreate(bundle);
        this.A03 = requireActivity().getCallingPackage();
        LoginClient$Request loginClient$Request = (LoginClient$Request) DbU.A06(requireActivity()).getParcelable("Request");
        this.A00 = loginClient$Request;
        int i = -1;
        if (bundle != null) {
            i = bundle.getInt("HandlerIndex", -1);
            loginClient$Request = (LoginClient$Request) bundle.getParcelable("Request");
            bigInteger = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE);
        } else {
            bigInteger = new BigInteger(100, new Random()).toString(32);
        }
        this.A04 = bigInteger;
        this.A02 = new SP4(this, loginClient$Request, bigInteger, i);
        this.A01 = loginClient$Request.A05;
        AnonymousClass0fD.A09(147861859, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1612693680);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.com_facebook_login_fragment);
        AnonymousClass0fD.A09(317660332, A022);
        return A0C;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(583866848);
        C7413QBx.super.onPause();
        requireActivity().findViewById(R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
        AnonymousClass0fD.A09(1736606090, A022);
    }

    public final void onResume() {
        int i;
        int A022 = AnonymousClass0fD.A02(832481579);
        C7413QBx.super.onResume();
        if (this.A03 == null) {
            Log.e("LoginFragment", "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            DbT.A1K(this);
            i = -1425557433;
        } else {
            SP4 sp4 = this.A02;
            if (sp4.A00 == -1) {
                sp4.A02();
            }
            i = -1297547174;
        }
        AnonymousClass0fD.A09(i, A022);
    }
}
