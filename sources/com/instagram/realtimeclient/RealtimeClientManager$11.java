package com.instagram.realtimeclient;

import X.0qQ;
import X.0vM;
import X.AnonymousClass7TF;
import X.C2605045x;
import X.C294045ll;
import X.C294055lm;

public class RealtimeClientManager$11 extends 0vM {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ boolean val$isForegrounded;
    public final /* synthetic */ boolean val$isMsysPresenceReporting;
    public final /* synthetic */ RealtimeClientManager$PresenceMsysAppStateChangeObserver val$localPresenceMsysAppStateChangeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealtimeClientManager$11(RealtimeClientManager realtimeClientManager, String str, int i, boolean z, RealtimeClientManager$PresenceMsysAppStateChangeObserver realtimeClientManager$PresenceMsysAppStateChangeObserver, boolean z2) {
        super(str, i);
        this.this$0 = realtimeClientManager;
        this.val$isForegrounded = z;
        this.val$localPresenceMsysAppStateChangeObserver = realtimeClientManager$PresenceMsysAppStateChangeObserver;
        this.val$isMsysPresenceReporting = z2;
    }

    public void loggedRun() {
        String str;
        boolean z = this.val$isForegrounded;
        RealtimeClientManager$PresenceMsysAppStateChangeObserver realtimeClientManager$PresenceMsysAppStateChangeObserver = this.val$localPresenceMsysAppStateChangeObserver;
        if (z) {
            realtimeClientManager$PresenceMsysAppStateChangeObserver.onAppForegrounded();
        } else {
            realtimeClientManager$PresenceMsysAppStateChangeObserver.onAppBackgrounded();
        }
        RealtimeClientManager realtimeClientManager = this.this$0;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        C294055lm A00 = C294045ll.A00(realtimeClientManager.mUserSession);
        boolean z2 = this.val$isForegrounded;
        boolean z3 = this.val$isMsysPresenceReporting;
        C2605045x A002 = C2605045x.A00();
        synchronized (A002) {
            if (z2) {
                str = AnonymousClass7TF.A0c();
                A002.A01 = str;
            } else {
                str = AnonymousClass7TF.A0c();
                A002.A00 = str;
            }
        }
        0qQ.A0A(str);
        C294055lm.A00(A00, Boolean.valueOf(z2), (Boolean) null, Boolean.valueOf(z3), "app_state_update", str);
    }
}
