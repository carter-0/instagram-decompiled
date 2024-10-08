package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eK  reason: invalid class name and case insensitive filesystem */
public final class C360278eK implements C255463uA {
    public static final C360278eK A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("kotlin.Int", C360288eL.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Integer.valueOf(decoder.ANy());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int intValue = ((Number) obj).intValue();
        0qQ.A0B(encoder, 0);
        encoder.AS2(intValue);
    }
}
