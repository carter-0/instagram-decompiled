package X;

import java.util.HashMap;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PeQ  reason: case insensitive filesystem */
public final /* synthetic */ class C73534PeQ implements C255533uI {
    public static final C73534PeQ A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r7 = C71007OYd.A02;
        HashMap hashMap = null;
        long j = 0;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new C71007OYd(hashMap, i, j);
            } else if (ANp == 0) {
                hashMap = (HashMap) ADI.AO5(hashMap, r7[0], serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                j = ADI.AO2(serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.PeQ, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.instagram.igsignals.signals.odin.IgSignalsOdinServerFeaturesProvider.ServerFeaturesData", obj, 2);
        r1.A00("features");
        r1.A00("timestamp");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C71007OYd.A02[0], C258663zR.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C71007OYd oYd = (C71007OYd) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, oYd);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(oYd.A01, C71007OYd.A02[0], serialDescriptor, 0);
        ADJ.AS5(serialDescriptor, A1U ? 1 : 0, oYd.A00);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
