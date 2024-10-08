package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.40v  reason: invalid class name and case insensitive filesystem */
public final class C2592140v implements C255463uA {
    public static final C2592140v A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("kotlin.Float", C2592240w.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Float.valueOf(decoder.ANr());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        0qQ.A0B(encoder, 0);
        encoder.ARy(floatValue);
    }
}
