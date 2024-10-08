package X;

import com.instagram.trust.noncemanager.VettedDeviceNonces;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.4z8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C279704z8 implements C255533uI {
    public static final C279704z8 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new VettedDeviceNonces(str, str2, i);
            } else if (ANp == 0) {
                str = (String) ADI.AO4(str, C255453u9.A01, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4z8, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.instagram.trust.noncemanager.VettedDeviceNonces", obj, 2);
        r2.A01("vetted_device_first_factor_nonce", false);
        r2.A01("vetted_device_second_factor_nonce", false);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r0), C360578eo.A00(r0)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        VettedDeviceNonces vettedDeviceNonces = (VettedDeviceNonces) obj;
        0qQ.A0B(encoder, 0);
        0qQ.A0B(vettedDeviceNonces, 1);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255453u9 r1 = C255453u9.A01;
        ADJ.AS7(vettedDeviceNonces.A00, r1, serialDescriptor, 0);
        ADJ.AS7(vettedDeviceNonces.A01, r1, serialDescriptor, 1);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
