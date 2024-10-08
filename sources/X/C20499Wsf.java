package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTTaskInfo;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wsf  reason: case insensitive filesystem */
public final class C20499Wsf implements C255533uI {
    public static final C20499Wsf A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder2.ADI(r6);
        String str = null;
        DTApplication dTApplication = null;
        Double d = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new DTTaskInfo(dTApplication, d, str, str2, i, i2);
            } else if (ANp == 0) {
                str = ADI.AOA(r6, 0);
                i |= 1;
            } else if (ANp == 1) {
                i2 = ADI.ANz(r6, 1);
                i |= 2;
            } else if (ANp == 2) {
                dTApplication = (DTApplication) ADI.AO4(dTApplication, C20490WsW.A00, r6, 2);
                i |= 4;
            } else if (ANp == 3) {
                d = (Double) ADI.AO4(d, C258703zV.A00, r6, 3);
                i |= 8;
            } else if (ANp == 4) {
                str2 = C13988Tno.A0f(str2, r6, ADI, 4);
                i |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Wsf, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.facebook.neko.directinstall.digitalturbine.DTTaskInfo", obj, 5);
        r2.A00("taskId");
        r2.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        r2.A01("application", true);
        r2.A01("progressValue", true);
        r2.A01("partnerMetadata", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r4 = C255453u9.A01;
        return new C255463uA[]{r4, C360278eK.A00, C360578eo.A00(C20490WsW.A00), C360578eo.A00(C258703zV.A00), C360578eo.A00(r4)};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTTaskInfo dTTaskInfo = (DTTaskInfo) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, dTTaskInfo);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.ASC(dTTaskInfo.A04, r3, 0);
        ADJ.AS3(r3, A1U ? 1 : 0, dTTaskInfo.A00);
        if (ADJ.EsA(r3, 2) || dTTaskInfo.A01 != null) {
            ADJ.AS7(dTTaskInfo.A01, C20490WsW.A00, r3, 2);
        }
        if (ADJ.EsA(r3, 3) || dTTaskInfo.A02 != null) {
            ADJ.AS7(dTTaskInfo.A02, C258703zV.A00, r3, 3);
        }
        if (ADJ.EsA(r3, 4) || dTTaskInfo.A03 != null) {
            ADJ.AS7(dTTaskInfo.A03, C255453u9.A01, r3, 4);
        }
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
