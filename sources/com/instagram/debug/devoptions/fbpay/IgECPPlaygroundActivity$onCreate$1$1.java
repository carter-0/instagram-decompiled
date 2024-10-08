package com.instagram.debug.devoptions.fbpay;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.C8924RFs;
import X.Pxh;
import X.S3G;
import android.view.View;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;

public final class IgECPPlaygroundActivity$onCreate$1$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$1$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2049809960);
        S3G s3g = this.this$0.ecpLauncher;
        if (s3g == null) {
            0qQ.A0F("ecpLauncher");
            throw AnonymousClass00P.createAndThrow();
        }
        C8924RFs rFs = C8924RFs.A0T;
        C8924RFs rFs2 = rFs;
        s3g.A00(new EcpUIConfiguration((AuthScreenStyle) null, rFs, rFs2, C8924RFs.A0Z, C8924RFs.A0a, C8924RFs.A0V, C8924RFs.A0c, C8924RFs.A0D, (EcpNuxLearnMoreScreenStyle) null, Pxh.A0V()), "FORCE_PUX");
        AnonymousClass0fD.A0C(908965828, A05);
    }
}
