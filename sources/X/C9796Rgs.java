package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookActivity;
import com.facebook.login.LoginClient$Request;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.Rgs  reason: case insensitive filesystem */
public abstract class C9796Rgs {
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        ? r5;
        Bundle bundle;
        C277014uI A0P = DbW.A0P(r9, 0);
        FragmentActivity A04 = C308206Td.A04(r8);
        if ((A04 instanceof BaseFragmentActivity) && (r5 = (IgFragmentActivity) A04) != 0) {
            UserSession A0B = C308206Td.A0B(r8);
            WO6 wo6 = new WO6(0, r8, A0P);
            0qQ.A0B(A0B, 1);
            try {
                r5.registerOnActivityResultListener(new T73(4, new C10287Rpl(wo6), A0B, r5));
                if (!A0B.hasEnded()) {
                    Intent intent = r5.getIntent();
                    if (intent == null || (bundle = intent.getExtras()) == null) {
                        bundle = AnonymousClass7TE.A0a();
                    }
                    String string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
                    if (string == null || string.length() == 0) {
                        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", A0B.A05);
                    }
                    Intent intent2 = r5.getIntent();
                    if (intent2 != null) {
                        intent2.putExtras(bundle);
                    }
                    HashSet A12 = C66580MXl.A12(EW3.A06.A00);
                    LoginClient$Request loginClient$Request = new LoginClient$Request(AnonymousClass1KO.A02, AnonymousClass7TF.A0b(), A0B.A06, A12);
                    loginClient$Request.A02 = false;
                    loginClient$Request.A01 = "pro2pro_promote_legacy_auth";
                    loginClient$Request.A00 = C8894REl.PROMOTE_PRO2PRO;
                    Intent A09 = DbS.A09();
                    A09.setClass(AnonymousClass1KO.A00, FacebookActivity.class);
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putParcelable("Request", loginClient$Request);
                    A09.putExtras(A0a);
                    try {
                        if (0kR.A07(r5, A09, 64206)) {
                            return null;
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                    throw new RuntimeException("Log in attempt failed: LoginActivity could not be started");
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
