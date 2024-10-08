package com.instagram.libraries.access.accountmanager.service;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.C7344Q4u;
import X.DbT;
import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class InstagramAuthenticationService extends Service {
    public C7344Q4u A00;

    public final IBinder onBind(Intent intent) {
        C7344Q4u q4u = this.A00;
        if (q4u == null) {
            0qQ.A0F("authenticator");
            throw AnonymousClass00P.createAndThrow();
        }
        IBinder iBinder = q4u.getIBinder();
        0qQ.A07(iBinder);
        return iBinder;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Q4u, android.accounts.AbstractAccountAuthenticator] */
    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(-146608085);
        this.A00 = new AbstractAccountAuthenticator(DbT.A05(this));
        AnonymousClass0fD.A0B(1617716298, A04);
    }
}
