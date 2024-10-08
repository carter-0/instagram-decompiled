package com.instagram.registrationpush;

import X.0Aj;
import X.0Sy;
import X.0wc;
import X.0xY;
import X.14i;
import X.1Q0;
import X.2Yu;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass9T8;
import X.C50306FXl;
import X.DbS;
import X.DbW;
import X.DbY;
import X.DbZ;
import X.Dbc;
import X.FGv;
import X.FH8;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.android.R;

public class RegistrationPushAlarmReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(2008941914);
        AnonymousClass0fQ.A01(this, context, intent);
        AnonymousClass0wW A0S = DbS.A0S(this);
        C50306FXl A00 = C50306FXl.A00(context);
        if (FGv.A06() || FGv.A05()) {
            14i.A06(A00);
        } else if (14i.A08()) {
            synchronized (FGv.class) {
                0xY AR4 = FGv.A01.A00.AR4();
                AR4.E5T("registration_push_sent_v2", true);
                AR4.apply();
            }
            0wc A02 = AnonymousClass0kN.A02(A0S);
            long currentTimeMillis = System.currentTimeMillis();
            long A002 = 1Q0.A00();
            0Aj A0e = AnonymousClass7TE.A0e(A02, "pushable");
            if (A0e.isSampled()) {
                double d = (double) currentTimeMillis;
                DbW.A13(A0e, d);
                double d2 = (double) A002;
                DbY.A1D(A0e, d, d2);
                DbZ.A1F(A0e, d2);
                FH8.A05(A0e);
                DbY.A1B(A0e);
                FH8.A0C(A0e, A0S);
            }
            Context context2 = A00.A02;
            AnonymousClass9T8 r4 = new AnonymousClass9T8(context2, AnonymousClass000.A00(3308));
            r4.A0E(true);
            int i = R.drawable.notification_icon;
            int A0H = 2Yu.A0H(context2, R.attr.defaultNotificationIcon);
            if (A0H != 0) {
                i = A0H;
            }
            r4.A04(i);
            r4.A0C(context2.getString(R.string.f0nameremoved));
            r4.A0B(context2.getString(2131965497));
            Class<RegistrationPushActionReceiver> cls = RegistrationPushActionReceiver.class;
            Intent intent2 = new Intent(context2, cls);
            intent2.setAction("com.instagram.registrationpush.ACTION_TAPPED");
            0Sy r1 = new 0Sy();
            r1.A0B(intent2, context2.getClassLoader());
            r4.A0C = r1.A02(context2, 0, 0);
            Intent intent3 = new Intent(context2, cls);
            intent3.setAction("com.instagram.registrationpush.ACTION_DELETED");
            0Sy r12 = new 0Sy();
            r12.A0B(intent3, context2.getClassLoader());
            r4.A0A.deleteIntent = r12.A02(context2, 0, 0);
            Notification A03 = r4.A03();
            long currentTimeMillis2 = System.currentTimeMillis();
            long A003 = 1Q0.A00();
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0S), "pushed");
            if (A0e2.isSampled()) {
                double d3 = (double) currentTimeMillis2;
                double d4 = (double) A003;
                Dbc.A0Y(A0e2, d3, d4);
                DbZ.A1F(A0e2, d4);
                DbW.A13(A0e2, d3);
                A0e2.A9F("time_variation", 30L);
                DbY.A1B(A0e2);
                FH8.A0E(A0e2, "release_channel", FH8.A01());
                FH8.A0D(A0e2, A0S, "fb_family_device_id", FH8.A02(A0S));
                DbW.A10(A0e2);
                A0e2.Cgf();
            }
            A00.A01.notify("registration", 64278, A03);
        }
        AnonymousClass0fD.A0E(848135299, A01, intent);
    }
}
