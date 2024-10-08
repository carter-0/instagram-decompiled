package X;

import android.os.Bundle;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import java.util.LinkedHashSet;

/* renamed from: X.ReY  reason: case insensitive filesystem */
public abstract class C9654ReY {
    public static AnonymousClass2gB A00(0hq r12, PaypalConsentLaunchParams paypalConsentLaunchParams) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("STYLE_RES", 2132017647);
        String str = paypalConsentLaunchParams.A09;
        long parseLong = Long.parseLong(paypalConsentLaunchParams.A07);
        LoggingPolicy loggingPolicy = paypalConsentLaunchParams.A00;
        if (loggingPolicy != null) {
            linkedHashSet = SQ1.A01(loggingPolicy);
        } else {
            linkedHashSet = 0sl.A00;
        }
        if (loggingPolicy != null) {
            linkedHashSet2 = SQ1.A02(loggingPolicy);
        } else {
            linkedHashSet2 = 0sl.A00;
        }
        LoggingContext loggingContext = new LoggingContext(loggingPolicy, str, linkedHashSet, linkedHashSet2, parseLong, paypalConsentLaunchParams.A0B);
        A0a.putParcelable("PAYPAL_CONSENT_LAUNCH_PARAMS", paypalConsentLaunchParams);
        A0a.putParcelable("logging_context", loggingContext);
        QCE A03 = AnonymousClass2E0.A01().A03(A0a, "paypal_consent_fragment");
        0qQ.A0C(A03, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.ecp.ECPPayPalConsentContentFragment");
        QCE qce = A03;
        C8608Qxp qxp = new C8608Qxp();
        qxp.setArguments(A0a);
        AnonymousClass7TG.A1N(r12, qce);
        qxp.A06 = qce;
        qxp.A0B(r12, "PAYPAL_CONSENT_FRAGMENT_TAG");
        return qce.A09;
    }
}
