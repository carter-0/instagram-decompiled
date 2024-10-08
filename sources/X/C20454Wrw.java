package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrw  reason: case insensitive filesystem */
public final class C20454Wrw implements C255533uI {
    public static final C20454Wrw A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder.ADI(r7);
        String str = null;
        boolean z = false;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            if (ANp == -1) {
                ADI.AST(r7);
                return new WHI(str, i, z);
            } else if (ANp == 0) {
                str = ADI.AOA(r7, 0);
                i |= 1;
            } else if (ANp == 1) {
                z = ADI.ANi(r7, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wrw, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("BooleanAction", obj);
        A0k.A00(DialogModule.KEY_TITLE);
        A0k.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, AnonymousClass40E.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WHI whi = (WHI) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, whi);
        C255543uJ r2 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r2);
        ADJ.ASC(whi.A00, r2, 0);
        ADJ.ARt(r2, A1U ? 1 : 0, whi.A01);
        ADJ.AST(r2);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
