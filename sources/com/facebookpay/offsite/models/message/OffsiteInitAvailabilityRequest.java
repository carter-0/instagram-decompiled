package com.facebookpay.offsite.models.message;

import X.0Yt;
import X.AnonymousClass7TE;
import X.JTP;
import java.util.List;

public final class OffsiteInitAvailabilityRequest {
    public static final OffsiteInitAvailabilityRequest INSTANCE = new Object();

    public final PaymentRequest buildInitAvailabilityRequest() {
        return new PaymentRequest("", new PaymentRequestContent(new PaymentDetails((PaymentItem) null, AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), (String) null, (String) null, (W3CShippingAddress) null, (W3CShippingAddress) null, (List) null, (PaymentPickupInfo) null, (String) null, (String) null), new PaymentOptions(true, true, true, true, true, (String) null, (String) null, (String) null, true, false, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null), new PaymentConfiguration("", "UNKNOWN", "UNKNOWN", 0Yt.A0E(), (PaymentMode) null, (String) null, (String) null, "", "", JTP.A0y(PaymentUXFlags.META_CHECKOUT), (SessionUsageType) null, (String) null, (String) null, (String) null)), System.currentTimeMillis(), (String) null, MessageType$Companion.AVAILABLE_INIT_REQUEST, (PaymentError) null);
    }
}
