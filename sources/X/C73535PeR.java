package X;

import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PeR  reason: case insensitive filesystem */
public final /* synthetic */ class C73535PeR implements C255533uI {
    public static final C73535PeR A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        boolean z = false;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new IGSupervisionUpsellEligibilityStatus(i, z);
            } else if (ANp == 0) {
                z = ADI.ANi(serialDescriptor, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.PeR, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus", obj, 1);
        r1.A00("isEligible");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{AnonymousClass40E.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IGSupervisionUpsellEligibilityStatus iGSupervisionUpsellEligibilityStatus = (IGSupervisionUpsellEligibilityStatus) obj;
        AnonymousClass7TG.A1N(encoder, iGSupervisionUpsellEligibilityStatus);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ARt(serialDescriptor, 0, iGSupervisionUpsellEligibilityStatus.A00);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
