package com.instagram.business.activity;

import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass32G;
import X.C20606Wvn;
import X.DbU;
import X.Dbc;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class FbConnectPageActivity extends BaseFragmentActivity {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new C20606Wvn(this, 13));
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C20606Wvn(this, 14));

    public final void A0j(Bundle bundle) {
        DbU.A0v();
        Bundle bundle2 = (Bundle) this.A00.getValue();
        0qQ.A0B(bundle2, 0);
        AnonymousClass32G r1 = new AnonymousClass32G();
        r1.setArguments(bundle2);
        Dbc.A0S(r1, this, this.A01);
    }
}
