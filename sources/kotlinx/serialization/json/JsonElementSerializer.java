package kotlinx.serialization.json;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C18283Vp3;
import X.C18700Vwy;
import X.C20801WzD;
import X.C255463uA;
import X.C255473uB;
import X.TPI;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class JsonElementSerializer implements C255463uA {
    public static final JsonElementSerializer A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A00("kotlinx.serialization.json.JsonElement", new TPI(8), C20801WzD.A00, new SerialDescriptor[0]);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return C18283Vp3.A00(decoder).AO0();
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C255473uB r0;
        AnonymousClass7TG.A1N(encoder, obj);
        C18283Vp3.A01(encoder);
        if (obj instanceof JsonPrimitive) {
            r0 = JsonPrimitiveSerializer.A01;
        } else if (obj instanceof JsonObject) {
            r0 = JsonObjectSerializer.A01;
        } else if (obj instanceof JsonArray) {
            r0 = JsonArraySerializer.A01;
        } else {
            throw new RuntimeException();
        }
        encoder.AS9(obj, r0);
    }
}
