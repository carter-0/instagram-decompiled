package kotlinx.serialization.json;

import X.0qQ;
import X.AnonymousClass48A;
import X.C18283Vp3;
import X.C18700Vwy;
import X.C20417Wr1;
import X.C255463uA;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class JsonNullSerializer implements C255463uA {
    public static final SerialDescriptor A00 = C18700Vwy.A00("kotlinx.serialization.json.JsonNull", new C20417Wr1(), AnonymousClass48A.A00, new SerialDescriptor[0]);
    public static final JsonNullSerializer A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C18283Vp3.A00(decoder);
        if (!decoder.AO3()) {
            return JsonNull.A00;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        0qQ.A0B(encoder, 0);
        C18283Vp3.A01(encoder);
        encoder.AS6();
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }
}
