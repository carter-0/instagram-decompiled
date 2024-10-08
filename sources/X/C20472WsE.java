package X;

import com.facebook.flipper.plugins.uidebugger.model.Bounds;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Bounds$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsE  reason: case insensitive filesystem */
public final class C20472WsE implements C255533uI {
    public static final C20472WsE A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        Bounds bounds = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new C14989UIo(bounds, i);
            } else if (ANp == 0) {
                bounds = (Bounds) ADI.AO5(bounds, C20459Ws1.A00, r5, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.WsE] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C13991Tnr.A0q("bounds", obj);
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C20459Ws1.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14989UIo uIo = (C14989UIo) obj;
        AnonymousClass7TG.A1N(encoder, uIo);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        InspectableValue$Bounds$Companion inspectableValue$Bounds$Companion = C14989UIo.Companion;
        C13990Tnq.A1Q(uIo.A00, C20459Ws1.A00, r3, ADJ);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
