package X;

import com.instagram.common.bloks.flipper.BloksPayloadCacheStatus;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrl  reason: case insensitive filesystem */
public final class C20443Wrl implements C255533uI {
    public static final C20443Wrl A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r13 = A01;
        C2590240b ADI = decoder2.ADI(r13);
        C255463uA[] r11 = C14984UIj.A08;
        String str = null;
        String str2 = null;
        List list = null;
        Map map = null;
        Object obj = null;
        BloksPayloadCacheStatus bloksPayloadCacheStatus = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r13);
            switch (ANp) {
                case -1:
                    ADI.AST(r13);
                    return new C14984UIj(bloksPayloadCacheStatus, obj, str, str3, str4, str2, list, map, i);
                case 0:
                    str = ADI.AOA(r13, 0);
                    i |= 1;
                    break;
                case 1:
                    bloksPayloadCacheStatus = (BloksPayloadCacheStatus) C13988Tno.A0W(bloksPayloadCacheStatus, r13, ADI, r11, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ADI.AO4(str3, C255453u9.A01, r13, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) ADI.AO4(str4, C255453u9.A01, r13, 3);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) ADI.AO4(map, r11[4], r13, 4);
                    i |= 16;
                    break;
                case 5:
                    obj = ADI.AO4(obj, C20432WrI.A00, r13, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ADI.AO4(list, r11[6], r13, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = C13988Tno.A0f(str2, r13, ADI, 7);
                    i |= 128;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Wrl, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("rawPayload", obj, 8);
        r1.A00("payloadType");
        r1.A00("cacheStatus");
        r1.A00("payloadRaw");
        r1.A00("cacheKey");
        r1.A00("perfMarkersMillis");
        r1.A00("annotations");
        r1.A00("siblingKeys");
        r1.A00("appId");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = C14984UIj.A08;
        C255453u9 r2 = C255453u9.A01;
        return new C255463uA[]{r2, r1[1], C360578eo.A00(r2), C360578eo.A00(r2), C360578eo.A00(r1[4]), C360578eo.A00(C20432WrI.A00), C360578eo.A00(r1[6]), C360578eo.A00(r2)};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14984UIj uIj = (C14984UIj) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, uIj);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        C255463uA[] r6 = C14984UIj.A08;
        ADJ.ASC(uIj.A05, r4, 0);
        ADJ.AS8(uIj.A00, r6[A1U], r4, A1U);
        C255453u9 r3 = C255453u9.A01;
        ADJ.AS7(uIj.A04, r3, r4, 2);
        ADJ.AS7(uIj.A03, r3, r4, 3);
        ADJ.AS7(uIj.A07, r6[4], r4, 4);
        ADJ.AS7(uIj.A01, C20432WrI.A00, r4, 5);
        ADJ.AS7(uIj.A06, r6[6], r4, 6);
        ADJ.AS7(uIj.A02, r3, r4, 7);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
