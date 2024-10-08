package com.instagram.rtc.signaling.notifications.service;

import X.0eG;
import X.0sL;
import X.1Fs;
import X.1X9;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass38W;
import X.C305926Kc;
import X.C58685Ivu;
import X.C70907OQz;
import X.I4H;
import X.J7N;
import X.JG2;
import X.O2A;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;

public final class RtcCallActionIntentHandlerService extends Service {
    public final 1X9 A00 = AnonymousClass38W.A00();
    public final AnonymousClass0eM A01 = C58685Ivu.A00(this, 11);

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(-1045136790);
        super.onDestroy();
        C305926Kc.A00(this);
        AnonymousClass0fD.A0B(1280423174, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        RtcConnectionEntity rtcConnectionEntity;
        String str;
        0sL r1;
        boolean z;
        int A04 = AnonymousClass0fD.A04(-1966378129);
        if (intent != null) {
            0eG.A01.A01(this, intent);
            try {
                intent.getAction();
                Bundle extras = intent.getExtras();
                if (!(extras == null || (rtcConnectionEntity = (RtcConnectionEntity) extras.getParcelable("com.instagram.rtc.notifications.service.entity")) == null)) {
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
                                    str = rtcConnectionEntity.BkA();
                                    r1 = new JG2(45, rtcConnectionEntity, this);
                                    O2A.A00(str, r1);
                                }
                            } else if (action.equals("DISMISS_MISSED")) {
                                z = false;
                            }
                        } else if (action.equals("DECLINE")) {
                            z = true;
                        }
                        str = rtcConnectionEntity.BkA();
                        r1 = new J7N(7, this, rtcConnectionEntity, z);
                        O2A.A00(str, r1);
                    }
                    ((1Fs) this.A01.getValue()).A00.cancel(C70907OQz.A01(rtcConnectionEntity), 1910377639);
                }
            } finally {
                stopSelf();
            }
        }
        AnonymousClass0fD.A0B(870950075, A04);
        return 1;
    }
}
