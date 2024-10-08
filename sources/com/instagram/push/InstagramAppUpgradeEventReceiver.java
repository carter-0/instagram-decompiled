package com.instagram.push;

import X.0Tu;
import X.182;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass3FH;
import X.AnonymousClass6U7;
import X.C49787F6v;
import X.C60960kU;
import X.C61170le;
import X.C638918c;
import X.DbS;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.instagram.common.session.UserSession;

public class InstagramAppUpgradeEventReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(-760917670);
        AnonymousClass0fQ.A01(this, context, intent);
        C638918c.A01(C61170le.A00).A0K(C49787F6v.A00(intent), AnonymousClass05K.A1F);
        AnonymousClass3FH.A02(AnonymousClass05K.A0N);
        UserSession A0S = DbS.A0S(this);
        if ((A0S instanceof UserSession) && Build.VERSION.SDK_INT >= 29) {
            UserSession userSession = A0S;
            if (182.A06(0Tu.A05, userSession, 36318393778837613L)) {
                AnonymousClass6U7.A00(C60960kU.A00, userSession).A02();
            }
        }
        AnonymousClass0fD.A0E(-600165217, A01, intent);
    }
}
