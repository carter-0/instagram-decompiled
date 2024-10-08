package X;

import com.facebook.flipper.plugins.bloksdebugger.StateUpdateV2;
import com.facebook.react.modules.intent.IntentModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrv  reason: case insensitive filesystem */
public final class C20453Wrv implements C255533uI {
    public static final C20453Wrv A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder2.ADI(r7);
        C255463uA[] r9 = StateUpdateV2.A06;
        String str = null;
        String str2 = null;
        String str3 = null;
        Object obj = null;
        String str4 = null;
        List list = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            switch (ANp) {
                case -1:
                    ADI.AST(r7);
                    return new StateUpdateV2(obj, str, str2, str3, str4, list, i);
                case 0:
                    str = ADI.AOA(r7, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = C13990Tnq.A0b(str2, r7, ADI, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = ADI.AOA(r7, 2);
                    i |= 4;
                    break;
                case 3:
                    obj = ADI.AO4(obj, C20432WrI.A00, r7, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = ADI.AOA(r7, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ADI.AO4(list, r9[5], r7, 5);
                    i |= 32;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Wrv, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.facebook.flipper.plugins.bloksdebugger.StateUpdateV2", obj, 6);
        r1.A00("scriptExecutionId");
        r1.A00("lispyUri");
        r1.A00("key");
        r1.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        r1.A00("framework");
        r1.A00("keyPath");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = StateUpdateV2.A06;
        C255453u9 r2 = C255453u9.A01;
        return new C255463uA[]{r2, C360578eo.A00(r2), r2, C360578eo.A00(C20432WrI.A00), r2, C360578eo.A00(r1[5])};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        StateUpdateV2 stateUpdateV2 = (StateUpdateV2) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, stateUpdateV2);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C255463uA[] r5 = StateUpdateV2.A06;
        ADJ.ASC(stateUpdateV2.A04, r3, 0);
        ADJ.AS7(stateUpdateV2.A03, C255453u9.A01, r3, A1U ? 1 : 0);
        ADJ.ASC(stateUpdateV2.A02, r3, 2);
        ADJ.AS7(stateUpdateV2.A00, C20432WrI.A00, r3, 3);
        ADJ.ASC(stateUpdateV2.A01, r3, 4);
        ADJ.AS7(stateUpdateV2.A05, r5[5], r3, 5);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
