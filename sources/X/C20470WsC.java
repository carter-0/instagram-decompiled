package X;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsC  reason: case insensitive filesystem */
public final class C20470WsC implements C255533uI {
    public static final C20470WsC A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        C255463uA[] r4 = C14987UIm.A01;
        Map map = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new C14987UIm(map, i);
            } else if (ANp == 0) {
                map = (Map) C13988Tno.A0W(map, r6, ADI, r4, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.WsC] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0g = C13990Tnq.A0g("object", obj);
        A0g.A00("fields");
        A01 = A0g;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C14987UIm.A01[0]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14987UIm uIm = (C14987UIm) obj;
        AnonymousClass7TG.A1N(encoder, uIm);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        ADJ.AS8(uIm.A00, C14987UIm.A01[0], r4, 0);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
