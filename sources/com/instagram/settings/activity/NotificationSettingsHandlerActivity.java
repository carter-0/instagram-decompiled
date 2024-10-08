package com.instagram.settings.activity;

import X.09i;
import X.0eO;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass4v0;
import X.C13998To0;
import X.C309516Yo;
import X.C61170le;
import X.C638918c;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbY;
import X.EST;
import X.FCT;
import X.FFQ;
import android.os.Bundle;
import android.view.MotionEvent;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

public final class NotificationSettingsHandlerActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new C13998To0(this, 26));

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        AnonymousClass4v0.A01(AnonymousClass4v0.A00(getSession()), AnonymousClass05K.A01, System.currentTimeMillis());
        return super.dispatchTouchEvent(motionEvent);
    }

    public final String getModuleName() {
        return "notification_settings_handler";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.settings.activity.NotificationSettingsHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, java.lang.Object, com.instagram.settings.activity.NotificationSettingsHandlerActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1897045012);
        super.onCreate(bundle);
        setTheme(R.style.IgPanorama);
        setContentView((int) R.layout.activity_single_container);
        if (DbT.A1Z(this)) {
            UserSession A08 = 09i.A0A.A08(this);
            if (AnonymousClass000.A00(129).equals(getIntent().getAction()) && getIntent().hasCategory("android.intent.category.NOTIFICATION_PREFERENCES")) {
                C638918c.A01(C61170le.A00).A0K(getIntent(), AnonymousClass05K.A0Y);
                Bundle A09 = DbY.A09(A08);
                A09.putBoolean("only_show_push", true);
                FCT.A01((AnonymousClass0iw) null, A08, "settings", "notifications_entered", (String) null);
                C309516Yo A0Q = DbU.A0Q(this, A08);
                A0Q.A0B(A09, new EST());
                A0Q.A04();
            }
        } else {
            FFQ.A00().A00(this, DbU.A06(this), getSession());
        }
        AnonymousClass0fD.A07(31092000, A002);
    }
}
