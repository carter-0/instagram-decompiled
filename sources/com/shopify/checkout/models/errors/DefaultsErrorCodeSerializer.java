package com.shopify.checkout.models.errors;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C18700Vwy;
import X.C255463uA;
import X.C255493uD;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class DefaultsErrorCodeSerializer implements C255463uA {
    public static final DefaultsErrorCodeSerializer A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A02("DefaultsErrorCode", C255493uD.A00);

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DefaultsErrorCode defaultsErrorCode = (DefaultsErrorCode) obj;
        AnonymousClass7TG.A1N(encoder, defaultsErrorCode);
        encoder.ASB(defaultsErrorCode.A00);
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0l = C13991Tnr.A0l(decoder);
        for (DefaultsErrorCode defaultsErrorCode : DefaultsErrorCode.values()) {
            if (0qQ.A0K(defaultsErrorCode.A00, A0l)) {
                return defaultsErrorCode;
            }
        }
        throw AnonymousClass7TF.A0W("Unknown DefaultsErrorCode value: ", A0l);
    }
}
