package com.instagram.urlhandlers.shopsqareplyprivately;

import X.08y;
import X.09i;
import X.0cp;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.Dba;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public class ShopsQAReplyPrivatelyUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;
    public UserSession A01;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "manage_qa_private_reply";
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.shopsqareplyprivately.ShopsQAReplyPrivatelyUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(462969872);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 24027386;
        } else {
            08y r1 = 09i.A0A;
            this.A00 = r1.A04(A0A);
            this.A01 = r1.A06(A0A);
            if (this.A00 != null) {
                String A0m = DbS.A0m(A0A);
                if (A0m != null && !TextUtils.isEmpty(A0m)) {
                    Uri A03 = 0cp.A03(A0m);
                    if (this.A01 != null) {
                        String queryParameter = A03.getQueryParameter("ig_merchant_fbid");
                        Context context = (Context) C71172bH.A00();
                        if (!(queryParameter == null || context == null || this.A00 == null)) {
                            HashMap A1E = AnonymousClass7TE.A1E();
                            HashMap A1E2 = AnonymousClass7TE.A1E();
                            HashMap A1E3 = AnonymousClass7TE.A1E();
                            BitSet A0w = DbS.A0w(1);
                            boolean A1Z = Dba.A1Z("ig_merchant_fbid", queryParameter, A1E, A0w);
                            IgBloksScreenConfig A0N = DbS.A0N(this.A01);
                            A0N.A0R = "com.bloks.www.qa.private-reply.manage.bottom-sheet";
                            if (A0w.nextClearBit(A1Z ? 1 : 0) >= 1) {
                                C46649DiU A05 = C46649DiU.A05("com.bloks.www.qa.private-reply.manage.bottom-sheet", A1E, A1E2);
                                A05.A03 = null;
                                A05.A02 = null;
                                A05.A04 = null;
                                A05.A0H(A1E3);
                                A05.A0E(context, A0N);
                            } else {
                                throw DbU.A0i();
                            }
                        }
                    }
                }
                finish();
                i = 557111538;
            } else {
                finish();
                i = 1758831755;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.shopsqareplyprivately.ShopsQAReplyPrivatelyUrlHandlerActivity, android.app.Activity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(1982405064);
        super.onResume();
        if (!(getWindow() == null || getWindow().getDecorView() == null)) {
            DbT.A16(getApplicationContext(), getWindow().getDecorView(), R.color.igds_creation_menu_background);
        }
        AnonymousClass0fD.A07(-353362607, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
