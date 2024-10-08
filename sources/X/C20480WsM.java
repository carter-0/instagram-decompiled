package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Text$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsM  reason: case insensitive filesystem */
public final class C20480WsM implements C255533uI {
    public static final C20480WsM A00;
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
                return new C14997UIw(str, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r5, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WsM, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C13991Tnr.A0q("text", obj);
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14997UIw uIw = (C14997UIw) obj;
        AnonymousClass7TG.A1N(encoder, uIw);
        C255543uJ r2 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r2);
        InspectableValue$Text$Companion inspectableValue$Text$Companion = C14997UIw.Companion;
        C13990Tnq.A1T(uIw.A00, r2, ADJ);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
