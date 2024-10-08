package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsy  reason: case insensitive filesystem */
public final /* synthetic */ class C20518Wsy implements C255533uI {
    public static final C20518Wsy A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new C18638Vva(str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wsy, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.shopify.checkout.AndroidWebView.JSMessage", obj);
        A0k.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A0k.A00("body");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{r0, r0};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C18638Vva vva = (C18638Vva) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, vva);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(vva.A01, serialDescriptor, 0);
        ADJ.ASC(vva.A00, serialDescriptor, A1U ? 1 : 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
