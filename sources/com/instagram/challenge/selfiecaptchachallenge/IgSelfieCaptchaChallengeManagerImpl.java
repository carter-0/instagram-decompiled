package com.instagram.challenge.selfiecaptchachallenge;

import X.0hq;
import X.0lg;
import X.0qQ;
import X.0sr;
import X.AQK;
import X.AnonymousClass7TG;
import X.AnonymousClass84S;
import X.C12056Slj;
import X.C312126dr;
import X.T6A;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class IgSelfieCaptchaChallengeManagerImpl {
    public static final List A00 = 0sr.A1P(new String[]{"UNKNOWN", "LEFT", "UP", "RIGHT", "DOWN"});

    public final synchronized void A00(Activity activity, Bundle bundle, 0hq r17, 0lg r18, T6A t6a, String str, String str2, String str3, String str4) {
        synchronized (this) {
            Bundle bundle2 = bundle;
            0hq r6 = r17;
            0lg r8 = r18;
            AnonymousClass7TG.A1U(r8, r6, bundle2);
            T6A t6a2 = t6a;
            0qQ.A0B(t6a2, 7);
            Context applicationContext = activity.getApplicationContext();
            0qQ.A07(applicationContext);
            String str5 = str3;
            String str6 = str4;
            AnonymousClass84S.A00(applicationContext, r8).A01(new AQK(new C12056Slj(activity, bundle2, r6, this, r8, t6a2, str6, str5, str2, str)), C312126dr.A01);
        }
    }
}
