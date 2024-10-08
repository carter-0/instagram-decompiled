package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Unknown$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsN  reason: case insensitive filesystem */
public final class C20481WsN implements C255533uI {
    public static final C20481WsN A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new C14998UIx(str, i);
            } else if (ANp == 0) {
                str = C13988Tno.A0f(str, r5, ADI, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WsN, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C13991Tnr.A0q("unknown", obj);
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360578eo.A00(C255453u9.A01)};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14998UIx uIx = (C14998UIx) obj;
        AnonymousClass7TG.A1N(encoder, uIx);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        InspectableValue$Unknown$Companion inspectableValue$Unknown$Companion = C14998UIx.Companion;
        ADJ.AS7(uIx.A00, C255453u9.A01, r4, 0);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
