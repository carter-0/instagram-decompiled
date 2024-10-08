package X;

import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.AuthenticationVersion;
import com.shopify.checkout.models.AuthenticationVersionSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt0  reason: case insensitive filesystem */
public final /* synthetic */ class C20520Wt0 implements C255533uI {
    public static final C20520Wt0 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        AuthenticationVersion authenticationVersion = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new Authentication(authenticationVersion, str, i);
            } else if (ANp == 0) {
                authenticationVersion = (AuthenticationVersion) ADI.AO5(authenticationVersion, AuthenticationVersionSerializer.A00, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wt0, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.shopify.checkout.models.Authentication", obj);
        A0k.A00("version");
        A0k.A00("payload");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{AuthenticationVersionSerializer.A00, C255453u9.A01};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Authentication authentication = (Authentication) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, authentication);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(authentication.A00, AuthenticationVersionSerializer.A00, serialDescriptor, 0);
        ADJ.ASC(authentication.A01, serialDescriptor, A1U ? 1 : 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
