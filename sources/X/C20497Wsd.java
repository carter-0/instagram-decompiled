package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTInstallationResponse;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wsd  reason: case insensitive filesystem */
public final class C20497Wsd implements C255533uI {
    public static final C20497Wsd A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder.ADI(r7);
        String str = null;
        DTApplication dTApplication = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            if (ANp == -1) {
                ADI.AST(r7);
                return new DTInstallationResponse(dTApplication, str, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r7, 0);
                i |= 1;
            } else if (ANp == 1) {
                dTApplication = (DTApplication) ADI.AO5(dTApplication, C20490WsW.A00, r7, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Wsd, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.facebook.neko.directinstall.digitalturbine.DTInstallationResponse", obj);
        A0k.A00("taskId");
        A0k.A00("data");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, C20490WsW.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTInstallationResponse dTInstallationResponse = (DTInstallationResponse) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, dTInstallationResponse);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.ASC(dTInstallationResponse.A01, r3, 0);
        ADJ.AS8(dTInstallationResponse.A00, C20490WsW.A00, r3, A1U ? 1 : 0);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
