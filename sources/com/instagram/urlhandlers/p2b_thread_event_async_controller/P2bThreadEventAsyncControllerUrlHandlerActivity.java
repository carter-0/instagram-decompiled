package com.instagram.urlhandlers.p2b_thread_event_async_controller;

import X.1ES;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C250863mB;
import X.C250873mC;
import X.C255453u9;
import X.C258613zM;
import X.C359608dC;
import X.C359988do;
import X.C360678ey;
import X.C68499NKs;
import X.DbS;
import X.DbT;
import X.DbX;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import java.net.URLDecoder;
import java.util.HashMap;

public final class P2bThreadEventAsyncControllerUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.p2b_thread_event_async_controller.P2bThreadEventAsyncControllerUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        String str;
        int A00 = AnonymousClass0fD.A00(1639611603);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null) {
            i = 236686241;
        } else {
            Uri A09 = DbT.A09(A0m);
            String queryParameter = A09.getQueryParameter("event_type");
            String queryParameter2 = A09.getQueryParameter("extra_params");
            if (queryParameter2 != null) {
                str = URLDecoder.decode(queryParameter2, ReactWebViewManager.HTML_ENCODING);
            } else {
                str = null;
            }
            C250873mC r2 = C250863mB.A03;
            if (str == null) {
                str = "{}";
            }
            C255453u9 r1 = C255453u9.A01;
            Object A002 = r2.A00(str, new C258613zM(r1, r1));
            C68499NKs nKs = new C68499NKs();
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setStatusBarColor(0);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("event_type", queryParameter);
            A1E.put("extra_params", A002);
            C360678ey A05 = C359988do.A05(DbS.A0S(this), "com.bloks.www.person.to.business.thread.event.async.controller", C359608dC.A01(A1E));
            A05.A00(nKs);
            1ES.A05(A05, 187041991, 2, false, false);
            finish();
            i = -1534120709;
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
