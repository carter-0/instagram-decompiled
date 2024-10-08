package com.instagram.urlhandlers.creatorsettings;

import X.0Gl;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dba;
import X.ESS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class CreatorSettingsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.creatorsettings.CreatorSettingsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1885806477);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -188040232;
        } else if (DbS.A0m(A0A) == null) {
            finish();
            i = -379854732;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (A0W != null) {
                C309516Yo A0B = Dba.A0B(this, 0Gl.A00(A0W));
                A0B.A0D(new ESS());
                A0B.A04();
                i = -1909773088;
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A07(904589070, A002);
                throw A0y;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
