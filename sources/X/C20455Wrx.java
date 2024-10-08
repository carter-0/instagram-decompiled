package X;

import com.facebook.react.modules.dialog.DialogModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrx  reason: case insensitive filesystem */
public final class C20455Wrx implements C255533uI {
    public static final C20455Wrx A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r8 = A01;
        C2590240b ADI = decoder.ADI(r8);
        C255463uA[] r6 = WHJ.A03;
        X0W x0w = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r8);
            if (ANp == -1) {
                ADI.AST(r8);
                return new WHJ(x0w, str, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r8, 0);
                i |= 1;
            } else if (ANp == 1) {
                x0w = (X0W) C13988Tno.A0W(x0w, r8, ADI, r6, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wrx, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("UnitAction", obj);
        A0k.A00(DialogModule.KEY_TITLE);
        A0k.A00("actionIcon");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, WHJ.A03[1]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WHJ whj = (WHJ) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, whj);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C255463uA[] r1 = WHJ.A03;
        ADJ.ASC(whj.A01, r3, 0);
        ADJ.AS8(whj.A00, r1[A1U], r3, A1U);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
