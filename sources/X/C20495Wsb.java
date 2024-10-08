package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTInstallationError;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wsb  reason: case insensitive filesystem */
public final class C20495Wsb implements C255533uI {
    public static final C20495Wsb A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r9 = A01;
        C2590240b ADI = decoder.ADI(r9);
        String str = null;
        DTApplication dTApplication = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r9);
            if (ANp == -1) {
                ADI.AST(r9);
                return new DTInstallationError(dTApplication, str, i2, i);
            } else if (ANp == 0) {
                i = ADI.ANz(r9, 0);
                i2 |= 1;
            } else if (ANp == 1) {
                str = ADI.AOA(r9, 1);
                i2 |= 2;
            } else if (ANp == 2) {
                dTApplication = (DTApplication) ADI.AO4(dTApplication, C20490WsW.A00, r9, 2);
                i2 |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wsb] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.facebook.neko.directinstall.digitalturbine.DTInstallationError", obj);
        A0l.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        A0l.A00(DialogModule.KEY_MESSAGE);
        A0l.A01("application", true);
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360278eK.A00, C255453u9.A01, C360578eo.A00(C20490WsW.A00)};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTInstallationError dTInstallationError = (DTInstallationError) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, dTInstallationError);
        C255543uJ r4 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        ADJ.AS3(r4, 0, dTInstallationError.A00);
        ADJ.ASC(dTInstallationError.A02, r4, A1U ? 1 : 0);
        if (ADJ.EsA(r4, 2) || dTInstallationError.A01 != null) {
            ADJ.AS7(dTInstallationError.A01, C20490WsW.A00, r4, 2);
        }
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
