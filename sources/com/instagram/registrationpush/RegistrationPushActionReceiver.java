package com.instagram.registrationpush;

import X.0Aj;
import X.0kR;
import X.0la;
import X.1Q0;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C50306FXl;
import X.DbS;
import X.DbW;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.Dbc;
import X.FH8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RegistrationPushActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(1560946096);
        AnonymousClass0fQ.A01(this, context, intent);
        C50306FXl A00 = C50306FXl.A00(context);
        AnonymousClass0wW A0S = DbS.A0S(this);
        if ("com.instagram.registrationpush.ACTION_TAPPED".equals(intent.getAction())) {
            long currentTimeMillis = System.currentTimeMillis();
            long A002 = 1Q0.A00();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0S), "push_tapped");
            if (A0e.isSampled()) {
                double d = (double) currentTimeMillis;
                double d2 = (double) A002;
                DbY.A1D(A0e, d, d2);
                Dbc.A0c(A0e, "containermodule", "waterfall_log_in", d2);
                DbW.A13(A0e, d);
                DbY.A1B(A0e);
                FH8.A0D(A0e, A0S, "release_channel", DbX.A0s(0la.A00()));
                FH8.A0A(A0e, A0S);
                DbY.A1A(A0e);
                A0e.Cgf();
            }
            Intent A09 = DbS.A09();
            Context context2 = A00.A02;
            A09.setClassName(context2, "com.instagram.mainactivity.InstagramMainActivity");
            A09.setAction(AnonymousClass000.A00(129));
            A09.addCategory(AnonymousClass000.A00(503));
            A09.addFlags(268435456);
            0kR.A0B(context2, A09);
        } else if ("com.instagram.registrationpush.ACTION_DELETED".equals(intent.getAction())) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long A003 = 1Q0.A00();
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0S), "push_dismissed");
            if (A0e2.isSampled()) {
                double d3 = (double) currentTimeMillis2;
                DbW.A13(A0e2, d3);
                double d4 = (double) A003;
                DbY.A1D(A0e2, d3, d4);
                DbW.A12(A0e2, d4);
                DbZ.A1E(A0e2);
                DbY.A1A(A0e2);
                DbW.A10(A0e2);
                A0e2.AAJ("release_channel", DbX.A0s(0la.A00()));
                FH8.A0C(A0e2, A0S);
            }
        }
        AnonymousClass0fD.A0E(-1856757723, A01, intent);
    }
}
