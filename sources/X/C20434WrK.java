package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WrK  reason: case insensitive filesystem */
public final class C20434WrK implements C255463uA {
    public static final C20434WrK A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A02("Feature", C255493uD.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        List A18 = DbV.A18(decoder.AO9(), ",");
        return new ULA(AnonymousClass7TE.A19(A18, 0), Integer.parseInt(AnonymousClass7TE.A19(A18, 1)));
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ULA ula = (ULA) obj;
        AnonymousClass7TG.A1N(encoder, ula);
        encoder.ASB(002.A0G(ula.A01, ',', ula.A00));
    }
}
