package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.40E  reason: invalid class name */
public final class AnonymousClass40E implements C255463uA {
    public static final AnonymousClass40E A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("kotlin.Boolean", AnonymousClass40F.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return Boolean.valueOf(decoder.ANh());
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        0qQ.A0B(encoder, 0);
        encoder.ARs(booleanValue);
    }
}
