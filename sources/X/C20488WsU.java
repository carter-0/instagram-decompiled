package X;

import com.facebook.flipper.plugins.uidebugger.model.TraversalError;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsU  reason: case insensitive filesystem */
public final class C20488WsU implements C255533uI {
    public static final C20488WsU A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new TraversalError(str, str4, str3, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r6, 0);
                i |= 1;
            } else if (ANp == 1) {
                str4 = ADI.AOA(r6, 1);
                i |= 2;
            } else if (ANp == 2) {
                str3 = ADI.AOA(r6, 2);
                i |= 4;
            } else if (ANp == 3) {
                str2 = ADI.AOA(r6, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.WsU] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.facebook.flipper.plugins.uidebugger.model.TraversalError", obj);
        A0m.A00("nodeName");
        A0m.A00("errorType");
        A0m.A00("errorMessage");
        A0m.A00("stack");
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{r0, r0, r0, r0};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        TraversalError traversalError = (TraversalError) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, traversalError);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.ASC(traversalError.A02, r3, 0);
        ADJ.ASC(traversalError.A01, r3, A1U ? 1 : 0);
        ADJ.ASC(traversalError.A00, r3, 2);
        ADJ.ASC(traversalError.A03, r3, 3);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
