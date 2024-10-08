package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eV  reason: invalid class name and case insensitive filesystem */
public final class C360388eV implements C255463uA {
    public static final SerialDescriptor A00 = C276374t8.A00("X.8eU", C360348eR.A00);
    public static final C360388eV A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return new C360378eU(decoder.ANw(A00).AO7());
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        short s = ((C360378eU) obj).A00;
        0qQ.A0B(encoder, 0);
        encoder.AS0(A00).ASA(s);
    }
}
