package com.facebook.analytics2.logger.legacy.uploader;

import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.C59910bu;
import X.TRA;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class HighPriUploadRetryReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0fD.A01(393819729);
        AnonymousClass0fQ.A01(this, context, intent);
        if (!C59910bu.A02().A00(context, intent, this)) {
            i = -1061341555;
        } else if (!"com.facebook.analytics2.logger.UPLOAD_NOW".equals(intent.getAction())) {
            i = -1107968825;
        } else {
            new TRA(goAsync(), context, intent, this).start();
            i = 394066524;
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
