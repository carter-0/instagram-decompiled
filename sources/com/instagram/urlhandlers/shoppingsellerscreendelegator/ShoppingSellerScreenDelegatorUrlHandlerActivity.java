package com.instagram.urlhandlers.shoppingsellerscreendelegator;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TF;
import X.C249713kF;
import X.DbT;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class ShoppingSellerScreenDelegatorUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.shoppingsellerscreendelegator.ShoppingSellerScreenDelegatorUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int i;
        int A002 = AnonymousClass0fD.A00(844483552);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            this.A00 = DbT.A0W(A0A);
        }
        UserSession userSession2 = this.A00;
        if (userSession2 == null) {
            finish();
            i = 160883904;
        } else {
            if (userSession2 instanceof UserSession) {
                userSession = userSession2;
            } else {
                userSession = null;
            }
            String stringExtra = intent.getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            String stringExtra2 = intent.getStringExtra("screen");
            if (userSession != null) {
                C249713kF.A00.A1B(this, userSession, stringExtra2, stringExtra, AnonymousClass7TF.A0b());
            }
            i = 1243415072;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
