package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eR  reason: invalid class name and case insensitive filesystem */
public final class C360348eR implements C255463uA {
    public static final C360348eR A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("kotlin.Short", C360358eS.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Short.valueOf(decoder.AO7());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        0qQ.A0B(encoder, 0);
        encoder.ASA(shortValue);
    }
}
