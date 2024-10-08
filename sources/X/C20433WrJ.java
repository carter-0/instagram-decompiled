package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WrJ  reason: case insensitive filesystem */
public final class C20433WrJ implements C255463uA {
    public static final C20433WrJ A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A02("com.meta.NumberSerializer", C258713zW.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Float.valueOf(decoder.ANr());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Number number = (Number) obj;
        AnonymousClass7TG.A1N(encoder, number);
        if (number instanceof Double) {
            if (!Double.isNaN(number.doubleValue())) {
                encoder.ARw(number.doubleValue());
                return;
            }
        } else if (number instanceof Float) {
            if (!Float.isNaN(number.floatValue())) {
                encoder.ARy(number.floatValue());
                return;
            }
        } else if (number instanceof Long) {
            encoder.AS4(number.longValue());
            return;
        } else if (number instanceof Integer) {
            encoder.AS2(number.intValue());
            return;
        } else {
            return;
        }
        encoder.AS6();
    }
}
