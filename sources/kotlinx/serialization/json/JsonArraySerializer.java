package kotlinx.serialization.json;

import X.0qQ;
import X.AnonymousClass409;
import X.AnonymousClass7TG;
import X.C18283Vp3;
import X.C20439Wrh;
import X.C255463uA;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class JsonArraySerializer implements C255463uA {
    public static final SerialDescriptor A00 = C20439Wrh.A01;
    public static final JsonArraySerializer A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C18283Vp3.A00(decoder);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        0qQ.A0B(jsonElementSerializer, 0);
        return new JsonArray((List) new AnonymousClass409(jsonElementSerializer).deserialize(decoder));
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AnonymousClass7TG.A1N(encoder, obj);
        C18283Vp3.A01(encoder);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        0qQ.A0B(jsonElementSerializer, 0);
        new AnonymousClass409(jsonElementSerializer).serialize(encoder, obj);
    }
}
