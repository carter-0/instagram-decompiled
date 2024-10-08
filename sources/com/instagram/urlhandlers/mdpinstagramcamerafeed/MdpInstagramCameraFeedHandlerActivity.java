package com.instagram.urlhandlers.mdpinstagramcamerafeed;

import X.0Tu;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C363138jC;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbX;
import X.Dba;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class MdpInstagramCameraFeedHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandlers.mdpinstagramcamerafeed.MdpInstagramCameraFeedHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(2137996250);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            finish();
            i = -2091791763;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(bundleExtra);
            if (A0W == null) {
                finish();
                i = 2094403112;
            } else {
                this.A00 = A0W;
                if (!(A0W instanceof UserSession)) {
                    FFQ.A00().A00(this, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), A0W);
                } else {
                    String A0m = DbS.A0m(bundleExtra);
                    if (!(A0m == null || A0m.length() == 0)) {
                        Uri A09 = DbT.A09(A0m);
                        Intent A08 = DbX.A08(this);
                        Uri.Builder appendQueryParameter = DbW.A07("instagram://story-camera").appendQueryParameter(DatePickerDialogModule.ARG_MODE, C363138jC.A00.A02);
                        if (A09.getQueryParameter("close_friends") != null && 182.A06(0Tu.A05, A0W, 36316087382970305L)) {
                            appendQueryParameter.appendQueryParameter("close_friends", "true");
                        }
                        Dba.A0o(this, A08, appendQueryParameter);
                    }
                }
                finish();
                i = -522693786;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
