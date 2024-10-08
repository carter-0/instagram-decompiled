package X;

import com.facebook.flipper.plugins.bloksdebugger.ClientState;
import com.facebook.react.modules.dialog.DialogModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrr  reason: case insensitive filesystem */
public final class C20449Wrr implements C255533uI {
    public static final C20449Wrr A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        String str = null;
        long j = 0;
        int i = 0;
        Object obj = null;
        ClientState clientState = null;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new WHG(clientState, obj, str, i, j);
            } else if (ANp == 0) {
                str = C13988Tno.A0f(str, r5, ADI, 0);
                i |= 1;
            } else if (ANp == 1) {
                obj = ADI.AO4(obj, C20432WrI.A00, r5, 1);
                i |= 2;
            } else if (ANp == 2) {
                clientState = (ClientState) ADI.AO5(clientState, C20445Wrn.A00, r5, 2);
                i |= 4;
            } else if (ANp == 3) {
                j = ADI.AO2(r5, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wrr] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("log", obj);
        A0m.A00("lispyUri");
        A0m.A00(DialogModule.KEY_MESSAGE);
        A0m.A00("clientState");
        A0m.A00("ts");
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360578eo.A00(C255453u9.A01), C360578eo.A00(C20432WrI.A00), C20445Wrn.A00, C258663zR.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WHG whg = (WHG) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, whg);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        ADJ.AS7(whg.A03, C255453u9.A01, r4, 0);
        ADJ.AS7(whg.A02, C20432WrI.A00, r4, A1U ? 1 : 0);
        ADJ.AS8(whg.A01, C20445Wrn.A00, r4, 2);
        ADJ.AS5(r4, 3, whg.A00);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
