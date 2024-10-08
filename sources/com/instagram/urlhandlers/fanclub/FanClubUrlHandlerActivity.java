package com.instagram.urlhandlers.fanclub;

import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass2o2;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C46649DiU;
import X.C49002Ene;
import X.C49891FBs;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.DbY;
import X.E7P;
import X.FC8;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

public final class FanClubUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.fanclub.FanClubUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        C309516Yo A0M;
        Fragment e7p;
        int A00 = AnonymousClass0fD.A00(1295780663);
        super.onCreate(bundle);
        UserSession A07 = 09i.A0A.A07(getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"));
        if (A07 == null) {
            finish();
            i = 21714128;
        } else {
            FanClubInfoDict B3v = DbX.A0m(A07).B3v();
            if (!(B3v == null || B3v.getFanClubId() == null)) {
                Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
                if (bundleExtra == null || (A0m = DbS.A0m(bundleExtra)) == null) {
                    finish();
                    i = 1576108089;
                } else {
                    Uri A09 = DbT.A09(A0m);
                    String lastPathSegment = A09.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int hashCode = lastPathSegment.hashCode();
                        if (hashCode != -216457707) {
                            if (hashCode != 218786155) {
                                if (hashCode == 1557721666 && lastPathSegment.equals("details")) {
                                    A0M = DbS.A0M(this, A07);
                                    FC8.A00();
                                    C46649DiU A04 = C46649DiU.A04("com.instagram.user_pay.fan_club.screens.creator_onboarding.creator_side_subscription_settings", DbY.A0m("tooltip", A09.getQueryParameter("tooltip")));
                                    IgBloksScreenConfig A0N = DbS.A0N(A07);
                                    DbS.A18(this, A0N, 2131976318);
                                    e7p = C49891FBs.A02(A0N, A04);
                                }
                            } else if (lastPathSegment.equals("content_preview_picker")) {
                                if (AnonymousClass2o2.A01(A07)) {
                                    A0M = DbS.A0M(this, A07);
                                    A0M.A0D(FC8.A00().A00("preview_picker"));
                                    DbV.A1O(A0M);
                                }
                                i = 894669973;
                            }
                        } else if (lastPathSegment.equals("subscriber_list")) {
                            String queryParameter = A09.getQueryParameter("origin");
                            A0M = DbS.A0M(this, A07);
                            FC8.A02();
                            String A002 = C49002Ene.A00(queryParameter);
                            if (A002 == null) {
                                A002 = "UNKNOWN";
                            }
                            Bundle A0a = AnonymousClass7TE.A0a();
                            A0a.putString("ARGUMENT_ENTRY_POINT", A002);
                            e7p = new E7P();
                            e7p.setArguments(A0a);
                        }
                        A0M.A0D(e7p);
                        DbV.A1O(A0M);
                        i = 894669973;
                    }
                }
            }
            finish();
            i = 894669973;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
