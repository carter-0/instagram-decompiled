package com.instagram.notifications.local;

import X.09i;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C49359EuN;
import X.C51797G2g;
import X.C59910bu;
import X.Ri6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

public final class LocalNotificationAlarmReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0fD.A01(-804192871);
        AnonymousClass0fQ.A01(this, context, intent);
        AnonymousClass7TG.A1N(context, intent);
        if (!C59910bu.A02().A00(context, intent, this)) {
            i = 1956409015;
        } else {
            UserSession A07 = 09i.A0A.A07(intent.getExtras());
            if (A07 == null) {
                i = -990550280;
            } else {
                if (Ri6.A00(context)) {
                    String stringExtra = intent.getStringExtra(AnonymousClass000.A00(3521));
                    if (stringExtra == null) {
                        i = -1720482044;
                    } else {
                        String A00 = AnonymousClass000.A00(1041);
                        if (stringExtra.equals(A00)) {
                            ((C49359EuN) A07.A01(C49359EuN.class, new C51797G2g(A07, 42))).A00.getString(A00, (String) null);
                        } else {
                            throw AnonymousClass7TE.A0w(stringExtra);
                        }
                    }
                }
                i = 59278397;
            }
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
