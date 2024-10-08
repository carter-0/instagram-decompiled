package com.facebookpay.offsite.models.message;

import X.0qQ;
import X.AnonymousClass7TE;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OffsiteJSONErrorTypeAdapter extends TypeAdapter {
    public static final Companion Companion = new Object();
    public static final OffsiteJSONErrorTypeAdapter$Companion$errorTypeToken$1 errorTypeToken = new OffsiteJSONErrorTypeAdapter$Companion$errorTypeToken$1();
    public final Gson gson;

    public OffsiteJSONErrorTypeAdapter(Gson gson2) {
        0qQ.A0B(gson2, 1);
        this.gson = gson2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebookpay.offsite.models.message.PaymentDetailsUpdatedError, java.util.Map, java.util.HashMap] */
    public PaymentDetailsUpdatedError read(JsonReader jsonReader) {
        0qQ.A0B(jsonReader, 0);
        ? hashMap = new HashMap();
        jsonReader.A0N();
        while (jsonReader.A0S()) {
            hashMap.put(jsonReader.A0J(), this.gson.A03(errorTypeToken).read(jsonReader));
        }
        jsonReader.A0P();
        return hashMap;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentDetailsUpdatedError paymentDetailsUpdatedError) {
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
