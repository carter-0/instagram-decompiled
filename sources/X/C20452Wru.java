package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wru  reason: case insensitive filesystem */
public final class C20452Wru implements C255533uI {
    public static final C20452Wru A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder2.ADI(r6);
        C255463uA[] r9 = WHH.A06;
        String str = null;
        String str2 = null;
        List list = null;
        long j = 0;
        int i = 0;
        String str3 = null;
        Object obj = null;
        while (true) {
            int ANp = ADI.ANp(r6);
            switch (ANp) {
                case -1:
                    ADI.AST(r6);
                    return new WHH(obj, str, str3, str2, list, i, j);
                case 0:
                    j = ADI.AO2(r6, 0);
                    i |= 1;
                    break;
                case 1:
                    str = C13990Tnq.A0b(str, r6, ADI, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = ADI.AOA(r6, 2);
                    i |= 4;
                    break;
                case 3:
                    obj = ADI.AO4(obj, C20432WrI.A00, r6, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = ADI.AOA(r6, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ADI.AO4(list, r9[5], r6, 5);
                    i |= 32;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Wru, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("stateUpdate", obj, 6);
        r1.A00("ts");
        r1.A00("lispyUri");
        r1.A00("key");
        r1.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        r1.A00("framework");
        r1.A00("keyPath");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = WHH.A06;
        C258663zR r2 = C258663zR.A00;
        C255453u9 r4 = C255453u9.A01;
        return new C255463uA[]{r2, C360578eo.A00(r4), r4, C360578eo.A00(C20432WrI.A00), r4, C360578eo.A00(r1[5])};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WHH whh = (WHH) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, whh);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        C255463uA[] r5 = WHH.A06;
        ADJ.AS5(r4, 0, whh.A00);
        ADJ.AS7(whh.A04, C255453u9.A01, r4, A1U ? 1 : 0);
        ADJ.ASC(whh.A03, r4, 2);
        ADJ.AS7(whh.A01, C20432WrI.A00, r4, 3);
        ADJ.ASC(whh.A02, r4, 4);
        ADJ.AS7(whh.A05, r5[5], r4, 5);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
