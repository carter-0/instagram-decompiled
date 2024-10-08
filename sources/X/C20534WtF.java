package X;

import com.shopify.checkout.models.NetworkRequestPayload;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtF  reason: case insensitive filesystem */
public final /* synthetic */ class C20534WtF implements C255533uI {
    public static final C20534WtF A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r9 = NetworkRequestPayload.A06;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new NetworkRequestPayload(str, str2, str3, str4, str5, map, i);
                case 0:
                    str = C13990Tnq.A0b(str, serialDescriptor, ADI, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = C13990Tnq.A0b(str2, serialDescriptor, ADI, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = C13990Tnq.A0b(str3, serialDescriptor, ADI, 2);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) ADI.AO4(map, r9[3], serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = C13990Tnq.A0b(str4, serialDescriptor, ADI, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = C13990Tnq.A0b(str5, serialDescriptor, ADI, 5);
                    i |= 32;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3uI, X.WtF] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.shopify.checkout.models.NetworkRequestPayload", obj, 6);
        r1.A00("url");
        r1.A00("method");
        r1.A00("body");
        r1.A00("headers");
        r1.A00("initiatorType");
        r1.A00("startTime");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r2 = NetworkRequestPayload.A06;
        C255453u9 r1 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r1), C360578eo.A00(r1), C360578eo.A00(r1), C360578eo.A00(r2[3]), C360578eo.A00(r1), C360578eo.A00(r1)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        NetworkRequestPayload networkRequestPayload = (NetworkRequestPayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, networkRequestPayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r4 = NetworkRequestPayload.A06;
        C255453u9 r3 = C255453u9.A01;
        ADJ.AS7(networkRequestPayload.A04, r3, serialDescriptor, 0);
        ADJ.AS7(networkRequestPayload.A02, r3, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS7(networkRequestPayload.A00, r3, serialDescriptor, 2);
        ADJ.AS7(networkRequestPayload.A05, r4[3], serialDescriptor, 3);
        ADJ.AS7(networkRequestPayload.A01, r3, serialDescriptor, 4);
        ADJ.AS7(networkRequestPayload.A03, r3, serialDescriptor, 5);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
