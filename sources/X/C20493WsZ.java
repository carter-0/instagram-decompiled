package X;

import com.facebook.neko.directinstall.digitalturbine.DTGenericError;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsZ  reason: case insensitive filesystem */
public final class C20493WsZ implements C255533uI {
    public static final C20493WsZ A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder.ADI(r7);
        String str = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            if (ANp == -1) {
                ADI.AST(r7);
                return new DTGenericError(str, i2, i);
            } else if (ANp == 0) {
                i = ADI.ANz(r7, 0);
                i2 |= 1;
            } else if (ANp == 1) {
                str = ADI.AOA(r7, 1);
                i2 |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WsZ, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.facebook.neko.directinstall.digitalturbine.DTGenericError", obj);
        A0k.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        A0k.A00(DialogModule.KEY_MESSAGE);
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360278eK.A00, C255453u9.A01};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTGenericError dTGenericError = (DTGenericError) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, dTGenericError);
        C255543uJ r2 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r2);
        ADJ.AS3(r2, 0, dTGenericError.A00);
        ADJ.ASC(dTGenericError.A01, r2, A1U ? 1 : 0);
        ADJ.AST(r2);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
