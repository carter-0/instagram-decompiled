package X;

import com.facebook.neko.directinstall.digitalturbine.DTAuthResponse;
import com.facebook.neko.directinstall.digitalturbine.DTSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsY  reason: case insensitive filesystem */
public final class C20492WsY implements C255533uI {
    public static final C20492WsY A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        DTSession dTSession = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new DTAuthResponse(dTSession, i);
            } else if (ANp == 0) {
                dTSession = (DTSession) ADI.AO5(dTSession, C20498Wse.A00, r5, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WsY, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0g = C13990Tnq.A0g("com.facebook.neko.directinstall.digitalturbine.DTAuthResponse", obj);
        A0g.A00("data");
        A01 = A0g;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C20498Wse.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DTAuthResponse dTAuthResponse = (DTAuthResponse) obj;
        AnonymousClass7TG.A1N(encoder, dTAuthResponse);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C13990Tnq.A1Q(dTAuthResponse.A00, C20498Wse.A00, r3, ADJ);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
