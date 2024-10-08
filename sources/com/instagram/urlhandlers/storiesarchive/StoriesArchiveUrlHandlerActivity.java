package com.instagram.urlhandlers.storiesarchive;

import X.00y;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C71495Olk;
import X.DbS;
import X.DbT;
import X.Dba;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class StoriesArchiveUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, android.app.Activity, com.instagram.urlhandlers.storiesarchive.StoriesArchiveUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        int i;
        Integer A0l;
        AnonymousClass7TG.A1O(userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m == null) {
            finish();
            return;
        }
        getSupportFragmentManager().A0s(new C71495Olk(this, 4));
        Uri A09 = DbT.A09(A0m);
        String queryParameter = A09.getQueryParameter("reel_id");
        String queryParameter2 = A09.getQueryParameter("reel_index");
        if (queryParameter2 == null || (A0l = 00y.A0l(queryParameter2)) == null) {
            i = 0;
        } else {
            i = A0l.intValue();
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("deeplink_reel_id", queryParameter);
        A0a.putInt("deeplink_reel_position", i);
        Dba.A0w(A0a, new ArchiveHomeFragment(), DbS.A0M(this, userSession));
    }
}
