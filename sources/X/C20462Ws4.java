package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws4  reason: case insensitive filesystem */
public final class C20462Ws4 implements C255533uI {
    public static final C20462Ws4 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder.ADI(r7);
        Number number = null;
        Number number2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            if (ANp == -1) {
                ADI.AST(r7);
                return new Coordinate(number, number2, i);
            } else if (ANp == 0) {
                number = (Number) ADI.AO5(number, C20433WrJ.A00, r7, 0);
                i |= 1;
            } else if (ANp == 1) {
                number2 = (Number) ADI.AO5(number2, C20433WrJ.A00, r7, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Ws4, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.facebook.flipper.plugins.uidebugger.model.Coordinate", obj);
        A0k.A00("x");
        A0k.A00("y");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        C20433WrJ wrJ = C20433WrJ.A00;
        return new C255463uA[]{wrJ, wrJ};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Coordinate coordinate = (Coordinate) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, coordinate);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C20433WrJ wrJ = C20433WrJ.A00;
        ADJ.AS8(coordinate.A00, wrJ, r3, 0);
        ADJ.AS8(coordinate.A01, wrJ, r3, A1U ? 1 : 0);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
