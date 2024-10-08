package com.instagram.debug.devoptions.fbpay;

import X.0kR;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass2E0;
import X.DbX;
import android.content.Intent;
import android.view.View;

public final class IgECPPlaygroundActivity$onCreate$8$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$8$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity, android.app.Activity] */
    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1772067967);
        Intent A09 = DbX.A09(IgECPPlaygroundActivity.DEEPLINK_URL);
        AnonymousClass2E0.A07();
        ? r3 = this.this$0;
        0qQ.A0B(r3, 2);
        0kR.A00.A08(IgECPPlaygroundActivity.DOMAIN).A0F(r3, A09, 10);
        AnonymousClass0fD.A0C(-285887452, A05);
    }
}
