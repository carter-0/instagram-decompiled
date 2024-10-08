package com.shopify.checkout.models.errors.violations;

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

public final class InventoryErrorCodeSerializer implements C255463uA {
    public static final InventoryErrorCodeSerializer A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A02("InventoryErrorCode", C255493uD.A00);

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InventoryErrorCode inventoryErrorCode = (InventoryErrorCode) obj;
        AnonymousClass7TG.A1N(encoder, inventoryErrorCode);
        encoder.ASB(inventoryErrorCode.A00);
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0l = C13991Tnr.A0l(decoder);
        for (InventoryErrorCode inventoryErrorCode : InventoryErrorCode.values()) {
            if (0qQ.A0K(inventoryErrorCode.A00, A0l)) {
                return inventoryErrorCode;
            }
        }
        throw AnonymousClass7TF.A0W("Unknown InventoryErrorCode value: ", A0l);
    }
}
