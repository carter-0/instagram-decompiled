package kotlinx.serialization.json;

import X.00l;
import X.012;
import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C18281Vp1;
import X.C18283Vp3;
import X.C18700Vwy;
import X.C18804W2u;
import X.C255463uA;
import X.C255493uD;
import X.C360238eG;
import X.C360248eH;
import X.C51969G9p;
import X.C51971G9r;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class JsonLiteralSerializer implements C255463uA {
    public static final SerialDescriptor A00 = C18700Vwy.A02("kotlinx.serialization.json.JsonLiteral", C255493uD.A00);
    public static final JsonLiteralSerializer A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        JsonElement AO0 = C18283Vp3.A00(decoder).AO0();
        if (AO0 instanceof JsonLiteral) {
            return AO0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected JSON element, expected JsonLiteral, had ");
        throw C18804W2u.A01(AO0.toString(), AnonymousClass7TF.A0i(C51969G9p.A0x(AO0), sb), -1);
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        long j;
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        AnonymousClass7TG.A1N(encoder, jsonLiteral);
        C18283Vp3.A01(encoder);
        if (!jsonLiteral.A01) {
            String str = jsonLiteral.A00;
            Long A0n = C51971G9r.A0n(0, str);
            if (A0n != null) {
                j = A0n.longValue();
            } else {
                0qQ.A0B(str, 0);
                C360238eG A012 = C18281Vp1.A01(str);
                if (A012 != null) {
                    j = A012.A00;
                    encoder = encoder.AS0(C360248eH.A00);
                } else {
                    Double A0p = 012.A0p(str);
                    if (A0p != null) {
                        encoder.ARw(A0p.doubleValue());
                        return;
                    }
                    Boolean A0A = 00l.A0A(str);
                    if (A0A != null) {
                        encoder.ARs(A0A.booleanValue());
                        return;
                    }
                }
            }
            encoder.AS4(j);
            return;
        }
        encoder.ASB(jsonLiteral.A00);
    }
}
