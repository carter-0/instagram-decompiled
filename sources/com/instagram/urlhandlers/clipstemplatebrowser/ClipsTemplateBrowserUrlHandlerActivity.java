package com.instagram.urlhandlers.clipstemplatebrowser;

import X.09i;
import X.293;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C55253Hei;
import X.C71172bH;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class ClipsTemplateBrowserUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity, com.instagram.urlhandlers.clipstemplatebrowser.ClipsTemplateBrowserUrlHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-1039299021);
        super.onCreate(bundle);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 293.A03);
        UserSession A05 = 09i.A0A.A05(this);
        DbS.A1Z(A05);
        C55253Hei.A00(this, getApplicationContext(), A0a, A05);
        if (C71172bH.A00() != null) {
            finish();
        }
        AnonymousClass0fD.A07(1954609503, A00);
    }

    public final AnonymousClass0wW getSession() {
        return 09i.A0A.A05(this);
    }
}
