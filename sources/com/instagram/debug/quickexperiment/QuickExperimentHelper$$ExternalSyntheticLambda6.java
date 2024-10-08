package com.instagram.debug.quickexperiment;

import X.0lg;
import X.0yN;
import X.2Ru;
import X.AnonymousClass0fN;
import X.C50989Fmc;
import android.content.Context;
import android.view.View;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;

public final /* synthetic */ class QuickExperimentHelper$$ExternalSyntheticLambda6 implements View.OnClickListener {
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ 0lg f$1;
    public final /* synthetic */ 0yN f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ C50989Fmc f$5;
    public final /* synthetic */ QuickExperimentDebugStore f$6;
    public final /* synthetic */ 2Ru f$7;

    public /* synthetic */ QuickExperimentHelper$$ExternalSyntheticLambda6(Context context, 0lg r2, 0yN r3, String str, String str2, C50989Fmc fmc, QuickExperimentDebugStore quickExperimentDebugStore, 2Ru r8) {
        this.f$0 = context;
        this.f$1 = r2;
        this.f$2 = r3;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = fmc;
        this.f$6 = quickExperimentDebugStore;
        this.f$7 = r8;
    }

    public final void onClick(View view) {
        AnonymousClass0fN.A00(QuickExperimentHelper.getSimpleDialog(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7));
    }
}
