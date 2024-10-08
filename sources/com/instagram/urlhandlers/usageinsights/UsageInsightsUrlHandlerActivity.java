package com.instagram.urlhandlers.usageinsights;

import X.0KC;
import X.0bY;
import X.0cS;
import X.1We;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.C60020ci;
import X.DbS;
import X.DbT;
import X.DbV;
import X.EWJ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class UsageInsightsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.usageinsights.UsageInsightsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A00 = AnonymousClass0fD.A00(-228067465);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            i = 788910210;
        } else {
            Bundle A0A = DbT.A0A(intent);
            if (A0A == null) {
                finish();
                i = 273764332;
            } else {
                UserSession A0U = DbS.A0U(A0A);
                if (A0U == null) {
                    finish();
                    i = -293455118;
                } else {
                    0cS r2 = new 0cS();
                    r2.A01();
                    r2.A02(C60020ci.A0m, "com.instagram.android");
                    try {
                        r2.A00().A02(this, getIntent(), (0bY) null);
                        1We r0 = 1We.A02;
                        if (r0 != null) {
                            C309516Yo A0M = DbS.A0M(this, A0U);
                            A0M.A0D(1We.A00(r0).A01(A0U, EWJ.IG_TS_ENTRY_POINT_STORIES));
                            A0M.A0F = true;
                            DbV.A1O(A0M);
                        }
                    } catch (SecurityException e) {
                        e = e;
                        str = "Security issue with caller";
                        0KC.A0F("usage_insights_url_handler", str, e);
                        finish();
                        i = -96932578;
                        AnonymousClass0fD.A07(i, A00);
                    } catch (IllegalStateException e2) {
                        e = e2;
                        str = "Failed to verify caller";
                        0KC.A0F("usage_insights_url_handler", str, e);
                        finish();
                        i = -96932578;
                        AnonymousClass0fD.A07(i, A00);
                    }
                    i = -96932578;
                }
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
