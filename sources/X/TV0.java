package X;

import java.util.HashMap;

public final class TV0 extends 0Yg implements C62320sa {
    public static final TV0 A00 = new TV0();

    public TV0() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("CHECKOUT_ERROR", "Proactive checkout is not supported for this user.");
        A1E.put("SECURITY_ERROR", "Security domain mismatch. Payment availability and request are from different domains.");
        A1E.put("ABORTED", "User cancelled checkout.");
        A1E.put("“MULTIPLE_CHECKOUT_REQUEST", "Payment checkout request issued when there is an outstanding request.");
        A1E.put("INTERNAL_ERROR", "There was an internal error.");
        A1E.put("CHECKOUT_ERROR_RISK", "Risk assessment blocked payment request.");
        A1E.put("PARTNER_MISMATCH", "Partner id mismatch. Payment availability and requests are using different partner id.");
        A1E.put("MERCHANT_MISMATCH", "Merchant id mismatch. Payment availability and requests are using different merchant id.");
        A1E.put("CHECKOUT_UNAVAILABLE", "Checkout requested when unavailable.");
        A1E.put("PAYMENT_MODE_MISMATCH", "Payment mode mismatch. Payment availability and payment request have different modes.");
        A1E.put("ECP_LAUNCH_PARAMS_NULL", "ECPPaymentRequest was null.");
        A1E.put("DISMISSED_FOR_SESSION", "User has dismissed Meta payment for this browser session.");
        return A1E;
    }
}
