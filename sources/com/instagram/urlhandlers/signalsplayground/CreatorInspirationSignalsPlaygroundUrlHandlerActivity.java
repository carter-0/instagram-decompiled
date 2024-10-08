package com.instagram.urlhandlers.signalsplayground;

import X.0Tu;
import X.182;
import X.1QK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass2ZQ;
import X.AnonymousClass6W8;
import X.C273654mx;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.Dbb;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class CreatorInspirationSignalsPlaygroundUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.signalsplayground.CreatorInspirationSignalsPlaygroundUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        return Dbb.A0M(DbX.A0A(this));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.signalsplayground.CreatorInspirationSignalsPlaygroundUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1519627398);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -505969630;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (A0A == null) {
                finish();
                i = 1540928350;
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = -1642489822;
                } else {
                    Uri A09 = DbT.A09(A0m);
                    AnonymousClass0wW session = getSession();
                    if (session != null) {
                        if (!(session instanceof UserSession)) {
                            FFQ.A01(this, A0A, session);
                        } else if (182.A06(0Tu.A05, session, 36328598621142474L)) {
                            AnonymousClass2ZQ A002 = C71172bH.A00();
                            if (A002 != null) {
                                A002.Eng(1QK.A0C);
                                AnonymousClass6W8 A0b = DbS.A0b(this, A0A, getSession(), ModalActivity.class, C273654mx.A00(2216));
                                A0b.A0J = new int[]{R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out};
                                A0b.A08 = true;
                                A0b.A0C(this);
                            } else {
                                DbZ.A0v(this, A09);
                            }
                            finish();
                        } else {
                            finish();
                            i = -2016312785;
                        }
                    }
                    i = -1461256795;
                }
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
