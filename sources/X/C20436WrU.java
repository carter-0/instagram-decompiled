package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WrU  reason: case insensitive filesystem */
public final class C20436WrU implements C255463uA {
    public static final C20436WrU A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A02("VaultedPaymentErrorCode", C255493uD.A00);

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C16544Uwq uwq = (C16544Uwq) obj;
        AnonymousClass7TG.A1N(encoder, uwq);
        encoder.ASB(uwq.A00);
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0l = C13991Tnr.A0l(decoder);
        for (C16544Uwq uwq : C16544Uwq.values()) {
            if (0qQ.A0K(uwq.A00, A0l)) {
                return uwq;
            }
        }
        throw AnonymousClass7TF.A0W("Unknown VaultedPaymentErrorCode value: ", A0l);
    }
}
