package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class MZU implements C255533uI {
    public static final MZU A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new PushInfraMetaData(l, str, str7, str8, str5, str6, str4, str2, str3, i);
                case 0:
                    str = (String) ADI.AO4(str, C255453u9.A01, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) ADI.AO4(l, C258663zR.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str7 = (String) ADI.AO4(str7, C255453u9.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str8 = (String) ADI.AO4(str8, C255453u9.A01, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) ADI.AO4(str5, C255453u9.A01, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) ADI.AO4(str6, C255453u9.A01, serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) ADI.AO4(str4, C255453u9.A01, serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) ADI.AO4(str3, C255453u9.A01, serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.MZU, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.facebook.pushlite.model.PushInfraMetaData", obj, 9);
        r2.A01("l", true);
        r2.A01("ui", true);
        r2.A01("pjid", true);
        r2.A01("hcs", true);
        r2.A01("hek", true);
        r2.A01("hki", true);
        r2.A01("tid", true);
        r2.A01("nid", true);
        r2.A01("ca", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r1 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r1), C360578eo.A00(C258663zR.A00), C360578eo.A00(r1), C360578eo.A00(r1), C360578eo.A00(r1), C360578eo.A00(r1), C360578eo.A00(r1), C360578eo.A00(r1), C360578eo.A00(r1)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, pushInfraMetaData);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C250863mB r0 = PushInfraMetaData.A09;
        if (ADJ.EsA(serialDescriptor, 0) || pushInfraMetaData.A05 != null) {
            ADJ.AS7(pushInfraMetaData.A05, C255453u9.A01, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || pushInfraMetaData.A00 != null) {
            ADJ.AS7(pushInfraMetaData.A00, C258663zR.A00, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || pushInfraMetaData.A07 != null) {
            ADJ.AS7(pushInfraMetaData.A07, C255453u9.A01, serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || pushInfraMetaData.A02 != null) {
            ADJ.AS7(pushInfraMetaData.A02, C255453u9.A01, serialDescriptor, 3);
        }
        if (ADJ.EsA(serialDescriptor, 4) || pushInfraMetaData.A03 != null) {
            ADJ.AS7(pushInfraMetaData.A03, C255453u9.A01, serialDescriptor, 4);
        }
        if (ADJ.EsA(serialDescriptor, 5) || pushInfraMetaData.A04 != null) {
            ADJ.AS7(pushInfraMetaData.A04, C255453u9.A01, serialDescriptor, 5);
        }
        if (ADJ.EsA(serialDescriptor, 6) || pushInfraMetaData.A08 != null) {
            ADJ.AS7(pushInfraMetaData.A08, C255453u9.A01, serialDescriptor, 6);
        }
        if (ADJ.EsA(serialDescriptor, 7) || pushInfraMetaData.A06 != null) {
            ADJ.AS7(pushInfraMetaData.A06, C255453u9.A01, serialDescriptor, 7);
        }
        if (ADJ.EsA(serialDescriptor, 8) || pushInfraMetaData.A01 != null) {
            ADJ.AS7(pushInfraMetaData.A01, C255453u9.A01, serialDescriptor, 8);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
