package com.instagram.lockscreen;

import X.0Aj;
import X.0kR;
import X.0wc;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C342017nu;
import X.C48962En0;
import X.DbS;
import X.DbV;
import X.FA7;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import com.instagram.common.session.UserSession;

public final class LockScreenShortcutActivity extends IgActivity {
    public final void onCreate(Bundle bundle) {
        0Aj A0e;
        String str;
        int A00 = AnonymousClass0fD.A00(-1290334641);
        super.onCreate(bundle);
        Intent A09 = DbS.A09();
        A09.setClassName(this, "com.instagram.mainactivity.InstagramMainActivity");
        A09.setAction("android.intent.action.VIEW");
        A09.setFlags(67108864);
        UserSession userSession = null;
        try {
            AnonymousClass0wW A0S = DbS.A0S(this);
            if (A0S instanceof UserSession) {
                userSession = (UserSession) A0S;
                if (userSession != null) {
                    boolean A1Z = AnonymousClass7TF.A1Z(C342017nu.A00(this, userSession).A04);
                    FA7 A002 = C48962En0.A00(this, userSession);
                    boolean A1Z2 = AnonymousClass7TF.A1Z(A002.A00);
                    if (A1Z) {
                        if (A1Z2) {
                            A0e = AnonymousClass7TE.A0e((0wc) A002.A01.getValue(), "ig_lock_screen_shortcuts");
                            if (A0e.isSampled()) {
                                str = "lss_launched";
                            }
                        }
                        A09.setData(Uri.parse("instagram://story-camera/"));
                    } else {
                        if (A1Z2) {
                            A0e = AnonymousClass7TE.A0e((0wc) A002.A01.getValue(), "ig_lock_screen_shortcuts");
                            if (A0e.isSampled()) {
                                str = "lss_launched_organic";
                            }
                        }
                        A09.setData(Uri.parse("instagram://story-camera/"));
                    }
                    DbV.A1G(A0e, str);
                    A09.setData(Uri.parse("instagram://story-camera/"));
                }
            }
        } catch (IllegalStateException unused) {
        }
        0kR.A0B(this, A09);
        finish();
        AnonymousClass0fD.A07(1402142158, A00);
    }
}
