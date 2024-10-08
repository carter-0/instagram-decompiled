package com.facebookpay.offsite.models.message;

import X.2G6;
import X.AnonymousClass7TG;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class OffsiteTypeAdapterFactory implements 2G6 {
    public final String fulfillmentType;

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public OffsiteTypeAdapterFactory(String str) {
        this.fulfillmentType = str;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        AnonymousClass7TG.A1N(gson, typeToken);
        if (PaymentRequestContent.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentRequestTypeAdapter(gson);
        }
        if (PaymentDetailsUpdatedResponse.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentDetailsUpdatedResponseTypeAdapter(gson, this.fulfillmentType);
        }
        return null;
    }
}
