package com.instagram.urlhandler;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C66588MXu;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public class ReelExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandler.ReelExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-2058561425);
        super.onCreate(C66588MXu.A00(bundle));
        Bundle A0A = DbX.A0A(this);
        A0A.getClass();
        this.A00 = DbT.A0W(A0A);
        String A0m = DbS.A0m(A0A);
        if (A0m == null) {
            finish();
            i = -644339325;
        } else {
            if (A0m.indexOf("applink") != -1) {
                A0m = A0m.replace("applink", "www");
            }
            A0A.putString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL", A0m);
            UserSession userSession = this.A00;
            if (userSession == null || !(userSession instanceof UserSession)) {
                FFQ.A00().A00(this, A0A, this.A00);
            } else {
                IgFragmentFactoryImpl.A00();
                ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = new ShortUrlReelLoadingFragment();
                DbU.A1D(A0A, userSession);
                shortUrlReelLoadingFragment.setArguments(A0A);
                Dbb.A13(shortUrlReelLoadingFragment, this, userSession);
            }
            i = -84694532;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
