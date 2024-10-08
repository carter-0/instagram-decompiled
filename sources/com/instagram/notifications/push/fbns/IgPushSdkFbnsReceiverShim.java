package com.instagram.notifications.push.fbns;

import X.0qQ;
import X.0sP;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C51971G9r;
import X.C61170le;
import X.C638918c;
import X.C66580MXl;
import X.C67636MrP;
import X.C74113PpG;
import X.C74114PpH;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.react.modules.dialog.DialogModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgPushSdkFbnsReceiverShim extends BroadcastReceiver {
    public final 0sP A00;
    public final 0sP A01;

    public IgPushSdkFbnsReceiverShim(0sP r1, 0sP r2) {
        AnonymousClass7TG.A1O(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onReceive(Context context, Intent intent) {
        BroadcastReceiver broadcastReceiver;
        int A012 = AnonymousClass0fD.A01(1234519699);
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            qPLInstance.markerStart(875309620);
            qPLInstance.markerAnnotate(875309620, "provider", "FBNS");
        }
        int A03 = C66580MXl.A03(this, context, intent, 1799408930);
        QuickPerformanceLogger qPLInstance2 = QuickPerformanceLoggerProvider.getQPLInstance();
        boolean z = false;
        0qQ.A0B(intent, 0);
        if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction()) && DialogModule.KEY_MESSAGE.equals(intent.getStringExtra("receive_type"))) {
            z = C51971G9r.A1a(this.A00.invoke(this), this.A01);
        }
        if (z) {
            if (qPLInstance2 != null) {
                qPLInstance2.markerAnnotate(875309620, "use_push_sdk_receiver", true);
            }
            broadcastReceiver = C67636MrP.A01;
        } else {
            if (qPLInstance2 != null) {
                qPLInstance2.markerAnnotate(875309620, "use_push_sdk_receiver", false);
            }
            broadcastReceiver = new BroadcastReceiver();
        }
        broadcastReceiver.onReceive(context, intent);
        AnonymousClass0fD.A0E(1194615755, A03, intent);
        C638918c.A01(C61170le.A00).A0K(intent, AnonymousClass05K.A0N);
        AnonymousClass0fD.A0E(-2059119666, A012, intent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgPushSdkFbnsReceiverShim(C74113PpG ppG, C74114PpH ppH, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C74113PpG.A00 : ppG, (i & 2) != 0 ? C74114PpH.A00 : ppH);
    }

    public IgPushSdkFbnsReceiverShim() {
        this(C74113PpG.A00, C74114PpH.A00);
    }
}
