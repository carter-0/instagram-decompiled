package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eB  reason: invalid class name and case insensitive filesystem */
public final class C360188eB implements C255463uA {
    public static final C360188eB A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("kotlin.Char", C360198eC.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Character.valueOf(decoder.ANl());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        0qQ.A0B(encoder, 0);
        encoder.ARv(charValue);
    }
}
