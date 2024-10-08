package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8ec  reason: invalid class name and case insensitive filesystem */
public final class C360458ec implements C255463uA {
    public static final SerialDescriptor A00 = C276374t8.A00("X.8eb", C360418eY.A00);
    public static final C360458ec A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return new C360448eb(decoder.ANw(A00).ANj());
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        byte b = ((C360448eb) obj).A00;
        0qQ.A0B(encoder, 0);
        encoder.AS0(A00).ARu(b);
    }
}
