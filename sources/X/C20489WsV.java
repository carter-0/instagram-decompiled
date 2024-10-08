package X;

import com.facebook.neko.directinstall.digitalturbine.AIDLInstallationProgress;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsV  reason: case insensitive filesystem */
public final class C20489WsV implements C255533uI {
    public static final C20489WsV A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new AIDLInstallationProgress(d, i3, i, i2);
            } else if (ANp == 0) {
                d = ADI.ANo(r5, 0);
                i3 |= 1;
            } else if (ANp == 1) {
                i = ADI.ANz(r5, 1);
                i3 |= 2;
            } else if (ANp == 2) {
                i2 = ADI.ANz(r5, 2);
                i3 |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.WsV, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.facebook.neko.directinstall.digitalturbine.AIDLInstallationProgress", obj);
        A0l.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        A0l.A00("action");
        A0l.A01(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, true);
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C258703zV r1 = C258703zV.A00;
        C360278eK r0 = C360278eK.A00;
        return new C255463uA[]{r1, r0, r0};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AIDLInstallationProgress aIDLInstallationProgress = (AIDLInstallationProgress) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, aIDLInstallationProgress);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.ARx(r3, aIDLInstallationProgress.A00, 0);
        ADJ.AS3(r3, A1U ? 1 : 0, aIDLInstallationProgress.A01);
        if (ADJ.EsA(r3, 2) || aIDLInstallationProgress.A02 != 0) {
            ADJ.AS3(r3, 2, aIDLInstallationProgress.A02);
        }
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
