package com.instagram.notifications.push.fcm;

import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.C70522Qk;
import com.google.firebase.messaging.FirebaseMessagingService;

public final class IgFirebaseMessagingService extends FirebaseMessagingService {
    public final void onCreate() {
        AnonymousClass0eM r0;
        int A04 = AnonymousClass0fD.A04(1233290219);
        super.onCreate();
        synchronized (C70522Qk.class) {
            C70522Qk.A00();
            r0 = C70522Qk.A02;
        }
        r0.getValue();
        AnonymousClass0fD.A0B(-1762435022, A04);
    }
}
