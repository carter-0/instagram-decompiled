package com.instagram.urlhandlers.p2b_thread_event_bloks_controller;

import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C250863mB;
import X.C250873mC;
import X.C255453u9;
import X.C258613zM;
import X.C359608dC;
import X.C46649DiU;
import X.C71495Olk;
import X.DbS;
import X.DbT;
import X.DbX;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.net.URLDecoder;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public final class P2bThreadEventBloksControllerUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.instagram.urlhandlers.p2b_thread_event_bloks_controller.P2bThreadEventBloksControllerUrlHandlerActivity, android.content.Context, java.lang.Object, androidx.appcompat.app.AppCompatActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onPostCreate(Bundle bundle) {
        String A0m;
        String str;
        super.onPostCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null && (A0m = DbS.A0m(A0A)) != null) {
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
            Map map = (Map) r2.A00(str, new C258613zM(r1, r1));
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setStatusBarColor(0);
            getSupportFragmentManager().A0s(new C71495Olk(this, 3));
            IgBloksScreenConfig A0N = DbS.A0N(DbS.A0S(this));
            A0N.A0R = "com.bloks.www.person.to.business.thread.event.bloks.controller";
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            HashMap A1E3 = AnonymousClass7TE.A1E();
            BitSet bitSet = new BitSet(1);
            A1E.put("event_type", queryParameter);
            bitSet.set(0);
            if (map != null && !map.isEmpty()) {
                A1E.put("extra_params", map);
            }
            if (bitSet.nextClearBit(0) >= 1) {
                C46649DiU A06 = C46649DiU.A06("com.bloks.www.person.to.business.thread.event.bloks.controller", C359608dC.A01(A1E), A1E2);
                C46649DiU.A0B(A06, 719983200);
                A06.A03 = null;
                A06.A02 = null;
                A06.A04 = null;
                A06.A0H(A1E3);
                A06.A0E(this, A0N);
                return;
            }
            throw AnonymousClass7TE.A0z("Missing Required Props");
        }
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
