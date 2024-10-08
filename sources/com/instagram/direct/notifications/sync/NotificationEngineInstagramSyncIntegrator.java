package com.instagram.direct.notifications.sync;

import X.0Tu;
import X.0lm;
import X.0qQ;
import X.0sP;
import X.182;
import X.1a8;
import X.1aD;
import X.AnonymousClass1aS;
import X.C304006Bs;
import X.C51974G9v;
import X.C66581MXm;
import X.C68309N9w;
import X.C68350NBm;
import X.C68351NBn;
import X.C70131Nxl;
import X.C70767OKn;
import X.C73911Plm;
import X.C74178PqK;
import X.PUD;
import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.instagram.common.session.UserSession;

public final class NotificationEngineInstagramSyncIntegrator implements 0lm {
    public static final C70131Nxl Companion = new Object();
    public static final String TAG = "NotificationEngineInstagramSyncIntegrator";
    public MSGNotificationEngineInstagramSyncPathIntegrator integrator;
    public long integratorInitializationDelay;
    public boolean isInitialized;
    public final C68309N9w notificationEngineInstagramIntegratorCallback;
    public final 0sP subscribeConsumer = C74178PqK.A00(this, 39);
    public final 1a8 subscriber = C66581MXm.A0P();
    public final UserSession userSession;
    public final MSGNotificationEngineValueProvider valueProvider;
    public final C70767OKn valueProviderRegister;

    public static final NotificationEngineInstagramSyncIntegrator getInstance(UserSession userSession2) {
        0qQ.A0B(userSession2, 0);
        return (NotificationEngineInstagramSyncIntegrator) userSession2.A01(NotificationEngineInstagramSyncIntegrator.class, C73911Plm.A00(userSession2, 35));
    }

    public final void initialize(String str) {
        0qQ.A0B(str, 0);
        if (this.isInitialized) {
            return;
        }
        if (this.userSession.hasEnded()) {
            logInitializationError();
            return;
        }
        AnonymousClass1aS r3 = 1aD.A01(this.userSession, str).A02;
        0qQ.A07(r3);
        PUD.A00(r3, this.subscriber, this.subscribeConsumer, 2);
        this.isInitialized = true;
        logInitialization();
    }

    public final void start(Mailbox mailbox) {
        0qQ.A0B(mailbox, 0);
        if (this.integrator == null) {
            UserSession userSession2 = this.userSession;
            0qQ.A0B(userSession2, 0);
            long A01 = 182.A01(0Tu.A06, userSession2, 36596338293606793L);
            this.integratorInitializationDelay = A01;
            if (A01 > 0) {
                Execution.executeAfterWithPriority(new C68350NBm(mailbox, this), (AccountSession) null, 1, 0, A01);
            } else {
                Execution.executeAsync(new C68351NBn(mailbox, this), (AccountSession) null, 1);
            }
        }
    }

    public final MSGNotificationEngineInstagramSyncPathIntegrator getIntegrator() {
        return this.integrator;
    }

    public final boolean isIntegratorInitialized() {
        return this.isInitialized;
    }

    public final void logInitialization() {
        UserSession userSession2 = this.userSession;
        if (userSession2 != null) {
            C304006Bs.A00(userSession2);
        }
    }

    public final void logInitializationError() {
        UserSession userSession2 = this.userSession;
        if (userSession2 != null) {
            C304006Bs.A00(userSession2).A00((String) null, (String) null, (String) null, (String) null, "InstagramSyncPathIntegrator not initialized, user session has ended", 7);
        }
    }

    public void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.integrator = null;
        }
        this.subscriber.A01();
    }

    public NotificationEngineInstagramSyncIntegrator(UserSession userSession2, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, C68309N9w n9w, C70767OKn oKn) {
        C51974G9v.A1P(userSession2, mSGNotificationEngineValueProvider, n9w, oKn);
        this.userSession = userSession2;
        this.valueProvider = mSGNotificationEngineValueProvider;
        this.notificationEngineInstagramIntegratorCallback = n9w;
        this.valueProviderRegister = oKn;
    }

    public final void setIntegrator(MSGNotificationEngineInstagramSyncPathIntegrator mSGNotificationEngineInstagramSyncPathIntegrator) {
        this.integrator = mSGNotificationEngineInstagramSyncPathIntegrator;
    }
}
