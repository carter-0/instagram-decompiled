package com.google.android.gms.analytics;

import X.AnonymousClass0fD;
import X.AnonymousClass3Qk;
import X.C11200SFa;
import X.C11381SQt;
import X.C66580MXl;
import X.C8481QvT;
import X.C8485QvX;
import X.Pxe;
import X.SDN;
import X.ST5;
import X.TDG;
import X.TJ1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class CampaignTrackingReceiver extends BroadcastReceiver {
    public static Boolean A00;

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -920075324);
        C11381SQt A01 = C11381SQt.A01(context);
        C8485QvX qvX = A01.A0C;
        C11381SQt.A02(qvX);
        if (intent == null) {
            ST5.A0B(qvX, "CampaignTrackingReceiver received null intent", 5);
            i = -299093981;
        } else {
            String stringExtra = intent.getStringExtra("referrer");
            String action = intent.getAction();
            qvX.A0E("CampaignTrackingReceiver received", action);
            if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
                ST5.A0B(qvX, "CampaignTrackingReceiver received unexpected intent without referrer extra", 5);
                i = 1583887658;
            } else {
                Number number = (Number) SDN.A0T.A00;
                int intValue = number.intValue();
                int length = stringExtra.length();
                if (length > intValue) {
                    qvX.A0D(Integer.valueOf(length), number, "Campaign data exceed the maximum supported size and will be clipped. size, limit");
                    stringExtra = Pxe.A0x(stringExtra, intValue);
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                C8481QvT qvT = A01.A06;
                C11381SQt.A02(qvT);
                TDG tdg = new TDG(goAsync);
                AnonymousClass3Qk.A06(stringExtra, "campaign param can't be empty");
                C11200SFa A002 = C11381SQt.A00(qvT);
                A002.A02.submit(new TJ1(qvT, tdg, stringExtra));
                i = 1060824943;
            }
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
