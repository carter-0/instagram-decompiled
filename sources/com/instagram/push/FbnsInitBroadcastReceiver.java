package com.instagram.push;

import X.09i;
import X.0Tu;
import X.182;
import X.1AW;
import X.1CI;
import X.AnonymousClass05K;
import X.AnonymousClass0YC;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass3FH;
import X.AnonymousClass3QY;
import X.AnonymousClass3R8;
import X.AnonymousClass3RD;
import X.AnonymousClass3RX;
import X.C241823Ri;
import X.C241833Rj;
import X.C241853Rl;
import X.C241903Rv;
import X.C49787F6v;
import X.C61170le;
import X.C638918c;
import X.C66588MXu;
import X.TSS;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public class FbnsInitBroadcastReceiver extends BroadcastReceiver {
    public static void A00(Intent intent, String str) {
        AnonymousClass0YC.A00.markerGenerateWithAnnotations(25105730, 467, 0, TimeUnit.MILLISECONDS, new TSS(intent, str));
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        String A00;
        int A01 = AnonymousClass0fD.A01(862564143);
        Context context2 = context;
        Intent intent2 = intent;
        AnonymousClass0fQ.A01(this, context2, intent2);
        UserSession A05 = 09i.A0A.A05(this);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, A05, 36321335832552739L)) {
            i = 50988532;
        } else {
            Intent A002 = C49787F6v.A00(intent2);
            C638918c.A01(C61170le.A00).A0K(A002, AnonymousClass05K.A15);
            if (A002 == null) {
                A00(A002, "null intent");
                i = 838973032;
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(A002.getAction()) || "android.intent.action.BOOT_COMPLETED".equals(A002.getAction()) || "android.intent.action.USER_PRESENT".equals(A002.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(A002.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(A002.getAction())) {
                String str = null;
                if ("com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(A002.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(A002.getAction())) {
                    context2.getClass();
                    if (!((AnonymousClass3RX) AnonymousClass3RD.A00).A00(A002, new C241903Rv(context2, (Boolean) null)).CeP()) {
                        A00(A002, "failed authenticator");
                        i = 54398642;
                    }
                }
                if (1AW.A06(r2, 18296440422138193L) && (A00 = C241833Rj.A00(context2)) != null) {
                    C241853Rl.A01(context2, (C241823Ri) null, FbnsServiceDelegate.A00(A00), "FbnsSuspendSwitch", A00, "com.facebook.rti.intent.ACTION_FBNS_KILL_SWITCH_DISABLE_SERVICE");
                }
                if (AnonymousClass3R8.A00(context2)) {
                    boolean z = false;
                    if (C66588MXu.A00) {
                        C66588MXu.A03();
                    }
                    if (A05 instanceof UserSession) {
                        UserSession userSession = A05;
                        str = userSession.A06;
                        z = 1CI.A00(userSession);
                    }
                    AnonymousClass3QY.A00().CMj(AnonymousClass3FH.A00, str, z);
                }
                i = 625200554;
            } else {
                A00(A002, "failed intent filters");
                i = -1268128060;
            }
        }
        AnonymousClass0fD.A0E(i, A01, intent2);
    }
}
