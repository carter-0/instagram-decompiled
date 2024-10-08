package com.instagram.urlhandlers.contactimportsettingsexternal;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.ES5;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class ContactImportSettingsExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.contactimportsettingsexternal.ContactImportSettingsExternalUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.contactimportsettingsexternal.ContactImportSettingsExternalUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-1707017256);
        super.onCreate(bundle);
        if (DbT.A1Z(this)) {
            C309516Yo A0M = DbS.A0M(this, getSession());
            IgFragmentFactoryImpl.A00();
            A0M.A0D(new ES5());
            DbV.A1O(A0M);
        } else {
            FFQ.A03(bundle, this);
            finish();
        }
        AnonymousClass0fD.A07(-1949387489, A00);
    }
}
