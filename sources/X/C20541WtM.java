package X;

import com.shopify.checkout.models.errors.DefaultsErrorCode;
import com.shopify.checkout.models.errors.DefaultsErrorCodeSerializer;
import com.shopify.checkout.models.errors.DefaultsErrorPayload;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtM  reason: case insensitive filesystem */
public final /* synthetic */ class C20541WtM implements C255533uI {
    public static final C20541WtM A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        DefaultsErrorCode defaultsErrorCode = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new DefaultsErrorPayload(defaultsErrorCode, errorGroup, str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                defaultsErrorCode = (DefaultsErrorCode) ADI.AO5(defaultsErrorCode, DefaultsErrorCodeSerializer.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 2);
                i |= 4;
            } else if (ANp == 3) {
                errorGroup = (ErrorGroup) ADI.AO5(errorGroup, ErrorGroupSerializer.A00, serialDescriptor, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WtM, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C13992Tns.A0U("com.shopify.checkout.models.errors.DefaultsErrorPayload", obj, 4);
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r3 = C255453u9.A01;
        return new C255463uA[]{r3, DefaultsErrorCodeSerializer.A00, C360578eo.A00(r3), ErrorGroupSerializer.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DefaultsErrorPayload defaultsErrorPayload = (DefaultsErrorPayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, defaultsErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(defaultsErrorPayload.A02, serialDescriptor, 0);
        ADJ.AS8(defaultsErrorPayload.A00, DefaultsErrorCodeSerializer.A00, serialDescriptor, A1U ? 1 : 0);
        if (ADJ.EsA(serialDescriptor, 2) || defaultsErrorPayload.A03 != null) {
            ADJ.AS7(defaultsErrorPayload.A03, C255453u9.A01, serialDescriptor, 2);
        }
        ADJ.AS8(defaultsErrorPayload.A01, ErrorGroupSerializer.A00, serialDescriptor, 3);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
