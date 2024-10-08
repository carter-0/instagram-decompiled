package X;

import com.facebook.flipper.plugins.bloksdebugger.ScriptStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrt  reason: case insensitive filesystem */
public final class C20451Wrt implements C255533uI {
    public static final C20451Wrt A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder2.ADI(r6);
        C255463uA[] r4 = C14985UIk.A09;
        String str = null;
        long j = 0;
        Object obj = null;
        List list = null;
        List list2 = null;
        ScriptStatus scriptStatus = null;
        String str2 = null;
        Object obj2 = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            switch (ANp) {
                case -1:
                    ADI.AST(r6);
                    return new C14985UIk(scriptStatus, obj2, obj, str, str2, str3, list, list2, i, j);
                case 0:
                    str = ADI.AOA(r6, 0);
                    i |= 1;
                    break;
                case 1:
                    scriptStatus = (ScriptStatus) C13988Tno.A0W(scriptStatus, r6, ADI, r4, 1);
                    i |= 2;
                    break;
                case 2:
                    obj2 = ADI.AO4(obj2, C20432WrI.A00, r6, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) ADI.AO4(list, r4[3], r6, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) C13988Tno.A0W(list2, r6, ADI, r4, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ADI.AO4(str2, C255453u9.A01, r6, 5);
                    i |= 32;
                    break;
                case 6:
                    obj = ADI.AO4(obj, C20432WrI.A00, r6, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = ADI.AOA(r6, 7);
                    i |= 128;
                    break;
                case 8:
                    j = ADI.AO2(r6, 8);
                    i |= 256;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3uI, X.Wrt] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("scriptExecuted", obj, 9);
        r1.A00("executionId");
        r1.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        r1.A00("result");
        r1.A00("bloksStackTrace");
        r1.A00("instructions");
        r1.A00("scriptUri");
        r1.A00("args");
        r1.A00("scriptType");
        r1.A00("durationNanos");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r2 = C14985UIk.A09;
        C255453u9 r3 = C255453u9.A01;
        C255463uA r4 = r2[1];
        C20432WrI wrI = C20432WrI.A00;
        return new C255463uA[]{r3, r4, C360578eo.A00(wrI), C360578eo.A00(r2[3]), r2[4], C360578eo.A00(r3), C360578eo.A00(wrI), r3, C258663zR.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14985UIk uIk = (C14985UIk) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, uIk);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C255463uA[] r6 = C14985UIk.A09;
        ADJ.ASC(uIk.A04, r3, 0);
        ADJ.AS8(uIk.A01, r6[A1U], r3, A1U);
        C20432WrI wrI = C20432WrI.A00;
        ADJ.AS7(uIk.A03, wrI, r3, 2);
        ADJ.AS7(uIk.A07, r6[3], r3, 3);
        ADJ.AS8(uIk.A08, r6[4], r3, 4);
        ADJ.AS7(uIk.A06, C255453u9.A01, r3, 5);
        ADJ.AS7(uIk.A02, wrI, r3, 6);
        ADJ.ASC(uIk.A05, r3, 7);
        ADJ.AS5(r3, 8, uIk.A00);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
