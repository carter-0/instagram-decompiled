package com.facebookpay.offsite.models.message;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C7210Pzc;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OffsitePaymentRequestTypeAdapter extends TypeAdapter {
    public static final Companion Companion = new Object();
    public static final OffsitePaymentRequestTypeAdapter$Companion$paymentConfigurationTypeToken$1 paymentConfigurationTypeToken = new OffsitePaymentRequestTypeAdapter$Companion$paymentConfigurationTypeToken$1();
    public static final OffsitePaymentRequestTypeAdapter$Companion$paymentOptionsTypeToken$1 paymentOptionsTypeToken = new OffsitePaymentRequestTypeAdapter$Companion$paymentOptionsTypeToken$1();
    public final Gson gson;
    public final TypeAdapter paymentConfigurationAdapter;
    public final TypeAdapter paymentOptionsAdapter;

    public OffsitePaymentRequestTypeAdapter(Gson gson2) {
        0qQ.A0B(gson2, 1);
        this.gson = gson2;
        this.paymentOptionsAdapter = gson2.A03(paymentOptionsTypeToken);
        this.paymentConfigurationAdapter = gson2.A03(paymentConfigurationTypeToken);
    }

    public PaymentRequestContent read(JsonReader jsonReader) {
        Object obj;
        Object A05;
        0qQ.A0B(jsonReader, 0);
        JsonObject jsonObject = (JsonObject) this.gson.A06(new TypeToken(JsonObject.class), jsonReader);
        String str = "paymentOptions";
        JsonElement jsonElement = jsonObject.get(str);
        Object obj2 = null;
        if (jsonElement != null) {
            obj = this.paymentOptionsAdapter.fromJsonTree(jsonElement);
        } else {
            obj = null;
        }
        JsonElement jsonElement2 = jsonObject.get("paymentConfiguration");
        if (jsonElement2 != null) {
            obj2 = this.paymentConfigurationAdapter.fromJsonTree(jsonElement2);
        }
        C7210Pzc pzc = new C7210Pzc();
        pzc.A07 = true;
        if (obj != null) {
            PaymentOptions paymentOptions = (PaymentOptions) obj;
            pzc.A01(new OffsitePaymentDetailsTypeAdapterFactory(paymentOptions.fulfillmentType));
            Gson A00 = pzc.A00();
            str = "paymentDetails";
            JsonElement jsonElement3 = jsonObject.get(str);
            if (!(jsonElement3 == null || (A05 = A00.A05(jsonElement3, PaymentDetails.class)) == null)) {
                PaymentDetails paymentDetails = (PaymentDetails) A05;
                if (obj2 != null) {
                    return new PaymentRequestContent(paymentDetails, paymentOptions, (PaymentConfiguration) obj2);
                }
                0qQ.A0F("paymentConfiguration");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentRequestContent paymentRequestContent) {
        throw AnonymousClass7TE.A1B("Use default gson builders to create JSON strings from Kotlin objects");
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        throw AnonymousClass7TE.A1B("Use default gson builders to create JSON strings from Kotlin objects");
    }
}
