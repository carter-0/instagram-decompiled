package kotlinx.serialization.json;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C18283Vp3;
import X.C18700Vwy;
import X.C18804W2u;
import X.C20417Wr1;
import X.C255463uA;
import X.C255493uD;
import X.C51969G9p;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class JsonPrimitiveSerializer implements C255463uA {
    public static final SerialDescriptor A00 = C18700Vwy.A00("kotlinx.serialization.json.JsonPrimitive", new C20417Wr1(), C255493uD.A00, new SerialDescriptor[0]);
    public static final JsonPrimitiveSerializer A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        JsonElement AO0 = C18283Vp3.A00(decoder).AO0();
        if (AO0 instanceof JsonPrimitive) {
            return AO0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected JSON element, expected JsonPrimitive, had ");
        throw C18804W2u.A01(AO0.toString(), AnonymousClass7TF.A0i(C51969G9p.A0x(AO0), sb), -1);
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AnonymousClass7TG.A1N(encoder, obj);
        C18283Vp3.A01(encoder);
        if (obj instanceof JsonNull) {
            encoder.AS9(JsonNull.A00, JsonNullSerializer.A01);
            return;
        }
        encoder.AS9(obj, JsonLiteralSerializer.A01);
    }
}
