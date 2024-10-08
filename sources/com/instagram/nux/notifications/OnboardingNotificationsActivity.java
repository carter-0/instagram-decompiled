package com.instagram.nux.notifications;

import X.09i;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C47453E2z;
import X.C51950G8t;
import X.DbT;
import X.DbW;
import X.DbY;
import X.Dba;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class OnboardingNotificationsActivity extends BaseFragmentActivity implements C51950G8t {
    public UserSession A00;
    public String A01;

    public final void ATY() {
    }

    public final boolean CTj() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.nux.notifications.OnboardingNotificationsActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        Intent intent = getIntent();
        String str = null;
        if (intent != null) {
            bundle2 = intent.getExtras();
        } else {
            bundle2 = null;
        }
        this.A00 = 09i.A0A.A07(bundle2);
        if (bundle2 != null) {
            str = bundle2.getString("extra_exit_url_host");
        }
        this.A01 = str;
        C309516Yo A0J = DbY.A0J(this, this.A00);
        Intent intent2 = getIntent();
        if (intent2 == null || (bundle3 = intent2.getExtras()) == null) {
            bundle3 = AnonymousClass7TE.A0a();
        }
        DbW.A0y(bundle3, new C47453E2z(), A0J);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.nux.notifications.OnboardingNotificationsActivity, android.content.Context] */
    public final void Cm0(int i) {
        Intent A03 = DbT.A0e().A03(this, 0);
        Uri.Builder scheme = new Uri.Builder().scheme("instagram");
        String str = this.A01;
        if (str == null) {
            str = "mainfeed";
        }
        Dba.A0o(this, A03, scheme.authority(str));
    }
}
