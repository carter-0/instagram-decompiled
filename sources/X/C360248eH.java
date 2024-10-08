package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eH  reason: invalid class name and case insensitive filesystem */
public final class C360248eH implements C255463uA {
    public static final SerialDescriptor A00 = C276374t8.A00("X.8eG", C258663zR.A00);
    public static final C360248eH A01 = new Object();

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return new C360238eG(decoder.ANw(A00).AO1());
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        long j = ((C360238eG) obj).A00;
        0qQ.A0B(encoder, 0);
        encoder.AS0(A00).AS4(j);
    }
}
