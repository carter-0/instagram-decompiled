package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fj1  reason: case insensitive filesystem */
public final class C50821Fj1 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        C309516Yo A0M = DbS.A0M(requireActivity, userSession);
        A0M.A0D(DbW.A0X().A00(userSession, queryParameter));
        A0M.A04();
    }

    public C50821Fj1(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
