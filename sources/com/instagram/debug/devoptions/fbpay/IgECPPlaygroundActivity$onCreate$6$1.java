package com.instagram.debug.devoptions.fbpay;

import X.0hq;
import X.0qQ;
import X.0sl;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C11353SOm;
import X.C8608Qxp;
import android.os.Bundle;
import android.view.View;
import com.facebookpay.confirmation.model.ECPConfirmationParams;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Set;

public final class IgECPPlaygroundActivity$onCreate$6$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$6$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1907787588);
        IgECPPlaygroundActivity igECPPlaygroundActivity = this.this$0;
        if (igECPPlaygroundActivity.ecpLauncher == null) {
            0qQ.A0F("ecpLauncher");
            throw AnonymousClass00P.createAndThrow();
        }
        0hq supportFragmentManager = igECPPlaygroundActivity.getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("STYLE_RES", 2132017647);
        C8608Qxp qxp = new C8608Qxp();
        qxp.setArguments(A0a);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new ECPConfirmationUpsellAction("LINK", "Connected", "messages", "Stay connected", "https://m.facebook.com/facebook_pay/connect_learn_more"));
        String str = "LINK";
        A1C.add(new ECPConfirmationUpsellAction(str, "Invite", "envelope_invitation", "Invite your friends", ""));
        A1C.add(new ECPConfirmationUpsellAction(str, "Share", "share", "Share fundraiser", ""));
        ECPConfirmationParams eCPConfirmationParams = new ECPConfirmationParams(new ECPConfirmationUpsellSection("Up Next", A1C), "Thanks for your purchase", "A confirmation email was sent to example@fb.com", "See Receipt", "https://m.facebook.com/facebook_pay/connect_learn_more", "Add extra security with PIN", "CLOSE");
        Set set = 0sl.A00;
        LoggingContext loggingContext = new LoggingContext((LoggingPolicy) null, "uplclienttest_1634071535_403977fe-132e-4c89-9498-8e1ef4bf95e1", set, set, 137885231632764L, false);
        C11353SOm A01 = AnonymousClass2E0.A01();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putParcelable("ECP_CONFIRMATION_FRAGMENT_PARAMS", eCPConfirmationParams);
        A0a2.putParcelable("logging_context", loggingContext);
        qxp.A06 = A01.A03(A0a2, "content_confirmation_fragment");
        qxp.A0B(supportFragmentManager, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        AnonymousClass0fD.A0C(1805183970, A05);
    }
}
