package com.facebook.pushlite.tokenprovider.fcm;

import X.C69716Nqc;
import X.MZw;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public final class PushLiteFcmListenerService extends FirebaseMessagingService {
    public final void A03() {
        ((MZw) C69716Nqc.A00().A08.getValue()).A06.A01("FCM", "deleted_messages");
    }

    public final void A04(RemoteMessage remoteMessage) {
        ((MZw) C69716Nqc.A00().A08.getValue()).A03(remoteMessage);
    }
}
