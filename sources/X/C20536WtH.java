package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtH  reason: case insensitive filesystem */
public final /* synthetic */ class C20536WtH implements C255533uI {
    public static final C20536WtH A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r6 = C18639Vve.A02;
        Map map = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new C18639Vve(str, map, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                map = (Map) C13988Tno.A0W(map, serialDescriptor, ADI, r6, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.WtH, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.shopify.checkout.models.OrderDetails.PaymentMethod", obj);
        A0k.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0k.A00("details");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, C18639Vve.A02[1]};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C18639Vve vve = (C18639Vve) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, vve);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r1 = C18639Vve.A02;
        ADJ.ASC(vve.A00, serialDescriptor, 0);
        ADJ.AS8(vve.A01, r1[A1U], serialDescriptor, A1U);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
