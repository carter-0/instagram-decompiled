package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3zV  reason: invalid class name and case insensitive filesystem */
public final class C258703zV implements C255463uA {
    public static final C258703zV A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("kotlin.Double", C258713zW.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Double.valueOf(decoder.ANn());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        0qQ.A0B(encoder, 0);
        encoder.ARw(doubleValue);
    }
}
