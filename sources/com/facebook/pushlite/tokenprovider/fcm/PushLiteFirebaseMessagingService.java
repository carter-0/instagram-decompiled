package com.facebook.pushlite.tokenprovider.fcm;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C69716Nqc;
import com.google.firebase.messaging.FirebaseMessagingService;

public final class PushLiteFirebaseMessagingService extends FirebaseMessagingService {
    public final void A05(String str) {
        0qQ.A0B(str, 0);
        0qQ.A07(C69716Nqc.A00().A09.getValue());
        throw AnonymousClass7TE.A11("onNewTokenAvailable");
    }
}
