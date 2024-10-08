package com.shopify.checkout.models;

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

public final class DeliveryMethodSerializer implements C255463uA {
    public static final DeliveryMethodSerializer A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A02("DeliveryMethod", C255493uD.A00);

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryMethod deliveryMethod = (DeliveryMethod) obj;
        AnonymousClass7TG.A1N(encoder, deliveryMethod);
        encoder.ASB(deliveryMethod.A00);
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0l = C13991Tnr.A0l(decoder);
        for (DeliveryMethod deliveryMethod : DeliveryMethod.values()) {
            if (0qQ.A0K(deliveryMethod.A00, A0l)) {
                return deliveryMethod;
            }
        }
        throw AnonymousClass7TF.A0W("Unknown DeliveryMethod value: ", A0l);
    }
}
