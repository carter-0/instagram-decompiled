package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Coordinate$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsG  reason: case insensitive filesystem */
public final class C20474WsG implements C255533uI {
    public static final C20474WsG A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        Coordinate coordinate = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new C14992UIr(coordinate, i);
            } else if (ANp == 0) {
                coordinate = (Coordinate) ADI.AO5(coordinate, C20462Ws4.A00, r5, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.WsG, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C13991Tnr.A0q("coordinate", obj);
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C20462Ws4.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14992UIr uIr = (C14992UIr) obj;
        AnonymousClass7TG.A1N(encoder, uIr);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        InspectableValue$Coordinate$Companion inspectableValue$Coordinate$Companion = C14992UIr.Companion;
        C13990Tnq.A1Q(uIr.A00, C20462Ws4.A00, r3, ADJ);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
