package com.instagram.wellbeing.limitedprofile.activity;

import X.0s1;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass3M3;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.C49891FBs;
import X.C66588MXu;
import X.DbS;
import X.DbW;
import X.Dbb;
import X.Dbc;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

public final class LimitedInteractionsReminderActivity extends BaseFragmentActivity {
    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.wellbeing.limitedprofile.activity.LimitedInteractionsReminderActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        if (getSupportFragmentManager().A0P(R.id.layout_container_main) == null) {
            C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(557), Dbb.A0e("entryPoint", "reminder", AnonymousClass7TE.A1L("step", "3")));
            IgBloksScreenConfig A0N = DbS.A0N(Dbc.A07(this));
            DbS.A18(this, A0N, 2131965056);
            AnonymousClass3M3 A02 = C49891FBs.A02(A0N, A04);
            0s1 A0D = DbW.A0D(this);
            A0D.A0A(A02, R.id.layout_container_main);
            A0D.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.wellbeing.limitedprofile.activity.LimitedInteractionsReminderActivity, android.app.Activity] */
    public final void finish() {
        LimitedInteractionsReminderActivity.super.finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.wellbeing.limitedprofile.activity.LimitedInteractionsReminderActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-1174875921);
        super.onCreate(C66588MXu.A00(bundle));
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
        AnonymousClass0fD.A07(804179451, A00);
    }
}
