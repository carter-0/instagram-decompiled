package com.facebook.rtc.notification.instagram;

import X.0qQ;
import X.0sL;
import X.1X9;
import X.AnonymousClass0fD;
import X.AnonymousClass38W;
import X.AnonymousClass7TF;
import X.C59136J7s;
import X.C66580MXl;
import X.C70907OQz;
import X.I4H;
import X.JG3;
import X.JGF;
import X.O2A;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;

public final class IgRtcNotificationBroadcastReceiver extends BroadcastReceiver {
    public final 1X9 A00 = AnonymousClass38W.A00();

    public final void onReceive(Context context, Intent intent) {
        int i;
        String BkA;
        0sL j7s;
        Context context2 = context;
        int A03 = C66580MXl.A03(this, context, intent, -1582988751);
        boolean A1U = AnonymousClass7TF.A1U(0, context, intent);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            i = 1213593660;
        } else {
            String string = extras.getString("com.instagram.rtc.notifications.service.recipient");
            if (!0qQ.A0K(intent.getAction(), "LEAVE") || string == null) {
                RtcConnectionEntity rtcConnectionEntity = (RtcConnectionEntity) extras.getParcelable("com.instagram.rtc.notifications.service.entity");
                if (rtcConnectionEntity == null) {
                    i = 14099644;
                } else {
                    RtcConnectionEntity A002 = I4H.A00(C70907OQz.A00(rtcConnectionEntity));
                    if (A002 != null) {
                        rtcConnectionEntity = A002;
                    }
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -2034635050) {
                            if (hashCode != -607360496) {
                                if (hashCode == 1422340809 && action.equals("DISMISS_LIVE_NOTIFICATION")) {
                                    BkA = rtcConnectionEntity.BkA();
                                    j7s = new JG3(8, rtcConnectionEntity, this, context);
                                }
                            } else if (action.equals("DISMISS_MISSED")) {
                                BkA = rtcConnectionEntity.BkA();
                                j7s = new C59136J7s(0, rtcConnectionEntity, context2, this, false);
                            }
                        } else if (action.equals("DECLINE")) {
                            BkA = rtcConnectionEntity.BkA();
                            j7s = new C59136J7s(0, rtcConnectionEntity, context2, this, A1U);
                        }
                        O2A.A00(BkA, j7s);
                    }
                    i = 1118200846;
                }
            } else {
                O2A.A00(string, new JGF(44, context, this));
                i = -1928269382;
            }
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
