package com.facebookpay.offsite.models.message;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C7210Pzc;
import X.Pxj;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.google.gson.Gson;
import java.util.Map;

public final class GsonUtils {
    public static final GsonUtils INSTANCE = new Object();
    public static final Gson defaultGson = new Gson();

    public final String getMessageType(String str) {
        0qQ.A0B(str, 0);
        return ((BaseMessage) defaultGson.A08(str, BaseMessage.class)).messageType;
    }

    public final String getToJson(Object obj) {
        0qQ.A0B(obj, 0);
        if ((obj instanceof AvailabilityResponse) || (obj instanceof PaymentDetailsChangedEvent) || (obj instanceof PaymentResponse)) {
            String A0B = defaultGson.A0B(obj);
            0qQ.A07(A0B);
            return A0B;
        }
        throw AnonymousClass7TE.A0z("Invalid message to convert to Json");
    }

    public final Map getToRedactedMap(String str) {
        0qQ.A0B(str, 0);
        Object A09 = defaultGson.A09(str, new GsonUtils$toRedactedMap$1().type);
        0qQ.A07(A09);
        return (Map) A09;
    }

    public final PaymentDetailsUpdatedResponse toOffsitePaymentUpdatedMsg(String str, String str2) {
        0qQ.A0B(str, 0);
        Object A08 = deserializerGson(str2).A08(str, PaymentDetailsUpdatedResponse.class);
        0qQ.A07(A08);
        return (PaymentDetailsUpdatedResponse) A08;
    }

    public static /* synthetic */ Gson deserializerGson$default(GsonUtils gsonUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return gsonUtils.deserializerGson(str);
    }

    public final Gson deserializerGson(String str) {
        C7210Pzc pzc = new C7210Pzc();
        pzc.A07 = true;
        pzc.A01(new OffsiteTypeAdapterFactory(str));
        return pzc.A00();
    }

    public final CheckoutAvailability getToOffsiteAvailabilityResponse(String str) {
        Object A08 = Pxj.A0Z(this, str).A08(str, CheckoutAvailability.class);
        0qQ.A07(A08);
        return (CheckoutAvailability) A08;
    }

    public final PaymentHandledRequest getToOffsitePaymentHandledMsg(String str) {
        Object A08 = Pxj.A0Z(this, str).A08(str, PaymentHandledRequest.class);
        0qQ.A07(A08);
        return (PaymentHandledRequest) A08;
    }

    public final PaymentRequest getToOffsitePaymentRequest(String str) {
        Object A08 = Pxj.A0Z(this, str).A08(str, PaymentRequest.class);
        0qQ.A07(A08);
        return (PaymentRequest) A08;
    }

    public final StartCheckoutRequest getToOffsiteStartCheckoutRequest(String str) {
        Object A08 = Pxj.A0Z(this, str).A08(str, StartCheckoutRequest.class);
        0qQ.A07(A08);
        return (StartCheckoutRequest) A08;
    }

    public final ScriptOverrideRequest getToScriptOverrideRequest(String str) {
        Object A08 = Pxj.A0Z(this, str).A08(str, ScriptOverrideRequest.class);
        0qQ.A07(A08);
        return (ScriptOverrideRequest) A08;
    }
}
