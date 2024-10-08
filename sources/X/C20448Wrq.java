package X;

import com.facebook.flipper.plugins.bloksdebugger.InitialState$Companion;
import com.facebook.react.modules.intent.IntentModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrq  reason: case insensitive filesystem */
public final class C20448Wrq implements C255533uI {
    public static final C20448Wrq A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        String str = null;
        Object obj = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new C14983UIh(obj, str, str2, str3, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r6, 0);
                i |= 1;
            } else if (ANp == 1) {
                obj = ADI.AO4(obj, C20432WrI.A00, r6, 1);
                i |= 2;
            } else if (ANp == 2) {
                str2 = ADI.AOA(r6, 2);
                i |= 4;
            } else if (ANp == 3) {
                str3 = ADI.AOA(r6, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wrq] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("stateInit", obj);
        A0m.A00("key");
        A0m.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        A0m.A00("framework");
        A0m.A00("bindMode");
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r1 = C255453u9.A01;
        return new C255463uA[]{r1, C360578eo.A00(C20432WrI.A00), r1, r1};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14983UIh uIh = (C14983UIh) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, uIh);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        InitialState$Companion initialState$Companion = C14983UIh.Companion;
        ADJ.ASC(uIh.A03, r3, 0);
        ADJ.AS7(uIh.A00, C20432WrI.A00, r3, A1U ? 1 : 0);
        ADJ.ASC(uIh.A02, r3, 2);
        ADJ.ASC(uIh.A01, r3, 3);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
