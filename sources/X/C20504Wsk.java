package X;

import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsk  reason: case insensitive filesystem */
public final /* synthetic */ class C20504Wsk implements C255533uI {
    public static final C20504Wsk A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        long j = 0;
        String str = null;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new OHAIConfig(str, i5, i, i4, i2, i3, j2, j);
                case 0:
                    i = ADI.ANz(serialDescriptor, 0);
                    i5 |= 1;
                    break;
                case 1:
                    str = ADI.AOA(serialDescriptor, 1);
                    i5 |= 2;
                    break;
                case 2:
                    i4 = ADI.ANz(serialDescriptor, 2);
                    i5 |= 4;
                    break;
                case 3:
                    i2 = ADI.ANz(serialDescriptor, 3);
                    i5 |= 8;
                    break;
                case 4:
                    i3 = ADI.ANz(serialDescriptor, 4);
                    i5 |= 16;
                    break;
                case 5:
                    j2 = ADI.AO2(serialDescriptor, 5);
                    i5 |= 32;
                    break;
                case 6:
                    j = ADI.AO2(serialDescriptor, 6);
                    i5 |= 64;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Wsk, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig", obj, 7);
        r1.A00("keyId");
        r1.A00("publicKey");
        r1.A00("kemId");
        r1.A00("kdfId");
        r1.A00("aeadId");
        r1.A00("expirationDate");
        r1.A00("lastUpdatedTime");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C360278eK r0 = C360278eK.A00;
        C255453u9 r1 = C255453u9.A01;
        C258663zR r5 = C258663zR.A00;
        return new C255463uA[]{r0, r1, r0, r0, r0, r5, r5};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        OHAIConfig oHAIConfig = (OHAIConfig) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, oHAIConfig);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS3(serialDescriptor, 0, oHAIConfig.A03);
        ADJ.ASC(oHAIConfig.A06, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS3(serialDescriptor, 2, oHAIConfig.A02);
        ADJ.AS3(serialDescriptor, 3, oHAIConfig.A01);
        ADJ.AS3(serialDescriptor, 4, oHAIConfig.A00);
        ADJ.AS5(serialDescriptor, 5, oHAIConfig.A04);
        ADJ.AS5(serialDescriptor, 6, oHAIConfig.A05);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
