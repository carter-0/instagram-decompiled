package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsB  reason: case insensitive filesystem */
public final class C20469WsB implements C255533uI {
    public static final C20469WsB A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        C255463uA[] r4 = C14986UIl.A01;
        List list = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new C14986UIl(list, i);
            } else if (ANp == 0) {
                list = C13988Tno.A0j(list, r6, ADI, r4, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.WsB] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0g = C13990Tnq.A0g("array", obj);
        A0g.A00(DialogModule.KEY_ITEMS);
        A01 = A0g;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C14986UIl.A01[0]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14986UIl uIl = (C14986UIl) obj;
        AnonymousClass7TG.A1N(encoder, uIl);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        ADJ.AS8(uIl.A00, C14986UIl.A01[0], r4, 0);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
