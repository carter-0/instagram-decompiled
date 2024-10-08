package com.instagram.debug.devoptions.section.igsignals;

import X.002;
import X.AnonymousClass0fN;
import android.app.AlertDialog;
import android.content.Context;

public final class IgSignalsOptions$showCasperResult$1 implements Runnable {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ long $minutes;

    public IgSignalsOptions$showCasperResult$1(Context context, long j) {
        this.$context = context;
        this.$minutes = j;
    }

    public final void run() {
        AnonymousClass0fN.A00(new AlertDialog.Builder(this.$context).setMessage(002.A0Q("Result is: ", this.$minutes)).setPositiveButton(2131968772, AnonymousClass1.INSTANCE).create());
    }
}
