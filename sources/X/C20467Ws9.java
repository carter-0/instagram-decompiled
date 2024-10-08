package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.plugins.uidebugger.model.FrameworkEventMetadata;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws9  reason: case insensitive filesystem */
public final class C20467Ws9 implements C255533uI {
    public static final C20467Ws9 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder.ADI(r7);
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            if (ANp == -1) {
                ADI.AST(r7);
                return new FrameworkEventMetadata(str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r7, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = ADI.AOA(r7, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Ws9, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.facebook.flipper.plugins.uidebugger.model.FrameworkEventMetadata", obj);
        A0k.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0k.A00("documentation");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{r0, r0};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        FrameworkEventMetadata frameworkEventMetadata = (FrameworkEventMetadata) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, frameworkEventMetadata);
        C255543uJ r2 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r2);
        ADJ.ASC(frameworkEventMetadata.A01, r2, 0);
        ADJ.ASC(frameworkEventMetadata.A00, r2, A1U ? 1 : 0);
        ADJ.AST(r2);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
