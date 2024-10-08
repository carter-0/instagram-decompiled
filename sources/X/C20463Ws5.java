package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate3D;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws5  reason: case insensitive filesystem */
public final class C20463Ws5 implements C255533uI {
    public static final C20463Ws5 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r9 = A01;
        C2590240b ADI = decoder.ADI(r9);
        Number number = null;
        Number number2 = null;
        Number number3 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r9);
            if (ANp == -1) {
                ADI.AST(r9);
                return new Coordinate3D(number, number2, number3, i);
            } else if (ANp == 0) {
                number = (Number) ADI.AO5(number, C20433WrJ.A00, r9, 0);
                i |= 1;
            } else if (ANp == 1) {
                number2 = (Number) ADI.AO5(number2, C20433WrJ.A00, r9, 1);
                i |= 2;
            } else if (ANp == 2) {
                number3 = (Number) ADI.AO5(number3, C20433WrJ.A00, r9, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Ws5] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.facebook.flipper.plugins.uidebugger.model.Coordinate3D", obj);
        A0l.A00("x");
        A0l.A00("y");
        A0l.A00("z");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C20433WrJ wrJ = C20433WrJ.A00;
        return new C255463uA[]{wrJ, wrJ, wrJ};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Coordinate3D coordinate3D = (Coordinate3D) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, coordinate3D);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        C20433WrJ wrJ = C20433WrJ.A00;
        ADJ.AS8(coordinate3D.A00, wrJ, r4, 0);
        ADJ.AS8(coordinate3D.A01, wrJ, r4, A1U ? 1 : 0);
        ADJ.AS8(coordinate3D.A02, wrJ, r4, 2);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
