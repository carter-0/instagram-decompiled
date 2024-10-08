package X;

import com.facebook.neko.directinstall.digitalturbine.DTApplication;
import com.facebook.neko.directinstall.digitalturbine.DTApplicationRequest;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsX  reason: case insensitive filesystem */
public final class C20491WsX implements C255533uI {
    public static final C20491WsX A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder.ADI(r7);
        DTApplication dTApplication = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            if (ANp == -1) {
                ADI.AST(r7);
                return new DTApplicationRequest(dTApplication, str, i);
            } else if (ANp == 0) {
                dTApplication = (DTApplication) ADI.AO5(dTApplication, C20490WsW.A00, r7, 0);
                i |= 1;
            } else if (ANp == 1) {
                str = C13988Tno.A0f(str, r7, ADI, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WsX, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.facebook.neko.directinstall.digitalturbine.DTApplicationRequest", obj);
        A0k.A00("data");
        A0k.A01("taskId", true);
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C20490WsW.A00, C360578eo.A00(C255453u9.A01)};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTApplicationRequest dTApplicationRequest = (DTApplicationRequest) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, dTApplicationRequest);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.AS8(dTApplicationRequest.A00, C20490WsW.A00, r3, 0);
        if (ADJ.EsA(r3, A1U ? 1 : 0) || dTApplicationRequest.A01 != null) {
            ADJ.AS7(dTApplicationRequest.A01, C255453u9.A01, r3, A1U);
        }
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
