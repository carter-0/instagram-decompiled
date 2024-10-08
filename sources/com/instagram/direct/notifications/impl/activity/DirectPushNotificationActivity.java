package com.instagram.direct.notifications.impl.activity;

import X.002;
import X.08y;
import X.09i;
import X.0KC;
import X.0Yh;
import X.0fh;
import X.0q1;
import X.0qQ;
import X.14i;
import X.17k;
import X.18g;
import X.1Z6;
import X.1pE;
import X.2cc;
import X.AnonymousClass000;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass1YB;
import X.AnonymousClass2MF;
import X.AnonymousClass6WB;
import X.AnonymousClass9H3;
import X.C254783t2;
import X.C309516Yo;
import X.C41620AxY;
import X.C50304FXj;
import X.C61170le;
import X.C61190ls;
import X.C638918c;
import X.C66579MXk;
import X.C71342cb;
import X.DbS;
import X.DbU;
import X.DbW;
import X.DbY;
import X.Dbb;
import X.FFQ;
import X.FHD;
import X.O1M;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceEventType;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Map;

public final class DirectPushNotificationActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(C41620AxY.A00);
    public final C50304FXj A01 = new C50304FXj(this);

    public final String getModuleName() {
        return TraceEventType.Push;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity, android.app.Activity] */
    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        C61190ls.A01(this, configuration);
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.0iw, com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity, java.lang.Object, android.content.ContextWrapper, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        Bundle bundle2;
        int i;
        Intent intent = getIntent();
        0qQ.A07(intent);
        AnonymousClass0eM r5 = this.A00;
        ((AnonymousClass9H3) r5.getValue()).A04.A01((String) null);
        UserSession A0S = DbS.A0S(this);
        if (!(A0S instanceof UserSession)) {
            Class<?> cls = A0S.getClass();
            Map map = 0Yh.A03;
            0qQ.A0B(cls, 1);
            0KC.A0C("DirectPushNotificationActivity", 002.A0R("Session is not the right instance ", 0q1.A01(cls)));
            ((AnonymousClass9H3) r5.getValue()).A02("thread_activity_user_session_error", true);
            FFQ.A01(this, (Bundle) null, A0S);
            return;
        }
        1Z6 A002 = AnonymousClass2MF.A00();
        Context baseContext = getBaseContext();
        0qQ.A07(baseContext);
        O1M.A00(intent, A0S, A002.A02(baseContext));
        Fragment A0H = DbY.A0H(this);
        UserSession userSession = A0S;
        Bundle bundle3 = FHD.A08(intent, userSession).A0P;
        try {
            1pE A003 = FHD.A00(this, bundle3, this, userSession, true);
            if (A003 == null) {
                bundle2 = null;
                i = -603596992;
            } else {
                int i2 = 0;
                if (bundle3.getBoolean("action_call_back")) {
                    i2 = 3;
                }
                C254783t2 r1 = A003.A0B;
                17k.A07(r1, "Missing ThreadTarget");
                bundle2 = 1pE.A00(A003, r1, i2, false);
                i = 1954771004;
            }
            0fh.A00(i);
            if (bundle2 == null) {
                ((AnonymousClass9H3) r5.getValue()).A02("thread_activity_fragment_arguments_error", true);
                ((AnonymousClass9H3) r5.getValue()).A04.A00();
                FHD.A0J(this, FHD.A08(intent, userSession).A0P, userSession, true);
                finish();
            } else if (A0H == null) {
                Fragment A004 = AnonymousClass6WB.A00(bundle2, this, A0S, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
                boolean booleanExtra = intent.getBooleanExtra(C66579MXk.A00(230), false);
                if (A004 != null) {
                    if (!booleanExtra) {
                        Dbb.A0o(bundle2, A004, this, A0S);
                    } else {
                        bundle2.putBoolean(AnonymousClass000.A00(2235), ((AnonymousClass9H3) r5.getValue()).A08.A0X((Intent) null));
                        C309516Yo A0P = DbU.A0P(bundle2, A004, this, A0S);
                        A0P.A0D = false;
                        A0P.A04();
                    }
                }
                ((AnonymousClass9H3) r5.getValue()).A04.A02((String) null);
            }
        } catch (Throwable th) {
            0fh.A00(-1052725155);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity, java.lang.Object, android.app.Activity, androidx.appcompat.app.AppCompatActivity] */
    public final void onCreate(Bundle bundle) {
        08y r4;
        int A002 = AnonymousClass0fD.A00(1183704305);
        boolean isTaskRoot = isTaskRoot();
        18g A012 = C638918c.A01(C61170le.A00);
        if (!isTaskRoot) {
            Intent intent = getIntent();
            r4 = 09i.A0A;
            A012.A0I(this, intent, r4.A05(this));
        } else {
            r4 = 09i.A0A;
            A012.A0J(this, r4.A05(this));
        }
        super.onCreate(bundle);
        DbW.A0s(getIntent(), r4.A05(this));
        View findViewById = findViewById(R.id.layout_container_parent);
        if (findViewById != null) {
            findViewById.setFitsSystemWindows(true);
        }
        boolean isTaskRoot2 = isTaskRoot();
        2cc A003 = C71342cb.A00(r4.A05(this));
        if (isTaskRoot2) {
            A003.A05();
        } else {
            A003.A0A(this, AnonymousClass000.A00(197));
        }
        14i.A05(this.A01);
        Intent intent2 = getIntent();
        0qQ.A07(intent2);
        ((AnonymousClass9H3) this.A00.getValue()).A02("thread_activity_is_from_direct_push", intent2.getBooleanExtra(C66579MXk.A00(538), false));
        AnonymousClass0fD.A07(-368317401, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(1124473953);
        14i.A06(this.A01);
        super.onDestroy();
        AnonymousClass0fD.A07(377919001, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
