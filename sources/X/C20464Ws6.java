package X;

import com.facebook.flipper.plugins.uidebugger.model.CustomActionGroup;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws6  reason: case insensitive filesystem */
public final class C20464Ws6 implements C255533uI {
    public static final C20464Ws6 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r10 = A01;
        C2590240b ADI = decoder.ADI(r10);
        C255463uA[] r8 = CustomActionGroup.A03;
        String str = null;
        X0W x0w = null;
        List list = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r10);
            if (ANp == -1) {
                ADI.AST(r10);
                return new CustomActionGroup(x0w, str, list, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r10, 0);
                i |= 1;
            } else if (ANp == 1) {
                x0w = (X0W) C13988Tno.A0W(x0w, r10, ADI, r8, 1);
                i |= 2;
            } else if (ANp == 2) {
                list = C13988Tno.A0j(list, r10, ADI, r8, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Ws6, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.facebook.flipper.plugins.uidebugger.model.CustomActionGroup", obj);
        A0l.A00(DialogModule.KEY_TITLE);
        A0l.A00("actionIcon");
        A0l.A00("actions");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r3 = CustomActionGroup.A03;
        return new C255463uA[]{C255453u9.A01, r3[1], r3[2]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CustomActionGroup customActionGroup = (CustomActionGroup) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, customActionGroup);
        C255543uJ r5 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r5);
        C255463uA[] r3 = CustomActionGroup.A03;
        ADJ.ASC(customActionGroup.A01, r5, 0);
        ADJ.AS8(customActionGroup.A00, r3[A1U], r5, A1U);
        ADJ.AS8(customActionGroup.A02, r3[2], r5, 2);
        ADJ.AST(r5);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
