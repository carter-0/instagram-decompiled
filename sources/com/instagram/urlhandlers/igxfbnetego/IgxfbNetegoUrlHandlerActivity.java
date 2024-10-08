package com.instagram.urlhandlers.igxfbnetego;

import X.0Gl;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.C273654mx;
import X.C46447Df9;
import X.C46474Dfc;
import X.C46548Dgp;
import X.DbS;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;

public final class IgxfbNetegoUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "igxfb_netego";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.igxfbnetego.IgxfbNetegoUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onBackPressed() {
        if (getSupportFragmentManager().A0M() > 1) {
            super.onBackPressed();
        } else {
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.urlhandlers.igxfbnetego.IgxfbNetegoUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1635215782);
        super.onCreate(bundle);
        if (DbX.A0A(this) == null) {
            finish();
            i = -1002842815;
        } else {
            String stringExtra = getIntent().getStringExtra("link");
            String stringExtra2 = getIntent().getStringExtra("media_id");
            String stringExtra3 = getIntent().getStringExtra("qp_id");
            UserSession A002 = 0Gl.A00(DbS.A0S(this));
            C46474Dfc A01 = C46548Dgp.A01(A002, "1807199", C273654mx.A00(3176), "igxfb_netego");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                A01.A01 = new IgxfbNetEgoCTABannerParams(stringExtra, stringExtra2, stringExtra3);
            }
            C46474Dfc.A03(DbS.A0M(this, A002), A002, C46447Df9.A02(), A01);
            i = 331382616;
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
