package com.instagram.debug.devoptions.metadata.utils;

import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass6W8;
import X.C254783t2;
import X.C273654mx;
import X.C59910bu;
import X.C62320sa;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ThreadMetadataOverrideBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Object();
    public static final String INTENT_ACTION = "dev_intent_action_thread_metadata_override";
    public final C62320sa activityProvider;
    public final C62320sa threadTargetProvider;
    public final UserSession userSession;

    public ThreadMetadataOverrideBroadcastReceiver(C62320sa r2, UserSession userSession2, C62320sa r4) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(userSession2, 2);
        0qQ.A0B(r4, 3);
        this.activityProvider = r2;
        this.userSession = userSession2;
        this.threadTargetProvider = r4;
    }

    public static final boolean isEnabled(UserSession userSession2) {
        return Companion.isEnabled(userSession2);
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0fD.A01(-1086799473);
        AnonymousClass0fQ.A01(this, context, intent);
        0qQ.A0B(context, 0);
        0qQ.A0B(intent, 1);
        if (!C59910bu.A02().A00(context, intent, this)) {
            i = 1292916960;
        } else {
            Activity activity = (Activity) this.activityProvider.invoke();
            UserSession userSession2 = this.userSession;
            AnonymousClass6W8 r3 = new AnonymousClass6W8(activity, ThreadMetadataOverrideFragment.Companion.createArgs(userSession2, (C254783t2) this.threadTargetProvider.invoke()), userSession2, ModalActivity.class, C273654mx.A00(2244));
            r3.A08();
            r3.A0C(activity);
            i = -731173789;
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }

    public final class Companion {
        public final boolean isEnabled(UserSession userSession) {
            0qQ.A0B(userSession, 0);
            182.A06(0Tu.A05, userSession, 36318101721061241L);
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
