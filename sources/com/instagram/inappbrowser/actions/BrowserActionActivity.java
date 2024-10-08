package com.instagram.inappbrowser.actions;

import X.0qQ;
import X.0xF;
import X.1ap;
import X.1as;
import X.2FW;
import X.2db;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass37D;
import X.AnonymousClass37F;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10503RtI;
import X.C12799T7m;
import X.C2594141p;
import X.C273414mX;
import X.C49731F3w;
import X.C61082JwK;
import X.C8872RDo;
import X.C9229RUg;
import X.DbS;
import X.DbU;
import X.FmI;
import X.SPF;
import android.os.Bundle;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

public final class BrowserActionActivity extends IgFragmentActivity implements C273414mX {
    public UserSession A00;
    public C8872RDo A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C12799T7m A07 = new Object();

    public final void Cyf() {
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.app.Activity, com.instagram.inappbrowser.actions.BrowserActionActivity] */
    public final void Cyc() {
        finish();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, com.instagram.inappbrowser.actions.BrowserActionActivity] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A002 = AnonymousClass0fD.A00(-914862404);
        Bundle A062 = DbU.A06(this);
        if (A062 != null) {
            this.A00 = DbS.A0U(A062);
            super.onCreate(bundle);
            C2594141p.A00(this, 1);
            setContentView((int) R.layout.browser_action_activity);
            this.A01 = (C8872RDo) A062.getSerializable("browser_action_extra_action_type");
            this.A02 = A062.getString("browser_action_extra_browser_url");
            this.A04 = A062.getString("browser_action_extra_media_id", "");
            this.A03 = A062.getString("browser_action_session_id", "");
            this.A05 = A062.getString("browser_action_tracking_token");
            A062.getBoolean("browser_action_tracking_enabled", true);
            this.A06 = A062.getString("browser_url_author_id");
            Window window = getWindow();
            if (window != null) {
                2db.A07(window.getDecorView(), window, A062.getBoolean("browser_action_status_bar_visibility"));
                AnonymousClass0fD.A07(-1779290840, A002);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -456372453;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1398382271;
        }
        AnonymousClass0fD.A07(i, A002);
        throw illegalStateException;
    }

    public final void onStart() {
        String str;
        int A002 = AnonymousClass0fD.A00(-1584700076);
        super.onStart();
        C8872RDo rDo = this.A01;
        if (rDo == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (rDo.ordinal() == 0) {
            SPF spf = SPF.A06;
            if (spf != null) {
                C61082JwK jwK = spf.A00;
                if (jwK.A01) {
                    C10503RtI rtI = (C10503RtI) jwK.A00;
                    String str2 = this.A02;
                    if (str2 != null) {
                        this.A02 = C9229RUg.A00(rtI, str2);
                    }
                }
            }
            String str3 = this.A02;
            if (str3 != null) {
                AnonymousClass37D bottomSheetNavigator = getBottomSheetNavigator();
                if (bottomSheetNavigator != null) {
                    ((AnonymousClass37F) bottomSheetNavigator).A0H = new FmI(this, 5);
                    0xF r6 = new 0xF();
                    0xF.A00(r6, this.A03, "iab_session_id");
                    0xF.A00(r6, this.A05, "tracking_token");
                    0xF.A00(r6, this.A02, "target_url");
                    0xF.A00(r6, "send_in_direct", "share_type");
                    1ap r3 = 1as.A04.A02;
                    UserSession userSession = this.A00;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        C49731F3w A072 = r3.A07(this.A07, userSession, 2FW.A17);
                        String str4 = this.A04;
                        if (str4 == null) {
                            str = "mediaId";
                        } else {
                            A072.A06(str4);
                            A072.A07(str3);
                            A072.A02(r6);
                            A072.A07.putString("DirectShareSheetConstants.url_author_id", this.A06);
                            bottomSheetNavigator.A0J(A072.A00());
                            AnonymousClass0fD.A07(-2137331855, A002);
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(rDo, "Unknown action type: ", AnonymousClass7TE.A1A()));
        }
    }
}
