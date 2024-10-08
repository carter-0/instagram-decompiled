package com.instagram.urlhandlers.igredirect;

import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass6W8;
import X.DbS;
import X.DbY;
import X.Pxd;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.ModalActivity;

public final class IGRedirectHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "ig_redirect_url_handler_activity";
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.igredirect.IGRedirectHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(975137088);
        super.onCreate(bundle);
        AnonymousClass6W8 A0b = DbS.A0b(this, DbY.A0B(Pxd.A00(850), true), DbS.A0S(this), ModalActivity.class, "open_trustly_lightbox");
        A0b.A0E = true;
        A0b.A09 = true;
        A0b.A0C(this);
        finish();
        AnonymousClass0fD.A07(458957037, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
