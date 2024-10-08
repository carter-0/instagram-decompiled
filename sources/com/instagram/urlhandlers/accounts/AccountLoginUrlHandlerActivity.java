package com.instagram.urlhandlers.accounts;

import X.0Tu;
import X.0eO;
import X.0kR;
import X.182;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C20698WxU;
import X.C66588MXu;
import X.DbS;
import X.DbT;
import X.DbX;
import X.SCN;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class AccountLoginUrlHandlerActivity extends BaseFragmentActivity {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new C20698WxU((Object) this, 44));

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.accounts.AccountLoginUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A002 = AnonymousClass0fD.A00(-398088457);
        super.onCreate(C66588MXu.A00(bundle));
        Bundle A0A = DbX.A0A(this);
        if (!(A0A == null || (A0m = DbS.A0m(A0A)) == null || !DbT.A1Z(this))) {
            if (!182.A06(0Tu.A05, getSession(), 36318621412956487L) && SCN.A00(this, DbT.A09(A0m), getSession())) {
                finishAffinity();
                i = 84587491;
                AnonymousClass0fD.A07(i, A002);
            }
        }
        0kR.A0B(this, DbT.A0e().A03(this, 268566528));
        finish();
        i = 1072558707;
        AnonymousClass0fD.A07(i, A002);
    }
}
