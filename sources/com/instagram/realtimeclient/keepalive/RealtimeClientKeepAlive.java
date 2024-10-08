package com.instagram.realtimeclient.keepalive;

import X.0qQ;
import X.2DU;
import X.AnonymousClass0eK;
import X.AnonymousClass0lh;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.lang.ref.WeakReference;

public class RealtimeClientKeepAlive implements AnonymousClass0lh {
    public static final String SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION = "SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION";
    public static final String TAG = "RealtimeClientKeepAlive";
    public Runnable mDelayStopRunnable;
    public final AnonymousClass0eK mDirectPluginProvider;
    public final String mKeepaliveCondition;
    public final Handler mMainLooperHandler;
    public final AnonymousClass0eK mRealtimeClientManagerProvider;
    public final UserSession mUserSession;

    public class RemoveKeepAliveRunnable implements Runnable {
        public final String mKeepaliveCondition;
        public final WeakReference mRealtimeClientManager;

        public void run() {
            RealtimeClientManager realtimeClientManager = (RealtimeClientManager) this.mRealtimeClientManager.get();
            if (realtimeClientManager != null) {
                realtimeClientManager.removeKeepAliveCondition(this.mKeepaliveCondition);
            }
        }

        public RemoveKeepAliveRunnable(RealtimeClientManager realtimeClientManager, String str) {
            this.mRealtimeClientManager = new WeakReference(realtimeClientManager);
            this.mKeepaliveCondition = str;
        }
    }

    private synchronized void clearLastStopRunnable() {
        Runnable runnable = this.mDelayStopRunnable;
        if (runnable != null) {
            this.mMainLooperHandler.removeCallbacks(runnable);
        }
        this.mDelayStopRunnable = null;
    }

    public synchronized void doKeepAlive(String str) {
        clearLastStopRunnable();
        RealtimeClientManager realtimeClientManager = (RealtimeClientManager) this.mRealtimeClientManagerProvider.get();
        this.mMainLooperHandler.post(new RealtimeClientKeepAlive$$ExternalSyntheticLambda3(this, str, realtimeClientManager));
        RemoveKeepAliveRunnable removeKeepAliveRunnable = new RemoveKeepAliveRunnable(realtimeClientManager, this.mKeepaliveCondition);
        this.mDelayStopRunnable = removeKeepAliveRunnable;
        this.mMainLooperHandler.postDelayed(removeKeepAliveRunnable, (long) realtimeClientManager.mRealtimeClientConfig.delayDisconnectMQTTMS);
    }

    public synchronized void onSessionWillEnd() {
        clearLastStopRunnable();
        this.mMainLooperHandler.post(new RemoveKeepAliveRunnable((RealtimeClientManager) this.mRealtimeClientManagerProvider.get(), this.mKeepaliveCondition));
    }

    public static RealtimeClientKeepAlive getInstance(UserSession userSession) {
        return (RealtimeClientKeepAlive) userSession.A01(RealtimeClientKeepAlive.class, new RealtimeClientKeepAlive$$ExternalSyntheticLambda2(userSession));
    }

    /* renamed from: lambda$doKeepAlive$2$com-instagram-realtimeclient-keepalive-RealtimeClientKeepAlive  reason: not valid java name */
    public /* synthetic */ void m64lambda$doKeepAlive$2$cominstagramrealtimeclientkeepaliveRealtimeClientKeepAlive(String str, RealtimeClientManager realtimeClientManager) {
        if (!this.mUserSession.hasEnded()) {
            this.mDirectPluginProvider.get();
            UserSession userSession = this.mUserSession;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(str, 1);
            2DU.A00(userSession).A0A(str);
            realtimeClientManager.addKeepAliveCondition(this.mKeepaliveCondition);
        }
    }

    public RealtimeClientKeepAlive(UserSession userSession, String str, Handler handler, AnonymousClass0eK r4, AnonymousClass0eK r5) {
        this.mUserSession = userSession;
        this.mKeepaliveCondition = str;
        this.mMainLooperHandler = handler;
        this.mRealtimeClientManagerProvider = r4;
        this.mDirectPluginProvider = r5;
    }

    public static /* synthetic */ RealtimeClientKeepAlive lambda$getInstance$1(UserSession userSession) {
        return new RealtimeClientKeepAlive(userSession, SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION, new Handler(Looper.getMainLooper()), new RealtimeClientKeepAlive$$ExternalSyntheticLambda0(userSession), new RealtimeClientKeepAlive$$ExternalSyntheticLambda1());
    }
}
