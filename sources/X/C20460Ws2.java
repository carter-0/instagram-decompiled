package X;

import com.facebook.flipper.plugins.uidebugger.model.BoxData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws2  reason: case insensitive filesystem */
public final class C20460Ws2 implements C255533uI {
    public static final C20460Ws2 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r10 = A01;
        C2590240b ADI = decoder.ADI(r10);
        C255463uA[] r8 = BoxData.A03;
        List list = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r10);
            if (ANp == -1) {
                ADI.AST(r10);
                return new BoxData(i, list, list2, list3);
            } else if (ANp == 0) {
                list = C13988Tno.A0j(list, r10, ADI, r8, 0);
                i |= 1;
            } else if (ANp == 1) {
                list2 = C13988Tno.A0j(list2, r10, ADI, r8, 1);
                i |= 2;
            } else if (ANp == 2) {
                list3 = C13988Tno.A0j(list3, r10, ADI, r8, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Ws2] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.facebook.flipper.plugins.uidebugger.model.BoxData", obj);
        A0l.A00("margin");
        A0l.A00("border");
        A0l.A00("padding");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r3 = BoxData.A03;
        return new C255463uA[]{r3[0], r3[1], r3[2]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BoxData boxData = (BoxData) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, boxData);
        C255543uJ r5 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r5);
        C255463uA[] r3 = BoxData.A03;
        ADJ.AS8(boxData.A01, r3[0], r5, 0);
        ADJ.AS8(boxData.A00, r3[A1U], r5, A1U);
        ADJ.AS8(boxData.A02, r3[2], r5, 2);
        ADJ.AST(r5);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
