package com.instagram.direct.avatar.socialstickers.ui;

import X.AnonymousClass0eM;
import X.AnonymousClass1YB;
import X.C309516Yo;
import X.DbX;
import X.ES9;
import X.MMO;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class AvatarOptionsActivity extends BaseFragmentActivity {
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new MMO(this, 20));

    public final void A0j(Bundle bundle) {
        ES9 es9 = new ES9();
        C309516Yo A0N = DbX.A0N(this, this.A00);
        A0N.A0F = true;
        A0N.A0D(es9);
        A0N.A04();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.app.Activity, com.instagram.direct.avatar.socialstickers.ui.AvatarOptionsActivity] */
    public final void onBackPressed() {
        finish();
    }
}
