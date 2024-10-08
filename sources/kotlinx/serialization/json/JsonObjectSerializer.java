package kotlinx.serialization.json;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C18283Vp3;
import X.C20440Wri;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.Dba;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class JsonObjectSerializer implements C255463uA {
    public static final SerialDescriptor A00 = C20440Wri.A01;
    public static final JsonObjectSerializer A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C18283Vp3.A00(decoder);
        C255453u9 r2 = C255453u9.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        AnonymousClass7TF.A1H(r2, jsonElementSerializer);
        return new JsonObject((Map) new C258613zM(r2, jsonElementSerializer).deserialize(decoder));
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        boolean A1Z = AnonymousClass7TG.A1Z(encoder, obj);
        C18283Vp3.A01(encoder);
        C255453u9 r2 = C255453u9.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        Dba.A0j(A1Z ? 1 : 0, r2, jsonElementSerializer);
        new C258613zM(r2, jsonElementSerializer).serialize(encoder, obj);
    }
}
