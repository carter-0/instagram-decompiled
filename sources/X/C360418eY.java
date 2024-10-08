package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eY  reason: invalid class name and case insensitive filesystem */
public final class C360418eY implements C255463uA {
    public static final C360418eY A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("kotlin.Byte", C360428eZ.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Byte.valueOf(decoder.ANj());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        0qQ.A0B(encoder, 0);
        encoder.ARu(byteValue);
    }
}
