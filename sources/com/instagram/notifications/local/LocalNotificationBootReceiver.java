package com.instagram.notifications.local;

import X.0qQ;
import X.1ES;
import X.1OC;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass0wW;
import X.AnonymousClass7TG;
import X.AnonymousClass9ET;
import X.AnonymousClass9EU;
import X.C377419Lt;
import X.C49787F6v;
import X.C58695Iw4;
import X.C59104J6m;
import X.C59910bu;
import X.DbS;
import X.DbV;
import X.DbW;
import X.EBE;
import X.F7X;
import X.Ri6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

public final class LocalNotificationBootReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0fD.A01(-992010558);
        AnonymousClass0fQ.A01(this, context, intent);
        boolean A1Z = AnonymousClass7TG.A1Z(context, intent);
        if (!C59910bu.A02().A00(context, intent, this) || !C49787F6v.A01(intent.getAction())) {
            i = 1025048738;
        } else {
            AnonymousClass0wW A0S = DbS.A0S(this);
            if (!(A0S instanceof UserSession)) {
                i = 30377340;
            } else {
                AnonymousClass9ET r5 = new AnonymousClass9ET(context);
                if (Ri6.A00(context) && System.currentTimeMillis() - DbW.A06(DbV.A0d(), "last_unseen_like_local_notification_timestamp") >= 86400000) {
                    0qQ.A0B(A0S, A1Z ? 1 : 0);
                    AnonymousClass9EU r3 = (AnonymousClass9EU) A0S.A01(AnonymousClass9EU.class, new C58695Iw4(35, (Object) context, (Object) A0S, (Object) r5));
                    C59104J6m j6m = new C59104J6m(13, (Object) r5, (Object) A0S, (Object) this);
                    if (AnonymousClass9EU.A01(r3)) {
                        EBE ebe = new EBE(r3, new C377419Lt(36, j6m, r3));
                        1OC A00 = F7X.A00(r3.A03, AnonymousClass000.A00(3756));
                        A00.A00 = ebe;
                        1ES.A03(A00);
                    }
                }
                i = -906028187;
            }
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
