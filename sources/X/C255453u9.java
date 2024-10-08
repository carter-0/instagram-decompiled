package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3u9  reason: invalid class name and case insensitive filesystem */
public final class C255453u9 implements C255463uA {
    public static final SerialDescriptor A00 = new C255523uG("kotlin.String", C255493uD.A00);
    public static final C255453u9 A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return decoder.AO9();
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        0qQ.A0B(encoder, 0);
        0qQ.A0B(str, 1);
        encoder.ASB(str);
    }
}
