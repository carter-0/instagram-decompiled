package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$SpaceBox$Companion;
import com.facebook.flipper.plugins.uidebugger.model.SpaceBox;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsL  reason: case insensitive filesystem */
public final class C20479WsL implements C255533uI {
    public static final C20479WsL A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        SpaceBox spaceBox = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new C14996UIv(spaceBox, i);
            } else if (ANp == 0) {
                spaceBox = (SpaceBox) ADI.AO5(spaceBox, C20487WsT.A00, r5, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WsL, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C13991Tnr.A0q("space", obj);
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C20487WsT.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14996UIv uIv = (C14996UIv) obj;
        AnonymousClass7TG.A1N(encoder, uIv);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        InspectableValue$SpaceBox$Companion inspectableValue$SpaceBox$Companion = C14996UIv.Companion;
        C13990Tnq.A1Q(uIv.A00, C20487WsT.A00, r3, ADJ);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
